package org.harvan.maven.mavendemo.controller;

import static reactor.core.scheduler.Schedulers.elastic;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.harvan.maven.mavendemo.entity.response.order.OrderResponse;
import org.harvan.maven.mavendemo.exception.NotFoundException;
import org.harvan.maven.mavendemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/order")
public class OrderController {

  private OrderService orderService;

  @Autowired
  public void setOrderService(OrderService orderService) {
    this.orderService = orderService;
  }

  @RequestMapping("/id/{id}")
  public Mono<OrderResponse> findById(@PathVariable @Valid @NotNull Long id) {
    return Mono.defer(() -> orderService.findById(id)
        .map(Mono::just)
        .orElseGet(() -> Mono.error(new NotFoundException("Order not found"))))
        .subscribeOn(elastic());
  }

  @RequestMapping
  public Flux<OrderResponse> findAll() {
    return Flux.defer(() -> Flux.fromIterable(orderService.findAll()))
        .subscribeOn(elastic());
  }
}