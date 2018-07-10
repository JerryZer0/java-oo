package practice06;

public class Teacher extends Person{
    String name;
    int age;
    int klass;

    Teacher(String name,int age,int klass){
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

    public int getKlass() {
        return klass;
    }

    public String introduce(){
        String introduction = super.introduce();
        String number = "";
        if(klass == 0){
            number = "No Class";
        }else{
            number = "Class "+klass;
        }
        introduction += " I am a Teacher. I teach " + number + ".";
        return introduction;
    }

}