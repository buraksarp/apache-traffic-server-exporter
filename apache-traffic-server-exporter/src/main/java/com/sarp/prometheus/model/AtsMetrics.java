package com.sarp.prometheus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Created by sarp on 8/11/17.
 */

@Getter
public class AtsMetrics {

    @JsonProperty("global")
    private GlobalMetrics globalMetrics;

}
