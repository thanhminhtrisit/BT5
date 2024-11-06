package baitap5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập tên sinh viên: ");
		String ten = scanner.nextLine();

		System.out.print("Nhập mã sinh viên: ");
		String id = scanner.nextLine();

		double dToan = validatedScore(scanner, "Toán");
		double dLi = validatedScore(scanner, "Lý");
		double dHoa = validatedScore(scanner, "Hóa");

		double tb = (dToan + dLi + dHoa) / 3;
		System.out.printf("Điểm trung bình của sinh viên: %.2f\n", tb);

		String grade;
		if (tb >= 9) {
			grade = "Xuất Sắc";
		} else if (tb >= 8) {
			grade = "Giỏi";
		} else if (tb >= 7) {
			grade = "Khá";
		} else if (tb >= 6) {
			grade = "Trung Bình";
		} else if (tb >= 5) {
			grade = "Yếu";
		} else {
			grade = "Kém";
		}

		System.out.println("Xếp loại của sinh viên " + ten + " mã số " + id + " là " + grade);
	}

	private static double validatedScore(Scanner scanner, String subject) {
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
}
