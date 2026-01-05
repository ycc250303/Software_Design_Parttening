package org.example.responsibility;

public class GeneralManager extends Handler{
    public GeneralManager() {
        super(Handler.LEVEL_TWO, Handler.LEVEL_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent());
        System.out.println("总经理审批：同意");
    }
}
