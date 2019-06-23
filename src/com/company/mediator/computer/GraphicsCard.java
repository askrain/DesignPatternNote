package com.company.mediator.computer;


/**
 * 显卡同事 ：播放视频
 */
public class GraphicsCard extends Colleague {
    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 播放视频
     *
     * @param data 视频数据
     */
    public void videoPlay(String data) {
        System.out.println("视频：" + data);
    }
}
