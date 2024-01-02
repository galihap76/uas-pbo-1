class Mahasiswa{
	
	private String nama;
	private int umur;
	
	public Mahasiswa(String nama, int umur) {
		this.nama = nama;
		this.umur = umur;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setUmur(int umur) {
		this.umur = umur;
	}
	
	public int getUmur() {
		return umur;
	}
	
	void displayinfo() {
		System.out.println("Nama saya " + getNama() + " umur saya " + getUmur());
	}
	
}

class MahasiswaLama extends Mahasiswa{
	private int angkatan;
	
	 public MahasiswaLama(String nama, int umur, int angkatan) {
	        super(nama, umur);
	        this.angkatan = angkatan;
	 }
	 
	 public void setAngkatan(int angkatan) {
		 this.angkatan = angkatan;
	 }
	 
	 public int getAngkatan() {
	        return angkatan;
	 }

	 @Override
	    void displayinfo() {
	        System.out.println("Nama saya " + this.getNama() + " umur saya " + this.getUmur() +
	                " angkatan saya " + getAngkatan());
	 } 
}

class MahasiswaBaru extends Mahasiswa{
	private int nim;
	
	 public MahasiswaBaru(String nama, int umur, int nim) {
	        super(nama, umur);
	        this.nim = nim;
	 }
	 
	 public void setNim(int nim) {
		 this.nim = nim;
	 }
	 
	 public int getNim() {
	        return nim;
	 }

	 @Override
	    void displayinfo() {
	        System.out.println("Nama saya " + this.getNama() + " umur saya " + this.getUmur() +
	                " nim saya " + getNim());
	 } 
}

public class Main {

	public static void main(String[] args) {
		
		Mahasiswa Obj1 = new Mahasiswa("galih anggoro prasetya", 20);
		MahasiswaLama Obj2 = new MahasiswaLama("prasetya wijoyo", 25, 2014);
		MahasiswaBaru Obj3 = new MahasiswaBaru("anggoro putra", 19, 22205018);
		
		System.out.println("===== Objek Mahasiswa =====");
		Obj1.displayinfo();
		System.out.print("\n");
		
		System.out.println("===== Objek Mahasiswa Lama =====");
		Obj2.displayinfo();
		System.out.print("\n");
		
		System.out.println("===== Objek Mahasiswa Baru =====");
		Obj3.displayinfo();
		System.out.print("\n");
	}

}
