package org.homeunix.thecave.buddi.model.impl;

import org.homeunix.thecave.buddi.model.BudgetCategoryType;

import java.util.Date;

public class BudgetPeriod {
    private final Date date;
    private BudgetCategoryType budgetPeriodType;

    public BudgetPeriod(Date startDate, BudgetCategoryType budgetPeriodType) {
        date = startDate;
        this.budgetPeriodType = budgetPeriodType;
    }

    public Date getDate() {
        return date;
    }

    Date getStartDate() {
        return this.budgetPeriodType.getStartOfBudgetPeriod(getDate());
    }

    Date getEndDate() {
        return this.budgetPeriodType.getEndOfBudgetPeriod(getDate());
    }

    @Override
    public boolean equals(Object obj) {
        return getStartDate().equals(((BudgetPeriod) obj).getStartDate());
    }

    BudgetPeriod getNext() {
        return new BudgetPeriod(budgetPeriodType.getBudgetPeriodOffset(getStartDate(), 1), budgetPeriodType);
    }

    BudgetPeriod getPrevious() {
        return new BudgetPeriod(budgetPeriodType.getBudgetPeriodOffset(getDate(), -1), budgetPeriodType);
    }

    long getDays() {
        return budgetPeriodType.getDaysInPeriod(getStartDate());
    }

    long getAmount(BudgetCategoryImpl budgetCategory) {
        return budgetCategory.getAmount(getStartDate());
    }

    public Period getPeriod() {
        return new Period(getStartDate(), getEndDate());
    }
}
