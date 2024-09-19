package model;

public class Student extends User {
    private int studentId;

    public Student(String firstName, String lastName, String middleName, int studentId) {
        super(firstName, lastName, middleName);
        this.studentId = studentId;
    }

    public int getStidentId() {
        return studentId;
    }

    public void setStidentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName="+this.getFirstName()+
                '}';
    }
}


