package com.company.State.loginsystem;

import javax.naming.Context;

/**
 * 主界面：有转发和注销的功能，此类为伪代码
 */
public class MainActivity {
    //    转发操作
    public void forward(Context context) {
        LoginContext.getLoginContext().forward(context);
    }

    //    评论操作
    public void comment(Context context) {
        LoginContext.getLoginContext().comment(context);
    }
}
