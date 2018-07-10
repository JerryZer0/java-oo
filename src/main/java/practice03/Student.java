package practice03;

public class Student extends Person{
    public String name;
    public int age;
    public int klass;

    Student(String name, int age, int klass){
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getKlass() {
        return klass;
    }

    public String introduce(){
        String introduction = "I am a Student. I am at Class "+ klass +".";
        return introduction;
    }
}