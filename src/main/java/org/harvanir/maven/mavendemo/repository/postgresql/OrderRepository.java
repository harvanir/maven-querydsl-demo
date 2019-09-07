package org.harvanir.maven.mavendemo.repository.postgresql;

import org.harvanir.maven.mavendemo.entity.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {}
