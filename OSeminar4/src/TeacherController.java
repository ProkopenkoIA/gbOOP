import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private final TeacherService teacherService = new TeacherService();

    private final TeacherView teacherView = new TeacherView();

    public void removeTeacherByFIO(String firstName, String lastName, String middleName ){
        teacherService.removeTeacherByFIO(firstName, lastName, middleName);
    }

    public void setTeacherFIO(Integer id, String firstName, String lastName, String middleName){
        teacherService.setTechearFIO(id, firstName, lastName, middleName);
    }

    public List<Teacher> getSortedTeacherList() {
       List<Teacher> teacherList =  teacherService.getSortedTeacherList();
        teacherView.sendOnConsole(teacherList);
       return teacherList;
    }

    public List<Teacher> getSortedTeacherByFIO(){
        List<Teacher> teacherList =  teacherService.getSortedTeacherByFIO();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

    public List<Teacher> getTeacherList(){
        List<Teacher> teacherList =  teacherService.getTeacherList();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName);
    }
}
