import java.util.List;

public interface UserService <T extends User>{

    void create(String firstName, String lastName, String middleName);
    void removeStudentByFIO(String firstName, String lastName, String middleName );
    List<T> getSortedStudentList();
    List<T> getSortedStudentByFIO();
}
