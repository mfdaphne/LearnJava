package com.zoo;

public class Animal {

	private String name;

	private int legCount;

	private boolean swim;

	private AnimalType animalType;

	public Animal(String name, int legCount, boolean swim) {
		this.name = name;
		this.legCount = legCount;
		this.swim = swim;
	}

	public void setAnimalType(AnimalType animalType) {
		this.animalType = animalType;
	}

	public AnimalType getAnimalType() {
		return animalType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegCount() {
		return legCount;
	}

	public void setLegCount(int legCount) {
		this.legCount = legCount;
	}

	public boolean isSwim() {
		return swim;
	}

	public void setSwim(boolean swim) {
		this.swim = swim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ (animalType == null ? 0 : animalType.hashCode());
		result = prime * result + legCount;
		result = prime * result + (name == null ? 0 : name.hashCode());
		result = prime * result + (swim ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Animal other = (Animal) obj;
		if (animalType != other.animalType) {
			return false;
		}
		if (legCount != other.legCount) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (swim != other.swim) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", legCount=" + legCount + ", swim="
				+ swim + ", animalType=" + animalType + "]";
	}

}
