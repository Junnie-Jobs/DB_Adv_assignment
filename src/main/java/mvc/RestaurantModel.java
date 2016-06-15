package mvc;

public class RestaurantModel {
	
	private String 제목;
	private String 카테고리1;
	private String 카테고리2;
	private String 카테고리3;
	private String 지역명;
	private String 시군구명;
	private String 개요;
	
	@Override
	public String toString() {
		return 제목 + ", " + 카테고리1 + ", " + 카테고리2 + ", " + 카테고리3 + ", "
				+ 지역명 + ", " + 시군구명 + ", " + 개요;
	}

	public RestaurantModel(){}
	
	public RestaurantModel(String 제목, String 카테고리1, String 카테고리2, String 카테고리3, String 지역명, String 시군구명, String 개요){
		
		this.제목 = 제목;
		this.카테고리1= 카테고리1;
		this.카테고리2= 카테고리2;
		this.카테고리3= 카테고리3;
		this.지역명 = 지역명;
		this.시군구명 = 시군구명;
		this.개요 = 개요;
	}

	public String get제목() {
		return 제목;
	}

	public void set제목(String 제목) {
		this.제목 = 제목;
	}

	public String get카테고리1() {
		return 카테고리1;
	}

	public void set카테고리1(String 카테고리1) {
		this.카테고리1 = 카테고리1;
	}

	public String get카테고리2() {
		return 카테고리2;
	}

	public void set카테고리2(String 카테고리2) {
		this.카테고리2 = 카테고리2;
	}

}
