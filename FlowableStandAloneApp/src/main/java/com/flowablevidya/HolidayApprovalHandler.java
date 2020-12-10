package com.flowablevidya;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

public class HolidayApprovalHandler implements JavaDelegate {
    public void execute(DelegateExecution execution) {
        System.out.println("Leave Request Approved "
                + execution.getVariable("employee"));
    }
}
