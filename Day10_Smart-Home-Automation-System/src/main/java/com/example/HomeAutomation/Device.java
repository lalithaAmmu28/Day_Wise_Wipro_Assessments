package com.example.HomeAutomation;

import org.springframework.stereotype.Component;

@Component
public class Device {
    private String type = "AC";
    private boolean status = false;

    public void toggle() {
        status = !status;
        System.out.println(type + " turned " + (status ? "ON" : "OFF"));
    }

	public String getType() {
		return type;
	}

	public boolean isStatus() {
		return status;
	}

    
}
