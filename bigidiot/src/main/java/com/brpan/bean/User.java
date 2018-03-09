package com.brpan.bean;

class User {
	
	private Integer user_id;
	private String user_name;
	private String user_nick;
	private String user_pwd;
	private Integer user_type_id;
	private String user_image;
	private Integer user_status;
	
	public User() {}

	public User(Integer user_id, String user_name, String user_nick, String user_pwd, Integer user_type_id,
			String user_image, Integer user_status) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_nick = user_nick;
		this.user_pwd = user_pwd;
		this.user_type_id = user_type_id;
		this.user_image = user_image;
		this.user_status = user_status;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_nick() {
		return user_nick;
	}

	public void setUser_nick(String user_nick) {
		this.user_nick = user_nick;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public Integer getUser_type_id() {
		return user_type_id;
	}

	public void setUser_type_id(Integer user_type_id) {
		this.user_type_id = user_type_id;
	}

	public String getUser_image() {
		return user_image;
	}

	public void setUser_image(String user_image) {
		this.user_image = user_image;
	}

	public Integer getUser_status() {
		return user_status;
	}

	public void setUser_status(Integer user_status) {
		this.user_status = user_status;
	}

}
