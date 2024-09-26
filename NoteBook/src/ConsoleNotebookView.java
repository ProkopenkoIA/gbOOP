import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class ConsoleNotebookView implements NotebookView{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void showNotes(List<Note> notes) {
        if (notes.isEmpty()) {
            System.out.println("Нет заметок");
        } else {
            for (Note note : notes) {
                System.out.println(note);
            }
        }

    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public LocalDateTime inputDateTime() {
        System.out.println("Введите дату и время (yyyy-MM-dd'T'HH:mm):");
        String input = scanner.nextLine();
        DateTimeFormatter formatDate = DateTimeFormatter.ISO_LOCAL_DATE_TIME;;
        return LocalDateTime.parse(input, formatDate);
    }

    @Override
    public String inputDescription() {
        System.out.println("Введите расшифровку события:");
        return scanner.nextLine();
    }

    @Override
    public String inputFileName() {
        String path = "C:\\Обучение\\ООП\\test.txt";
        return path;
    }
}

