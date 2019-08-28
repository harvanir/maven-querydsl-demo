package org.harvan.maven.mavendemo.configuration;

import org.harvan.maven.mavendemo.properties.TestProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(TestProperties.class)
@Configuration
public class TestConfiguration {}
