package com.company;

import com.oracle.tools.packager.Log;

public abstract class Main extends Person implements Trans{
    public static void main(String[] args) {
        Person Wang = new Person();
        Wang.introduce("老王");

        Car_ car1=new Car_();
        car1.nature("奔驰","白色",100000);
        Place <Integer> aaa =new Place<Integer>(123456);
        Place <String> bbb=new Place<String>("东北");
        System.out.println("我要开车去"+bbb.getPlace());
        System.out.println("去"+aaa.getPlace()+"公里的地方");
        System.out.print("我这次回家，准备");
        Thing a=new Friend();
        a.play("liu");
        Function(new Friend());

        Thing b=new Family();
        b.play("ming");
        Function(new Family());
    }
    public static void Function(Thing n){

        if (n instanceof Family){
            Family a=(Family)n;
            ((Family) n).play_two();
        }
        else if (n instanceof Friend){
            Friend a=(Friend)n;
            ((Friend) n).play_two();
        }
    }
}
