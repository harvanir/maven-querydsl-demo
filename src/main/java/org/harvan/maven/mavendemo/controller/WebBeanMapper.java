package org.harvan.maven.mavendemo.controller;

import org.harvan.maven.mavendemo.entity.model.Order;
import org.harvan.maven.mavendemo.entity.response.order.OrderResponse;
import org.mapstruct.Mapper;

@Mapper
public interface WebBeanMapper {

  OrderResponse mapFromModel(Order order);
}
