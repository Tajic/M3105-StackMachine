package fr.iutvalence.info.m3105.stackmachine;

public class Program {

	private Instruction[] instructions;
	private int instructionCount;
	
	public Program(Instruction[] instructions) {
		this.instructions = instructions;
		instructionCount = instructions.length;
	}

	public int getInstructionCount() {
		return instructionCount;
	}

	public Instruction getInstructionAt(int instructionNumber) {
		return instructions[instructionNumber];
	}
	
	

}
