package com.company.mediator.computer;


/**
 * 通过客户端来模式电脑播放电影的效果
 */
public class Client {

    public static void main(String[] args) {

        //构造主板对象
        MainBoard mediator = new MainBoard();

        //分别构造各个零部件
        CDDevice cdDevice = new CDDevice(mediator);
        CPU cpu = new CPU(mediator);
        GraphicsCard gc = new GraphicsCard(mediator);
        SoundCard soundCard = new SoundCard(mediator);

        //将各个零部件安装到主板
        mediator.setCdDevice(cdDevice);
        mediator.setCpu(cpu);
        mediator.setSoundCard(soundCard);
        mediator.setGraphicsCard(gc);

        //完成后就可以开始放片了
        cdDevice.load();
    }
}
