package com.handle;

public class Player {

	private int id;

	private Player(Builder builder) {
		this.id = builder.id;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private int id;

		private Builder() {
		}

		public Builder withId(int id) {
			this.id = id;
			return this;
		}

		public Player build() {
			return new Player(this);
		}
	}

}
