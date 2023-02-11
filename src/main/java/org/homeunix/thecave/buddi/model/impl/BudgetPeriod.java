package org.homeunix.thecave.buddi.model.impl;

import org.homeunix.thecave.buddi.model.BudgetCategoryType;

import java.util.Date;

public class BudgetPeriod {
    private final Date date;
    private BudgetCategoryType budgetPeriodType;

    public BudgetPeriod(Date date, BudgetCategoryType categoryType) {
        this.date = date;
        this.budgetPeriodType = categoryType;
    }

    public Date getDate() {
        return date;
    }

    Date getStartDate() {
        return this.budgetPeriodType.getStartOfBudgetPeriod(getDate());
    }
}
