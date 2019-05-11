package org.homeunix.thecave.buddi.model.impl;

import org.homeunix.thecave.buddi.model.BudgetCategoryType;

import java.util.Date;

public class BudgetPeriod {
    private final Date date;
    private BudgetCategoryType budgetPeriodType;

    public BudgetPeriod(Date startDate, BudgetCategoryType budgetPeriodType) {
        this.date = startDate;
        this.budgetPeriodType = budgetPeriodType;
    }

    public Date getDate() {
        return date;
    }

    Date getStartDate() {
        return this.budgetPeriodType.getStartOfBudgetPeriod(getDate());
    }

    @Override
    public boolean equals(Object obj) {
        return getStartDate().equals(((BudgetPeriod) obj).getStartDate());
    }

}
