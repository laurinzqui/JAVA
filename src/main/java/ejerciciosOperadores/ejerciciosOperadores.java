package prueba;

import java.util.Scanner;

public class ejerciciosOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Los operadores lógicos se uttilixan para combinar valores booleanos y nos devuelven un resultado true or false.
		 * 
		 * 
		 */
		/* int a = 5;
		 int b = 3;
		 System.out.printIn( a == b && a > b);
		 */
		package ejerciciosOperadores;

		import java.util.Scanner;

		public class ejerciciosOperadores {
		    private static int PAR=2;

		    public static void main(String[] args) {
		        // TODO Auto-generated method stub

		        Scanner read = new Scanner(System.in);
		        int a;
		        System.out.println("Ingresse un numero entero: ");
		        a=read.nextInt();

		        //System.out.println(a==b || a>b);

		        if(a%PAR==0) {
		            System.out.println("El numero " + a + " es par");
		        }else {
		            System.out.println("El numero " + a + " es impar");
		        }

		        read.close();

		    }

		}
