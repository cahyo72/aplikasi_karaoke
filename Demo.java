import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Demo
{
	static Customer customer[] = new Customer[99];
	static Biasa biasa[] = new Biasa[10];
	static VIP vip[] = new VIP[10];
	static VVIP vvip[] = new VVIP[10];
	static int y=0;
	static int v=0;
	static int z=0;
	static int a=0;
	static int b=0;
	static int c=0;
	static int x=0;
	static int q, qq;
	static int menu=0;
	static int menu1=0;
	static double h;

	static Date tanggal = new Date();
	static SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
	static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String namatoko, alamattoko, nama, alamat;
		int menu3, menu5, no, lama, jumlahmic, jumlahtv, jumlahkursi, jumlahspeaker, usia, member, k; 
		double tambah, bayar;
		double hours = 0;
		no=0;
		int menu2=0;
		int menu4 = 0;
		int noruang = 0;
		int m=0;
		int t=0;
		int u=0;
		int s=0;
		nama = "";
		usia = 0;
		alamat = "";
		member = 0;
		
		for (int i=1; i<10; i++) 
		{
			biasa[i]  = new Biasa(customer, 0, 0, 0, 0, "-");
			biasa[i].setKet("kosong");
		}
		for (int i=1; i<10; i++) 
		{
			vip[i]  = new VIP(customer, 0, 0, 0, 0, "-");
			vip[i].setKet("kosong");
		}
		for (int i=1; i<10; i++) 
		{
			vvip[i]  = new VVIP(customer, 0, 0, 0, 0, "-");
			vvip[i].setKet("kosong");
		}
		
		do
		{
			try
			{
				System.out.println();
				System.out.println("\t//=============================================================\\\\");
				System.out.println("\t|\t    Selamat Datang Di Stephen Vista Karaoke    \t\t|");
				System.out.println("\t*===============================================================*");
				System.out.println("\t|\t\t\t\t\t\t\t\t|");
				System.out.println("\t|  Silakan pilih jenis layanan yang Anda inginkan :\t\t|");
				System.out.println("\t|  1. Buat Kartu Member.\t\t\t\t\t|");
				System.out.println("\t|  2. Registrasi.\t\t\t\t\t\t|");
				System.out.println("\t|  3. Daftar Ruang.\t\t\t\t\t\t|");
				System.out.println("\t|  4. Data Customer.\t\t\t\t\t\t|");
				System.out.println("\t|  5. Cari Customer.\t\t\t\t\t\t|");
				System.out.println("\t|  6. Tambah Waktu.\t\t\t\t\t\t|");
				System.out.println("\t|  7. Cetak Nota.\t\t\t\t\t\t|");		
				System.out.println("\t|  8. Keluar Program.\t\t\t\t\t\t|");
				System.out.println("\t\\\\=============================================================//");
				System.out.print("\nMasukkan pilihan : ");	
				menu = Integer.parseInt(read.readLine());
			
				if(menu<1 | menu>8) throw new Exception();
			}
		
			catch (Exception e)
			{
					System.out.println("Error \nInputkan angka 1 - 8\nSilahkan input lagi"); 
			}
				switch (menu)
				{
				case 1:
					do
					{
						try
						{
							System.out.println("\t//=============================================================\\\\");
							System.out.println("\t|\t\t         Buat Kartu Member    \t\t\t|");
							System.out.println("\t**=============================================================**");
							System.out.println("\t|\t\t\t\t\t\t\t\t|");
							System.out.println("\t|  1. Input data customer.\t\t\t\t\t\t|");
							System.out.println("\t|  2. Cetak kartu.\t\t\t\t\t\t|");
							System.out.println("\t|  3. Kembali ke Menu Sebelumnya.\t\t\t\t|");
							System.out.println("\t\\\\=============================================================//");
							System.out.print("\nMasukkan pilihan : ");
							menu1 = Integer.parseInt(read.readLine());
						
							if(menu1<1 | menu>3) throw new Exception();
						}
						catch (Exception e)
						{
								System.out.println("Error \nInputkan angka 1 - 3 \nSilahkan input lagi"); 
						}
						switch (menu1)
						{
							case 1:
								System.out.print("\n\t* Masukkan nama \t: ");
								nama = read.readLine();
								System.out.print("\t* Masukkan alamat \t: ");
								alamat = read.readLine();
								break;
							case 2:
								System.out.println("\n\t+===============================================+");
								System.out.println("\t|\t\t    Kartu Member    \t\t|");
								System.out.println("\t+-----------------------------------------------+");
								System.out.println("\t|\t    Stephen Vista Karaoke   \t\t|");
								System.out.println("\t|\t    Jl. Penuh Harapan Palsu   \t\t|");
								System.out.println("\t|* Nama \t: " + nama+"\t\t\t|");
								System.out.println("\t|* Alamat \t: "+ alamat+"\t\t\t|");
								System.out.println("\t+===============================================+");
								break;
							case 3:
								break;
							default:
								System.out.println("Anda salah pilih !!!!");
						}
					}
					while(menu1!=3);
				  break;
				case 2:
					x++;
					do
					{
						try
						{
						System.out.println();
						System.out.println("\t//=============================================================\\\\");
						System.out.println("\t|\t\t\t    Registrasi    \t\t\t|");
						System.out.println("\t**-------------------------------------------------------------**");
						System.out.println("\t|\t  Happy Hours at 21.00 - 24.00, Diskon up to 10%\t|");
						System.out.println("\t**=============================================================**");
						System.out.println("\t|\t\t\t\t\t\t\t\t|");
						System.out.println("\t|\t\t\t Customer "+x+"\t\t\t\t|");
						System.out.println("\t|  1. Input Customer.\t\t\t\t\t\t|");
						System.out.println("\t|  2. Pilih Ruangan.\t\t\t\t\t\t|");
						System.out.println("\t|  3. Kembali ke Menu Sebelumnya.\t\t\t\t|");
						System.out.println("\t\\\\=============================================================//");
						System.out.print("\nMasukkan pilihan : ");
						menu1 = Integer.parseInt(read.readLine());
					
						if(menu1<1 | menu>3) throw new Exception();
						}
					
						catch (Exception e)
						{
								System.out.println("Error \nInputkan angka 1 - 3 \nSilahkan input lagi"); 
						}
						switch (menu1)
						{
							case 1:
								System.out.print("\n\t* Masukkan nama customer "+x+"\t: ");
								nama = read.readLine();
								System.out.print("\t* Masukkan alamat customer "+x+"\t: ");
								alamat = read.readLine();
								k = 0;
								do
								{
									if (k > 0) {

									}
									try
									{
										System.out.print("\t* Apakah anda Member [1.Member/2.Non member]\t: ");
										member = Integer.parseInt(read.readLine());
										if(member<1 | member>2) throw new Exception();
										}
									
										catch (Exception e)
										{
												System.out.println("\n\t  Pilih angka 1 atau 2\n\t  Silahkan input lagi"); 
										}
										k++;
								}
								while (member < 1 | member > 2);
								no=x;
							break;
							case 2:
								if(no!=x) 
								{
									System.out.println("Isi data customer terlebih dahulu");
								} else
								{
									if(menu4==0)
									{
											try
											{
											System.out.println("\n\t+============================================================+");
											System.out.println("\t|\tBerikut adalah layanan Ruang yang kami sediakan      |");
											System.out.println("\t|\t\t\t\t\t\t\t     |");
											System.out.println("\t|\t     Setiap kelas terdiri dari 9 ruangan.\t     |");
											System.out.println("\t+============================================================+");
											System.out.println("\t|Kelas|=Jenis=|=TV=|=AC=|=Mic=|=Speaker=|=Luas=|====Harga====|");
											System.out.println("\t|=====+=======+====+====+=====+=========+======+=============|");
											System.out.println("\t|  1  | Biasa |  "+biasa[1].perkap.getJumlahtv()+" |  - |  "+biasa[1].perkap.getJumlahmic()+"  |    "+biasa[1].perkap.getJumlahspeaker()+"    | 3x3m | Rp 20.000,00|");
											System.out.println("\t|  2  | VIP   |  "+vip[1].perkap.getJumlahtv()+" |  1 |  "+vip[1].perkap.getJumlahmic()+"  |    "+vip[1].perkap.getJumlahspeaker()+"    | 4x4m | Rp 40.000,00|");
											System.out.println("\t|  3  | VVIP  |  "+vvip[1].perkap.getJumlahtv()+" |  2 |  "+vvip[1].perkap.getJumlahmic()+"  |    "+vvip[1].perkap.getJumlahspeaker()+"    | 6x6m | Rp 60.000,00|");
											System.out.println("\t+============================================================+");
											System.out.println("\t|  0. Kembali Ke Menu Sebelumnya\t\t\t     |");
											System.out.println("\t+============================================================+");
											System.out.print("\nMasukkan pilihan ruang : ");
											menu4 = Integer.parseInt(read.readLine());
											
											if(menu4<0 | menu4>3) throw new Exception();
											}
										
											catch (Exception e)
											{
													System.out.println("Error \nInputkan angka 0 - 3 \nSilahkan input lagi"); 
											}
											switch (menu4)
											{
												case 1:
													ruanganB();
													do
													{
													try
													{
														System.out.print("\n\t* Masukkan nomor ruang\t\t\t: ");
														noruang = Integer.parseInt(read.readLine());
													}
													catch (NumberFormatException exc){
														System.out.println("\t  Hanya Inputkan angka !\n\t  Pilih Angka 1-9");
														}
													}
													while(noruang<1 | noruang>9);
													y = noruang;
													while (biasa[y].getKet().equalsIgnoreCase("isi")) 
													{
														System.out.println("\t* Maaf, ruangan tersebut sudah dipakai. Pilih ruangan yang lain !!!!");
													do
													{
													try
													{
														System.out.print("\n\t* Masukkan nomor ruang\t\t\t: ");
														y = Integer.parseInt(read.readLine());
													}
													catch (NumberFormatException exc){
													System.out.println("\t  Hanya Inputkan angka !\n\t  Pilih Angka 1-9");
														}
													}
													while(y<1 | y>9);
													}
													try
													{
													System.out.print("\t* Masukkan lama karaoke [dalam Jam]\t: ");
													lama = Integer.parseInt(read.readLine());
													}
													catch (NumberFormatException exc)
													{
													System.out.println("\t  Masukkan lama Karaoke berupa angka !!! ");
													System.out.print("\t* Masukkan lama karaoke [dalam Jam]\t: ");
													lama = Integer.parseInt(read.readLine());
													}
													
													do 
													{
														System.out.print("\t* Masukkan jam mulai ([xx.xx]/24 jam)\t: ");
														hours = Double.parseDouble(read.readLine());
													
														if(hours==24)
														{
															hours=0;
														}
														if (hours<0 | hours>23.59) 
														{
															System.out.println("\n\t* Inputan salah, Masukkan dengan format 24 jam !!!!");
														}
													}
													while (hours<0 | hours>24);
													customer[x] = new Customer(nama, usia, alamat, member, no, noruang, hours, lama);
													customer[x].setRuang("Biasa");
													biasa[y] = new Biasa(customer, no, lama, hours, noruang, nama);
													biasa[y].setKet("isi");
													a++;
													break;
												case 2:
													ruanganV();
													do
													{
													try
													{
														System.out.print("\n\t* Masukkan nomor ruang\t\t\t: ");
														noruang = Integer.parseInt(read.readLine());
														}
													catch (NumberFormatException exc){
													System.out.println("\t  Hanya Inputkan angka !\n\t  Pilih Angka 1-9");
														}
													}
													while(noruang<1 | noruang>9);
													v = noruang;
													while (vip[v].getKet().equalsIgnoreCase("isi")) 
													{
														System.out.println("\t* Maaf, ruangan tersebut sudah dipakai. Pilih ruangan yang lain !!!!");
													do
													{
													try
													{
														System.out.print("\n\t* Masukkan nomor ruang\t\t\t: ");
														v = Integer.parseInt(read.readLine());
														}
													catch (NumberFormatException exc){
													System.out.println("\t  Hanya Inputkan angka !\n\t  Pilih Angka 1-9");
														}
													}
													while(v<1 | v>9);
													}
													try
													{
													System.out.print("\t* Masukkan lama karaoke [dalam Jam]\t: ");
													lama = Integer.parseInt(read.readLine());
													}
													catch (NumberFormatException exc)
													{
													System.out.println("\t  Masukkan lama Karaoke berupa angka !!! ");
													System.out.print("\t* Masukkan lama karaoke [dalam Jam]\t: ");
													lama = Integer.parseInt(read.readLine());
													}
													do 
													{
														System.out.print("\t* Masukkan jam mulai ([xx.xx]/24 jam)\t: ");
														hours = Double.parseDouble(read.readLine());
														if(hours==24)
														{
															hours=0;
														}
														if (hours<0 | hours>23.59) 
														{
															System.out.println("\n\t* Inputan salah, Masukkan dengan format 24 jam !!!!");
														}
													}
													while (hours<0 | hours>24);
													customer[x] = new Customer(nama, usia, alamat, member, no, noruang, hours, lama);
													customer[x].setRuang("VIP");
													vip[v] = new VIP(customer, no, lama, hours, noruang, nama);
													vip[v].setKet("isi");
													b++;
													break;
												case 3:
													ruanganVV();
													do
													{
													try
													{
														System.out.print("\n\t* Masukkan nomor ruang\t\t\t: ");
														noruang = Integer.parseInt(read.readLine());
														}
													catch (NumberFormatException exc){
													System.out.println("\t  Hanya Inputkan angka !\n\t  Pilih Angka 1-9");
														}
													}
													while(noruang<1 | noruang>9);
													z = noruang;
													while (vvip[z].getKet().equalsIgnoreCase("isi")) 
													{
														System.out.println("\t* Maaf, ruangan tersebut sudah dipakai. Pilih ruangan yang lain !!!!");
													do
													{
													try
													{
														System.out.print("\n\t* Masukkan nomor ruang\t\t\t: ");
														z = Integer.parseInt(read.readLine());
														}
													catch (NumberFormatException exc){
													System.out.println("\t  Hanya Inputkan angka !\n\t  Pilih Angka 1-9");
														}
													}
													while(z<1 | z>9);
													}
													try
													{
													System.out.print("\t* Masukkan lama karaoke [dalam Jam]\t: ");
													lama = Integer.parseInt(read.readLine());
													}
													catch (NumberFormatException exc)
													{
													System.out.println("\t  Masukkan lama Karaoke berupa angka !!! ");
													System.out.print("\t* Masukkan lama karaoke [dalam Jam]\t: ");
													lama = Integer.parseInt(read.readLine());
													}
													do 
													{
														System.out.print("\t* Masukkan jam mulai ([xx.xx]/24 jam)\t: ");
														hours = Double.parseDouble(read.readLine());
														if(hours==24)
														{
															hours=0;
														}
														if (hours<0 | hours>23.59) 
														{
															System.out.println("\n\t* Inputan salah, Masukkan dengan format 24 jam !!!!");
														}
													}
													while (hours<0 | hours>24);
													customer[x] = new Customer(nama, usia, alamat, member, no, noruang, hours, lama);
													customer[x].setRuang("VVIP");
													vvip[z] = new VVIP(customer, no, lama, hours, noruang, nama);
													vvip[z].setKet("isi");
													c++;
													break;
												case 0:
													break;
												default:
													System.out.println("Anda salah pilih !!!");
											}
									}
									else
									{
										System.out.println("Anda sudah memilih ruangan !!!!");
									}
								}
								break;
							case 3:
								menu4 = 0;
								break;
							default:
								System.out.println("Anda salah pilih !!!!");
						}
					}
					while(menu1!=3);
					break;
				case 3:
					ruanganB();
					ruanganV();
					ruanganVV();
					break;
				case 4:
					dataCustomer();
					break;
				case 5:
					cari();
					break;
				case 6:
					if(cekkosongC())
					{
						System.out.print(" Masukkan nama customer : ");
						String cari = read.readLine();
						
						for(int i=1;i<=x;i++) 
						{
							if(cari.equalsIgnoreCase(customer[i].getNama()))
							{
								if(customer[i].getRuang().equalsIgnoreCase("Biasa"))
								{
									System.out.print("\t* Inputkan tambahan waktu [dalam jam\t: ");
									tambah = Double.parseDouble(read.readLine());
									qq = customer[i].getNoruang();
									biasa[qq].TambahWaktu(tambah);
									h = biasa[qq].getLama();
									customer[i].setLama(h);
								}
								if(customer[i].getRuang().equalsIgnoreCase("VIP"))
								{
									System.out.print("\t* Inputkan tambahan waktu [dalam jam\t: ");
									tambah = Double.parseDouble(read.readLine());
									qq = customer[i].getNoruang();
									vip[qq].TambahWaktu(tambah);
									h = vip[qq].getLama();
									customer[i].setLama(h);
								}
								if(customer[i].getRuang().equalsIgnoreCase("VVIP"))
								{
									System.out.print("\t* Inputkan tambahan waktu [dalam jam\t: ");
									tambah = Double.parseDouble(read.readLine());
									qq = customer[i].getNoruang();
									vvip[qq].TambahWaktu(tambah);
									h = vvip[qq].getLama();
									customer[i].setLama(h);
								}
							}
						}
					}
					else
					{
						System.out.println("\n Daftar kosong. Tidak ada customer");
					}
					break;
				case 7:
					if(cekkosongC())
					{
						System.out.print(" Masukkan nama customer : ");
						String cari = read.readLine();
						
						for(int i=1;i<=x;i++) 
						{
							if(cari.equalsIgnoreCase(customer[i].getNama()))
							{
								if(customer[i].getRuang().equalsIgnoreCase("Biasa"))
								{
									System.out.println("\n\tADA KERUSAKAN ?! ");
									k = 0;
									do
									{
										if (k > 0) {
											System.out.println("\t Maaf pilihan Anda tidak tersedia !!!!");
										}
										System.out.println("\t1.Ya | 2.Tidak");
										System.out.print("\tMasukkan pilihan : ");
										menu3 = Integer.parseInt(read.readLine());
										k++;
									}
									while (menu3 < 1 | menu3 > 2);
									switch(menu3)
									{
										case 1:
											do
											{
												System.out.println();
												System.out.println("\t+============================================================+");
												System.out.println("\t|\t\t Daftar denda Kerusakan \t\t     |");
												System.out.println("\t+------------------------------------------------------------+");
												System.out.println("\t|  1. Mic     = 50000\t\t\t\t\t     |");
												System.out.println("\t|  2. TV      = 100000\t\t\t\t\t     |");
												System.out.println("\t|  3. Kursi   = 10000\t\t\t\t\t     |");
												System.out.println("\t|  4. Speaker = 50000\t\t\t\t\t     |");
												System.out.println("\t+------------------------------------------------------------+");
												System.out.println("\t|  0. End\t\t\t\t\t\t     |");
												System.out.println("\t+============================================================+");
												System.out.print("Masukkan pilihan : ");
												menu5 = Integer.parseInt(read.readLine());
												qq = customer[i].getNoruang();
												
												if(menu5==1)
												{
													m++;
													if(m>biasa[1].perkap.getJumlahmic())
													{
														System.out.println("Semua perlengkapan yang sudah anda pilih rusak semua");
													}
													else
													{
														biasa[qq].Denda(menu5);
													}
												}
												if(menu5==2)
												{
													t++;
													if(t>biasa[1].perkap.getJumlahtv())
													{
														System.out.println("Semua perlengkapan yang sudah anda pilih rusak semua");
													}
													else
													{
														biasa[qq].Denda(menu5);
													}
												}
												if(menu5==3)
												{
													u++;
													if(u>biasa[1].perkap.getJumlahkursi())
													{
														System.out.println("Semua perlengkapan yang sudah anda pilih rusak semua");
													}
													else
													{
														biasa[qq].Denda(menu5);
													}
												}
												if(menu5==4)
												{
													s++;
													if(s>biasa[1].perkap.getJumlahspeaker())
													{
														System.out.println("Semua perlengkapan yang sudah anda pilih rusak semua");
													}
													else
													{
														biasa[qq].Denda(menu5);
													}
												}
											}
											while(menu5!=0);
										case 2:
											qq = customer[i].getNoruang();
											System.out.println("Nama Customer\t: "+customer[i].getNama());
											System.out.println("Alamat\t\t: "+customer[i].getAlamat());
											System.out.println("Total bayar\t\t: Rp "+biasa[qq].Total());
											System.out.print("\nDibayarkan\t: Rp. ");
											bayar=Integer.parseInt(read.readLine());
										
											if (bayar==biasa[qq].Total()) 
											{
												System.out.println("Pembayaran pas.\nTerima Kasih.");
											}
											
											else if (bayar>biasa[qq].Total()) {
												System.out.println("Kembalian anda Rp. "+(bayar-biasa[qq].Total())+"\nTerima Kasih.");
											}
											
											else {
												do {
													System.out.println("Uang anda kurang Rp. "+(biasa[qq].Total()-bayar));
													System.out.print("Masukkan uang anda : ");
													bayar=Integer.parseInt(read.readLine());
												} while (bayar<biasa[qq].Total());
												
												if (bayar==biasa[qq].Total()) {
													System.out.println("Pembayaran pas.");
												}
												
												else {
													System.out.println("Kembalian anda sebesar Rp "+(bayar-biasa[qq].Total())+"\nTerima Kasih.");
												}
											}
											System.out.println("\n\t+=========================================+");
											System.out.println("\t|\t     .:: Customer "+biasa[qq].getNo()+" ::.\t\t  |");
											System.out.println("\t+-----------------------------------------+");
											System.out.println("\t|\t\t\t "+sdf.format(tanggal)+" |");
											System.out.println(biasa[qq].toString());
											System.out.println("\t|\t*Uang yang dibayarkan : Rp. "+bayar+" \t\t |");
											System.out.println("\t|\t*Uang kembalian : Rp. "+(bayar-biasa[qq].Total())+" \t\t |");
											System.out.println("\t|\t\t Terima kasih \t\t|");
											System.out.println("\t+=========================================+");
											biasa[qq].setKet("kosong");
											biasa[qq].setHours(0);
											biasa[qq].setLama(0);
											biasa[qq].setKet("kosong");
											customer[i].setNama("-");
											a--;
											m=0;
											t=0;
											u=0;
											s=0;
											break;
										default:
											System.out.println("Anda salah pilih");
									}
								}
								if(customer[i].getRuang().equalsIgnoreCase("VIP"))
								{
									System.out.println("\n\tADA KERUSAKAN ?! ");
									k = 0;
									do
									{
										if (k > 0) 
										{
											System.out.println("\t Maaf pilihan Anda tidak tersedia !!!!");
										}
										System.out.println("\t1.Ya | 2.Tidak");
										System.out.print("\tMasukkan pilihan : ");
										menu3 = Integer.parseInt(read.readLine());
										k++;
									}
									while (menu3 < 1 | menu3 > 2);
									switch(menu3)
									{
										case 1:
											do
											{
												System.out.println();
												System.out.println("\t+============================================================+");
												System.out.println("\t|\t\t Daftar denda Kerusakan \t\t     |");
												System.out.println("\t+------------------------------------------------------------+");
												System.out.println("\t|  1. Mic     = 50000\t\t\t\t\t     |");
												System.out.println("\t|  2. TV      = 100000\t\t\t\t\t     |");
												System.out.println("\t|  3. Kursi   = 10000\t\t\t\t\t     |");
												System.out.println("\t|  4. Speaker = 50000\t\t\t\t\t     |");
												System.out.println("\t+------------------------------------------------------------+");
												System.out.println("\t|  0. End\t\t\t\t\t\t     |");
												System.out.println("\t+============================================================+");
												System.out.print("Masukkan pilihan : ");
												menu5 = Integer.parseInt(read.readLine());
												qq = customer[i].getNoruang();
												
												if(menu5==1)
												{
													m++;
													if(m>vip[1].perkap.getJumlahmic())
													{
														System.out.println("Semua perlengkapan yang sudah anda pilih rusak semua");
													}
													else
													{
														vip[qq].Denda(menu5);
													}
												}
												if(menu5==2)
												{
													t++;
													if(t>vip[1].perkap.getJumlahtv())
													{
														System.out.println("Semua perlengkapan yang sudah anda pilih rusak semua");
													}
													else
													{
														vip[qq].Denda(menu5);
													}
												}
												if(menu5==3)
												{
													u++;
													if(u>vip[1].perkap.getJumlahkursi())
													{
														System.out.println("Semua perlengkapan yang sudah anda pilih rusak semua");
													}
													else
													{
														vip[qq].Denda(menu5);
													}
												}
												if(menu5==4)
												{
													s++;
													if(s>vip[1].perkap.getJumlahspeaker())
													{
														System.out.println("Semua perlengkapan yang sudah anda pilih rusak semua");
													}
													else
													{
														vip[qq].Denda(menu5);
													}
												}
											}
											while(menu5!=0);
										case 2:
											qq = customer[i].getNoruang();
											System.out.println("Nama Customer\t: "+customer[i].getNama());
											System.out.println("Alamat\t\t: "+customer[i].getAlamat());
											System.out.println("Total bayar\t\t: Rp "+vip[qq].Total());
											System.out.print("\nDibayarkan\t: Rp. ");
											bayar=Integer.parseInt(read.readLine());
										
											if (bayar==vip[qq].Total()) {
												System.out.println("Pembayaran pas.\nTerima Kasih.");
											}
											
											else if (bayar>vip[qq].Total()) {
												System.out.println("Kembalian anda Rp. "+(bayar-vip[qq].Total())+"\nTerima Kasih.");
											}
											
											else {
												do {
													System.out.println("Uang anda kurang Rp. "+(vip[qq].Total()-bayar));
													System.out.print("Masukkan uang anda : ");
													bayar=Integer.parseInt(read.readLine());
												} while (bayar<vip[qq].Total());
												
												if (bayar==vip[qq].Total()) {
													System.out.println("Pembayaran pas.");
												}
												
												else {
													System.out.println("Kembalian anda sebesar Rp "+(bayar-vip[qq].Total())+"\nTerima Kasih.");
												}
											}
											System.out.println("\n\t+=========================================+");
											System.out.println("\t|\t     .:: Customer "+vip[qq].getNo()+" ::.\t\t  |");
											System.out.println("\t+-----------------------------------------+");
											System.out.println("\t|\t\t\t "+sdf.format(tanggal)+" |");
											System.out.println(vip[qq].toString());
											System.out.println("\t|\t*Pajak : Rp. "+vip[qq].getPajak()+" \t\t |");
											System.out.println("\t|\t*Uang yang dibayarkan : Rp. "+bayar+" \t\t |");
											System.out.println("\t|\t*Uang kembalian : Rp. "+(bayar-vip[qq].Total())+" \t\t |");
											System.out.println("\t+=========================================+");
											vip[qq].setKet("kosong");
											vip[qq].setHours(0);
											vip[qq].setLama(0);
											vip[qq].setNama("");
											customer[i].setNama("-");
											b--;
											m=0;
											t=0;
											u=0;
											s=0;
											break;
										default:
											System.out.println("Anda salah pilih !!!");
									}
								}
								if(customer[i].getRuang().equalsIgnoreCase("VVIP"))
								{
									System.out.println("\n\tADA KERUSAKAN ?! ");
									k = 0;
									do
									{
										if (k > 0) 
										{
											System.out.println("\t Maaf pilihan Anda tidak tersedia !!!!");
										}
										System.out.println("\t1.Ya | 2.Tidak");
										System.out.print("\tMasukkan pilihan : ");
										menu3 = Integer.parseInt(read.readLine());
										k++;
									}
									while (menu3 < 1 | menu3 > 2);
									switch(menu3)
									{
										case 1:
											do
											{
												System.out.println();
												System.out.println("\t+============================================================+");
												System.out.println("\t|\t\t Daftar denda Kerusakan \t\t     |");
												System.out.println("\t+------------------------------------------------------------+");
												System.out.println("\t|  1. Mic     = 50000\t\t\t\t\t     |");
												System.out.println("\t|  2. TV      = 100000\t\t\t\t\t     |");
												System.out.println("\t|  3. Kursi   = 10000\t\t\t\t\t     |");
												System.out.println("\t|  4. Speaker = 50000\t\t\t\t\t     |");
												System.out.println("\t+------------------------------------------------------------+");
												System.out.println("\t|  0. End\t\t\t\t\t\t     |");
												System.out.println("\t+============================================================+");
												System.out.print("Masukkan pilihan : ");
												menu5 = Integer.parseInt(read.readLine());
												qq = customer[i].getNoruang();
												
												if(menu5==1)
												{
													m++;
													if(m>vvip[1].perkap.getJumlahmic())
													{
														System.out.println("Semua perlengkapan yang sudah anda pilih rusak semua");
													}
													else
													{
														vvip[qq].Denda(menu5);
													}
												}
												if(menu5==2)
												{
													t++;
													if(t>vvip[1].perkap.getJumlahtv())
													{
														System.out.println("Semua perlengkapan yang sudah anda pilih rusak semua");
													}
													else
													{
														vvip[qq].Denda(menu5);
													}
												}
												if(menu5==3)
												{
													u++;
													if(u>vvip[1].perkap.getJumlahkursi())
													{
														System.out.println("Semua perlengkapan yang sudah anda pilih rusak semua");
													}
													else
													{
														vvip[qq].Denda(menu5);
													}
												}
												if(menu5==4)
												{
													s++;
													if(s>vvip[1].perkap.getJumlahspeaker())
													{
														System.out.println("Semua perlengkapan yang sudah anda pilih rusak semua");
													}
													else
													{
														vvip[qq].Denda(menu5);
													}
												}
											}
											while(menu5!=0);
										case 2:
											qq = customer[i].getNoruang();
											System.out.println("Nama Customer\t: "+customer[i].getNama());
											System.out.println("Alamat\t\t: "+customer[i].getAlamat());
											System.out.println("Total bayar\t\t: Rp "+vvip[qq].Total());
											System.out.print("\nDibayarkan\t: Rp. ");
											bayar=Integer.parseInt(read.readLine());
										
											if (bayar==vvip[qq].Total()) {
												System.out.println("Pembayaran pas.\nTerima Kasih.");
											}
											
											else if (bayar>vvip[qq].Total()) {
												System.out.println("Kembalian anda Rp. "+(bayar-vvip[qq].Total())+"\nTerima Kasih.");
											}
											
											else {
												do {
													System.out.println("Uang anda kurang Rp. "+(vvip[qq].Total()-bayar));
													System.out.print("Masukkan uang anda : ");
													bayar=Integer.parseInt(read.readLine());
												} while (bayar<vvip[qq].Total());
												
												if (bayar==vvip[qq].Total()) {
													System.out.println("Pembayaran pas.");
												}
												
												else {
													System.out.println("Kembalian anda sebesar Rp "+(bayar-vvip[qq].Total())+"\nTerima Kasih.");
												}
											}
											System.out.println("\n\t+=========================================+");
											System.out.println("\t|\t     .:: Customer "+vvip[qq].getNo()+" ::.\t\t  |");
											System.out.println("\t+-----------------------------------------+");
											System.out.println("\t|\t\t\t "+sdf.format(tanggal)+" |");
											System.out.println(vvip[qq].toString());
											System.out.println("\t|\t*Pajak : Rp. "+vvip[qq].getPajak()+" \t\t |");
											System.out.println("\t|\t*Uang yang dibayarkan : Rp. "+bayar+" \t\t |");
											System.out.println("\t|\t*Uang kembalian : Rp. "+(bayar-vvip[qq].Total())+" \t\t |");
											System.out.println("\t|\t "+vvip[qq].getBonus()+" \t |");
											System.out.println("\t+=========================================+");
											vvip[qq].setKet("kosong");
											vvip[qq].setHours(0);
											vvip[qq].setLama(0);
											vvip[qq].setNama("");
											customer[i].setNama("-");
											b--;
											m=0;
											t=0;
											u=0;
											s=0;
											break;
										default:
											System.out.println("Anda salah pilih !!!");
									}
								}
							}
						}
					}
					else
					{
						System.out.println("\n Daftar kosong. Tidak ada customer");
					}
					break;
				
				case 8:
					break;	
				default:
					System.out.println("Anda salah pilih");
			}
		}
		while (menu!=8);
	}

