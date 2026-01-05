package org.example.responsibility;

public class Manager extends Handler{
    public Manager() {
        super(Handler.LEVEL_ONE, Handler.LEVEL_TWO);
    }

    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent());
        System.out.println("经理审批：同意");
    }
}
