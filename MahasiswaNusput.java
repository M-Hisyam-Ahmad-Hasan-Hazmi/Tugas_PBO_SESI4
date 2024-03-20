
public class MahasiswaNusput extends Mahasiswa{
	String type = "Nusput";

	MahasiswaNusput(String nama){
		super(nama);
	}

	@Override
	void display(){
		super.display();
		System.out.println("Type \t: " + this.type);
	}

	void showoff(){
		System.out.println("Saya Mahasiswa Nusput!!");
	}
}
    

