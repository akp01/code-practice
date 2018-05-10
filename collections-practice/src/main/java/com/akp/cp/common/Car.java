package com.akp.cp.common;

public class Car implements Comparable<Car> {
	private String registrationNumber;
	private int price;

	public Car(final String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Car(final String registrationNumber, final int price) {
		this.registrationNumber = registrationNumber;
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(final int price) {
		this.price = price;
	}

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(final String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@Override
	public boolean equals(final Object obj) {
		if ((obj != null) && (obj instanceof Car)) {
			final String regNumber = ((Car) obj).getRegistrationNumber();
			if ((regNumber != null) & regNumber.equals(this.registrationNumber)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.registrationNumber.hashCode();
	}

	@Override
	public String toString() {
		return this.registrationNumber;
	}

	/**
	 * Natural ordering for car instances
	 */
	public int compareTo(final Car o) {
		if (this.getPrice() > o.getPrice()) {
			return 1;
		} else if (this.getPrice() < o.getPrice()) {
			return -1;
		}
		return 0;
	}

}
