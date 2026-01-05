package org.example.responsibility;

public class GroupLeader extends Handler{
    public GroupLeader() {
        super(0,Handler.LEVEL_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+leave.getNum()+"天，"+leave.getContent());
        System.out.println("小组长审批：同意");
    }
}
