/**
 * @author Felipe Cachinero
 * Modificado por antonio Marmol Manchado
 */

public class Numeros {
	Numeros() {
	}

	/*
	 * Comprueba si un numero es primo
	 */
	public boolean primo(int num) {
		boolean bandera = true;
		for (int i = 2; i < num / 2 + 1; i++) {
			if (num % i == 0)
				bandera = false;
		}
		return bandera;
	}

	/*
	 * Devuelve el resultado de elevar un número a un exponente
	 */
	public String Potencia(int base, int exponente) {
		int total = 1;
		if (base == 0 && exponente == 0)
			return "Indeterminación";
		else {
			if (base < 0)
				return "Infinito";
			else {

				for (int i = 1; i <= exponente; i++)
					total = total * base;
			}
			return total + "";
		}
	}

	/*
	 * Devuelve la secuencia de Fibonacci de un número
	 */

	public int Fibonacci(int num) {
		int ant1 = 1;
		int ant2 = 0;
		int actual = 0;
		if (num == 0 || num == 1)
			return num;
		for (int i = 2; i <= num; i++) {
			actual = ant1 + ant2;
			ant2 = ant1;
			ant1 = actual;
		}
		return actual;
	}

	/*
	 * Devuelve si un número es perfecto. Un número es perfecto cuando es igual
	 * a la suma de sus divisores propios positivos, sin incluirse él mismo Ej:
	 * 6 Es Perfecto, sus divisores 1,2,3. 6=1+2+3.
	 */

	public boolean Perfecto(int num) {
		int suma = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				suma = suma + i;
		}
		if (suma == num)
			return true;
		else
			return false;
	}

	/*
	 * Un Número n es Abundante si la sumas de sus divisores es mayor que 2n.
	 * Por Ejemplo: 24,sus divisores son 1, 2, 3, 4, 6, 8, 12 y 24, cuya suma es
	 * 60. Puesto que 60 es mayor que 2 × 24, el número 24 es abundante. Y su
	 * abundancia es 60 menos 2 × 24 = 12.
	 * Ejemplos: 12, 18, 20, 24, 30, 36, 40, 42, 48, 54, 56, 60, 66, 70, 72, 78, 80, 84, 88, 90, 96, 100, 102
	 */

	public int Abundante(int num) {
		int suma = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				suma = suma + i;
		}
		if (suma > num)
			return suma - num;
		else
			return -1;
	}

	/*
	 * Se dice que dos Números son Amigos cuando la suma de los divisores
	 * propios de uno es igual al otro 
	 * Ejemplos: (220,280), (1184, 1210), (17.296, 18.416)
	 */

	public boolean Amigos(int num1, int num2) {
		int suma1 = 0, suma2 = 0;
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0)
				suma1 = suma1 + i;
		}
		for (int i = 1; i < num2; i++) {
			if (num2 % i == 0)
				suma2 = suma2 + i;
		}
		if (suma2 == num1 && suma1 == num2)
			return true;
		else
			return false;
	}

	/*
	 * Dos números primos gemelos si dos números primos están separados por una
	 * distancia de 2. Devuelve: -1: El primer número no es primo -2: El segundo
	 * número no es primo 0: Son primos pero no gemelos 1: Son primos gemelos
	 */
	public int Primos_Gemelos(int num1, int num2) {
		if (!primo(num1))
			return -1;
		if (!primo(num2))
			return -2;
		if (Math.abs(num1 - num2) == 2)
			return 1;
		else
			return 0;
	}

}
