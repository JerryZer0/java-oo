package practice10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person{
    String name;
    int age;
    LinkedList<Klass> classes;

    Teacher(int id, String name, int age, LinkedList<Klass> classes){
        super(id, name,age);
        this.id = id;
        this.name = name;
        this.age = age;
        this.classes = classes;
    }
    Teacher(int id, String name,int age){
        super(id, name,age);
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public String introduce(){
        String introduction = super.introduce();
        String number = "";
        if(classes == null){
            number = "No Class";
        }else{
            number = "Class ";
            for(Klass klass: classes )
                number += klass.number + ", ";
            number = number.substring(0,number.lastIndexOf(", "));
        }
        introduction += " I am a Teacher. I teach " + number + ".";
        return introduction;
    }

    public String introduceWith(Student student){
        String teach = "";
        if(isTeaching(student))
            teach = " I am a Teacher. I teach " + student.name + ".";
        else
            teach = " I am a Teacher. I don't teach " + student.name + ".";
        return super.introduce()+ teach;
    }
    public boolean isTeaching(Student student){
        boolean key =false;
        for( Klass klass: classes){
            if(klass == student.klass){
                key = true;
                break;
            }
        }
        return key;
    }

}
