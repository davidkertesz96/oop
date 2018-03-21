
public class AlkalmazottFuttathato {

	int maxFizetes=0;
	public static void main(String[] args) {
	int n = 3;
	Alkalmazott[] alkalmazottak = new Alkalmazott[n];
	for (int i = 0; i < alkalmazottak.length; i++) {
		alkalmazottak[i] = new Alkalmazott("xy", (int)((Math.random() * (Alkalmazott.getNyugdijKorhatar()-18))+18),
				(long)(Math.random() * 1000));
		System.out.println(alkalmazottak[i]);
	}

	Alkalmazott.setNyugdijKorhatar(70);
	
	for (int i = 0; i < alkalmazottak.length; i++) {
		System.out.println(alkalmazottak[i]);
	}
	
	Alkalmazott maxFizetesuAlkalmazott = alkalmazottak[0];
	
	for (int i = 1; i < alkalmazottak.length; i++) {
		maxFizetesuAlkalmazott= Alkalmazott.NagyobbFizetesuAlkalmazott(maxFizetesuAlkalmazott, alkalmazottak[i]);
		
	}
	System.out.println(maxFizetesuAlkalmazott);
	}

	
}