package org.harvan.maven.mavendemo.entity;

import org.harvan.maven.mavendemo.entity.model.Order;
import org.harvan.maven.mavendemo.entity.response.order.OrderResponse;
import org.mapstruct.Mapper;

@Mapper
public interface EntityBeanMapper {

  OrderResponse mapFromModel(Order order);
}