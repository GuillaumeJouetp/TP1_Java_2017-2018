
import java.util.Scanner;
public class Testscanneer 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // Définition de l'entrée console "scan"
		String test = scan.nextLine();         // Demande à l'utilisateur la valeur de "test" (type : string)
		long entierLu = scan.nextLong();	   // Demande à l'utilisateur la valeur de "entierLu" (type : long)
		double doubleLu = scan.nextDouble();   // Demande à l'utilisateur la valeur de "doubleLu" (type : double)
		System.out.println("j'ai lu :" + entierLu + " et " + doubleLu + " et " + test + "!"); // Affichage

	}

}




