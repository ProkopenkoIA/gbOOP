package service;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    List<StudyGroup> studyGroupList;

    public StudyGroupService() {
        this.studyGroupList = new ArrayList<>();
    }

    public void create(Teacher teacher, List<User> studentList) {
        StudyGroup studyGroup = new StudyGroup(teacher, studentList);
        studyGroupList.add(studyGroup);
    }

    public List<StudyGroup> getGroups(){
        return studyGroupList;
    }

}
