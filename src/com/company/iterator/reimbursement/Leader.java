package com.company.iterator.reimbursement;

public abstract class Leader {
    protected Leader nextHandler;

    public abstract int limit();

    public abstract void handle(int money);

    public final void handleRequest(int money) {
        if (money < limit()) {
            handle(money);
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(money);
            }
        }
    }
}
