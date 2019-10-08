package image.color;


public class GrayColor {
	
	public static final GrayColor WHITE = new GrayColor(255);
	public static final GrayColor BLACK = new GrayColor(0);
	private int level;
	
	public GrayColor(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public boolean equals(Object o) {
		
		if (o instanceof GrayColor) {
			// conversion de type
			GrayColor that = (GrayColor)o;

			boolean b1 = (that.WHITE == this.WHITE);
			boolean b2 = (that.BLACK == this.BLACK);
			boolean b3 = (that.getLevel() == this.level);
			boolean b = b3 && b2 && b1;
			
			return b;
			} else {
			return false;
			}
	}



// Pour tester :
public static void main(String[] args){
	System.out.println("�a fonctionne");
}


}


