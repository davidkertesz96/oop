
public class Teglalap {
	
	private int a_oldal;
	private int b_oldal;
	
	public Teglalap(int a_oldal, int b_oldal) {
		setOldalak(a_oldal, b_oldal);
	}

	public Teglalap(int oldalhossz) {
		super();
		a_oldal = oldalhossz;
		b_oldal = oldalhossz;
	}
	
	public int terulet() {
		return a_oldal*b_oldal;
	}

	@Override
	public String toString() {
		return "a oldal=" + a_oldal + " b oldal=" + b_oldal
				+ " terulet=" + terulet();
	}

	public void setOldalak(int a_oldal, int b_oldal) {
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}
	
	public void setOldalak(int oldalhossz) {
		setOldalak(oldalhossz, oldalhossz);
	}
	
	public boolean teruleteNagyobbMint(Teglalap Teglalap2) {
		return terulet() > Teglalap2.terulet();
	}
	
	public boolean egyenloE(Teglalap Teglalap2) {
		return a_oldal == Teglalap2.a_oldal
				&& b_oldal == Teglalap2.b_oldal;
		
		
	}

}
