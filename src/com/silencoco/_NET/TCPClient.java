package com.silencoco._NET;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        /**
         * 设置IP、端口号
         * 使用socket中的getOutputStream方法获取os对象
         * 使用outputStream中的write给服务器发送数据
         *
         * getInputStream获取，read读取
         * 释放资源
         */
        Socket socket = new Socket("127.0.0.1",8888);
//        socket.getOutputStream().write(Integer.parseInt("向服务器发送数据..."));
        OutputStream os = socket.getOutputStream();
        os.write("客户端发出请求".getBytes());
        //读取服务器回写的数据
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.printf(new String(bytes,0,len));

        socket.close();
    }

}
