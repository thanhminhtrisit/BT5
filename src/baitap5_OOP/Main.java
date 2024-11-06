package baitap5_OOP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		StudentManager.createDummyData();
		int choice;
		do {
			System.out.println("\n1. Thêm sinh viên");
			System.out.println("2. Hiển thị tất cả sinh viên");
			System.out.println("3. Tìm sinh viên có ĐTB cao nhất");
			System.out.println("4. Hiển thị tất cả sinh viên Yếu");
			System.out.println("5. Tìm sinh viên theo tên");
			System.out.println("6. Tìm sinh viên theo mã");
			System.out.println("7. Xóa sinh viên theo mã");
			System.out.println("0. Thoát");
			System.out.print("Chọn một lựa chọn: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1 -> StudentManager.addStudent();
			case 2 -> StudentManager.displayAllStudents();
			case 3 -> StudentManager.displayHighestAverageStudent();
			case 4 -> StudentManager.displayWeakStudents();
			case 5 -> StudentManager.searchStudentByName();
			case 6 -> StudentManager.searchStudentByID();
			case 7 -> StudentManager.deleteStudentByID();
			case 0 -> System.out.println("Kết thúc chương trình.");
			default -> System.out.println("Lựa chọn không hợp lệ!");
			}
		} while (choice != 0);
		scanner.close();
	}

}
