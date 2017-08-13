package com.sarp.prometheus.config;

import io.prometheus.client.exporter.MetricsServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sarp on 8/11/17.
 */

@Configuration
public class MonitoringConfig {

    @Bean
    ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new MetricsServlet(), "/metrics");
    }

}
