
import java.util.Scanner; // importation de biblioth�que
public class Volume       // Cr�ation de la classe Volume
{  
	public static void main(String[] args)  // Cr�ation fonction public main
	{	
		Scanner scan = new Scanner(System.in); 
		System.out.println("Veuillez entrer la largeur");
		float a = scan.nextFloat(); // Demande la largeur � l'utilisateur
		System.out.println("Veuillez entrer la hauteur");
		float b = scan.nextFloat(); // Demande la hauteur � l'utilisateur
		System.out.println("Veuillez entrer la longueur");
		float c = scan.nextFloat(); // Demande la longueur � l'utilisateur
		if (a<0 || b<0 || c<0)
		{
			System.out.println("Veuillez entrer des valeurs positives");
		}
		else
		{
			float V;                    // On d�finit le type de la variable V
			V = a*b*c;                  // Calcul de V
			System.out.println("votre pav� droit a un volume de " + V);  // Affichage de la valeur
		}
	}
}
