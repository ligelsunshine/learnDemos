package com.ligel.interfaces;

/**
 * @version v1.0
 * @ProjectName: chatRoom
 * @ClassName: Client
 * @Description:
 * @Author: LIGEL
 * @Date: 2020/5/22 21:08
 */
public interface Client {
    /*加入房间*/
    public void intoChatRoom();
    /*发送信息*/
    public void sendMassage();
    /*接收信息*/
    public void receive();
}