//------------------------------------------------------------------------------------------------------------------------------	
	public static void ruanganB()
	{
		System.out.println("\nInfo ruang yang tersedia  :");
		System.out.println();
		System.out.println("No| Daftar ruang Biasa");
		System.out.println("----------------------------------------------------------------------------------------");
		for (int i=1;i<10;i++) 
		{
			System.out.print(i+" | ");
			System.out.printf("%-5s",biasa[i].getKet());
			System.out.printf(" | Nama customer : %-8s",biasa[i].getNama());
			System.out.print(" | Jam mulai : "+biasa[i].getHours()+" | Lama : "+biasa[i].getLama()+" | Jam selesai : "+biasa[i].getSelesai());
			System.out.println();
		}
	}
//------------------------------------------------------------------------------------------------------------------------------	
	public static void ruanganV()
	{
		System.out.println("\nInfo ruang yang tersedia  :");
		System.out.println();
		System.out.println("No| Daftar ruang VIP");
		System.out.println("----------------------------------------------------------------------------------------");
		for (int i=1;i<10;i++) 
		{
			System.out.print(i+" | ");
			System.out.printf("%-5s",vip[i].getKet());
			System.out.printf(" | Nama customer : %-8s",vip[i].getNama());
			System.out.print(" | Jam mulai : "+vip[i].getHours()+" | Lama : "+vip[i].getLama()+" | Jam selesai : "+vip[i].getSelesai());
			System.out.println();
		}
	}
