package latihan3;

public class MesinATM {
	private Kartu kartu;
	private boolean otentikasi = false;
	
	public void cekPIN(Kartu kartu, String pin) {
		if (validasiKartu(kartu)) {
			if (kartu.otentikasi(pin)) {
				otentikasi = true;
				this.kartu = kartu;
			}
			else {
				otentikasi = false;
			}
		}
	}
	
	public void tarikTunai() {
		if (otentikasi) {
			System.out.println("Tarik tunai menggunkan Kartu".concat(kartu 
					instanceof KartuATM ? "ATM!" : "Kredit!"));
		}
		else {
			System.out.println("Tarik tunai Gagal!");
		}
	}

	private boolean validasiKartu(Kartu kartu2) {
		return true;
	}
}
