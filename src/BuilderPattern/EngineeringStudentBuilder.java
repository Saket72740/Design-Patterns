package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {

	@Override
	public StudentBuilder setSubjects() {
		List<String> subjects = new ArrayList<>();
		subjects.add("DSA");
		subjects.add("System Design");
		subjects.add("OS");
		subjects.add("Computer Design");
		this.subjects = subjects;
		return this;		
	}
	
	

}
