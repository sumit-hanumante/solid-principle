package Single_Responsibility_Principle.ViolationOfSingleResponsibilityPrinciple;

/**
 * Created by sumit on 9/10/2018.
 */
public class Student {

    private Long id;
    private String name;

    //School information
    private Long schoolId;
    private String schoolName;
    private String schoolCty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolCty() {
        return schoolCty;
    }

    public void setSchoolCty(String schoolCty) {
        this.schoolCty = schoolCty;
    }
}
