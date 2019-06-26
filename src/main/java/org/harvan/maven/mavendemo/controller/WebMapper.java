package org.harvan.maven.mavendemo.controller;

import org.mapstruct.factory.Mappers;

class WebMapper {

  static final WebBeanMapper MAPPER = Mappers.getMapper(WebBeanMapper.class);

  private WebMapper() {
  }
}