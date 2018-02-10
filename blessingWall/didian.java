package com.company;

public class didian<String>{
    public void Dongbei(){
        System.out.print("目的地东北到了！请做好准备！");
    }
    public void Guangxi(){
        System.out.print("目的地广西到了！请做好准备！");
    }
    public void Shanxi(){
        System.out.print("目的地山西到了！请做好准备！");
    }
    public void Beijing(){
        System.out.print("目的地北京到了！请做好准备！");
    }
    public void Guangdong(){
        System.out.print("目的地广东到了！请做好准备！");
    }
    private String place;
    public didian(String place){
        this.place=place;
    }
    public String getPlace() {
        return place;
    }
}
