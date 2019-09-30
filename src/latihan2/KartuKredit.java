package latihan2;

public class KartuKredit extends KartuElektronik{
	
	public KartuKredit(String kodeBank, String PIN) {
		super(kodeBank, PIN);
	}
	
	//OVERRIDE
	public String encode(String PIN) {
		//Encrypt dengan metode Y
		return PIN.concat("Y");
	}
}
