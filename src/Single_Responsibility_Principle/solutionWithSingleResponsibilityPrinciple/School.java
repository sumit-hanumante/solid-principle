package Single_Responsibility_Principle.solutionWithSingleResponsibilityPrinciple;

/**
 * Created by sumit on 9/10/2018.
 */
public class School {

    private Long id;
    private String schoolName;
    private String schoolCty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
