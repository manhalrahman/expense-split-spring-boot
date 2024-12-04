package com.manhalrahman.expenseshare.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Expense {
    private BalanceMap userBalances;
    private String title;
    private String description;
    private String imageUrl;
}
