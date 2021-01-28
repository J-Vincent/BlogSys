package com.gao.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @Author: hanko
 * @Date: 2020.12.7 18:52
 */
@Data
@Component
@ConfigurationProperties(prefix = "com.high")
public class PropertiesConfig {
    private String connectURL;
}
