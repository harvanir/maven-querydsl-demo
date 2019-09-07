package org.harvanir.maven.mavendemo.entity;

import org.harvanir.maven.mavendemo.entity.model.Order;
import org.harvanir.maven.mavendemo.entity.response.order.OrderResponse;
import org.mapstruct.Mapper;

@Mapper
public interface EntityBeanMapper {

  OrderResponse mapFromModel(Order order);
}
