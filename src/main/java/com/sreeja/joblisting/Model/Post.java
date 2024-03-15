package com.sreeja.joblisting.Model;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
@Component
@Document(collection="jobpost")

public class Post {
	private String profile;
	private String techs[];
	private String desc;
	private int exp;
	public Post() {
		
	}
	
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String[] getTechs() {
		return techs;
	}
	public void setTechs(String[] techs) {
		this.techs = techs;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Post [profile=" + profile + ", techs=" + Arrays.toString(techs) + ", desc=" + desc + ", exp=" + exp
				+ "]";
	}
}

