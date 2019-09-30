package latihan3;

public class KartuMain {

	public static void main(String[] args) {
		Kartu kartu1 = new KartuATM("222", "123");
		Kartu kartu3 = new KartuATM("333", "457");
		
		System.out.println("Kartu1 : " + kartu1.otentikasi("123")); //123X == 123X
		System.out.println("Kartu1 : " + kartu1.otentikasi("237")); //123X == 237X
		System.out.println("Kartu3 : " + kartu3.otentikasi("457")); //457Y == 457Y
		System.out.println("Kartu3 : " + kartu3.otentikasi("444")); //457Y == 444Y
		
	}

}
