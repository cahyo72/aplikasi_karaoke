public class Customer
{
	private String nama, alamat, ruang;
	private int member, no, noruang, usia;
	public double potongan, hours, lama, selesai;
	
	public Customer(String nama, int usia, String alamat, int member, int no, int noruang, double hours, double lama)
	{
		this.nama = nama;
		this.usia = usia;
		this.alamat = alamat;
		this.member = member;
		this.no = no;
		this.noruang = noruang;
		this.hours = hours;
		this.lama = lama;
	}
	
	public String getNama()
	{
		return nama;
	}
	
	public String getAlamat()
	{
		return alamat;
	}
	
	public int getMember()
	{
		return member;
	}
	
	public int getNo()
	{
		return no;
	}
	
	public int getNoruang()
	{
		return noruang;
	}
	
	public String getRuang()
	{
		return ruang;
	}
	
	public double getHours()
	{
		return hours;
	}
	
	public double getLama()
	{
		return lama;
	}
	
	public void setNama(String nama)
	{
		this.nama = nama;
	}
	
	public void setAlamat(String alamat)
	{
		this.alamat = alamat;
	}
	
	public void setMember(int member)
	{
		this.member = member;
	}
	
	public void setNo(int no)
	{
		this.no = no;
	}
	
	public void setNoruang(int noruang)
	{
		this.noruang = noruang;
	}
	
	public void setRuang(String ruang)
	{
		this.ruang = ruang;
	}
	
	public void setLama(double lama)
	{
		this.lama = lama;
	}
	
	public double getSelesai()
	{
		this.selesai = this.hours+this.lama;
		if(this.selesai==24)
		{
			return this.selesai=0;
		}
		if(this.selesai>=24)
		{
			return this.selesai = this.selesai - 24;
		}
		if (this.selesai<0 | this.selesai>23.59) 
		{
			return this.selesai;
		}
		
		return this.selesai;
	}
	
	public double Bonus()
	{
		if(this.member==1)
		{
			return 5000;
		} 
		else 
		{
			return 0;
		}
	}
	
	public String CetakMember()
	{
		if(this.member==1)
		{
			return "Member";
		}
		else
		{
			return "Non member";
		}
	}
	
	public String toString()
	{
		return "\t\t\t  |\n\t|   * Membership\t: "+CetakMember()+"\t  |\n\t|   * Nama\t\t: "+this.nama+"\t\t  |\n\t|   * Alamat\t\t: "+this.alamat;
	}
}