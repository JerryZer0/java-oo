package practice03;

public class Person {
    public String name;
    public int age;

    Person(){}

    Person(String n, int a){
        name = n;
        age = a;
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