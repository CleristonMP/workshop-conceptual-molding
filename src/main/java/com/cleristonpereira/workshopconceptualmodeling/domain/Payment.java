package com.cleristonpereira.workshopconceptualmodeling.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.cleristonpereira.workshopconceptualmodeling.domain.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "tb_payment")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private Integer status;
	
	@JsonBackReference
	@OneToOne
	@JoinColumn(name = "order_id")
	@MapsId
	private Order order;
	
	public Payment() {
	}

	public Payment(Long id, PaymentStatus status, Order order) {
		super();
		this.id = id;
		this.status = status.getCod();
		this.order = order;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PaymentStatus getStatus() {
		return PaymentStatus.toEnum(status);
	}

	public void setStatus(PaymentStatus status) {
		this.status = status.getCod();
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(id, other.id);
	}
}
