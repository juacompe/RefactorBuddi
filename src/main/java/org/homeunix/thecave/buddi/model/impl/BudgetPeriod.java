package org.homeunix.thecave.buddi.model.impl;

import java.util.Date;

public class BudgetPeriod {
    private final Date startDate;

    public BudgetPeriod(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    Date getStartOfBudgetPeriod(BudgetCategoryImpl budgetCategory) {
        return budgetCategory.getBudgetPeriodType().getStartOfBudgetPeriod(getStartDate());
    }
}
