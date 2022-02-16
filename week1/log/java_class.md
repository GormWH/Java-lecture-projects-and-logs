# 2022-02-16

## 클래스

### 클래스란?

[Classes and Objects in Java(Geeks for Geeks)](https://www.geeksforgeeks.org/classes-objects-java/#:~:text=real%20life%20entities.-,Class,all%20objects%20of%20one%20type.)  
위 링크의 설명에 의하면

> A class is a user defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type.

라고 한다.  
클래스는 객체(object)를 만드는 설계도 같은 것이다.

1. 클래스는 하나의 타입으로 사용될 수 있고
2. 여러가지 속성(property) 혹은 함수(method)로 이루어져 있다.

위 두가지만으로 설명하기엔 훨씬 더 많은 기능과 특징들이 있지만 일단은 어떤 것인지 설명하는 선에서 마무리 짓고자 한다.

### 클래스 예시

코드를 통해 어떻게 동작하는지 좀 더 알아보자.

```java
public class Main {

    public static void main(String[] args) {

        Person james = new Person(); // Person 타입의 객체 james 선언
        james.height = 2.0;
        james.weight = 90.0;
        System.out.println(james.calcBMI());

    }
}

class Person {

    String name;
    String sex;
    double height; // m
    double weight; // kg

    public double calcBMI() {
        return weight / (height * height);
    }
}
```

Person이라는 클래스를 하나 만들어 보았다.

Person에는 name, sex, height, weight라는 속성이 있어서 Person 타입의 객체는 4개의 속성을 데이터로서 보관할 수 있게 된다.

class와 c언어에서의 구조체(struct)의 가장 눈에 띄는 다른 점은 함수(method)를 포함할 수 있다는 점이다.  
method는 대체로 이 class의 객체가 동작하는 데에 필요한 함수들로 구성되어 있다.
위 코드에서 calcBMI라는 method는 객체의 속성 height와 weight를 이용해 BMI를 계산해 반환해 준다.
