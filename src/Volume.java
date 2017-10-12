
import java.util.Scanner; // importation de bibliothéque
public class Volume       // Création de la classe Volume
{  
	public static void main(String[] args)  // Création fonction public main
	{	
		Scanner scan = new Scanner(System.in); 
		System.out.println("Veuillez entrer la largeur");
		float a = scan.nextFloat(); // Demande la largeur à l'utilisateur
		System.out.println("Veuillez entrer la hauteur");
		float b = scan.nextFloat(); // Demande la hauteur à l'utilisateur
		System.out.println("Veuillez entrer la longueur");
		float c = scan.nextFloat(); // Demande la longueur à l'utilisateur
		if (a<0 || b<0 || c<0)
		{
			System.out.println("Veuillez entrer des valeurs positives");
		}
		else
		{
			float V;                    // On définit le type de la variable V
			V = a*b*c;                  // Calcul de V
			System.out.println("votre pavé droit a un volume de " + V);  // Affichage de la valeur
		}
	}
}
