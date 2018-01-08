package com.sarp.prometheus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by sarp on 8/12/17.
 */

@Getter
@ToString
public class GlobalMetrics {

    // main metrics

    @JsonProperty("proxy.node.restarts.manager.start_time")
    private long managerStartTime;

    @JsonProperty("proxy.node.restarts.proxy.start_time")
    private long proxyStartTime;

    @JsonProperty("proxy.node.restarts.proxy.cache_ready_time")
    private long proxyCacheReadyTime;

    @JsonProperty("proxy.node.restarts.proxy.stop_time")
    private long proxyStopTime;

    @JsonProperty("proxy.node.restarts.proxy.restart_count")
    private long proxyRestartCount;

    @JsonProperty("proxy.node.http.throughput")
    private double throughput;

    @JsonProperty("proxy.node.current_client_connections")
    private int concurrentClientCount;

    //total cache

    @JsonProperty("proxy.process.cache.bytes_total")
    private long cacheBytesTotal;

    @JsonProperty("proxy.process.cache.bytes_used")
    private long cacheBytesUsed;

    @JsonProperty("proxy.node.cache.bytes_free")
    private long cacheBytesFree;

    @JsonProperty("proxy.node.cache_total_hits")
    private long cacheTotalHits;

    @JsonProperty("proxy.node.cache_total_misses")
    private long cacheTotalMisses;

    @JsonProperty("proxy.node.cache_hit_ratio") // both ram and disk
    private double cacheHitRatio;

    //ram cache

    @JsonProperty("proxy.process.cache.ram_cache.total_bytes")
    private double ramCacheTotalBytes;

    @JsonProperty("proxy.process.cache.ram_cache.bytes_used")
    private double ramCacheUsedBytes;

    @JsonProperty("proxy.process.cache.ram_cache.hits")
    private double ramCacheHits;

    @JsonProperty("proxy.process.cache.ram_cache.misses")
    private double ramCacheMisses;

    @JsonProperty("proxy.node.cache_hit_mem_ratio")
    private double ramCacheHitRatio;

}
