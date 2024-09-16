import java.util.Iterator;
import java.util.List;

public class GroupStream implements Iterable<StudentGroup>{

    private List<StudentGroup> groupStrem;
    private String name;

    public GroupStream(List<StudentGroup> groupStrem, String name) {
        this.groupStrem = groupStrem;
        this.name = name;
    }

    public List<StudentGroup> getGroupStrem() {
        return groupStrem;
    }

    public void setGroupStrem(List<StudentGroup> groupStrem) {
        this.groupStrem = groupStrem;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public String toString() {
        return "Stream{" +
                "streamName=" + name +
                '}';
    }
}

