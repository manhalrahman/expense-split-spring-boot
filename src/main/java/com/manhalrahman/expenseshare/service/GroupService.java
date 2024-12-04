package com.manhalrahman.expenseshare.service;

import com.manhalrahman.expenseshare.entities.Expense;
import com.manhalrahman.expenseshare.entities.Group;
import com.manhalrahman.expenseshare.entities.PaymentGraph;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GroupService {
    @Autowired private ExpenseService expenseService;
    private final Map<String, Group> groups = new HashMap<>();

    public PaymentGraph getGroupPaymentGraph(String groupId, String userId) {
        final Expense groupBalances = getBalances(groupExpenses);
        return expenseService.getPaymentGraph(resultExpense);
    }

    public Expense getBalances(String groupId, String userId) throws IllegalArgumentException {
        if(!group.getUsers().contains(userId)) {
            throw new IllegalAccessException("Invalid User ID " + userId + " for the group " + groupId);
        }
        return sumExpenses(expenseService.getGroupExpenses(groupId));
    }


}
