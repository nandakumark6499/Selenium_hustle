package selenium_training;

public class MyYoutube {

	public static void main(String[] args) {

		Methods yt = new Methods();
		String share = yt.Sharevideo();
		yt.createVideo();
		System.out.println(share);
	}

}
