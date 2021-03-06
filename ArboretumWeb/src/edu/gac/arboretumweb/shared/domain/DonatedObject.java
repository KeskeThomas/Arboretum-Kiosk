package edu.gac.arboretumweb.shared.domain;

import edu.gac.arboretumweb.client.SearchParameter.Quadrant;

public class DonatedObject {

	protected int yearDonated;
	protected String donatedFor;

	public int getYearDonated() 
	{
		return yearDonated;
	}
	
	public void setYearDonated(int yearDonated) 
	{
		this.yearDonated = yearDonated;
	}
	
	public String getDonatedFor() 
	{
		return donatedFor;
	}
	
	public void setDonatedFor(String donatedFor) 
	{
		this.donatedFor = donatedFor;
	}
	
	public Quadrant getQuadrant()
	{
		return Quadrant.E;
	}
}