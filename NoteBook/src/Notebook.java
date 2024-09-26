import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Notebook {

    private List<Note> noteList = new ArrayList<>();

    public void addNote(Note note){
        noteList.add(note);
    }

    public List<Note> getNoteList(){
        return noteList;
    }

    public List<Note> getNotesOnDate(LocalDateTime date){

        return (List<Note>) noteList.stream().filter(note -> note.getDateTime().toLocalDate().isEqual(date.toLocalDate()))
                .sorted(Comparator.comparing(Note::getDateTime))
                .collect(Collectors.toList());

    }
    public List<Note> getNotesOnWeek(LocalDateTime startDate){
        LocalDateTime endDate = startDate.plusWeeks(1);

        return (List<Note>) noteList.stream().filter(note -> !note.getDateTime().isBefore(startDate)&&!note.getDateTime().isAfter(endDate))
                .sorted(Comparator.comparing(Note::getDateTime))
                .collect(Collectors.toList());
    }

    public void saveToFile(String fileName) throws IOException {
        try (BufferedWriter writter = new BufferedWriter(new FileWriter(fileName))) {
            for (Note value : noteList) {
                writter.write(value.toString());
            }
        }

    }

    public void loadToFile(String fileName) throws IOException {
        noteList.clear();

            if (Files.isRegularFile(Path.of(fileName))) {
                Path path = Path.of(fileName);
                List<String> list = Files.readAllLines(path);
                for (String str : list) {
                    String[] parts = str.split("::", 2);
                    LocalDateTime dateTime = LocalDateTime.parse(parts[0]);
                    String description = parts[1];
                    noteList.add(new Note(dateTime, description));
                }
            }
            ;

    }
}
