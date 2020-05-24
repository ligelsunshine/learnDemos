package com.ligel.lckRule;

public class Student {
    private MyParent myParent;
    private MyTeacher myTeacher;

    public MyParent getMyParent() {
        return myParent;
    }
    //叫家长
    public void callParent(){
        System.out.println(myTeacher.getName()+"叫小明通知"+myParent.getName()+"来学校");
    }


    public void setMyParent(MyParent myParent) {
        this.myParent = myParent;
    }

    public MyTeacher getMyTeacher() {
        return myTeacher;
    }

    public void setMyTeacher(MyTeacher myTeacher) {
        this.myTeacher = myTeacher;
    }
}
