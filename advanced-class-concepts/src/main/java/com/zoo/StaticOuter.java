package com.zoo;

public class StaticOuter {

	static class StaticInner {

		public void getClimate() {
		}
	}

	private void canGoOut() {
		StaticInner inner = new StaticInner();
		inner.getClimate();

	}

}
