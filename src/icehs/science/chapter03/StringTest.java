package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String king = "�������";
		String year = "2017";
		int money = 10000;
		
		int parseYear = Integer.parseInt(year);
		
		System.out.println(king + ": " + money);
		System.out.println(year + "��");
		System.out.println(money + year);
		System.out.println(4*money + parseYear);

	}

}
