package es.Studium.SaltoN;

import java.util.Scanner;

public class SaltoN 
{

	public static void main(String[] args) 
	{
		int numero, i=0;
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el numero de salto");
        numero = teclado.nextInt();
        teclado.close();
        i=numero;
        //comprueba que el numero introducido no es 0 ni menor que 0
        if (i>0)
        {
        	//mientras i<1000, hacer
        	while(i<=1000)
        		{
        			System.out.println(i);
        			i=i+numero;
        		}
        }
        else
        {
        	System.out.println("El salto no puede ser 0 o menor");
        }
	}

}
