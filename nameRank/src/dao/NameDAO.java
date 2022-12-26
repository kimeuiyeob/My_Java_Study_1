package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

import vo.BoyVO;
import vo.GirlVO;
import vo.NameDTO;

public class NameDAO {
	public ArrayList<GirlVO> girls;
	public ArrayList<BoyVO> boys;
	
	//병합
	public void merge(String path1, String path2, String path3) throws IOException{
		BufferedReader boyReader = DBConnecter.getReader(path1);
		BufferedReader girlReader = DBConnecter.getReader(path2);
		BufferedWriter bufferedWriter = null;
		
		BoyDAO boyDAO = new BoyDAO();
		GirlDAO girlDAO = new GirlDAO();
		
		girls = new ArrayList<GirlVO>();
		boys = new ArrayList<BoyVO>();
		
		String line = null, temp = "";
		
		while((line = boyReader.readLine()) != null) {
			temp += line + "\n";
			boys.add(boyDAO.setObject(line));
		}
		
		boyReader.close();
		
		while((line = girlReader.readLine()) != null) {
			temp += line + "\n";
			girls.add(girlDAO.setObject(line));
		}
		
		girlReader.close();
		
		bufferedWriter = DBConnecter.getWriter(path3);
		bufferedWriter.write(temp);
		bufferedWriter.close();
	}
	
	//랭킹 수정
	public void updateRanking(String path) throws IOException{
		BufferedWriter bufferedWriter = DBConnecter.getWriter(path);
		ArrayList<Object> datas = new ArrayList<Object>();
		ArrayList<Integer> populations = new ArrayList<Integer>();
		HashSet<Integer> populationSet = null;
		String temp = "";
		int ranking = 1, count = 0;
		
		datas.addAll(boys);
		datas.addAll(girls);
		
		boys.stream().map(v -> v.getPopulation()).forEach(populations::add);
		girls.stream().map(v -> v.getPopulation()).forEach(populations::add);
		
		populationSet = new HashSet<Integer>(populations);
		populations = new ArrayList<Integer>(populationSet);
		
		populations = (ArrayList<Integer>)populations.stream().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		
		for (Integer population : populations) {
			count = 0;
			for (Object obj : datas) {
				if(obj instanceof BoyVO) {
					BoyVO boyVO = (BoyVO) obj;
					if(population == boyVO.getPopulation()) {
						NameDTO nameDTO = new NameDTO();
						nameDTO.setGender("B");
						nameDTO.setName(boyVO.getName());
						nameDTO.setRanking(ranking);
						nameDTO.setPopulation(population);
						
						temp += nameDTO + "\n";
						count ++;
					}
				}
				
				if(obj instanceof GirlVO) {
					GirlVO girlVO = (GirlVO) obj;
					if(population == girlVO.getPopulation()) {
						NameDTO nameDTO = new NameDTO();
						nameDTO.setGender("G");
						nameDTO.setName(girlVO.getName());
						nameDTO.setRanking(ranking);
						nameDTO.setPopulation(population);
						
						temp += nameDTO + "\n";
						count ++;
					}
				}
			}
			if(count > 1) {
				ranking += count - 1;
			}
			ranking ++;
		}
		
		bufferedWriter.write(temp);
		bufferedWriter.close();
	}
}



















