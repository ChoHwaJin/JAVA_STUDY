package icehs.science.chapter05;

public class GradeIfElseTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dongScore = 92;
		
		if (dongScore >= 90 && dongScore <= 100) {
			System.out.println("A���� �Դϴ�.");
		} else if (dongScore >= 80 && dongScore < 90) {
			System.out.println("B���� �Դϴ�.");
		} else if (dongScore >= 70 && dongScore < 80) {
			System.out.println("C���� �Դϴ�.");
		} else if (dongScore >= 60 && dongScore <70) {
			System.out.println("D���� �Դϴ�.");
		} else {
			System.out.println("F���� �Դϴ�.");
		}

	}

}
