package latihan1;

public class KartuATM extends KartuElektronik {
	
	public KartuATM(String kodeBank, String PIN) {
		super(kodeBank, PIN);
	}
	
	//override
	public String encode(String PIN) {
		//Encrypt dengan metode X
		return PIN.concat("X");
	}
}
