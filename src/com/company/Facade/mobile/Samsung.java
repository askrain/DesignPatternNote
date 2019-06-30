package com.company.Facade.mobile;

public class Samsung implements Camera {
    @Override
    public void open() {
        System.out.println("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照");
    }

    @Override
    public void close() {
        System.out.println("关闭");
    }
}
