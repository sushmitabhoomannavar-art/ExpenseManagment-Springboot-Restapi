package com.example.expense_manager.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.expense_manager.Entity.Expense;
import com.example.expense_manager.Service.ExpenseService;
@RestController
@RequestMapping("/expense")
public class ExpenseController {
	@Autowired
    ExpenseService service;

    @PostMapping("/add")
    public Expense addExpense(@RequestBody Expense expense) {
        return service.addExpense(expense);
    }

    @GetMapping("/get")
    public List<Expense> getAllExpenses() {
        return service.getAllExpenses();
    }

    @GetMapping("/category/{category}")
    public List<Expense> getByCategory(@PathVariable String category) {
        return service.getExpensesByCategory(category);
    }

    @GetMapping("/total")
    public Map<String, Double> getTotalExpense() {
    	  return Map.of("totalExpense", service.getTotalExpense());
    }

    @GetMapping("/total/{category}")
    public Map<String, Double> getCategoryTotal(@PathVariable String category) {
    	 return Map.of("TotalExpenseByCategory", service.getCategoryTotal(category));
    }
    @DeleteMapping("/{id}")
    public String deleteExpense(@PathVariable int id) {
        return service.deleteExpense(id);
    }
}

