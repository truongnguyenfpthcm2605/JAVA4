package com.poly.ps24083.bai2;

public class User {
		private String username;
		private String password;
		private boolean remember;
		public User(String username, String password, boolean remember) {
			this.username = username;
			this.password = password;
			this.remember = remember;
		}
		
		public User() {
		
		}

		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public boolean isRemember() {
			return remember;
		}
		public void setRemember(boolean remember) {
			this.remember = remember;
		}
		
		
		
		
}
