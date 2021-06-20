package com.student.ms.model;

public class SecondaryStudent extends Student {

	private float physics;

	private float chemistry;

	private float biology;

	private float mathematics;

	private SecondaryStudent(Builder builder) {
		this.physics = builder.physics;
		this.chemistry = builder.chemistry;
		this.biology = builder.biology;
		this.mathematics = builder.mathematics;
	}

	public SecondaryStudent() {
	}

	public float getPhysics() {
		return physics;
	}

	public void setPhysics(float physics) {
		this.physics = physics;
	}

	public float getChemistry() {
		return chemistry;
	}

	public void setChemistry(float chemistry) {
		this.chemistry = chemistry;
	}

	public float getBiology() {
		return biology;
	}

	public void setBiology(float biology) {
		this.biology = biology;
	}

	public float getMathematics() {
		return mathematics;
	}

	public void setMathematics(float mathematics) {
		this.mathematics = mathematics;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private float physics;
		private float chemistry;
		private float biology;
		private float mathematics;

		private Builder() {
		}

		public Builder withPhysics(float physics) {
			this.physics = physics;
			return this;
		}

		public Builder withChemistry(float chemistry) {
			this.chemistry = chemistry;
			return this;
		}

		public Builder withBiology(float biology) {
			this.biology = biology;
			return this;
		}

		public Builder withMathematics(float mathematics) {
			this.mathematics = mathematics;
			return this;
		}

		public SecondaryStudent build() {
			return new SecondaryStudent(this);
		}
	}

}
