package practice04;

public class Worker extends Person{
    String name;
    int age;

    Worker(String name,int age){
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

    public String introduce(){
        String introduction = super.introduce();
        introduction += " I am a Worker. I have a job.";
        return introduction;
    }

}
