package com.company;

public class Car {

	private int realSpeed;
	private int needSpeed;
	private int maxSpeed;

	private String color;

	private int howManyseats;

	private String types;

	private int yearMadeCar;

	private boolean runAndDrive;

	private String model;

	public void startEngine() {
		System.out.println("Start engine with key or button");
	}

	public void braking() {
		while (needSpeed != realSpeed) {
			realSpeed--;
		}
			System.out.println("Real speed equals " + realSpeed);
	}

	public boolean isRunAndDrive(boolean runAndDrive) {
		return runAndDrive;
	}

	public void setNeedSpeed(int needSpeed) {
		if (needSpeed < 0) {

		}
		this.needSpeed = needSpeed;
	}

	public int getNeedSpeed() {
		return needSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed < 0) {
			System.out.println("It is not true");
		}
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeede() {
		return maxSpeed;
	}
}
