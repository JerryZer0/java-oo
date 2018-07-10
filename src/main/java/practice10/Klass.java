package practice10;

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
        if(isIn(student))
            leader = student;
        else
            System.out.print("It is not one of us.\n");
    }
    public void appendMember(Student student){
        this.changeClass(student);
    }
    private void changeClass(Student student){
        student.klass = this;
    }
    private boolean isIn(Student student){
        return this == student.klass;
    }
}
