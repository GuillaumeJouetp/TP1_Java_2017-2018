
import java.util.Scanner;
public class Testscanneer 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); // D�finition de l'entr�e console "scan"
		String test = scan.nextLine();         // Demande � l'utilisateur la valeur de "test" (type : string)
		long entierLu = scan.nextLong();	   // Demande � l'utilisateur la valeur de "entierLu" (type : long)
		double doubleLu = scan.nextDouble();   // Demande � l'utilisateur la valeur de "doubleLu" (type : double)
		System.out.println("j'ai lu :" + entierLu + " et " + doubleLu + " et " + test + "!"); // Affichage

	}

}




