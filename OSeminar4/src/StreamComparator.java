import java.util.Comparator;

public class StreamComparator implements Comparator<GroupStream> {

    @Override
    public int compare(GroupStream o1, GroupStream o2) {
        return o1.getGroupStrem().size()-o2.getGroupStrem().size();
    }

}
