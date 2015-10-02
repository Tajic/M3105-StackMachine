package fr.iutvalence.info.m3105.stackmachine;

public class Memory {

	private final int startAdress;
	private final int endAdress;
	private final int data[];
	
	public Memory(int startAdress, int endAdress) {
		this.startAdress = startAdress;
		this.endAdress = endAdress;
		this.data = new int[endAdress-startAdress];
	}
	
	public int getStartAddress() {
		return startAdress;
	}
	
	public void write(int currentAddress, int opCode) throws AddressOutOfBoundsException {
		data[currentAddress] = opCode;
	}
	
	public int read(int adress) throws AddressOutOfBoundsException{
		return data[adress];
	}

}
