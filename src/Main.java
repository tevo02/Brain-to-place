import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		boolean salir = false;
		while(salir ==  false) {
			System.out.println("\n------- Brain-to-Place -------\n");
			System.out.println("1. Agregar Tarea");
			System.out.println("2. Completar Tarea");
			System.out.println("3. Eliminar Tarea");
			System.out.println("4. Modificar Tarea");
			System.out.println("5. Tareas Pendientes");
			System.out.println("6. Historial de Tareas");
			System.out.println("7. Quejas o Sugerencias");
			System.out.println("8. Salir\n");
			
			Scanner lector = new Scanner(System.in);
		    String entrada1 = lector.nextLine();
			
			switch(entrada1) {
			  case "1":
				  break;
			  case "2":
				  break;
			  case "3":
				  break;
			  case "4":
				  break;
			  case "5":
				  break;
			  case "6":
				  break;
			  case "7":
				  break;
			  case "8":
				  salir = true;
				  break;
			  default:
			}
		}
	}
}