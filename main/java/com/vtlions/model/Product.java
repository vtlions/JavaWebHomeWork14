package com.vtlions.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
@NamedQuery(name="Product.getAll",query = "SELECT p FROM Product p")
@NamedQuery(name="Product.getByCategory",query = "SELECT p FROM Product p WHERE p.category=?1")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int id;
	private String product_name;
	private String product_description;
	private int product_price;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Category category;

	public int getId() {
		return id;
	}

	public Product setId(int id) {
		this.id = id;
		return this;
	}

	public String getProduct_name() {
		return product_name;
	}

	public Product setProduct_name(String product_name) {
		this.product_name = product_name;
		return this;
	}

	public String getProduct_description() {
		return product_description;
	}

	public Product setProduct_description(String product_description) {
		this.product_description = product_description;
		return this;
	}

	public int getProduct_price() {
		return product_price;
	}

	public Product setProduct_price(int product_price) {
		this.product_price = product_price;
		return this;
	}

	public Category getCategory() {
		return category;
	}

	public Product setCategory(Category category) {
		this.category = category;
		return this;
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
		Product other = (Product) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", product_name=" + product_name + ", product_description=" + product_description
				+ ", product_price=" + product_price + ", category=" + category + "]";
	}
}
