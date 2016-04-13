import java.util.Scanner;

/**
 * 
 */

/**
 * @author Emilija
 *
 */
public class Twitter {

	private TwitterFunctionalities functionality;

	public Twitter() {
		super();

	}

	public void readInput() {
		Scanner in;

		while (true) {
			in = new Scanner(System.in);
			String option = in.nextLine();
			if (option.equals("2")) {

				break;
			}

			if (option.equals("0")) {
				functionality = new TweetWrite();
				String msg = in.nextLine();
				functionality.writeTweet(msg);
			} else if (option.equals("1")) {
				functionality = new TweetRead();
				functionality.readTweet();
			}
		}
		in.close();

	}

}
