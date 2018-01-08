package com.sarp.prometheus.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sarp.prometheus.model.AtsMetrics;
import com.sarp.prometheus.model.GlobalMetrics;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

/**
 * Created by sarp on 8/11/17.
 */


@Service
@RequiredArgsConstructor
public class PrometheusServiceImpl extends PrometheusComponents implements PrometheusService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    @Override
    public GlobalMetrics getAtsMetrics() {
        ResponseEntity<String> str = restTemplate.getForEntity("/_stats", String.class);

        AtsMetrics atsMetrics = null;
        try {
            atsMetrics = objectMapper.readValue(str.getBody(), AtsMetrics.class);
        } catch (Exception e) {
            logger.error("Unable to map AtsMetrics object.", e);
        }

        return Objects.requireNonNull(atsMetrics).getGlobalMetrics();
    }

    @Override
    public void ingestAtsMetrics() {

        GlobalMetrics globalMetrics = this.getAtsMetrics();

        //main metrics

        managerStartTime.set(globalMetrics.getManagerStartTime());
        proxyCacheReadyTime.set(globalMetrics.getProxyCacheReadyTime());
        proxyRestartCount.set(globalMetrics.getProxyRestartCount());
        proxyStartTime.set(globalMetrics.getProxyStartTime());
        proxyStopTime.set(globalMetrics.getProxyStopTime());
        gaugeThroughput.set(globalMetrics.getThroughput());
        gaugeConcurrentClientCount.set(globalMetrics.getConcurrentClientCount());

        //total cache

        gaugeCacheBytesTotal.set(globalMetrics.getCacheBytesTotal());
        gaugeCacheBytesUsed.set(globalMetrics.getCacheBytesUsed());
        gaugeCacheBytesFree.set(globalMetrics.getCacheBytesFree());
        gaugeCacheTotalHits.set(globalMetrics.getCacheTotalHits());
        gaugeCacheTotalMisses.set(globalMetrics.getCacheTotalMisses());
        gaugeCacheHitRatio.set(globalMetrics.getCacheHitRatio());

        //ram cache

        gaugeRamCacheTotalBytes.set(globalMetrics.getRamCacheTotalBytes());
        gaugeRamCacheBytesUsed.set(globalMetrics.getRamCacheUsedBytes());
        gaugeCacheRamHits.set(globalMetrics.getRamCacheHits());
        gaugeCacheRamMisses.set(globalMetrics.getRamCacheMisses());
        gaugeRamCacheHitRatio.set(globalMetrics.getRamCacheHitRatio());

        logger.info(globalMetrics.toString());
    }

}
