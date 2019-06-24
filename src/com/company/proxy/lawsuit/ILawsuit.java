package com.company.proxy.lawsuit;

/**
 * 诉讼接口类
 */
public interface ILawsuit {
    void submit();//提交申请

    void burden();//进行举证

    void defend();//开始辩护

    void finish();//诉讼完成
}
