package com.freshreview.onlineshopping.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateCreated;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<Product> product = new ArrayList<>();
    
    private Double cost;

	public Order(Long id, LocalDate dateCreated, List<Product> product, Double cost) {
		super();
		this.id = id;
		this.dateCreated = dateCreated;
		this.product = product;
		this.cost = cost;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double finalCost) {
		this.cost = finalCost;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", dateCreated=" + dateCreated + ", product=" + product + ", cost=" + cost + "]";
	}
	
}
