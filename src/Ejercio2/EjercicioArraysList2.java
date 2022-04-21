package Ejercio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EjercicioArraysList2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int z, n=0;
		ArrayList <Integer> n1= new ArrayList<Integer>();
		do {
			System.out.println("Dime un numero guachin");
			z=Integer.parseInt(sc.nextLine());
			n1.add(z);
		}while (z!=0);
		System.out.println("Se introdujo un 0 no se pueden añadir mas numeros ");
		System.out.println("Has introdcido "+ n1.size());
		for(int i =0;i<n1.size();i++) {
			n += n1.get(i);
		}
		System.out.println("La media es " + calculoMedia(n1));
	}
	public static int calculoMedia( ArrayList <Integer> n1) {
		int media, n=0;
		for(int i =0;i<n1.size();i++) {
			n += n1.get(i);
		}
		System.out.println("La suma de los numeros es "+n);
		media = n/(n1.size()-1);
		return media;
	}
	public static ArrayList<Integer> numerosIntroducidos (ArrayList <Integer>n1) {
		ArrayList <Integer> nros = new ArrayList <Integer>();
		Iterator <Integer> it = n1.iterator(); 
		while(it.hasNext())
			System.out.println(it.next());
		return n1;
	}
	public static void rellenarArray(ArrayList <Integer>n1, Scanner sc) {
		
	}
}
