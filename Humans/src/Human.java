import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

yes
public class Human implements Comparable<Human>{
	
	
	public static final Comparator<Human> AGE_ORDER = new Comparator<Human>() {
		public int compare(Human h1 , Human h2) {
			return h2.calculateCurrentAgeInDays() - h1.calculateCurrentAgeInDays();
		}
	};
	
	
	public static final Comparator<Human> ASSEMBLY_ORDER = new Comparator<Human>() {
		public int compare(Human h1 , Human h2) {
			Integer humanOneOrdinal = humanOrdinal(h1);
			Integer humanTwoOrdinal = humanOrdinal(h2);
			return (humanOneOrdinal + (h1.getLastName() + "," + h1.getFirstName())).compareTo(humanTwoOrdinal + (h2.getLastName() + "," + h2.getFirstName()));
		}
		
		public int humanOrdinal(Human h1) {
			if (h1 instanceof WilliamAberhartStudent) {
				return 0;
			}
			if (h1 instanceof Youth) {
				return 1;
			}
			if (h1 instanceof Adult) {
				return 2;
			}
			if (h1 instanceof Human) {
				return 3;
			}
			else {
				return 4;
			}
			
		}

	};


	public static final Comparator<Human> NAME_ORDER = new Comparator<Human>() {
		public int compare(Human h1 , Human h2) {
			return (h1.getLastName() + "," + h1.getFirstName()).compareTo(h2.getLastName() + "," + h2.getFirstName());
		}
	};
	
	int birthYear;
	int birthMonth;
	int birthDay;
	String firstName;
	String lastName;
	Gender gender;

	public Human(int birthYear, int birthMonth, int birthDay, String firstName, String lastName, Gender gender) {
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}
	
	public int getBirthMonth() {
		return birthMonth;
	}
	
	public int getBirthDay() {
		return birthDay;
	}
	
	public Gender getGender() {
		return gender;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}
	
	public void setBirthYear (int birthYear) {
		this.birthYear = birthYear;
	}
	
	public void setBirthMonth (int birthMonth) {
		this.birthMonth = birthMonth;
	}
	
	public void setBirthDay (int birthDay) {
		this.birthDay = birthDay;
	}
	
	public void setGender (Gender gender) {
		this.gender = gender;
	}
	
	public int calculateCurrentAgeInYears() {
		int age;
		LocalDateTime today = LocalDateTime.now();
		int currentMonth = today.getMonthValue();
		int currentDay = today.getDayOfMonth();
		int currentYear = today.getYear();
		
		if (birthMonth <= currentMonth) {
			if (birthDay <= currentDay) {
				age = currentYear - birthYear;
			}
			else {
				age = currentYear - birthYear - 1;
			}
		}
		else {
			age = currentYear - birthYear - 1;
		}
		return age;
	}
	
	public int calculateCurrentAgeInDays() {
		LocalDate dateOfBirth = LocalDate.of(birthYear, birthMonth, birthDay);
		LocalDate now = LocalDate.now();
		long years = ChronoUnit.DAYS.between(dateOfBirth, now);
		return(int)years;
	}

	@Override
	public int compareTo(Human o) {
		// TODO Auto-generated method stub
		return AGE_ORDER.compare(this, o);
	}
	
}
