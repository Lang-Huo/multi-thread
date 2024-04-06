package com.lslt;

import com.lslt.thread.InheritThread;

/**
 * @author lslt
 * @description
 * @date 2024/4/6 22:28
 */
public class Application {

    public static void main(String[] args) {

        InheritThread thread = new InheritThread("t1");
        thread.start();

    }
}
