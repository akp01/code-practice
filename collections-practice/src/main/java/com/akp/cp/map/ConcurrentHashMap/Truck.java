package com.akp.cp.map.ConcurrentHashMap;

public class Truck {
	private int plates;
	private boolean inprogress;

	public Truck() {
	}

	public Truck(int plates) {
		this.plates = plates;
	}

	public int getPlates() {
		return plates;
	}

	public void setPlates(int plates) {
		this.plates = plates;
	}

	public boolean isInprogress() {
		return inprogress;
	}

	public void setInprogress(boolean inprogress) {
		this.inprogress = inprogress;
	}

	// It is VERY IMPORTANT to implement hasCode() and equals() on classes
	// that will be "stored" in a HashMap
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + plates;
		result = prime * result + (inprogress ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Truck other = (Truck) obj;
		if (plates != other.plates)
			return false;
		if (inprogress != other.inprogress)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Truck [plates=" + plates + "]";
	}
}
