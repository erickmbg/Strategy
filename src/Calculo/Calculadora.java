package Calculo;
	
	public class Calculadora {

		private ICalcular calculatorStrategy;
		
		public double calculate(double a, double b) {
			return calculatorStrategy.calculate(a, b);
		}
		
		public void setCalculate(ICalcular calculatorStrategy) {
			this.calculatorStrategy = calculatorStrategy;
			
		}

	}