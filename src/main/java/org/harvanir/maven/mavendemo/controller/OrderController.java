package org.harvanir.maven.mavendemo.controller;

import static reactor.core.scheduler.Schedulers.elastic;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.harvanir.maven.mavendemo.entity.response.order.OrderResponse;
import org.harvanir.maven.mavendemo.exception.NotFoundException;
import org.harvanir.maven.mavendemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orders")
public class OrderController {

  private OrderService orderService;

  @Autowired
  public void setOrderService(OrderService orderService) {
    this.orderService = orderService;
  }

  @GetMapping("/id/{id}")
  public Mono<OrderResponse> findById(@PathVariable @Valid @NotNull Long id) {
    return Mono.defer(
            () ->
                orderService
                    .findById(id)
                    .map(Mono::just)
                    .orElseGet(() -> Mono.error(new NotFoundException("Order not found"))))
        .subscribeOn(elastic());
  }

  @GetMapping
  public Flux<OrderResponse> findAll() {
    return Flux.defer(() -> Flux.fromIterable(orderService.findAll())).subscribeOn(elastic());
  }
}
