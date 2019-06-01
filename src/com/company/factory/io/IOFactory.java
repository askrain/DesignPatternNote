package com.company.factory.io;


//日常使用的时候经常会省略掉抽象工厂类，直接使用具体的工厂类，根据反射原理，动态生成所需要的实例对象
public class IOFactory {
    public static <T extends IOHandler> T getIOHandler(Class<IOHandler> clz) {
        IOHandler handler = null;
        try {
            handler = (IOHandler) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) handler;
    }

    ;
}
