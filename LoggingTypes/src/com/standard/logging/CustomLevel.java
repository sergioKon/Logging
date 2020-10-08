package com.standard.logging;

import java.util.logging.Level;

public class CustomLevel  extends Level{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final Level DEBUG = new CustomLevel("DEBUG", (Level.INFO.intValue() + Level.CONFIG.intValue())/2);
	public CustomLevel(String name, int value) {
		super(name, value);
	}
	
}
