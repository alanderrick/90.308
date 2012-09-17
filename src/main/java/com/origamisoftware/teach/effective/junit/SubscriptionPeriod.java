package com.origamisoftware.teach.effective.junit;

import java.util.Calendar;
import java.util.Date;


/**
 * A simple Date Range Class
 *
 * @author Spencer A Marks
 */
public class SubscriptionPeriod {

    private Date startDate;
    private Date endDate;

    /**
     * Creates a  SubscriptionPeriod instance
     *
     * @param startDate
     * @param endDate
     */
    public SubscriptionPeriod(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Returns the the start date of the subscription
     *
     * @return
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Returns the the end date of the subscription
     *
     * @return
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Returns the total Days in the subscription
     *
     * @return
     */
    public int getTotalDays() {
        return (int) ((endDate.getTime() - startDate.getTime()) / (1000 * 60 * 60 * 24));
    }

    /**
     * Returns the total months on the subscription.
     *
     * @return
     */
    public int getTotalMonths() {
        Calendar beginCalendar = Calendar.getInstance();
        beginCalendar.setTime(startDate);
        Calendar endingCalendar = Calendar.getInstance();
        endingCalendar.setTime(endDate);

        int months = endingCalendar.get(Calendar.MONTH) - beginCalendar.get(Calendar.MONTH);
        int years = endingCalendar.get(Calendar.YEAR) - beginCalendar.get(Calendar.YEAR);
        return months = ( months + years * 12);
    }

    /*  TODO add new functionality to the SubscriptionPeriod class here and write a test for it in the test class.
     *  This functionality can be as simple as you want. The goal is to give you practice writing a test and some functionality
     */
    public int getTotalYears() {
        Calendar beginningCalendar = Calendar.getInstance();
        beginningCalendar.setTime(startDate);
        Calendar endingCalendar = Calendar.getInstance();
        endingCalendar.setTime(endDate);

        int years;
        return years = (endingCalendar.get(Calendar.YEAR) - beginningCalendar.get(Calendar.YEAR));
    }
}
