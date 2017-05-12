public class Perkap
{
	private int jumlahmic, jumlahtv, jumlahkursi, jumlahspeaker;
	
	public Perkap()
	{
		this.jumlahmic = 2;
		this.jumlahtv = 1;
		this.jumlahkursi = 5;
		this.jumlahspeaker = 3;
	}
	
	public Perkap(int jumlahmic, int jumlahtv, int jumlahkursi, int jumlahspeaker)
	{
		this.jumlahmic = jumlahmic;
		this.jumlahtv = jumlahtv;
		this.jumlahkursi = jumlahkursi;
		this.jumlahspeaker = jumlahspeaker;
	}
	
	public int getJumlahmic()
	{
		return jumlahmic;
	}
	
	public int getJumlahtv()
	{
		return jumlahtv;
	}
	
	public int getJumlahkursi()
	{
		return jumlahkursi;
	}
	
	public int getJumlahspeaker()
	{
		return jumlahspeaker;
	}
	
	public void setJumlahmic(int jumlahmic)
	{
		this.jumlahmic = jumlahmic;
	}
	
	public void setJumlahtv(int jumlahtv)
	{
		this.jumlahtv = jumlahtv;
	}
	
	public void setJumlahkursi(int jumlahkursi)
	{
		this.jumlahkursi = jumlahkursi;
	}
	
	public void setJumlahspeaker(int jumlahspeaker)
	{
		this.jumlahspeaker = jumlahspeaker;
	}
	
	public String toString()
	{
		return "\n*Jumlah mic : "+this.jumlahmic+"\n*Jumlah tv : "+this.jumlahtv+"\n*Jumlah kursi : "+this.jumlahkursi+"\n*Jumlah speaker : "+this.jumlahspeaker;
	}
}