package com.programming.techie.mongo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("expense")
public class Expense {
    @Id
    private String id;
    @Field("name")
    @Indexed(unique = true)
    private String expenseName;
    @Field("category")
    private ExpenseCategory expenseCategory;
    @Field("amount")
    private BigDecimal expenseAmount;
}
