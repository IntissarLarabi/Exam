package fr.larabi.exo1;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
	
		Identite a1 =new Identite ("r5","larabi","adam");
		Identite a2= new Identite ("r6","amrani","oumaima");
		
		HashMap<String,Integer> mats=new HashMap<>();
		
		Formation b1=new Formation ("01",mats);
		//Formation b2=new Formation ("02",mats);
		
		
		b1.ajoutMat("Math",9);
		b1.ajoutMat("Arabe",2);
		//b1.supprimMat("Arabe") ;
		
		System.out.println(b1.obtenirCoef("Math"));
		
		HashMap<String, ArrayList<Float>> resultats=new HashMap<>();
		
		/****** les etudiants c1 et c2 de la formation b1  *****/
		
		Etudiant c1=new Etudiant(a1,b1,resultats) ;
	
		ArrayList<Float> notes1=new ArrayList<>();
        notes1.add(5.25F);
		notes1.add(12.62F);
		
		c1.ajouter_note("Math",notes1);
		
		System.out.println("Moymath pour c1 " +c1.moyenne("Math"));
		
		ArrayList<Float> notes2=new ArrayList<>();
        notes2.add(17.25F);
		notes2.add(10.56F);
		
		c1.ajouter_note("Arabe",notes2);
		System.out.println("Moyarabe pour c1 "+c1.moyenne("Arabe"));
		
		System.out.println("Moygeneral pour c1 "+c1.moyGen());
		
		Etudiant c2=new Etudiant(a2,b1,resultats);
		
		ArrayList<Float> notes11=new ArrayList<>();
        notes11.add(17.5F);
		notes11.add(17.93F);
		
		c2.ajouter_note("Math",notes11);
		System.out.println("Moymath pour c2 "+c2.moyenne("Math"));
		
		ArrayList<Float> notes22=new ArrayList<>();
        notes22.add(8.25F);
		notes22.add(15.62F);
		
		c2.ajouter_note("Arabe",notes22);
		System.out.println("Moyarabe pour c2 "+c2.moyenne("Arabe"));
		
		System.out.println("Moygeneral pour c2 "+c2.moyGen());
		
		//c1.modifierFR("r5",m1);
		
		/****** Groupe d1   *******/
		ArrayList<Etudiant> etudiants=new ArrayList<>();
		
		Groupe d1=new Groupe(etudiants,b1);
		
		d1.ajouterEtudiant(c1);
		d1.ajouterEtudiant(c2);
		
		System.out.println("Moy de d1 pour math" +d1.moyGrMat("Math")); //prblm katakhod ghi la note ta3 c2
		System.out.println("Moy de d1 pour arabe "+d1.moyGrMat("Arabe")); // 
		
		System.out.println("Moygeneral de d1 "+d1.MoyGeneral());
		
	    System.out.println(d1.triparmerite());
	    System.out.println(d1.triAlpha());
	    System.out.println(d1.triparMat("Math")); 
	    System.out.println(d1.triparMat("Arabe"));
	
	}

}

/*public ArrayList<Etudiant> triAlpha() 
	{
		   Collections.sort(etudiants, new Comparator<Etudiant>(){
			
			public int compare(Etudiant p1, Etudiant p2) {
			
			return (p1.getIdentite().getNom().compareTo(p2.getIdentite().getNom()));
						
			} 
			});
		  	return etudiants; }*/  
	
