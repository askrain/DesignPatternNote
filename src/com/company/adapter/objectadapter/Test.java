package com.company.adapter.objectadapter;

public class Test {

    public static void main(String[] args) {
        VoltAdapter adapter = new VoltAdapter(new Volt220());
        int nowVolt = adapter.getVolt5();
        System.out.println("现在的电压是： " + nowVolt);
    }
}
