package practice08;

public class Klass {
    int number;
    Student leader;

    Klass(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName(){
        return "Class " + number;
    }

    public void assignLeader(Student student){
        leader = student;
    }
}