package com.silencoco._NET.FileUpload3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 读取和回写
 *
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动……");
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket = serverSocket.accept();//建立连接
        //创建输入流，读取文件数据
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        //创建输出流，保存到本地
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\upload\\a_copy.txt"));
        //读写数据
        byte[] bytes = new byte[1024 * 8];
        int len=0;
        while ((len=bis.read(bytes))!=-1) {
            bos.write(bytes,0,len);
        }

        socket.close();
        bis.close();
        bos.close();
    }

}
