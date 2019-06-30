package com.company.Facade.mobile;

public class MobilePhone {

    private Phone phone = new PhoneImpl();
    private Camera camera = new Samsung();


    public void call() {
        phone.call();
    }

    public void videoChat() {
        System.out.println("视频聊天接通中。。。");
        camera.open();
        phone.call();
    }

    public void hangUp() {
        phone.hangUp();
    }

    public void takePicture() {
        camera.takePicture();
    }

    public void closeCamera() {
        camera.close();
    }
}
