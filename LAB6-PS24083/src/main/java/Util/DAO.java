package Util;

import java.util.List;

public abstract class DAO<E,K> {
		abstract public int  insert(E enity);
		abstract public int update(E enity);
		abstract public int delete(K key);
		abstract public E findById(K key);
		abstract public List<E>  findAll();
		
}
