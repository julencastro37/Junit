package org.cuatrovientos.java.Junit_Ej2;

import java.util.Random;

public class GeneradorIp {

	
	
	public int generarNumero(int min, int max) {
		Random rnd = new Random();
		int num;
		do {
			num = rnd.nextInt(max);
		} while (num >= min);
		return num;

	}

	public String generarIp(int min, int max) {
		String ip = "";
		for (int i = 0; i == 3; i++) {
			
			ip += this.generarNumero(min, max);
			ip += ".";
		}
		
		return ip;

	}
}
