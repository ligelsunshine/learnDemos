package com.ligel.lckRule;

public class LckRuleTest {
    public static void main(String[] args) {
        Student student=new Student();
        student.setMyParent(new MyParent("小明的爸爸"));
        student.setMyTeacher(new MyTeacher("小明的老师"));
        student.callParent();
    }
}
