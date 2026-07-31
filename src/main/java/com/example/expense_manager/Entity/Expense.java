package com.example.expense_manager.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Expense {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "expense_seq")
	@SequenceGenerator(
	    name = "expense_seq",
	    sequenceName = "expense_sequence",
	    initialValue = 101,
	    allocationSize = 1
	)
    private int id;

    private String title;

    private double amount;

    private String category;

    private LocalDate date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
    
    

}