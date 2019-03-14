package org.homeunix.thecave.buddi.model.impl;

import org.homeunix.thecave.buddi.model.BudgetCategoryType;

import java.util.Date;

public class BudgetPeriod {
    private final Date date;

    public BudgetPeriod(Date startDate) {
        date = startDate;
    }

    public Date getDate() {
        return date;
    }

    Date getStartDate(BudgetCategoryImpl budgetCategory) {
        return budgetCategory.getBudgetPeriodType().getStartOfBudgetPeriod(getDate());
    }
}
