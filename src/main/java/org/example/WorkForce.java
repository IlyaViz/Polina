package org.example;

public class WorkForce {
    Integer participants;
    Float daySalary;
    Integer workingDays;
    
    public WorkForce(Integer participants, Float daySalary, Integer workingDays){
        this.participants = participants;
        this.daySalary = daySalary;
        this.workingDays = workingDays;
    };
    
    public WorkForce(Integer participants, Integer workingDays){
        this.participants = participants;
        this.workingDays = workingDays;
    }

    public WorkForce(Integer participants){
        this.participants = participants;
    }
}
