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
        // return 0;
        int comparison;
        int days;
        comparison = endDate.compareTo(startDate);
        days = comparison / (1000 * 60 * 60 * 24);  // get the number of days
        return days;
    }

    /**
     * Returns the total months on the subscription.
     *
     * @return
     */
    public int getTotalMonths() {
        // return 0;
        int comparison;
        int months;
        comparison = endDate.compareTo(startDate);
        months = comparison / (1000 * 60 * 60 * 24 * 12); // gets the number of months
        return months;
    }

    /*  TODO add new functionality to the SubscriptionPeriod class here and write a test for it in the test class.
     *  This functionality can be as simple as you want. The goal is to give you practice writing a test and some functionality
     */
    public int getTotalHours() {
        // return 0;
        int comparison;
        int hours;
        comparison = endDate.compareTo(startDate);
        hours = comparison/(1000 * 60 * 60);    // get the number of hours
        return hours;
    }
}
