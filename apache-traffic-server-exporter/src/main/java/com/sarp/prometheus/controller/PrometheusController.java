package com.sarp.prometheus.controller;

import com.sarp.prometheus.service.PrometheusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by sarp on 8/11/17.
 */


@RestController
@RequiredArgsConstructor
public class PrometheusController {

    private final PrometheusService prometheusService;

    @GetMapping(path = "/ingest-ats-metrics")
    public void ingestAtsMetrics() {
        this.prometheusService.ingestAtsMetrics();
    }

}
