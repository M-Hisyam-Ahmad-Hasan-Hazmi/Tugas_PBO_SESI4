
public class Mahasiswa {
	String nama;

	Mahasiswa(String nama){
		this.nama = nama;
	}

	void display(){
		System.out.println("\nName \t: " + this.nama);
	}

	void belajarbersama(Mahasiswa lain){
		System.out.println("belajarbersama");
	}

  
}

