package fr.larabi.exo1;

public class Identite {
	
		private String nip ;
		private String nom;
		private String prenom;
		
		String getNip() 
		{return this.nip;}
		
		String getNom()
		{return this.nom;}
		
		String getPrenom()
		{return this.prenom;}
		
	public Identite(String nip,String nom,String prenom) 
	{ 
		this.nip=nip;
	    this.nom=nom;
	    this.prenom=prenom;
	}	
	}

