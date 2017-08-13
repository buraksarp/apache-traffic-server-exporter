package com.sarp.prometheus.service;

import com.sarp.prometheus.model.GlobalMetrics;

/**
 * Created by sarp on 8/12/17.
 */


public interface PrometheusService {

    void ingestAtsMetrics();

    GlobalMetrics getAtsMetrics();
}
