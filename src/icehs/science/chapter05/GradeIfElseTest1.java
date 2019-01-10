package icehs.science.chapter05;

public class GradeIfElseTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dongScore = 92;
		
		if (dongScore >= 90 && dongScore <= 100) {
			System.out.println("A학점 입니다.");
		} else if (dongScore >= 80 && dongScore < 90) {
			System.out.println("B학점 입니다.");
		} else if (dongScore >= 70 && dongScore < 80) {
			System.out.println("C학점 입니다.");
		} else if (dongScore >= 60 && dongScore <70) {
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}

	}

}
