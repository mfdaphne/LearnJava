package com.zoo;

public class Animal {

	private String name;

	private boolean swim;

	private boolean hop;

	public Animal(String name, boolean swim, boolean hop) {
		this.name = name;
		this.swim = swim;
		this.hop = hop;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.equals("Monkey")) {
			this.name = name;
		}
	}

	public boolean isSwim() {
		return swim;
	}

	public void setSwim(boolean swim) {
		this.swim = swim;
	}

	public boolean isHop() {
		return hop;
	}

	public void setHop(boolean hop) {
		this.hop = hop;
	}

}
