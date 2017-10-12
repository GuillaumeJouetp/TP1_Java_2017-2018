import java.util.Scanner; // importation de bibliothèque
public class Equation2ndDegré // Création de classe 
{  
	public static void main(String[] args)  // Création fonction principale
	{	
		Scanner scan = new Scanner(System.in); // Entrée console
		System.out.println("Quel est la valeur du coefficient du 2nd degré?");
		double a = scan.nextDouble(); // Demande du coefficient du 2nd degré à  l'utilisateur
		System.out.println("Quel est la valeur du coefficient du 1er degré?");
		double b = scan.nextDouble(); // Demande du coefficient du 1er degré à  l'utilisateur
		System.out.println("Quel est la valeur de la constante?");
		double c = scan.nextDouble(); // Demande de la constante à  l'utilisateur
		double D = b*b-4*a*c;        // On définit le discriminant
		
		if (D<0)
		{
			System.out.println("Il n'y a pas de solutions réelles"); // Sortie console
		}
		if (D == 0)
		{
			double x = -b/(2*a);
			System.out.println("La valeur de x est : " + x); // Sortie console
		}
		if (D>0)
		{
			double x1 = (-b+Math.sqrt(D))/(2*a);
			double x2 = (-b-Math.sqrt(D))/(2*a);
			System.out.println("La valeur de x1 est : " + x1 + " et la valeur de x2 est " + x2); // Sortie console
		}
			
		     
	}
}