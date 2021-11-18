package Calculo;

import Calculo.Soma;
import Calculo.Subtracao;
import Calculo.Multiplicacao;
import Calculo.Divisao;
import Calculo.ICalcular;
import Calculo.Calculadora;

public class Controle {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		double a = 2;
		double b = 2;
		
		calculadora.setCalculate(new Soma());
		System.out.println(a + " + " + b  +" = " + calculadora.calculate(a, b));
		
		calculadora.setCalculate(new Subtracao());
		System.out.println(a + " - " + b  +" = " + calculadora.calculate(a, b));
		
		calculadora.setCalculate(new Multiplicacao());
		System.out.println(a + " * " + b  +" = " + calculadora.calculate(a, b));
		
		calculadora.setCalculate(new Divisao());
		System.out.println(a + " / " + b  +" = " + calculadora.calculate(a, b));
	}

}
