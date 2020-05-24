package com.ligel.observerDesignPartent.dao;

public interface Subject {
    //注册观察者
    public void registerOberver(Observer o);
    //删除观察者
    public void removeObserver(Observer o);
    //提供的信息更新接口
    public void notifyObserver();


}
