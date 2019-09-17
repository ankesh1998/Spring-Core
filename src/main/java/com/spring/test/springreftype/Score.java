package com.spring.test.springreftype;

public class Score {

	private int physics;
	private int chemistry;
	private int math;

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "[physics=" + physics + ", chemistry=" + chemistry + ", math=" + math + "]";
	}
	

}
