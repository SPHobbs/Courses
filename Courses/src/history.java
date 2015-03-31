
public class history {
	private static String title;
	private static int number;
	private static String description;
	public history(String Title, int Number, String Description) {
	    title = Title;
	    number = Number;
	    description = Description;
	}
	public String toString(){
		return "Title: " + title + ".\nCourse Number: " + number+ ".\nDescription: " + description;
	}
}
