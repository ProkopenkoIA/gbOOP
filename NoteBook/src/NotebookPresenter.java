import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class NotebookPresenter {
    private Notebook model;
    private NotebookView view;

    public NotebookPresenter(Notebook model, NotebookView view) {
        this.model = model;
        this.view = view;
    }

    public void addNote() {
        LocalDateTime dateTime = view.inputDateTime();
        String description = view.inputDescription();

        model.addNote(new Note(dateTime, description));
        view.showMessage("Запись добавлена");
    }

    public List<Note> getNoteList() {
        return model.getNoteList();
    }

    public void getNotesOnDate() {
        LocalDateTime dateTime = view.inputDateTime();
        List<Note> notes = model.getNotesOnDate(dateTime);
        view.showNotes(notes);
    }

    public void getNotesOnWeek() {
        LocalDateTime dateTime = view.inputDateTime();
        List<Note> notes = model.getNotesOnWeek(dateTime);
        view.showNotes(notes);
    }

    public void saveToFile() throws IOException {
        String path = view.inputFileName();
        try {
            model.saveToFile(path);
            view.showMessage("Заметки выгружены в файл " + path);
        } catch (IOException e) {
            view.showMessage("Ошибка выгрузки в файл " + e.getMessage());
        }
    }

    public void loadToFile() throws IOException {
        String path = view.inputFileName();
        try {
            model.loadToFile(path);
            view.showMessage("Заметки загружены из файла " + path);
        }
        catch (IOException e) {
            view.showMessage("Ошибка загрузки заметок из файла " + e.getMessage());
        }
    }
}
