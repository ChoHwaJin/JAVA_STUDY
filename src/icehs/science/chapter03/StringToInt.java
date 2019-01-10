package icehs.science.chapter03;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstNum = "25";
		String secondNum = "20";
		
		int intFirstNum = Integer.parseInt(firstNum);
		int intSecondNum = Integer.parseInt(secondNum);
		
		System.out.println(firstNum + secondNum);
		System.out.println(intFirstNum + intSecondNum);
		System.out.println(firstNum + secondNum + intFirstNum + intSecondNum);
		System.out.println(intFirstNum + intSecondNum + firstNum + secondNum);
		System.out.println(firstNum + intFirstNum);
		
	}

}
