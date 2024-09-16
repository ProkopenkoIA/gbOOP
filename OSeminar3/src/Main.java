import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student(1L, "Ivan","Ivanov", "Ivanovich");
        Student student2= new Student(2L, "Petrov","Petr", "Petrovich");
        Student student3= new Student(3L, "Yan","Petr", "Petrovich");

        ArrayList<Student> arrayList = new ArrayList<>();
        ArrayList<Student> arrayList2 = new ArrayList<>();
        ArrayList<Student> arrayList3 = new ArrayList<>();
        ArrayList<Student> arrayList4 = new ArrayList<>();

        arrayList.add(student1);
        arrayList2.add(student2);

        //-- Большая группа
        arrayList3.add(student2);
        arrayList3.add(student3);
        //-- Самя большая группа
        arrayList4.add(student1);
        arrayList4.add(student2);
        arrayList4.add(student3);

        //-- Группа 1
        StudentGroup studentGroupList = new StudentGroup("Группа Ивана", arrayList);

        Iterator<Student> iterator = new StudentGroupIterator(studentGroupList);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //-- Группа 2
        StudentGroup studentGroupList2 = new StudentGroup("Группа Петра", arrayList2);
        //-- Объеденяем группы в список 1
        ArrayList<StudentGroup> studentGroups= new ArrayList<>();
        studentGroups.add(studentGroupList);
        studentGroups.add(studentGroupList2);


        //-- Группа 3
        StudentGroup studentGroupList3 = new StudentGroup("Группа Петра, Петра и Ивана", arrayList4);
        //-- Объеденяем группы в список  2
        ArrayList<StudentGroup> studentGroups2= new ArrayList<>();
        studentGroups2.add(studentGroupList);
        studentGroups2.add(studentGroupList2);
        studentGroups2.add(studentGroupList3);

        //-- Поток 1
        GroupStream stream = new GroupStream(studentGroups2, "Первый поток");
        //--Поток 2
        GroupStream stream2 = new GroupStream(studentGroups, "Второй поток");



        Iterator<StudentGroup> streamIterator= new StreamIterator(stream);
        while (streamIterator.hasNext()) {
            System.out.println(streamIterator.next());
        }


        //-- Объединяем поток в список
        ArrayList<GroupStream> streamArrayList= new ArrayList<>();

        streamArrayList.add(stream);
        streamArrayList.add(stream2);

        //-- Вывод не отсортированного потока
        System.out.println("Вывод не отсортированного потока");
        System.out.println(streamArrayList);

       /* //-- Сортировка потока
        StreamService.sort(streamArrayList);
        //-- Вывод отсортированного потока
        System.out.println("Вывод отсортированного потока");
        System.out.println(streamArrayList);*/

        StreamController streamController = new StreamController();

        System.out.println("Вывод отсортированного потока");
        System.out.println(streamController.sort(streamArrayList));

        }
}