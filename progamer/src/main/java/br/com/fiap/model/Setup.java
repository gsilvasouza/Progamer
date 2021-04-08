package br.com.fiap.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_SETUP")
public class Setup {
	@Id
	private String name;
	private String description;
	private BigDecimal price;

	public Setup() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "SetupBean [name=" + getName() + ", description=" + getDescription() + ", price=" + getPrice() + "]";
	}
}