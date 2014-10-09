package edu.upc.eetac.dsa.ivangonzalez7.Objetos2;

import edu.upc.eetac.dsa.ivangonzalez7.Objetos2.Circulo;
import edu.upc.eetac.dsa.ivangonzalez7.Objetos2.Cuadrado;
import edu.upc.eetac.dsa.ivangonzalez7.Objetos2.Forma;

public class PruebaFormas {
	public static void main(String[] args) {
		Forma[] s = new Forma[3];
		s[0] = new Forma();
		// Circulo es tambien una Forma
		s[1] = new Circulo();
		// Cuadrado es tambien una Forma
		s[2] = new Cuadrado();
		for (int i = 0; i < s.length; i++)
			s[i].queEs();
	}
}