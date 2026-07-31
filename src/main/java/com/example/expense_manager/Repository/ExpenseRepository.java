package com.example.expense_manager.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.expense_manager.Entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Integer>{
	
	 List<Expense> findByCategory(String category);
}
