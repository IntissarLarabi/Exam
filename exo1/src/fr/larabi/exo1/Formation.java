package fr.larabi.exo1;

import java.util.HashMap;

public class Formation { 
	
	private String id;
	HashMap<String,Integer> mats=new HashMap<String,Integer>();
	
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public Formation (String id ,HashMap<String,Integer> mats)
	{
		this.id=id;
		this.mats=mats;
		
	}
	public void ajoutMat(String m,Integer c) 
	{
     mats.put(m,c);
     }
	
	public void supprimMat(String m) 
	{
		mats.remove(m);
	}
	
	public int obtenirCoef(String m) 
	{
		return mats.get(m);
	}
 }
