package org.harvanir.maven.mavendemo.controller;

import org.harvanir.maven.mavendemo.entity.model.Order;
import org.harvanir.maven.mavendemo.entity.response.order.OrderResponse;
import org.mapstruct.Mapper;

@Mapper
public interface WebBeanMapper {

  OrderResponse mapFromModel(Order order);
}
