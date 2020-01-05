package com.cn;

public class happy {
   public int age;

    public int getAge() {
        System.out.println("年龄"+age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public happy(String name){
        System.out.println("名字是"+name);
    }


    public static void main(String[] args) {
        happy h = new happy("狗");
      h.setAge(8);
      h.getAge();
    }
}