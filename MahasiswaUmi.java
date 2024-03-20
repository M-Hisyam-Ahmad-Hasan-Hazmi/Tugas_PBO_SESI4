
public class MahasiswaUmi extends Mahasiswa {
	String type = "umi";

	MahasiswaUmi(String nama){
		super(nama);
	}

	@Override
	void display(){
		super.display();
		System.out.println("Type \t: " + this.type);
	}
}
    

