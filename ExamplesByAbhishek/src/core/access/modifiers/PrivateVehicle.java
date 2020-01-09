package core.access.modifiers;

public class PrivateVehicle {

	private String RegAddress="Gurgaon";
	private String ownerName="Arushi";

	PrivateVehicle() {
	}
	
	PrivateVehicle(String rA, String oN) {
		this.setRegAddress(rA);
		this.setOwnerName(oN);
	}

	/**
	 * 
	 * getters and setters are required to manipulate and read private class
	 * members.
	 * 
	 */

	public String getRegAddress() {
		return RegAddress;
	}

	public void setRegAddress(String regAddress) {
		RegAddress = regAddress;
	}

	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

}
