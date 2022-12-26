package jobTask;

import java.util.Random;

public class OakSeller {

	String[] table = {"사원", "팀장", "다이아"};
	int[] pay = {0, 10_000, 100_000};
	int[] incomes = {1_000, 3_000, 9_000};
	
	String name;
	int positionNumber;
	int successRating;
	int income;
	int count;
	
	Random r = new Random();
	
	public OakSeller() {
		this("한동석", 0);
	}
	
	public OakSeller(String name, int positionNumber) {
		this.name = name;
		this.positionNumber = positionNumber;
		this.successRating = 50;
	}
	
	int sell() { //성공 : 0, 대성공 : 1, 실패 : -1
		if(rate(successRating)) { //성공
			count = 0;
			if(rate(20)) { //대성공
				income += incomes[positionNumber] * 3;
				successRating += 5;
				return 1;
			}
			income += incomes[positionNumber];
			successRating -= 2;
			return 0;
		}
		//실패
		count++;
		income -= 2_000;
		return -1;
	}
	
	void demote() {
		positionNumber--;
	}
	
	boolean promote() {
		income -= pay[positionNumber+1];
		if(positionNumber == 0 ? rate(30) : rate(10)) {
			positionNumber++;
			return true;
		}
		return false;
	}
	
	boolean rate(int rating) {
		int[] percent = new int[100];
		for (int i = 0; i < rating; i++) {percent[i] = 1;}
		
		return percent[r.nextInt(percent.length)] == 1;
	}
}
















