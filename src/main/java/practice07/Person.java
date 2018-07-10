package practice07;

public class Person {
    public String name;
    public int age;

    Person(){}

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public String introduce(){
        String introduction = "My name is "+ name +". I am "+ age +" years old.";
        return introduction;
    }
}