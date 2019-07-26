import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		new Main().foo();
		new Main().baz();
	}
	
	public void foo() {
		int x = 0;
		for(int i = 0; i < 10; i++) {
			x += bar(i);
		}
		System.out.println(x);
	}
	
	public int bar(int x) {
		return 2 * x;
	}
	
	public class Bop {
		int x, y;
		String s;
		
		public Bop(int x, int y, String s) {
			this.x = x;
			this.y = y;
			this.s = s;
		}
	}
	
	public void baz() {
		ArrayList<Bop> bops = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				bops.add(new Bop(i, j, i+""+j));
			}
		}
		System.out.println(bops);
	}
}
