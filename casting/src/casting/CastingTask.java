package casting;

public class CastingTask {
//	넷플릭스
//	애니메이션, 영화, 드라마 클래스 선언
//	사용자가 선택한 영상이
//	애니메이션이라면 "자막지원"기능 사용
//	영화라면 "4D"기능 사용
//	드라마라면 "굿즈"기능 사용

	public void check(Video video) {
//		video 가 Animation 타입이면
		if (video instanceof Animation) {
			Animation ani = (Animation) video;
			ani.printSubtitle();
//		video 가 Animation 타입이면
		} else if (video instanceof Film) {
			Film film = (Film) video;
			film.print4D();
//		video 가 Animation 타입이면
		} else {
			Drama drama = (Drama) video;
			drama.sellGoods();
		}
	}

	public static void main(String[] args) {
		CastingTask ct = new CastingTask();
		ct.check(new Animation());
		ct.check(new Film());
		ct.check(new Drama());
	}
}
