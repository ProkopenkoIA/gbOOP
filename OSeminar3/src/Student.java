public class Student implements Comparable<Student> {

    private Long stidentId;
    private String firstName;
    private String lastName;
    private String middleName;

    public Student(Long stidentId, String firstName, String lastName, String middleName) {
        this.stidentId = stidentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Long getStidentId() {
        return stidentId;
    }

    public void setStidentId(Long stidentId) {
        this.stidentId = stidentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stidentId=" + stidentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
       return this.stidentId.compareTo(o.stidentId);
    }
}
