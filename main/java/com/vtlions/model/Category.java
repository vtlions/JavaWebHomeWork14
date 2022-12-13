package com.vtlions.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private int id;
	private String category_name;

	public Category() {
	}

	public int getId() {
		return id;
	}

	public Category setId(int id) {
		this.id = id;
		return this;
	}

	public String getCategory_name() {
		return category_name;
	}

	public Category setCategory_name(String category_name) {
		this.category_name = category_name;
		return this;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", category_name=" + category_name + "]";
	}
	
	
}
