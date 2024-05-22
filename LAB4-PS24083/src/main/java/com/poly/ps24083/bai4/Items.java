package com.poly.ps24083.bai4;

import java.util.Date;

public class Items {
		int id;
		String name;
		String img;
		double price;
		double discount;
		Date date = new Date();
		
		public Items() {
			
		}
		public Items(int id,String name, String img, double price, double discount) {
			this.id = id;
			this.name = name;
			this.img = img;
			this.price = price;
			this.discount = discount;
			
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getImg() {
			return img;
		}
		public void setImg(String img) {
			this.img = img;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public double getDiscount() {
			return discount;
		}
		public void setDiscount(double discount) {
			this.discount = discount;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		
		
		
		
}
