package anonymousTask;

public class Building {
	public static void main(String[] args) {
//		잠실점 오픈
//		잠실점은 무료 나눔 행사중이라서 판매 방식을 구현할 필요 없다.
//		본사에서는 전달받은 양식을 검사할 때
//		무료나눔 행사중인 매장이라면 "무료 나눔 행사중" 출력하기
		
		Starbucks gangnam = new Starbucks();
		Starbucks jamsil = new Starbucks();
		
//		register메소드의 매개변수는 Form타입이다.
//		FormAdapter는 Form의 자식타입이므로 up casting을 통해 전달한다.
		jamsil.register(new FormAdapter() {
			@Override
			public String[] getMenu() {
				String[] menus = {"아메리카노", "카푸치노", "캐모마일티"};
				return menus;
			}
		});
		
		
		gangnam.register(new Form() {
			
			@Override
			public void sell(String order) {
				String[] menus = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if(order.equals(menus[i])) {
						System.out.println("판매 완료");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				String[] menus = {"아메리카노", "카푸치노", "캐모마일티"};
				return menus;
			}
		});
	}
}
