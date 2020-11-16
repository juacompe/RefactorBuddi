package org.homeunix.thecave.buddi.model.impl;

import java.util.Date;

public class BudgetPeriod {
    private final Date date;

    public BudgetPeriod(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    Date getStartDate(BudgetCategoryImpl budgetCategory) {
        return budgetCategory.getBudgetPeriodType().getStartOfBudgetPeriod(getDate());
    }
}
