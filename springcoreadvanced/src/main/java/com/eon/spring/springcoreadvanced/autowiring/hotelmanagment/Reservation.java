package com.eon.spring.springcoreadvanced.autowiring.hotelmanagment;

public class Reservation {

	private int roomNo;
	private String name;

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Reservation [roomNo=" + roomNo + ", name=" + name + "]";
	}

}
