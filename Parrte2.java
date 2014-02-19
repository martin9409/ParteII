import java.util.Scanner;
public class Parrte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mi_scanner=new Scanner(System.in);
		for(int i=0;i<3;i ++){
			System.out.println(" Clase de Programacion");
			String nombre=mi_scanner.next();
			int num1=mi_scanner.nextInt();
			System.out.println("VisualBase");
			int num2=mi_scanner.nextInt();
			System.out.println("Java");
			int num3=mi_scanner.nextInt();
			System.out.println("Eclipse");
			double promedio=((num1+num2+num3)/3);
			System.out.println("Promedio "+ promedio+"%");
			if (promedio >= 60){
				System.out.println("Aprovado");
			}
			else {
					System.out.println("Reprobado");
			}
		}
			
	
	}	
	
	
}
