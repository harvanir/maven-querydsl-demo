package org.harvanir.maven.mavendemo.service;

import java.util.List;
import java.util.Optional;
import org.harvanir.maven.mavendemo.entity.response.order.OrderResponse;

public interface OrderService {

  List<OrderResponse> findAll();

  Optional<OrderResponse> findById(Long id);
}
