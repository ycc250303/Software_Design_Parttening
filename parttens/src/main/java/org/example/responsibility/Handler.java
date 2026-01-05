package org.example.responsibility;

public abstract class Handler {
    protected final static int LEVEL_ONE = 1;
    protected final static int LEVEL_TWO = 3;
    protected final static int LEVEL_THREE = 7;

    private int numStart;
    private int numEnd;

    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void handleLeave(LeaveRequest leave);

    public final void submit(LeaveRequest leave) {
        this.handleLeave(leave);
        if (this.nextHandler != null && leave.getNum() > this.numEnd) {
            this.nextHandler.submit(leave);
        } else {
            System.out.println("流程结束！");
        }
    }

    public int getNumStart() {
        return numStart;
    }
}
