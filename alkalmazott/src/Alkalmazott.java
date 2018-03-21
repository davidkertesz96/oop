
public class Alkalmazott {
private String nev;
private int kor;
private long fizetes;
public long getFizetes() {
	return fizetes;
}

static private int nyugdijKorhatar = 65;

public Alkalmazott(String nev, int kor, long fizetes) {
	super();
	this.nev = nev;
	this.kor = kor;
	this.fizetes = fizetes;
}

public int HanyEvVanNyugdijig() {
	return nyugdijKorhatar - kor;
}

public String toString() {
	return "Alkalmazott [nev=" + nev + ", kor=" + kor + ", fizetes=" + fizetes
			+ ", Évek száma Nyugdíjig()=" + HanyEvVanNyugdijig() + "]";
}

public static int getNyugdijKorhatar() {
	return nyugdijKorhatar;
}

public static void setNyugdijKorhatar(int nyugdijKorhatar) {
	Alkalmazott.nyugdijKorhatar = nyugdijKorhatar;
}

public static Alkalmazott NagyobbFizetesuAlkalmazott(Alkalmazott egyik, Alkalmazott masik) {
	if (egyik.fizetes > masik.fizetes) {
		return egyik;
	} else {
		return masik;
	}
	
	
}


}