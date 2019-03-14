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

    int getDaysBetween() {
        return DateUtil.getDaysBetween(getStartDate(), getEndDate(), true);
    }

    public long getOverlappingDays(Period p) {
        Date laterStart = startDate.after(p.startDate)? startDate: p.startDate;
        Date earlierEnd = endDate.before(p.endDate)? endDate: p.endDate;
        return new Period(laterStart, earlierEnd).getDaysBetween();
    }
}
