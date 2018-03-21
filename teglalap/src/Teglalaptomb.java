public class Teglalaptomb {

	public static void main(String[] args) {
		int meret = 10;
		
		Teglalap teglalaptomb[] = new Teglalap[meret];
		
		for (int i = 0; i < teglalaptomb.length; i++) {
			int a_oldal = (int)(Math.random() * 9)+2;
			int b_oldal = (int)(Math.random() * 9)+2;
			
			teglalaptomb[i] = new Teglalap(a_oldal, b_oldal);
		}
		int minimumteglalapindex = 0;
		
		for (int i = 0; i < teglalaptomb.length; i++) {
			System.out.println(teglalaptomb[i]);
			if (teglalaptomb[minimumteglalapindex].teruleteNagyobbMint(teglalaptomb[i])){
				minimumteglalapindex = i;
			}
			
		}
		System.out.println(" ");
		System.out.println(teglalaptomb[minimumteglalapindex]);
		
	}


}