package controller;

import model.Student;
import model.Teacher;
import model.Type;
import service.DataService;
import view.StudentView;
import model.User;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView  view = new StudentView();

    public  void createStudent( String firsName, String lastName, String middleName){
        service.create(firsName, lastName, middleName, Type.STUDENT);
    }

    // Создать Преподователя
    public  void createTeacher( String firsName, String lastName, String middleName){
        service.create(firsName, lastName, middleName, Type.TEACHER);
    }

    public void viewAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user : userList){
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }

    public List<User>  getAllStudent(){
        return service.getAllStudent();
    }

    public void getAllTeachers(){
        List<User> userList = service.getAllTeachers();
        for (User user : userList){
            Teacher teacher = (Teacher) user;
            view.printTeacherOnConsole(teacher);
        }
    }

    public User getUserById(Type type, int id){
       return service.getUserById(type,id);
    }
}
