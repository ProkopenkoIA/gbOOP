import java.util.Iterator;
import java.util.List;


public class TeacherList implements Iterable<Teacher>{

    private List<Teacher> teacherList;

    public TeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void createTeacher(String firstName, String lastName, String middleName){
        teacherList.add(new Teacher(firstName,lastName,middleName));
    }


    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherIterator(this);
    }
}

