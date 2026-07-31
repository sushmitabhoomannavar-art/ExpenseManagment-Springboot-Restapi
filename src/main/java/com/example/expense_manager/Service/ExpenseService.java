package com.example.expense_manager.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expense_manager.Entity.Expense;
import com.example.expense_manager.dao.ExpenseDao;
@Service
public class ExpenseService {
    @Autowired
    ExpenseDao dao;

    public Expense addExpense(Expense expense) {
        return dao.saveExpense(expense);
    }

    public List<Expense> getAllExpenses() {
        return dao.getAllExpenses();
    }

    public List<Expense> getExpensesByCategory(String category) {
        return dao.getByCategory(category);
    }

    public double getTotalExpense() {
        return dao.getAllExpenses()
                .stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }

    public double getCategoryTotal1(String category) {
        return dao.getByCategory(category)
                .stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }

    public double getCategoryTotal(String category) {
        return dao.getByCategory(category)
                .stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }

    public String deleteExpense(int id) {
        dao.deleteExpense(id);
        return "Expense Deleted Successfully";
    }
}

