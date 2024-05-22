package com.poly.dao;

import java.util.List;

import com.poly.enity.Clients;

public class ClientImpl extends DAO<Clients>  implements ClientsDao{

	@Override
	public Clients findById(String id) {
		return em.find(Clients.class, id);
	}


	@Override
	public List<Clients> findAll() {
		return super.findAll(Clients.class, false);
	}

	@Override
	public List<Clients> findPage(int pageNumber, int pageSize) {
		return super.findToPage(Clients.class, false, pageNumber, pageSize);
	}

	@Override
	public List<Clients> findvideoVip(boolean vip) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(Clients enity) {
		return super.insert(enity);
	}

	@Override
	public boolean update(Clients enity) {
		return super.update(enity);
	}

	@Override
	public boolean delete(Clients id) {
		return super.update(id);
	}


	@Override
	public List<Clients> findTitle(String title) {
		String sql = "select o from Clients o where o.hoten like ?0";
		return super.findMany(Clients.class, sql, "%"+title+"%");
	}

}
