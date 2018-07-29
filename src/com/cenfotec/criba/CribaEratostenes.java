package com.cenfotec.criba;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CribaEratostenes {

	public static int[] generarCriba(int tope) {
		if (tope == 1) return new int[0];
		// >> Limite Superior
		int limiteSuperior = (int) Math.sqrt(tope);
		// >> Array Dimension
		int dim = tope + 1;
		// >> Prime numbers
		boolean[] primo = new boolean[dim];
		List<Integer> primos = new ArrayList<Integer>();
		
		for (int m = 2; m <= limiteSuperior; m++)
			if (!primo[m]) {
				primos.add(m);
				for (int k = m * m; k <= tope; k += m)
					primo[k] = true;
			}

		for (int m = limiteSuperior; m <= tope; m++)
			if (!primo[m])
				primos.add(m);
		
		return primos.stream().mapToInt(i -> i).toArray();
	}
	public static boolean esPrimo (int number) {
		List<Integer> primos = IntStream.of(generarCriba(number)).boxed().collect(Collectors.toList());
		return primos.contains(number);
	}
}
