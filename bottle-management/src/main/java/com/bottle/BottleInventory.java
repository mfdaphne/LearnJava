package com.bottle;

public class BottleInventory {

	private int quantity = 0;

	private static BottleInventory instance;

	private BottleInventory() {
	}

	public synchronized static BottleInventory getInstance() {
		if (instance == null) {
			instance = new BottleInventory();
		}
		return instance;
	}

	public int getQuantity() {
		return quantity;
	}

	public synchronized void addBottles(int no) {
		quantity = quantity + no;
	}

	public synchronized void removeBottle(int no) {
		quantity = quantity - no;
	}

}
