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

	@Test
	public void IsPrime () {
		// >> First 2
		assertFalse(CribaEratostenes.esPrimo(1));
		assertTrue(CribaEratostenes.esPrimo(2));
		// >> Hundreds 
		assertTrue(CribaEratostenes.esPrimo(191));
		assertFalse(CribaEratostenes.esPrimo(198));
		// >> Thousands
		assertTrue(CribaEratostenes.esPrimo(8513));
		assertFalse(CribaEratostenes.esPrimo(8520));
	}
	
}
