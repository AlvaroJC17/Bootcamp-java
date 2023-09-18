package jsonify;

public class Jsonify {

	 public static void main(String[] args) {
	    	
   	  if (args.length == 0) {
             System.out.println("Debes proporcionar al menos un argumento.");
             return;
         }
   	 
   	  procesarListaArgs(args);
   }
   	  
   public static void procesarListaArgs(String[] lista) {
   	
   	// Construir la representación JSON
   	StringBuilder json = new StringBuilder();
   	
   	json.append("{\"data\":[");
   	
   	for (int i = 0; i < lista.length; i++) {
   		json.append("\"").append(lista[i]).append("\"");
   		if (i < lista.length - 1) {
   			json.append(",");
   		}
   	}
   	
   	json.append("]}");
   	String jsonformat = json.toString();
   	
   	
   	//Resultado en formato JSON
   	System.out.println("Valores en formato JSON:");
   	System.out.println(jsonformat);
   }
}


