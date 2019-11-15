package org.homeunix.thecave.buddi.model.impl;

import org.homeunix.thecave.buddi.model.BudgetCategoryType;

import java.util.Date;

public class BudgetPeriod {
    private final Date date;

    public BudgetPeriod(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    Date getStartDate(BudgetCategoryType budgetPeriodType) {
        return budgetPeriodType.getStartOfBudgetPeriod(getDate());
    }
}
