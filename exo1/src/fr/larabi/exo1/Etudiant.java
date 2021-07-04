package fr.larabi.exo1;

import java.util.ArrayList;
import java.util.HashMap;

public class Etudiant {
	
	private Identite identite;
	private Formation formation;
	HashMap<String, ArrayList<Float>> resultats=new HashMap<>();

	public Etudiant(Identite identite, Formation formation, HashMap<String, ArrayList<Float>> resultats) {
		this.identite = identite;
		this.formation = formation;
		this.resultats = resultats;
	}
	public Identite getIdentite() {
		return identite;
	}
	public void setIdentite(Identite identite) {
		this.identite = identite;
	}
	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	
	@Override
	public String toString() {
		return "Etudiant [identite=" + identite + ", formation=" + formation + ", resultats=" + resultats + "]";
	}
	
	public void ajouter_note(String nom,ArrayList<Float> n) {
	     resultats.put(nom,n);
	        		 }
	
	public float moyenne (String matiere) {
		float moy=0,s=0;
		ArrayList<Float> n=new ArrayList<Float>();
		
		for(HashMap.Entry<String,ArrayList<Float>> p:resultats.entrySet()) 
		{
			if(p.getKey()==matiere) {
			   n= p.getValue();
		}
		}
		for(Float o:n)
		{
			s+=o;
		}
		moy=s/n.size();
		return moy ;
	}
	
	public float moyGen() 
	{
	int c=0,a=0;float s=0;
	for(HashMap.Entry<String,ArrayList<Float>> p:resultats.entrySet()) {
	for(HashMap.Entry<String,Integer> i: formation.mats.entrySet()) 
	{	
	 if(p.getKey()==i.getKey()) 
	   {
		c=i.getValue();  
		s+=moyenne(p.getKey())*c;
	
	    a+=c; 
	  }}}
      return s/a; 
      }
	
	public void modifierFR(String np,Formation o)
	  {
		if(this.identite.getNip()==np)
		{
		  this.formation=o;
		  
		  System.out.println("la formation est modifiée de "+this.formation +"a"+ o);
	   }
	  }
		
     }
