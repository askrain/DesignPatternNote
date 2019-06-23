package com.company.mediator.computer;


/**
 * 主板中介者
 */
public class MainBoard extends Mediator {

    private CDDevice cdDevice;//光驱设备
    private CPU cpu;// CPU
    private SoundCard soundCard;//声卡设备
    private GraphicsCard graphicsCard;//显卡设备


    @Override
    public void changed(Colleague c) {
//       如果光驱读取了数据
        if (c == cdDevice) {  //关于此处为什么用 == 而不是instanceOf 是因为在客户端最终调用之前给中介者
//            设置了同一个光驱 和 cpu,所以比较的内存地址
            handleCD((CDDevice) c);
        } else if (c == cpu) {//如果CPU处理完数据
            handleCPU((CPU) c);
        }
    }

    /**
     * 处理光驱读取数据后与其他设备的交互
     *
     * @param cdDevice
     */
    private void handleCD(CDDevice cdDevice) {
        cpu.decodeData(cdDevice.read());
    }

    /**
     * 处理cpu读取数据后与其他设备的交互
     *
     * @param cpu
     */
    private void handleCPU(CPU cpu) {
        soundCard.soundPlay(cpu.getDataSound());
        graphicsCard.videoPlay(cpu.getDataVideo());
    }


    /**
     * 设置CD设备
     *
     * @param cdDevice cd设备
     */
    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }


    /**
     * 设置cpu
     *
     * @param cpu
     */
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }


    /**
     * 设置声卡
     *
     * @param soundCard 声卡设备
     */
    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    /**
     * 设置显卡
     *
     * @param graphicsCard 显卡设备
     */
    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
