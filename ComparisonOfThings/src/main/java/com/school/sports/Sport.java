package com.school.sports;

public class Sport implements Comparable<Sport> {

	private int id;

	private String name;

	private Sport(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + (name == null ? 0 : name.hashCode());
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
		Sport other = (Sport) obj;
		if (id != other.id) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Sport [id=" + id + ", name=" + name + "]";
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private int id;
		private String name;

		private Builder() {
		}

		public Builder withId(int _id) {
			this.id = _id;
			return this;
		}

		public Builder withName(String _name) {
			this.name = _name;
			return this;
		}

		public Sport build() {
			return new Sport(this);
		}
	}

	@Override
	public int compareTo(Sport o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
