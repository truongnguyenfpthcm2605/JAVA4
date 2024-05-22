package com.poly.dao;

import java.util.List;

import com.poly.enity.Clients;

public interface ClientsDao {
	public Clients findById(String id);
	public List<Clients> findAll();
	public List<Clients> findTitle(String title);
	public List<Clients> findPage(int pageNumber, int pageSize);
	public List<Clients> findvideoVip(boolean vip);
	public boolean insert(Clients enity);
	public boolean update(Clients enity);
	public boolean delete(Clients id);
}
