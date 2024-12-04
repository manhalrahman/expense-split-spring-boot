package com.manhalrahman.expenseshare.entities;

import lombok.Data;

import java.util.Map;

@Data
public class BalanceMap {
    private Map<User, Amount> balances;
}
