package baitap5_OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
	private static ArrayList<Student> students = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void createDummyData() {
		students.add(new Student("Nguyen Van A", "SV01", 9, 8, 9));
		students.add(new Student("Le Thi B", "SV02", 7, 6, 7));
		students.add(new Student("Tran Van C", "SV03", 4, 5, 4));
		students.add(new Student("Vu Thi H", "SV04", 4, 5, 4));
	}

	public static void addStudent() {
		System.out.print("Nhập tên sinh viên: ");
		String name = new Scanner(System.in).nextLine();
		System.out.print("Nhập mã sinh viên: ");
		String studentID = scanner.nextLine();
		double mathScore = getValidatedScore("Toán");
		double physicsScore = getValidatedScore("Lý");
		double chemistryScore = getValidatedScore("Hóa");
		students.add(new Student(name, studentID, mathScore, physicsScore, chemistryScore));
		System.out.println("Đã thêm sinh viên thành công.");
	}

	public static double getValidatedScore(String subject) {
		double score;
		do {
			System.out.print("Nhập điểm " + subject + " (0-10): ");
			score = scanner.nextDouble();
			if (score < 0 || score > 10) {
				System.out.println("Điểm không hợp lệ. Vui lòng nhập lại.");
			}
		} while (score < 0 || score > 10);
		return score;
	}

	public static void displayAllStudents() {
		for (Student student : students) {
			student.display();
		}
	}

	public static void displayHighestAverageStudent() {
		Student highestAvgStudent = students.get(0);
		for (Student student : students) {
			if (student.getAverageScore() > highestAvgStudent.getAverageScore()) {
				highestAvgStudent = student;
			}
		}
		System.out.println("Sinh viên có ĐTB cao nhất:");
		highestAvgStudent.display();
	}

	public static void displayWeakStudents() {
		System.out.println("Danh sách sinh viên Yếu:");
		for (Student student : students) {
			if (student.getGrade().equals("Yếu")) {
				student.display();
			}
		}
	}

	public static void searchStudentByName() {
		System.out.print("Nhập tên sinh viên: ");
		String name = new Scanner(System.in).nextLine();
		System.out.println("Kết quả tìm kiếm:");
		for (Student student : students) {
			if (student.getName().equalsIgnoreCase(name)) {
				student.display();
				return;
			}
		}
		System.out.println("Không tìm thấy tên này!");
	}

	public static void searchStudentByID() {
		System.out.print("Nhập mã sinh viên: ");
		String studentID = scanner.nextLine();
		for (Student student : students) {
			if (student.getStudentID().equalsIgnoreCase(studentID)) {
				student.display();
				return;
			}
		}
		System.out.println("Không tìm thấy sinh viên với mã này.");
	}

	public static void deleteStudentByID() {
		System.out.print("Nhập mã sinh viên muốn xóa: ");
		String studentID = scanner.nextLine();

		boolean found = students.removeIf(student -> student.getStudentID().equalsIgnoreCase(studentID));

		if (found) {
			System.out.println("Đã xóa sinh viên có mã: " + studentID);
		} else {
			System.out.println("Không tìm thấy sinh viên với mã: " + studentID);
		}
	}
}
