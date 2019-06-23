package com.company.mediator.computer;

/**
 * CPU同事，负责从主板传递来的音、视频数据的解码
 */
public class CPU extends Colleague {

    private String dataVideo, dataSound;//视频和音频数据

    public CPU(Mediator mediator) {
        super(mediator);
    }

    /**
     * 获取视频数据
     *
     * @return 视频数据
     */
    public String getDataVideo() {
        return dataVideo;
    }

    /**
     * 获取音频数据
     *
     * @return 音频数据
     */
    public String getDataSound() {
        return dataSound;
    }


    /**
     * 解码数据
     *
     * @param data 音、视频数据
     */
    public void decodeData(String data) {

        //分隔 音、视频数据
        String[] temp = data.split(",");

        //解析音、视频数据
        dataVideo = temp[0];
        dataSound = temp[1];

        mediator.changed(this);

    }
}
