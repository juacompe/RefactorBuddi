package org.homeunix.thecave.buddi.model.impl;

import ca.digitalcave.moss.common.DateUtil;

import java.util.Date;

public class Period {
    private final Date startDate;
    private final Date endDate;

    public Period(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Date before(Period period) {
        return null;
    }

    public long overlappingDays(Period period) {
        Date startDate = period.getStartDate().after(getStartDate())? period.getStartDate(): getStartDate();
        Date endDate = period.getEndDate().before(getEndDate())? period.getEndDate(): getEndDate();
        long daysBetween = DateUtil.getDaysBetween(startDate, endDate, true);
        return daysBetween;
    }
}
