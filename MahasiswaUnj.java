
public class MahasiswaUnj extends Mahasiswa {
    
	String type = "UNJ";

	MahasiswaUnj(String nama){
		super(nama);
	}

	@Override
	void display(){
		super.display();
		System.out.println("Type \t: " + this.type);
	}
}

