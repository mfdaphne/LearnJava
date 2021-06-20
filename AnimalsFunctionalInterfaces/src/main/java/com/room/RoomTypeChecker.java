package com.room;

import com.zoo.Animal;

@FunctionalInterface
public interface RoomTypeChecker {

	boolean checkRoom(Animal a);
}
