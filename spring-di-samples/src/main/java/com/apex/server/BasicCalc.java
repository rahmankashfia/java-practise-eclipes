package com.apex.server;

public class BasicCalc implements Calc {
	/* (non-Javadoc)
	 * @see com.apex.sever.Calc#add(int, int)
	 */
	public int add(int i, int j) {
		return i + j;
	}
	/* (non-Javadoc)
	 * @see com.apex.sever.Calc#diff(int, int)
	 */
	public int diff(int i, int j) {
		return i - j;
	}
	/* (non-Javadoc)
	 * @see com.apex.sever.Calc#prod(int, int)
	 */
	public int prod(int i, int j) {
		return i * j;
	}
	/* (non-Javadoc)
	 * @see com.apex.sever.Calc#div(int, int)
	 */
	public int div(int i, int j) {
		return i / j;
	}
}
