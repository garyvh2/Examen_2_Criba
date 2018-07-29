package com.cenfotec.criba.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cenfotec.criba.CribaEratostenes;

public class CribaEratostenes_Test {
	
	
	@BeforeClass
	public static void init() {
		
	}
	
	@Test
	public void First_20 () {
		int [] f20 = new int [] { 2, 3, 5, 7, 11, 13, 17, 19 };
		assertArrayEquals(f20, CribaEratostenes.generarCriba(20));
	}

}
