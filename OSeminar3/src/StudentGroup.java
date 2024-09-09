import java.lang.annotation.Inherited;
import java.util.Iterator;
import java.util.List;


public class StudentGroup implements Iterable<Student>{

    private  String groupName;
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentGroup(String name, List<Student> studentList) {
        this.studentList = studentList;
        this.groupName = name;
    }


    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName=" + groupName +
                '}';
    }
}

