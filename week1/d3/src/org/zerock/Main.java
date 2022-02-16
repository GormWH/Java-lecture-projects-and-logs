package org.zerock;

public class Main {

    public static void main(String[] args) {
        Person suhong = new Person();
        suhong.height = 1.7;
        suhong.weight = 63;
        System.out.println(suhong.calcBMI());

    }
}

class Person {

    String name;
    String sex;
    double height;
    double weight;

    public double calcBMI() {
        return weight / (height * height);
    }
}
