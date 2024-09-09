import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamService {

    /*public static void sort(List<GroupStream> groupStreamList){
        Comparator streamComparator = new StreamComparator();
        Collections.sort(groupStreamList, streamComparator);
    }*/


    public List<GroupStream> sort(List<GroupStream> groupStreamList){
        Comparator streamComparator = new StreamComparator();
        Collections.sort(groupStreamList, streamComparator);
        return groupStreamList;
    }

}
