class Book{
	boolean checkedOut = false;
	Book(boolean checkOut) {
		checkedOut = checkOut;
	}
	protected void finalize() {
		if(chechedOut)
			System.out.println("Error: checkedOut");
	}
}
public class EndCondition {
	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkln();
		new Book(true);
		System.gc();
	}

}
