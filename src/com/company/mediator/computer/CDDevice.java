package com.company.mediator.computer;


/**
 * 光驱同事
 * CD设备负责读取光盘的数据并将数据提供给主板
 */
public class CDDevice extends Colleague {

    private String data;//视频数据

    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    /**
     * 读取视频数据
     *
     * @return 视频数据
     */
    public String read() {
        return data;
    }

    /**
     * 加载视频数据
     */
    public void load() {
//        实际情况中视频数据与音频诗句都在一个数据流中
        data = "视频数据,音频数据";
        mediator.changed(this);
    }
}
