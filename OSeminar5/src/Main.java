import controller.Controller;
import controller.StudyGroupController;
import model.Teacher;
import model.Type;
import model.User;
import service.DataService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // STEP 1
    //todo Создать package - model.
    //todo Реализовать австрактынй класс Юзер и его наследника Стьюдент и Тичер
    // Родитель имеет в себе общие данные (фио, год рождения и т.д.),
    // а наследник собственные параметры
    // например: ид

    // STEP 2
    //todo Создать package - service
    //todo Создать класс DataService с методами по управлению сущностями User
    // и агрегирующий всех пользователей заведенных в системе

    //todo StudentId должны быть созданы по алгоритму - максимальный id в коллекции + 1.
    // Аналогично для TeacherId. Здесь решение через перебор элементов instanceOf

    // STEP 3
    //todo Создать package - view.
    //todo Создать класс StudentView
    // содержащий в себе метод вывода в консоль данных студентов поданныйх на ввод

    // STEP 4
    //todo Создать package - controller.
    //todo Создать класс Controller, агренирующий в себе необходимые классы в виде полей,
    // а инициализируем прям в поле

    //todo Создаем метод созданиеСтудента - реализующий логику,
    // путем вызова соответствующих методов интерфйсов:
    //todo Создания Студента в сервисе
    // Возвращение всех студентов в сервисе
    // Вызов view и передача списка найденных студентов


    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.createStudent("Petrov", "Petre", "Petrovich");
        controller.createStudent("Ivanov", "Ivan", "Ivanovich");
        controller.createTeacher("Sidarov", "Sidor", "Ivanovich");

        controller.viewAllStudent();
        controller.getAllTeachers();

        //--------------------------------------

        StudyGroupController studyGroupController = new StudyGroupController();

        Teacher teacher = (Teacher) controller.getUserById(Type.TEACHER,1);

        studyGroupController.CreateStudy(teacher,controller.getAllStudent());
        studyGroupController.viewStudyGroup();

    }
}