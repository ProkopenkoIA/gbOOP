package view;

import model.Student;
import model.Teacher;

public class StudentView {

    public void printOnConsole(Student student){
        System.out.println(student.toString());
    }

    public void printTeacherOnConsole(Teacher teacher){
        System.out.println(teacher.toString());
    }

}
