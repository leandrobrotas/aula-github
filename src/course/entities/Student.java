package course.entities;

public class Student {

	public double firstTrimester;
	public double secondTrimester;
	public double thirdTrimester;
	public String name;

	public double finalGrade() {
		return firstTrimester + secondTrimester + thirdTrimester;
	}

	public void finalResult(double finalGrade) {
		System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
		if (finalGrade >= 60) {
			System.out.print("PASS");
		} else {
			double missingPoints = 60.0 - finalGrade;
			System.out.println("FAILED");
			System.out.println("MISSING " + missingPoints + " POINTS");
		}
	}
}