//------------------------------------------------------------------------------------------------------------------------------	
	public static void ruanganVV()
	{
		System.out.println("\nInfo ruang yang tersedia  :");
		System.out.println();
		System.out.println("No| Daftar ruang VVIP");
		System.out.println("----------------------------------------------------------------------------------------");
		for (int i=1;i<10;i++) 
		{
			System.out.print(i+" | ");
			System.out.printf("%-5s",vvip[i].getKet());
			System.out.printf(" | Nama customer : %-8s",vvip[i].getNama());
			System.out.print(" | Jam mulai : "+vvip[i].getHours()+" | Lama : "+vvip[i].getLama()+" | Jam selesai : "+vvip[i].getSelesai());
			System.out.println();
		}
	}
//------------------------------------------------------------------------------------------------------------------------------
	public static boolean cekkosongB()
	{
		if (a==0)
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
//------------------------------------------------------------------------------------------------------------------------------
	public static boolean cekkosongV()
	{
		if (b==0)
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
//------------------------------------------------------------------------------------------------------------------------------
	public static boolean cekkosongVV()
	{
		if (c==0)
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
//------------------------------------------------------------------------------------------------------------------------------
	public static boolean cekkosongC()
	{
		if (x==0)
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
//------------------------------------------------------------------------------------------------------------------------------	
	public static void dataCustomer(){
		int total=0;
		
		for (int i=1;i<=x;i++) 
		{
				if (customer[i].getNama()!="") 
				{
					System.out.println("\n* Kelas "+customer[i].getRuang()+" di ruang nomor "+customer[i].getNoruang()+" diisi oleh "+customer[i].getNama()+" :\n  Jam "+customer[i].getHours()+" - Jam "+customer[i].getSelesai());
					total++;
				}
				
				
		}
		if(total==0)
		{
			System.out.println("Data Customer masih kosong.\n");
		}
	}
//------------------------------------------------------------------------------------------------------------------------------	
	public static void cari ()throws IOException {
		if(cekkosongC())
		{
			System.out.print(" Masukkan nama customer : ");
			String cari = read.readLine();
			
			for(int i=1;i<=x;i++) {
				if(cari.equalsIgnoreCase(customer[i].getNama()))
				{
				
				System.out.println("\n\t+===============================================+");
				System.out.println("\t|\t\t    Data Customer    \t\t|");
				System.out.println("\t+-----------------------------------------------+");
				System.out.println("\t|* Nama Customer\t: " + customer[i].getNama()+"\t\t\t|");
				System.out.println("\t|* Alamat Customer\t: "+ customer[i].getAlamat()+"\t\t|");
				System.out.println("\t|* Berada di kelas "+customer[i].getRuang()+" ruang "+customer[i].getNoruang()+" \t\t\t|");
				System.out.println("\t|* Waktu Mulai\t\t: Jam "+customer[i].getHours()+"\t\t|");
				System.out.println("\t|* Waktu Selesai\t: Jam "+customer[i].getSelesai()+"\t\t|");
				System.out.println("\t+===============================================+");				
				System.out.println();
				}
			}
		}
		else
		{
			System.out.println("\n Daftar kosong. Tidak ada customer");
		}
	}
}