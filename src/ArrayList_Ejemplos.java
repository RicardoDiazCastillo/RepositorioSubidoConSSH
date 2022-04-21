import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Ejemplos {
	public static void main(String[] args) {
		ArrayList <String> listaPaises = new ArrayList();
		listaPaises.add("España");
		listaPaises.add("Portugal");
		listaPaises.add("Belgica");
		System.out.println(listaPaises);
		listaPaises.add(2,"Italia");
		
		System.out.println(listaPaises);
		listaPaises.remove(1);
		System.out.println(listaPaises);
		listaPaises.remove("Italia");
		System.out.println(listaPaises);
		System.out.println(listaPaises.get(0));
		listaPaises.add("Mauritania");
		listaPaises.add("Rumania");
		System.out.println(listaPaises);
		listaPaises.set(2, "Suiza");
		System.out.println(listaPaises);
		
		String paisBuscado = "Suiza"; 
		int pos = listaPaises.indexOf(paisBuscado); 
		if(pos!=-1) 
		System.out.println(paisBuscado + " encontrado en la posición: "+pos); 
		else 
		System.out.println(paisBuscado + " no se ha encontrado");
		System.out.println("---------------------------------------");
		for (int i=0; i<listaPaises.size(); i++) 
			System.out.println(listaPaises.get(i)); 
		System.out.println("--------------------------------------------");
		for (String pais:listaPaises) 
			System.out.println(pais);
		System.out.println("-------------------------------------");
		ArrayList<Integer> nros = new ArrayList<Integer>(); 
		//se insertan elementos 
		Iterator<String> it = listaPaises.iterator(); 
		//se crea el iterador it para el ArrayList nros 
		while(it.hasNext()) //mientras queden elementos 
		System.out.println(it.next()); //se obtienen y se muestran


	}
}
