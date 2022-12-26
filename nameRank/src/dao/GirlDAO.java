package dao;

import vo.GirlVO;

public class GirlDAO {
	public GirlVO setObject(String line) {
		String[] datas = line.split("\t");
		GirlVO girlVO = new GirlVO();
		
		girlVO.setName(datas[0]);
		girlVO.setRanking(Integer.valueOf(removeComma(datas[1])));
		girlVO.setPopulation(Integer.valueOf(removeComma(datas[2])));
		
		return girlVO;
	}
	
	public String removeComma(String data) {
		return data.replaceAll(",", "");
	}
}
