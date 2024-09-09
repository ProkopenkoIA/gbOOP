import java.util.List;

public class StreamController {
    private final StreamService streamService = new StreamService();

    public List<GroupStream> sort(List<GroupStream> groupStreamList){
        return streamService.sort(groupStreamList);
    }



}
