package com.silencoco._NET.FileUpload2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 文件上传案例的客户端：
 * 读取本地文件，上传到服务器，读取服务器回写的数据
 *
 * 实现步骤：
 * 1、创建一个本地字节输入流FileInputStream对象，构造方法中绑定要输入的数据源
 * 2、创建客户端Socket对象，构造方法中绑定服务器的IP和端口号
 * 3、使用Socket中的方法getOutputStream，获取网络字节输出流outputStream对象
 * 4、使用本地字节输入流FileInputStream对象中的方法read读取本地文件
 * 5、使用网络字节输出流SocketOutputStream对象中的write，把读取到的文件上传到服务器
 * 6、使用Socket中的方法getInputStream，获取网络字节输入流InputStream对象
 * 7、使用网络字节输入流InputStream对象中的方法read读取服务回写的数据
 * 8、释放资源
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\upload\\preview.jpg");
        Socket socket = new Socket("127.0.0.1",8888);
        //通过字节流向服务器上传本地文件
        OutputStream os = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];//设置一次读取长度
        while ((len = fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();//在对于套接字添加终止序列
        //读取服务器回写的数据
        InputStream is = socket.getInputStream();//获取读取
        while ((len = is.read(bytes))!=-1){
            System.out.printf(new String(bytes,0,len));
        }

        fis.close();
        socket.close();
    }

}
