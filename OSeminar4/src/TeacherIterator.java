
import java.util.Iterator;
import java.util.List;

public class TeacherIterator implements Iterator<Teacher>{

    private int count;
    private final List<Teacher> teacherList;

    public TeacherIterator(TeacherList teacherList) {
       this.count = -1;
        this.teacherList = teacherList.getTeacherList();
    }

    @Override
    public boolean hasNext() {
        return count < teacherList.size()-1;
    }

    @Override
    public Teacher next() {
        if (!hasNext()) {
            return null;
        }
        count++;
        return teacherList.get(count);
    }

    @Override
    public void remove() {
        teacherList.remove(count);
    }
}
