package view;

import java.io.IOException;

import dao.NameDAO;

public class Test {
	public static void main(String[] args) throws IOException{
		NameDAO nameDAO = new NameDAO();
		nameDAO.merge("boyNames.txt", "girlNames.txt", "names.txt");
		nameDAO.updateRanking("names.txt");
	}
}
