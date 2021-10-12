
public class Introducer {

	public String pronoun = "";

	public String createPublicIntroduction(Human human) {
		String intro = "";
		String genderString = human.gender.name();
		if (genderString == "MALE") {
			pronoun = "He";
		}
		else if (genderString == "FEMALE") {
			pronoun = "She";
		}
		else {
			pronoun = "They";
		}
		
		
		try {
			human.calculateCurrentAgeInYears();
			if (human instanceof Human) {
				intro = "I am pleased to introduce " + human.getFirstName()+ " " + human.getLastName()+ ".";
				if (human instanceof Adult) {
					Adult adult = (Adult)human;
					intro = intro + " " + pronoun +" works at " + adult.getPlaceOfWork() + " and their occupation is " + adult.getOccupation() + ".";
				}
				else if(human instanceof Youth) {
					Youth youth = (Youth)human;
					if (human instanceof WilliamAberhartStudent) {
						WilliamAberhartStudent williamAberhartStudent = (WilliamAberhartStudent)human;
						if (williamAberhartStudent.getHomeRoomTeacher() == null) {
							intro = intro + " " + pronoun+ " goes to William Aberhart High School and is in grade " + youth.getSchoolGrade() + "." + " Their homeroom is unknown at this time.";
						}
						else {
							intro = intro + " " + pronoun+ " goes to William Aberhart High School and is in grade " + youth.getSchoolGrade() + "." + " " + pronoun + " belongs to " + williamAberhartStudent.getHomeRoomTeacher() +"'s homeroom, which is in room " + williamAberhartStudent.getHomeRoom() + ".";
						}
					}
					else {
						intro = intro + " " + pronoun + " goes to " + youth.getSchoolName() + " and is in grade " + youth.getSchoolGrade() + ".";
					}
				}
			}
			return intro;
		}
		catch (Exception e){
			return "This person has issues and can't be introduced.";
		}
	}

}
	
