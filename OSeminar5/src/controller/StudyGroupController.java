package controller;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import model.User;
import service.StudyGroupService;
import view.StudyGroupView;

import java.util.List;

public class StudyGroupController
{
   private StudyGroupService  studyGroupService = new StudyGroupService();
   private StudyGroupView studyGroupView = new StudyGroupView();

   public void CreateStudy(Teacher teacher, List<User> studentList){
       studyGroupService.create(teacher,studentList);
   }

   public void viewStudyGroup(){
       List<StudyGroup> studyGroups = studyGroupService.getGroups();

       for (StudyGroup studyGroup : studyGroups)
       {
           studyGroupView.printOnConsole(studyGroup);
       }
   }

}
