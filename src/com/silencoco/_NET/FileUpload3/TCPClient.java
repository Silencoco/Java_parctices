package com.silencoco._NET.FileUpload3;

import java.io.*;

import java.net.Socket;
import java.nio.ByteBuffer;

/**
 * 通过buffer流实现对文件的上传，对服务器数据的读取
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",6666);
        //创建输入流，获取本地文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\upload\\a.txt"));
        //创建输出流，写到服务器
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        //写入数据
        byte[] bytes = new byte[1024 * 8];
        int len;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0, len);
            bos.flush();
        }
        System.out.println("文件发送完毕");

        socket.close();
        bis.close();
        bos.close();
    }
}
