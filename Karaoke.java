abstract public class Karaoke
{
	private String namatoko, alamattoko;
	public Customer[] customer;
	
	public Karaoke(Customer[] customer)
	{
		this.namatoko = "Stephen Vista Karaoke";
		this.alamattoko = "Jl.Penuh Harapan Palsu";
		this.customer = customer;
	}
	
	public String getNamatoko()
	{
		return namatoko;
	}
	
	public String getAlamattoko()
	{
		return alamattoko;
	}
	
	public void setNamatoko(String namatoko)
	{
		this.namatoko = namatoko;
	}
	
	public void setAlamattoko(String alamattoko)
	{
		this.alamattoko = alamattoko;
	}
	
	abstract public double Total();
	abstract public String toString();
}