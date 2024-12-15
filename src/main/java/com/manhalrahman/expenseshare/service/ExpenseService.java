package com.manhalrahman.expenseshare.service;

import com.manhalrahman.expenseshare.entities.Expense;
import com.manhalrahman.expenseshare.entities.PaymentGraph;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {
    public PaymentGraph getPaymentGraph(Expense expense) {
        return new PaymentGraph();
    }
}
