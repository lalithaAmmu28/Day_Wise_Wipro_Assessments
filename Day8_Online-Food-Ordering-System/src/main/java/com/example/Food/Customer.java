package com.example.Food;

public class Customer {
    private String name;
    private String contact;
    private String preferredCuisine;

    public Customer(String name, String contact, String preferredCuisine) {
        this.name = name;
        this.contact = contact;
        this.preferredCuisine = preferredCuisine;
    }

    public String getPreferredCuisine() {
        return preferredCuisine;
    }

	@Override
	public String toString() {
		return "Customer [name=" + name + ", contact=" + contact + ", preferredCuisine=" + preferredCuisine + "]";
	}

	public String getName() {
		return name;
	}

	public String getContact() {
		return contact;
	}

    // getters and toString()
}
