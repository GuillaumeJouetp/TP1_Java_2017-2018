import java.util.Scanner; // importation de biblioth�que
public class Equation2ndDegr� // Cr�ation de classe 
{  
	public static void main(String[] args)  // Cr�ation fonction principale
	{	
		Scanner scan = new Scanner(System.in); // Entr�e console
		System.out.println("Quel est la valeur du coefficient du 2nd degr�?");
		double a = scan.nextDouble(); // Demande du coefficient du 2nd degr� � l'utilisateur
		System.out.println("Quel est la valeur du coefficient du 1er degr�?");
		double b = scan.nextDouble(); // Demande du coefficient du 1er degr� � l'utilisateur
		System.out.println("Quel est la valeur de la constante?");
		double c = scan.nextDouble(); // Demande de la constante � l'utilisateur
		double D = b*b-4*a*c;        // On d�finit le discriminant
		
		if (D<0)
		{
			System.out.println("Il n'y a pas de solutions r�elles"); // Sortie console
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