package com.company.adapter.objectadapter;

//适配器角色
public class VoltAdapter implements FiveVolt {
    Volt220 volt220;

    public VoltAdapter(Volt220 volt220) {
        this.volt220 = volt220;
    }

    public int getVolt220() {
        return volt220.getVolt220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}
