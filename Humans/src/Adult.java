
public class Adult extends Human{
	
	public String placeOfWork;
	public String occupation;
	
	public Adult(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender, String placeOfWork, String occupation) {
		super(birthYear, birthMonth, birthDay, firstName, lastName, gender);
		
		this.placeOfWork = placeOfWork;
		this.occupation = occupation;
	}

	public String getOccupation() {
		// TODO Auto-generated method stub
		return occupation;
	}

	public String getPlaceOfWork() {
		// TODO Auto-generated method stub
		return placeOfWork;
	}
	
	public void setPlaceOfWork(String placeOfWork) {
		this.placeOfWork = placeOfWork;
	}
	
	public void setOccupation (String occupation) {
		this.occupation = occupation;
	}

}
