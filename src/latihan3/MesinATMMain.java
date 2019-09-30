package latihan3;

public class MesinATMMain {

	public static void main(String[] args) {
		MesinATM mesinATM = new MesinATM();
		
		Kartu kartu1 = new KartuATM("222", "123");
		mesinATM.cekPIN(kartu1, "123");
		mesinATM.tarikTunai();
		mesinATM.cekPIN(kartu1, "222");
		mesinATM.tarikTunai();
		
		Kartu kartu2 = new KartuKredit("333", "435");
		mesinATM.cekPIN(kartu2, "435");
		mesinATM.tarikTunai();
	}

}
