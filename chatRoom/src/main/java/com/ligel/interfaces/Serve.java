package com.ligel.interfaces;

/**
 * @version v1.0
 * @ProjectName: chatRoom
 * @ClassName: Serve
 * @Description:
 * @Author: LIGEL
 * @Date: 2020/5/22 21:08
 */
public interface Serve {
    /*转发信息*/
    public void sendMassage(String massage);
    /*接收信息*/
    public void rereceive();
}
