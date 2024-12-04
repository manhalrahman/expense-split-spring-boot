package com.manhalrahman.expenseshare.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Group {
    private String name;
    private String imgUrl;
    private String description;
    private List<String> userList;
}
