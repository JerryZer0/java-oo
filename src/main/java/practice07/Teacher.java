package practice07;

public class Teacher extends Person{
    String name;
    int age;
    Klass klass;

    Teacher(String name,int age,Klass klass){
        super(name,age);
        this.name = name;
        this.age = age;
        this.klass = klass;
    }
    Teacher(String name,int age){
        super(name,age);
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

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        String introduction = super.introduce();
        String number = "";
        if(klass == null){
            number = "No Class";
        }else{
            number = "Class "+klass.number;
        }
        introduction += " I am a Teacher. I teach " + number + ".";
        return introduction;
    }

    public String introduceWith(Student student){
        String teach = "";
        if(klass == student.klass)
            teach = " I am a Teacher. I teach " + student.name + ".";
        else
            teach = " I am a Teacher. I don't teach " + student.name + ".";
        return super.introduce()+ teach;
    }

}