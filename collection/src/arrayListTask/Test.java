package arrayListTask;

public class Test {
	public static void main(String[] args) {
		
		Fruit f = new Fruit(); 
		Market f2 = new Market();
		f.setName("과일");
		f.setPrice(1000);
		f2.add(f);
		
		System.out.println(Market.fruits);
		
		f2.remove("과일");
		System.out.println(Market.fruits);

		
		Fruit apple = new Fruit();
		Fruit banana = new Fruit();
		
		Market market = new Market();
		
		apple.setName("사과");
		apple.setPrice(1000);
		
		banana.setName("바나나");
		banana.setPrice(800);
		
		market.add(apple);
		market.add(banana);
		
		System.out.println(market.getAverage());
		
		
//		market.remove("사과");
		System.out.println(Market.fruits);
		
	}
}








