package com.alen.TCP.CSTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 创建ServerSocket对象，指定端口号，
 * 使用ServerSocket对象中的accept获取到请求的客户端对象Socket
 * 使用socket对象中国年的getInputStream获取输入流
 * read读取
 * 在用socket.getOutputStream write 回写数据
 * close
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        //读取客户端的数据
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.printf(new String(bytes,0,len));
        //向客户端回写数据
        OutputStream os = socket.getOutputStream();
        os.write("服务器收到请求并响应".getBytes());

        serverSocket.close();
        socket.close();
    }
}
