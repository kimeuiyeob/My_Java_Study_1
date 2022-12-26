package arrayListTask;

import java.util.ArrayList;

import javax.print.DocFlavor.READER;

public class Test3 {
	
	public static void main(String[] args) {
//		Restaurant restaurant = new Restaurant();
//		Food food = new Food();
		
		Food f = new Food(); // 객체 인스턴스
		Food f2 = new Food();
		Food f3 = new Food();
		
		Restaurant r = new Restaurant();
		Restaurant r2 = new Restaurant();

		System.out.println(f instanceof Food); // true
		System.out.println(f2 instanceof Food); // true
		System.out.println(f3 instanceof Food); // true
		
		System.out.println(r instanceof Restaurant); // true
		System.out.println(r2 instanceof Restaurant);
		
		
		System.out.println(f);
		
		
//		food.setName("치즈돈까스");
//		food.setPrice(8500);
//		food.setKinds("일식");
//		
//		Restaurant.foods.add(food);
//		
//		food = new Food();
//		
//		food.setName("한우갈비찜");
//		food.setPrice(12000);
//		food.setKinds("한식");
//		
//		Restaurant.foods.add(food);
//
//		food = new Food();
//		
//		food.setName("잡채찜닭돼지고기두루치기");
//		food.setPrice(1500);
//		food.setKinds("한식");
//		
//		Restaurant.foods.add(food);
//		
		
//		System.out.println(r.checkKinds("한우갈비찜"));
//		System.out.println(r.checkKinds("치즈돈까스"));
		
//		for (Food selected : r.getFoods("한식")) {
//			System.out.println(selected);
//		}
		
//		food.setKinds("일식");
//		restaurant.updateKinds(food);
//		System.out.println(Restaurant.foods);
		
//		System.out.println(restaurant.getCount("한식"));
	}
}
















