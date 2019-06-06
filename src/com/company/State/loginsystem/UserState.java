package com.company.State.loginsystem;

import javax.naming.Context;

/**
 * 用户状态接口，定义用户在所有状态下的行为
 */
public interface UserState {
    void forward(Context context);//转发

    void comment(Context context);//评论
}
