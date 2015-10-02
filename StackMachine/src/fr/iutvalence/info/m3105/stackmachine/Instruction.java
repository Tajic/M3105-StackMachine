package fr.iutvalence.info.m3105.stackmachine;
/**
 * 
 * @author PASCAL Benjamin et BARNEOUD Hector
 *
 */

public class Instruction {

	private int codeOp;
	private int[] params;
	
	public Instruction(int codeOp, int[] params) {
		this.codeOp = codeOp;
		this.params = params;		
	}

	public int getOpCode() {
		return codeOp;
	}

	public int[] getParams() {
		return params;
	}

}
