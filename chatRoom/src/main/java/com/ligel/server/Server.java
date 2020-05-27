package com.ligel.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @ProjectName: chatRoom
 * @ClassName: Serve
 * @Description:
 * @Author: LIGEL
 * @Date: 2020/5/22 21:51
 */
public class Server {
    //保存连接的用户
    private List<ThreadServer> clients=new ArrayList<ThreadServer>();

    //内部类
    public  class ThreadServer implements Runnable {
        private Socket socket;
        private BufferedReader br;
        private  List<OutputStream> outs= new ArrayList<OutputStream>();
        //保存了输出流
        private PrintWriter out;
        private String name;
        private Boolean flag = true;

        public ThreadServer(Socket socket) throws IOException {
            this.socket = socket;
            //输入缓存
            outs.add(socket.getOutputStream());
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            String str = br.readLine();
            name = str + "[" + socket.getInetAddress().getHostAddress() + ":" + socket.getPort() + "]";
            System.out.println(name + "加入该聊天室");
            /*这里就没有发过去，每个终端没有接收到信息*/
            send(name + "加入该聊天室");
            clients.add(this);
        }

        private void send(String message) {
//            outs.forEach(out->{
//                System.out.println("-->已向线程" +01 + "发送消息");
//                byte[] bytes = message.getBytes();
//                try {
//                    out.write(bytes);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            });
            for (ThreadServer threadServer : clients) {
                System.out.println("-->已向线程" + threadServer.name + "发送消息");
                threadServer.out.print(message);
                threadServer.out.flush();
            }
        }

        private void receive() throws IOException {
            String message;
            while (flag = true) {
                message = br.readLine();
                if (message.equalsIgnoreCase("quit")) {
                    System.out.println("用户" + name + "退出了");
                    out.println("quit");
                    out.flush();
                    clients.remove(this);
                    flag = false;
                }
                System.out.println(name + ":" + message);
                send(name + ":" + message);
            }
        }
        public void run() {
            try {
                while (flag = true) {
                    receive();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void startup() throws IOException {
        System.out.println("监听8009端口");
        //创建一个服务器端口
        ServerSocket ss=new ServerSocket(8009);
        while(true){
            //获取端口的信息
            Socket socket=ss.accept();
            System.out.println("发现新用户" +
                    socket.getInetAddress().getHostAddress()
                    +":"+socket.getPort());
            //为每一个socker新建一个线程
            Thread st=new Thread(new ThreadServer(socket));
            st.start();
            System.out.println("一共有多少用户加入聊天房间："+clients.size());
        }
    }

    public static void main(String []args) throws IOException {
        Server server=new Server();
        System.out.println("服务器开启");
        server.startup();

    }

}
