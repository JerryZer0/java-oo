package practice03;

public class Worker extends Person{
    String name;
    int age;

    Worker(String name,int age){
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
        String introduction = "I am a Worker. I have a job.";
        return introduction;
    }

}
