package fr.larabi.exo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Groupe 
{
    ArrayList<Etudiant> etudiants=new ArrayList<>();
	private Formation formation;
	
	public Groupe(ArrayList<Etudiant> etudiants, Formation formation) {
		this.etudiants = etudiants;
		this.formation = formation;
	}
	
	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	@Override
	public String toString() {
		return "Groupe [etudiants=" + etudiants + ", formation=" + formation + "]";
	}
	
public void ajouterEtudiant(Etudiant e) 
{ etudiants.add(e);
}
public void supprimerEtudiant(Etudiant e) 
{
	etudiants.remove(e);
}

 public float moyGrMat(String m) {
    float res=0,s=0;
    for (Etudiant e:etudiants)
    {
    		{
    			s+=e.moyenne(m);
    		}
    		res=s/etudiants.size();
    		}
    return res ;
    }
  
 
   public float MoyGeneral()
     {
	float res=0,s=0;
	for(Etudiant e:etudiants)
	{
		s+=e.moyGen();
	}
	res=s/etudiants.size();
	return res;
	}
	
   public ArrayList<Etudiant> triparmerite() 
	{
		   Collections.sort(etudiants, new Comparator<Etudiant>(){
			
			public int compare(Etudiant p1, Etudiant p2) {
			
			if(p1.moyGen()< p2.moyGen())
				return -1;
			
			else if(p1.moyGen()>p2.moyGen())
				return 1;		
			else 
				return 0; 
			} 
		}	  );
		  return etudiants;	 
	}
   
  public ArrayList<Etudiant> triAlpha() 
	{
		   Collections.sort(etudiants, new Comparator<Etudiant>(){
			
			public int compare(Etudiant p1, Etudiant p2) {
			
			return (p1.getIdentite().getNom().compareTo(p2.getIdentite().getNom()));
						
			} 
			});
		  	return etudiants; }
   
   public ArrayList<Etudiant> triparMat(String m) 
  	{
  		   Collections.sort(etudiants, new Comparator<Etudiant>()
  		   {
  			
  			public int compare(Etudiant p1, Etudiant p2) {
  				
  			if(p1.moyenne(m)< p2.moyenne(m))
  				return 1;
  			
  			else if(p1.moyenne(m)>p2.moyenne(m))
  				return -1;		
  			else 
  				return 0; 
  			} 
  		}	);  
      return etudiants;  	
   
	}

}
