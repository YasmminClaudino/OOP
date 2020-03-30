package entities;

public class Student {
	public String name;
	// public String status;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGradeReult() {
		return (grade1 + grade2 + grade3);

	}

	public String isStudentAprroved() {
		String status = (finalGradeReult() > 60.0) ? "PASS"
				: ("FAILED \n" + "MISSING " + (60 - finalGradeReult()) + " POINTS");
		return status;

	}

	public String toString() {
		return ("FINAL GRADE = " + finalGradeReult() + "\n" + isStudentAprroved());
	}

}
