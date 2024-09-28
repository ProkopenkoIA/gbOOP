import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        NotebookPresenter notebookPresenter = new NotebookPresenter(new Notebook(), new ConsoleNotebookView());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("1. Добавить заметку");
            System.out.println("2. Посмотреть заметки на дату");
            System.out.println("3. Посмотреть заметки на неделю");
            System.out.println("4. Выгрузить заметки в файл");
            System.out.println("5. Загрузить заметки из файла");
            System.out.println("6. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    notebookPresenter.addNote();
                    break;
                case 2:
                    notebookPresenter.getNotesOnDate();
                    break;
                case 3:
                    notebookPresenter.getNotesOnWeek();
                    break;
                case 4:
                    notebookPresenter.saveToFile();
                    break;
                case 5:
                    notebookPresenter.loadToFile();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Ошибка входных параметров");
            }

        }
    }
}