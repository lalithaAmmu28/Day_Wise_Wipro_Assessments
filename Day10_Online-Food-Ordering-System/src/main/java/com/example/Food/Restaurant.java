package com.example.Food;

import java.util.Arrays;

public class Restaurant {
    private String name;
    private String location;
    private String[] cuisines;

    public Restaurant(String name, String location, String[] cuisines) {
        this.name = name;
        this.location = location;
        this.cuisines = cuisines;
    }

    public boolean servesCuisine(String cuisine) {
        for (String c : cuisines) {
            if (c.equalsIgnoreCase(cuisine)) return true;
        }
        return false;
    }

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", location=" + location + ", cuisines=" + Arrays.toString(cuisines) + "]";
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String[] getCuisines() {
		return cuisines;
	}

    // getters and toString()
}

