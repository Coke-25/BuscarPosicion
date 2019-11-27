package es.studium.BuscarPosicion;

import java.util.Scanner;

public class BuscarPosicion 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		char c;
		String frase;
		int posicion = -1;
		System.out.println("Añade una frase:");
		frase = teclado.nextLine();
		System.out.println("Indica una letra que este en la frase anterior:");
		c = teclado.next().charAt(0);
		
		for(int i=0;i<frase.length();i++)
		{
			if(frase.charAt(i)==c)
			{
				posicion = i;
				i = frase.length();
			}
		}
		if(posicion==-1)
		{
			System.out.println("No encontrado");
		}
		else
		{
			System.out.println("Se ha encontrado en la posicion "+(posicion+1));
		}
		teclado.close();
	}

}
