package BuilderPattern;

public class Director {
	
	StudentBuilder student;
	
	public Director(StudentBuilder student) {
		this.student = student;
	}
	
	public Student createStudent() {
		if(student instanceof EngineeringStudentBuilder) {
			return createEngineeringStudent();
		}
		else if(student instanceof MBAStudentBuilder) {
			return createMBAStudent();
		}
		return null;
	}
	
	private Student createEngineeringStudent() {
		return student.setRollNumber(1).setName("Saket Kumar").setAge(23).setSubjects().build();
	}
	
	private Student createMBAStudent() {
		return student.setRollNumber(100).setName("S Kumar Shrivastav").setAge(28).setSubjects().build();
	}
}
