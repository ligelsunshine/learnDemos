package com.ligel.clients;

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @version v1.0
 * @ProjectName: chatRoom
 * @ClassName: Client01
 * @Description:
 * @Author: LIGEL
 * @Date: 2020/5/22 22:14
 */
public class Client01 {
    private PrintWriter out;
    /*输入*/
    private Scanner scan;
    private Boolean flag= true;
    /**/
    private Socket socket;
    /*输入流*/
    private InputStream in;

    /*构造方法*/
    public Client01(){
        try {
            socket= new Socket("172.20.10.4",8009);
            //返回此套接字的输入流。
            in= socket.getInputStream();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void intoChatRoom() {
        try {
            //1. 返回此套接字的输出流。
            out= new PrintWriter(socket.getOutputStream(),true);
            //2. 开启一个线程监听服务端的消息
            Thread watch= new Thread(new Runnable() {
                public void run() {
                    while (true){
                        try {
                            receive();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }
            });
            //3. 启动监听线程
            watch.start();
            //4. 主线程负责发送消息
            System.out.println("请输入你的用户名称！");
            scan= new Scanner(System.in);
            String name= scan.nextLine();
            out.println(name);
            System.out.println(name+",欢迎进入聊天室，输入quit退出");
            /*循环输入*/
            while (flag){
                /*获取用户输入的信息*/
                String read= scan.nextLine();
                if(read.equals("quit")){
                    flag= false;
                }
                out.println(read);
            }
        }catch (Exception e){

        }
    }

    public void sendMassage() {

    }

    /**
     * 接收服务器传来的信息
     */
    public void receive() {
        try {
            //传来是字节流
            byte ss[]= new byte[1024];
            //获取socket中的保存的信息
            int length= socket.getInputStream().read(ss);
            for (int i=0;i<ss.length;i++){
                System.out.print("服务器传来的信息："+ss[i]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread thread01= new Thread(new Runnable() {
            public void run() {
                Client client01 =new Client();
                client01.intoChatRoom();
            }
        });
        thread01.start();
    }
}
