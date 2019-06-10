package com.company.iterator.complex;

public class Request1 extends AbstractRequest {
    public Request1(Object object) {
        super(object);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }
}
