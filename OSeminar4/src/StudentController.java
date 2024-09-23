import java.util.List;

public class StudentController implements UserController<Student> {

    /*private final StudentGroupService studentGroupService = new StudentGroupService();

    private final StudentView studentView = new StudentView();*/

    //-- Принцип инверсии зависимостей за счет имплементации UserService и UserView классами StudentGroupService и StudentView
    private final UserService<Student> studentGroupService;

    private final UserView<Student> studentView;

    public StudentController(UserService<Student> studentGroupService, UserView<Student> studentView) {
        this.studentGroupService = studentGroupService;
        this.studentView = studentView;
    }


    public void removeStudentByFIO(String firstName, String lastName, String middleName ){
       studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
       List<Student> studentList =  studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
       return studentList;
    }

    public List<Student> getSortedStudentByFIO(){
        List<Student> studentList =  studentGroupService.getSortedStudentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.create(firstName, lastName, middleName);
    }
}
