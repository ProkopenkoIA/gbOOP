import java.util.List;

public class TeacherView implements UserView<Teacher>{

    //-- Принцип Барабары Липски, за счет реализацци имплементированного метода sendOnConsole. Сохраняется единообразие
    //-- выводимых данных типа String

    // Принцып открытости закрытости: Исполняется за счет изменения имплементированного метода sendOnConsole
    //-- в сранвении с методом sendOnConsole класса StudentView

    //-- Так же данный класс соответствует принципу единственной ответственности, т.к. реализует только один метод  - sendOnConsole


    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher: list){
            System.out.println("Teacher{" +
                    " firstName='" + teacher.getFirstName() + '\'' +
                    ", lastName='" + teacher.getLastName() + '\'' +
                    ", middleName='" + teacher.getMiddleName() + '\'' +
                    '}');
        }
    }
}
