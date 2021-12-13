package com.cleristonpereira.workshopconceptualmodeling.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cleristonpereira.workshopconceptualmodeling.domain.enums.PaymentStatus;

@Entity
@Table(name = "tb_card_payment")
public class CardPayment extends Payment {
	private static final long serialVersionUID = 1L;
	
	private Integer installments;
	
	public CardPayment() {
	}

	public CardPayment(Long id, PaymentStatus status, Order order, Integer installments) {
		super(id, status, order);
		this.installments = installments;
	}

	public Integer getInstallments() {
		return installments;
	}

	public void setInstallments(Integer installments) {
		this.installments = installments;
	}
}
