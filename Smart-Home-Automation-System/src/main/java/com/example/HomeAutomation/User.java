package com.example.HomeAutomation;

import org.springframework.stereotype.Component;
 
@Component
public class User {
    private String name = "Pavan";
    private String homeId = "HOME123";
	public String getName() {
		return name;
	}
	public String getHomeId() {
		return homeId;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", homeId=" + homeId + "]";
	}

   
}
