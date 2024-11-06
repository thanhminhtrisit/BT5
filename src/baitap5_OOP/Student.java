package baitap5_OOP;

public class Student {
	private String name;
	private String studentID;
	private double mathScore;
	private double physicsScore;
	private double chemistryScore;

	public Student(String name, String studentID, double mathScore, double physicsScore, double chemistryScore) {
		this.name = name;
		this.studentID = studentID;
		this.mathScore = mathScore;
		this.physicsScore = physicsScore;
		this.chemistryScore = chemistryScore;
	}

	public String getName() {
		return name;
	}

	public String getStudentID() {
		return studentID;
	}

	public double getAverageScore() {
		return (mathScore + physicsScore + chemistryScore) / 3;
	}

	public String getGrade() {
		double avgScore = getAverageScore();
		if (avgScore >= 9)
			return "Xuất Sắc";
		else if (avgScore >= 8)
			return "Giỏi";
		else if (avgScore >= 7)
			return "Khá";
		else if (avgScore >= 6)
			return "Trung Bình";
		else if (avgScore >= 5)
			return "Yếu";
		else
			return "Kém";
	}

	public void display() {
		System.out.printf("Tên: %s | Mã SV: %s | ĐTB: %.2f | Xếp loại: %s\n", name, studentID, getAverageScore(),
				getGrade());
	}
}
