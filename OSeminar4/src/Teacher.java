public class Teacher extends User implements Comparable<Teacher> {

    private Integer teacherId;

    public Teacher(String firstName, String lastName, String middleName) {
       super(firstName, lastName, middleName);
    }

    public Integer getStudentId() {
        return teacherId;
    }

    public void setStudentId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public int compareTo(Teacher o) {
       return this.teacherId.compareTo(o.teacherId);
    }

}
