package org.harvan.maven.mavendemo.entity.model;

import java.time.ZonedDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long id;

  @Column private ZonedDateTime createdAt;

  @Column private ZonedDateTime updatedAt;

  @Column private String status;

  @Column private String applicationOrderId;

  @Column private Long applicationId;

  @Column private String applicationName;

  @Column private String applicationLogoUrl;

  @Column private Long outletId;

  @Column private Long businessId;

  @Column private Long paymentId;

  @Column private String paymentType;

  @Column private String note;

  @Column private String completeOrderNotificationUrl;

  @Column private String acceptOrderNotificationUrl;

  @Column private String cancelOrderNotificationUrl;

  @Column private String assignExpeditionNotificationUrl;

  @Column private Long salesTypeId;

  @Column private String salesTypeName;
}
