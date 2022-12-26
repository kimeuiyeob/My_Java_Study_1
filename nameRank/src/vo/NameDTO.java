package vo;

public class NameDTO {
	private String gender;
	private String name;
	private int ranking;
	private int population;
	
	public NameDTO() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private String insertComma(String data) {
		String result = "";
		for (int i = 0; i < data.length(); i++) {
			if(i % 3 == 0 && i != 0) {
				result = "," + result;
			}
			result = data.charAt(data.length() - 1 - i) + result;
		}
		return result;
	}
	
	@Override
	public String toString() {
		String str = gender + "\t" + name + "\t" + ranking + "\t" + insertComma(String.valueOf(population));
		return str;
	}
}






















