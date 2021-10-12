
public class WilliamAberhartStudent extends Youth{
	
	public int homeRoom;
	public String homeRoomTeacher;

	public WilliamAberhartStudent(int birthYear, int birthMonth, int birthDay, String firstName, String lastName,
			Gender gender, int grade, int homeRoom, String homeRoomTeacher) {
		super(birthYear, birthMonth, birthDay, firstName, lastName, gender, grade, "William Aberhart High School");
		
		this.homeRoom = homeRoom;
		this.homeRoomTeacher = homeRoomTeacher;
	}
	
	public int getHomeRoom () {
		return homeRoom;
	}

	public String getHomeRoomTeacher () {
		return homeRoomTeacher;
	}
	
	public void setHomeRoom (int homeRoom) {
		this.homeRoom = homeRoom;
	}
	
	public void setHomeRoomTeacher (String homeRoomTeacher) {
		this.homeRoomTeacher = homeRoomTeacher;
	}
	public void setSchoolName(String school) {
	}

}
