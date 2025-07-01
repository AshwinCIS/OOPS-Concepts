package OOPS;

interface Playable{
	void play();
}

class Guitar implements Playable{
	public void play() {
		System.out.println("Playing guitar...");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playable d = new Guitar();
		d.play();

	}

}
