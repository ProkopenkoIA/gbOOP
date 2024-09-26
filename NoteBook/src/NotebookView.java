import java.time.LocalDateTime;
import java.util.List;

public interface NotebookView {
    void showNotes(List<Note> notes);
    void showMessage(String message);
    LocalDateTime inputDateTime();
    String inputDescription();
    String inputFileName();


}
