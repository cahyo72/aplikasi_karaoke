public class Biasa extends Karaoke implements Charge
{
	private String rusak, ket, nama;
	private int no, pil, noruang;
	private double lama, tambah, hours, total, persen, selesai;
	public double harga = 20000;
	private double denda = 0;
	private double diskon = 0;
	public Perkap perkap;
	
	public Biasa(Customer[] customer, int no, double lama, double hours, int noruang, String nama)
	{
		super(customer);
		this.no = no;
		this.lama = lama;
		this.hours = hours;
		this.noruang = noruang;
		this.nama = nama;
		perkap = new Perkap(2,1,4,3);
	}
	
	public String getNama()
	{
		return nama;
	}
	
	public int getNo()
	{
		return no;
	}
	
	public double getLama()
	{
		return lama;
	}
	
	public double getHours()
	{
		return hours;
	}
	
	public String getKet()
	{
		return ket;
	}
	
	public int getNoruang()
	{
		return noruang;
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
	
	public void setNama(String nama)
	{
		this.nama = nama;
	}
	
	public void setNo(int no)
	{
		this.no = no;
	}
	
	public void setLama(double lama)
	{
		this.lama = lama;
	}
	
	public void setKet(String ket)
	{
		this.ket = ket;
	}
	
	public double Diskon()
	{
		HappyHours();
		return this.diskon = this.harga*this.lama*this.persen;
	}
	
	public double HappyHours()
	{
		if(this.hours>=21.00)
		{
			return this.persen = 0.1;
		}
		else 
		{
			return this.persen = 0;
		}
	}
	
	public void setHours(double hours)
	{
		this.hours = hours;
	}
	
	public void setNoruang(int noruang)
	{
		this.noruang = noruang;
	}
	
	public double Denda(int pil)
	{
		if(pil==1)
		{
			return this.denda = this.denda+50000;
		}
		else if(pil==2)
		{
			return this.denda = this.denda+100000;
		}
		else if(pil==3)
		{
			return this.denda = this.denda+10000;
		}
		else if(pil==4) 
		{
			return this.denda = this.denda+50000;
		}
		else
		{
			return this.denda;
		}
	}
	
	public double getTambah()
	{
		return tambah;
	}
	
	public void setDenda1(double denda)
	{
		this.denda = denda;
	}
	
	public void setTambah(double tambah)
	{
		this.tambah = tambah;
	}
	
	public void TambahWaktu(double tambah)
	{
		this.lama = lama+tambah;
	}
	
	@Override
	public double Total()
	{
		Denda(pil);
		Diskon();
		return this.total = (this.harga*this.lama)+this.denda-this.diskon-(customer[getNo()].Bonus()*this.lama);
	}
	
	@Override
	public String toString()
	{
		return "\t|\t "+super.getNamatoko()+"\t\t  |\n\t|\t "+super.getAlamattoko()+"\t\t  |\n\t+-----------------------------------------+\n\t| # Data Customer : "+customer[getNo()]+"\t  |\n\t|   * Ruang\t\t: Biasa\t\t  |\n\t|   * No ruang\t\t: "+this.noruang+
		"\t\t  |\n\t|   * Jam mulai\t\t: jam "+this.hours+"\t  |\n\t|   * Lama\t\t: "+this.lama+" jam\t  |\n\t|   * Jam selesai\t: jam "+getSelesai()+"\t  |\n\t|   * Diskon\t\t: "+this.diskon+"\t\t  |\n\t|   * Total denda\t: "+this.denda +"\t\t  |\n\t|   * Total bayar\t: Rp. "+this.total+"\t  |";
	}
}