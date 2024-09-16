import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherService {

    private TeacherList teacherList;

    public void removeTeacherByFIO(String firstName, String lastName, String middleName ){
        Iterator<Teacher> iterator = teacherList.iterator();
        while (iterator.hasNext()){
            Teacher teacher = iterator.next();
            if (teacher.getFirstName().equals(firstName)
                    && teacher.getLastName().equals(lastName)
                    && teacher.getMiddleName().equals(middleName)){
                iterator.remove();
            }
        }
    }

    public List<Teacher> getSortedTeacherList(){
        List<Teacher> teacherList1 = new ArrayList<>(teacherList.getTeacherList());
        Collections.sort(teacherList1);
        return teacherList1;
    }

    public List<Teacher> getSortedTeacherByFIO(){
        List<Teacher> teacherList1 = new ArrayList<>(teacherList.getTeacherList());
        teacherList1.sort(new UserComparator<Teacher>());
        return teacherList1;

    }

    public void setTechearFIO(Integer id, String firstName, String lastName, String middleName)
    {
        List<Teacher> teacherList1 = new ArrayList<>(teacherList.getTeacherList());
        teacherList1.get(id).setFirstName(firstName);
        teacherList1.get(id).setLastName(lastName);
        teacherList1.get(id).setMiddleName(middleName);
    }

    public List<Teacher> getTeacherList(){
        return teacherList.getTeacherList();
    }

  public void  createTeacher(String firstName, String lastName, String middleName) {
      teacherList.createTeacher(firstName, lastName, middleName);
  }
}
