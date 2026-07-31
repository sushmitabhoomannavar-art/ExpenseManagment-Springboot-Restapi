package com.example.expense_manager.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.expense_manager.Entity.Expense;
import com.example.expense_manager.Repository.ExpenseRepository;
@Repository
public class ExpenseDao {
	@Autowired
    ExpenseRepository repository;

    public Expense saveExpense(Expense expense) {
        return repository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public List<Expense> getByCategory(String category) {
        return repository.findByCategory(category);
    }

    public void deleteExpense(int id) {
        repository.deleteById(id);
    }

}
