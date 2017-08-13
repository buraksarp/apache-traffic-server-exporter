package com.sarp.prometheus.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by sarp on 8/12/17.
 */


@Component
@RequiredArgsConstructor
public class AtsMetricsPullerScheduledTask {

    private final PrometheusService prometheusService;

    @Scheduled(fixedRate = 11000)
    public void pullAtsMetrics() {
        this.prometheusService.ingestAtsMetrics();
    }

}
