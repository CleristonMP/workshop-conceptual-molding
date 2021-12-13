package com.cleristonpereira.workshopconceptualmodeling.domain.enums;

public enum CustomerType {

	PESSOA_FISICA(1, "Pessoa Física"),
	PESSOA_JURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String description;
	
	private CustomerType(int cod, String description) {
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
	
	public static CustomerType toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		for (CustomerType x : CustomerType.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
