package com.charles.library.util;

import java.io.Closeable;
import java.io.IOException;

/**
 * Author:charles_lun
 * email:1c1031012395@gmail.com
 * Date: 2017/9/13
 * Description:关闭所有实现Closeable接口的工具
 */

public class CloseUtils {

    /**
     * 关闭IO
     *
     * @param closeables closeables
     */
    public static void closeIO(final Closeable... closeables) {
        if (closeables == null) return;
        for (Closeable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
