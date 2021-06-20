package com.room;

import com.zoo.Animal;

public class Room {

	public static void main(String[] args) {
		RoomTypeChecker checker = (Animal a) -> {
			if (a.getName().equals("Lion")) {
				return true;
			}
			return false;
		};

		checker.checkRoom(new Animal("Lion", false, false));
	}
}
