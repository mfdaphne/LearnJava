package com.school.club;

public class Player {

	private int age;

	private String name;

	private int ranking;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int age, String name, int ranking) {
		this.age = age;
		this.name = name;
		this.ranking = ranking;
	}

	private Player(Builder builder) {
		this.age = builder.age;
		this.name = builder.name;
		this.ranking = builder.ranking;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (name == null ? 0 : name.hashCode());
		result = prime * result + ranking;
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
		Player other = (Player) obj;
		if (age != other.age) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (ranking != other.ranking) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Player [age=" + age + ", name=" + name + ", ranking=" + ranking
				+ "]\n";
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private int age;
		private String name;
		private int ranking;

		private Builder() {
		}

		public Builder withAge(int age) {
			this.age = age;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withRanking(int ranking) {
			this.ranking = ranking;
			return this;
		}

		public Player build() {
			return new Player(this);
		}
	}

}
