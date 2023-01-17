package org.homeunix.thecave.buddi.model.impl;

import org.homeunix.thecave.buddi.model.BudgetCategoryType;

import java.util.Date;

public class BudgetPeriod {
    private final Date date;
    private BudgetCategoryType budgetPeriodType;

    public BudgetPeriod(Date date, BudgetCategoryType budgetPeriodType) {
        this.date = date;
        this.budgetPeriodType = budgetPeriodType;
    }

    public Date getDate() {
        return date;
    }

    Date getStartDate() {
        return budgetPeriodType.getStartOfBudgetPeriod(getDate());
    }

    Date getEndDate() {
        return budgetPeriodType.getEndOfBudgetPeriod(getDate());
    }

    @Override
    public boolean equals(Object obj) {
        return getStartDate().equals(
                ((BudgetPeriod) obj).getStartDate());
    }
}
