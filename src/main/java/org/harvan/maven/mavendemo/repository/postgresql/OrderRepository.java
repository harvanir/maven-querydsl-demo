package org.harvan.maven.mavendemo.repository.postgresql;

import org.harvan.maven.mavendemo.entity.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {}
