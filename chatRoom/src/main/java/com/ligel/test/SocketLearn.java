package com.ligel.test;

import java.net.InetAddress;
import java.net.Socket;

/**
 * @version v1.0
 * @ProjectName: chatRoom
 * @ClassName: SocketLearn
 * @Description:
 * @Author: LIGEL
 * @Date: 2020/5/23 7:46
 */
public class SocketLearn {
    public static void main(String[] args) {
        //Socket socket= new Socket("172.20.10.4",5001,"172.20.10.4",8000);
        try {
            /*通过制定ip查看ip,感觉这个方法很没用*/
            InetAddress inetAddress= InetAddress.getByName("172.20.10.4");
            /*获取本地ip地址*/
            InetAddress localhostAddress= InetAddress.getLocalHost();
            String localPort= localhostAddress.getHostAddress();
            System.out.println("查看本地ip地址："+localPort);
            /*通过指定域名来查看ip*/
            InetAddress baidu = InetAddress.getByName("www.baidu.com");
            System.out.println("查看百度域名的ip地址："+baidu);
            System.out.println("指定ip的域名："+inetAddress);
            System.out.println("查看本地ip："+localhostAddress);

        }catch (Exception e){
            e.printStackTrace();
        }

        /*测试socket*/
        try {
            String baidu= InetAddress.getByName("www.baidu.com").getHostAddress();
            String localAddress= InetAddress.getLocalHost().getHostAddress();

            Socket socket= new Socket(baidu,5000, InetAddress.getByName(localAddress),5001);
            System.out.println("查看socket端口："+socket.getPort());

        }catch (Exception e){
//          /*这段代码是会报错的，因为没有服务器监听指定的端口，相当于这里缺少了服务器Server*/
            e.printStackTrace();
        }
    }
}
