import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

 //-- Если сортировку выкинуть в интерфейс и создать классы для сортировки, по получится применить принцип открыточти/закрытости
 //-- при этом нужно переписать сам сервис
//-- если подробить сервис на отдельные методы, то получится выполнить принцип единственной ответственности
//--


        Student student1 = new Student("Ivan","Ivanov", "Ivanovich");
        Student student2= new Student( "Petrov","Petr", "Petrovich");

        ArrayList<Student> arrayList = new ArrayList<>();

        arrayList.add(student1);
        arrayList.add(student2);

        //-- Группа 1
        StudentGroup studentGroupList = new StudentGroup("Группа 1", arrayList);

        studentGroupList.createStudent("Yan","Petr", "Petrovich");
        //StudentController studentController = new StudentController();




        }
}