package com.manhalrahman.expenseshare.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
public class PaymentGraph {
    //User -> User, amount
    private Map<User, BalanceMap> graph;


}
