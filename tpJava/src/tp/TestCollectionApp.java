package tp;

import java.util.ArrayList;
import java.util.List;

public class TestCollectionApp {

	public static void main(String[] args) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("lundi");
		liste1.add("mardi");
		liste1.add("mercredi");
		liste1.add("jeudi");
		//liste1.add(5); erreur vue par le compilateur
		liste1.remove("lundi");
		System.out.println("nb elts de liste1="+ liste1.size());
        //liste1.clear();
		
		for(String jour : liste1) {
			System.out.println("jour="+jour);
		}
		
        System.out.println("liste1="+liste1);
        
        
        List<Integer> liste2 = new ArrayList<Integer>();
        liste2.add(10); liste2.add(20);
        for(Integer val : liste2) {
			System.out.println("val="+val);
		}
        
	}

}
