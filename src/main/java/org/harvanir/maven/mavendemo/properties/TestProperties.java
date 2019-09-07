package org.harvanir.maven.mavendemo.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "test.configuration")
public class TestProperties {

  private String value;
}
