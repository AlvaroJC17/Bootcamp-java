package calculadorajava;



public class calculadora{
	
	public static void main(String[] args) {
	

	      if (args.length != 3) {
	            System.out.println("Uso: java Calculadora <num1> <num2> <operacion>");
	            return;
	        }

	        double num1, num2;
	        String operacion;

	        num1 = Double.parseDouble(args[0]);
	        num2 = Double.parseDouble(args[1]);
	        operacion = args[2].toLowerCase();
	       
	        double resultado = calcular(num1, num2, operacion);
	        
	        if (Double.isNaN(resultado)) {
	        	System.out.println("Error: Operación no válida o división por cero.");
	        } else {
	        	System.out.println("Resultado: " + String.format("%2f", resultado));
	        }
	}
	
	 public static double calcular(double num1, double num2, String operacion) {
	        switch (operacion) {
	            case "sum":
	                return num1 + num2;
	            case "res":
	                return num1 - num2;
	            case "mul":
	                return num1 * num2;
	            case "div":
	                if (num2 != 0) {
	                    return num1 / num2;
	                } else {
	                    return Double.NaN;
	                }
	            default:
	                return Double.NaN;
	        }
	    }
}
