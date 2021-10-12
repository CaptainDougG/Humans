
public class Youth extends Human{
	
	public int grade;
	public String school;

	public Youth(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender, int grade, String school) {
		super(birthYear, birthMonth, birthDay, firstName, lastName, gender);
		
		this.grade = grade;
		this.school = school;
	}

	public int getSchoolGrade() {
		// TODO Auto-generated method stub
		return grade;
	}
	
	public String getSchoolName () {
		return school;
	}
	
	public void setSchoolGrade(int grade) {
		this.grade = grade;
	}
	
	public void setSchoolName(String school) {
		this.school = school;
	}

}
