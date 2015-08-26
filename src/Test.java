
public class Test {
	
	public static void main(String[] args) {
		Story story = new Story();
		for (int i = 0; i < 12; i++) {
			System.out.println("Page " + i + " text: " + story.getPage(i).getText());
			System.out.println();
		}
	}

}
