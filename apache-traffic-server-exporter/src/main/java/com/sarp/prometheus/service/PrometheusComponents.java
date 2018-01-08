package com.sarp.prometheus.service;

import io.prometheus.client.Gauge;

/**
 * Created by sarp on 8/12/17.
 */

public abstract class PrometheusComponents {

    protected final Gauge managerStartTime = Gauge.build()
            .name("proxy_node_restarts_manager_start_time")
            .help("manager start time")
            .register();

    protected final Gauge proxyStartTime = Gauge.build()
            .name("proxy_node_restarts_proxy_start_time")
            .help("proxy start time")
            .register();

    protected final Gauge proxyCacheReadyTime = Gauge.build()
            .name("proxy_node_restarts_proxy_cache_ready_time")
            .help("proxy cache ready time")
            .register();

    protected final Gauge proxyStopTime = Gauge.build()
            .name("proxy_node_restarts_proxy_stop_time")
            .help("proxy stop time")
            .register();

    protected final Gauge proxyRestartCount = Gauge.build()
            .name("proxy_node_restarts_proxy_restart_count")
            .help("proxy restart count")
            .register();

    protected final Gauge gaugeThroughput = Gauge.build()
            .name("proxy_node_http_throughput")
            .help("proxy node throughput")
            .register();

    protected final Gauge gaugeConcurrentClientCount = Gauge.build()
            .name("proxy_node_current_client_connections")
            .help("proxy node current client connections")
            .register();

    //total cache

    protected final Gauge gaugeCacheBytesTotal = Gauge.build()
            .name("proxy_process_cache_bytes_total")
            .help("proxy node cache bytes total")
            .register();


    protected final Gauge gaugeCacheBytesUsed = Gauge.build()
            .name("proxy_process_cache_bytes_used")
            .help("proxy node cache bytes used")
            .register();


    protected final Gauge gaugeCacheBytesFree = Gauge.build()
            .name("proxy_node_cache_bytes_free")
            .help("proxy node cache bytes free")
            .register();

    protected final Gauge gaugeCacheTotalHits = Gauge.build()
            .name("proxy_node_cache_total_hits")
            .help("proxy node cache total hits")
            .register();

    protected final Gauge gaugeCacheTotalMisses = Gauge.build()
            .name("proxy_node_cache_total_misses")
            .help("proxy node cache total misses")
            .register();

    protected final Gauge gaugeCacheHitRatio = Gauge.build()
            .name("proxy_node_cache_hit_ratio")
            .help("proxy node cache hit ratio")
            .register();

    //ram cache

    protected final Gauge gaugeRamCacheTotalBytes = Gauge.build()
            .name("proxy_process_cache_ram_cache_total_bytes")
            .help("proxy process cache ram total bytes")
            .register();

    protected final Gauge gaugeRamCacheBytesUsed = Gauge.build()
            .name("proxy_process_cache_ram_cache_bytes_used")
            .help("proxy process cache ram total bytes used")
            .register();

    protected final Gauge gaugeCacheRamHits = Gauge.build()
            .name("proxy_process_cache_ram_cache_hits")
            .help("proxy process cache ram hits")
            .register();

    protected final Gauge gaugeCacheRamMisses = Gauge.build()
            .name("proxy_process_cache_ram_cache_misses")
            .help("proxy process cache ram misses")
            .register();

    protected final Gauge gaugeRamCacheHitRatio = Gauge.build()
            .name("proxy_node_cache_hit_mem_ratio")
            .help("proxy node cache hit mem ratio")
            .register();

}
