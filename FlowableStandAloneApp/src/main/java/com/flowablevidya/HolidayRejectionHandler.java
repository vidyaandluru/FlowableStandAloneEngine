package com.flowablevidya;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class HolidayRejectionHandler implements JavaDelegate {
    public void execute(DelegateExecution execution) {
        System.out.println("Leave Request Rejected "
                + execution.getVariable("employee"));
    }
}
