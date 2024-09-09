import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    private int count;
    private final List<StudentGroup> studentGroups;

    public StreamIterator(GroupStream groupStream) {
        this.studentGroups = groupStream.getGroupStrem();
        this.count = -1;
    }

    @Override
    public boolean hasNext() {
        return count < studentGroups.size()-1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        count++;
        return studentGroups.get(count);
    }

    @Override
    public void remove() {
        studentGroups.remove(count);
    }
}
