package com.cleristonpereira.workshopconceptualmodeling.domain.enums;

public enum PaymentStatus {

	PENDING(1, "Pendente"),
	SETTLED(2, "Quitado"),
	CANCELLED(3, "Cancelado");
	
	private int cod;
	private String description;
	
	private PaymentStatus(int cod, String description) {
		this.cod = cod;
		this.description = description;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public static PaymentStatus toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (PaymentStatus x : PaymentStatus.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
