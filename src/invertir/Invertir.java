package invertir;

import java.util.ArrayList;

public class Invertir {

	public static void main(String[] args) {
		
	}
	public static void invertir (ArrayList<Integer> x) {
		int i;
		i = x.size();
		int ultimo;
		for (int j =0; j<x.size()/2;j++) {
			
		}
	}
	public static void invertir2 (ArrayList<Integer> x) {
		for(int i=0;i<x.size()-1;i++) {
			x.add(i,x.get(x.size()-1));
			
		}
	}
	

}
