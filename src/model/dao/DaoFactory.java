package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	//nao expoe a implementação 
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
