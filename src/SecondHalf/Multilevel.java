package SecondHalf;
class chiru{
	void dad() {
		System.out.println("dading");
	}
}
class Pawankalyan extends chiru{
	void bro() {
		System.out.println("brother");
	}
}
class Ramcharn extends Pawankalyan{
	void son() {
		System.out.println("soning");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ramcharn r1=new Ramcharn();
		r1.son();
		r1.bro();
		r1.dad();

	}

}
