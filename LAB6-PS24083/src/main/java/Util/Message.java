package Util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.TypedQuery;

import model.Video;

public class Message {
	public static String getAttr(String text1,String text2,int add) {
		return add==1?text1:text2;
	}
	public static List<Video> getListOnlyOne(TypedQuery<Video> type){
		List<Video> list = type.getResultList();
		Set<Video> set = new HashSet<>();
		list.clear();
		list.addAll(set);
		return list;
	}
}
