package com.cleristonpereira.workshopconceptualmodeling.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cleristonpereira.workshopconceptualmodeling.domain.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_payment_with_slip")
public class PaymentWithSlip extends Payment {
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dueDate;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date paymentDate;
	
	public PaymentWithSlip() {
	}

	public PaymentWithSlip(Long id, PaymentStatus status, Order order, Date dueDate, Date paymentDate) {
		super(id, status, order);
		this.dueDate = dueDate;
		this.paymentDate = paymentDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
}
