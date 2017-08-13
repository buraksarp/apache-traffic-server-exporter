package com.sarp.prometheus.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sarp on 8/12/17.
 */

@Configuration
public class RestTemplateConfig {

    @Value("${rest-template.root.URI}")
    private String rootURI;

    @Value("${rest-template.connection.timeout}")
    private int connectTimeout;

    @Value("${rest-template.read.timeout}")
    private int readTimeout;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.rootUri(rootURI)
                .setConnectTimeout(connectTimeout)
                .setReadTimeout(readTimeout)
                .build();
    }


}
