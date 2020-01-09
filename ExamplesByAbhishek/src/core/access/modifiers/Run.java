package core.access.modifiers;

/**
 * This program aims at the constructor chaining.
 * 
 * when a class extends another class , the constructor of the super class is
 * always invoked first.
 * 
 * @author abhishek.vishnoi
 *
 */
public class Run {

	public static void main(String[] args) {
		
		PublicVehicle pubV = new PublicVehicle();
		System.out.println(pubV.RegAddress + " and " + pubV.ownerName);
		pubV.RegAddress = "Delhi";
		pubV.ownerName = "DelhiTransportCorp";
		System.out.println(pubV.RegAddress + " and " + pubV.ownerName);
		
		PrivateVehicle pv1 = new PrivateVehicle();
		System.out.println(pv1.getRegAddress() + " and " + pv1.getOwnerName());
		
		PrivateVehicle pv = new PrivateVehicle("Delhi", "Abhishek");
		System.out.println(pv.getRegAddress() + " and " + pv.getOwnerName());
		
	}
}
