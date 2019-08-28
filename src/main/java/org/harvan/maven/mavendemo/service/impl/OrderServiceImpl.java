package org.harvan.maven.mavendemo.service.impl;

import static org.harvan.maven.mavendemo.entity.EntityMapper.MAPPER;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.harvan.maven.mavendemo.entity.model.Order;
import org.harvan.maven.mavendemo.entity.model.QOrder;
import org.harvan.maven.mavendemo.entity.response.order.OrderResponse;
import org.harvan.maven.mavendemo.repository.postgresql.OrderRepository;
import org.harvan.maven.mavendemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

  private OrderRepository orderRepository;

  @Autowired
  public void setOrderRepository(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  @Override
  public List<OrderResponse> findAll() {
    QOrder qOrder = QOrder.order;

    return orderRepository.findAll().stream()
        .map(MAPPER::mapFromModel)
        .collect(Collectors.toList());
  }

  @Override
  public Optional<OrderResponse> findById(Long id) {
    Optional<Order> byId = orderRepository.findById(id);
    return byId.map(MAPPER::mapFromModel);
  }
}
