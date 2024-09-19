package view;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import model.User;

import java.util.List;

public class StudyGroupView {

    public void printOnConsole(StudyGroup studyGroup){
        Teacher teacher = studyGroup.getTeacher();;
        List<User> studentList = studyGroup.getStudentList();
        System.out.println("Преподователь группы: "+ teacher.toString());
        for (User user : studentList){
            Student student = (Student) user;
            System.out.println(student.toString());
        }

    }
}
