package com.company.mediator.computer;

/**
 * 声卡同事
 */
public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 播放音频
     *
     * @param data 音频数据
     */
    public void soundPlay(String data) {
        System.out.println("音频： " + data);
    }
}
