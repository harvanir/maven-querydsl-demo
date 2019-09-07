package org.harvanir.maven.mavendemo.configuration;

import org.harvanir.maven.mavendemo.properties.TestProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(TestProperties.class)
@Configuration
public class TestConfiguration {}
