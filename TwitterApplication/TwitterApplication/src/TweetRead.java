import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * 
 */

/**
 * @author Emilija
 *
 */
public class TweetRead extends TwitterFunctionalities {

	public void readTweet() {
		ArrayList<String> tweets = new ArrayList();
		try (FileReader filereader = new FileReader("tweet.txt")) {

			try (BufferedReader reader = new BufferedReader(filereader)) {

				String line = "";
				while ((line = reader.readLine()) != null) {
					tweets.add(line);
				}
				Collections.reverse(tweets);

				for (String str : tweets) {
					System.out.println(str);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void writeTweet(String tweet) {
		// TODO Auto-generated method stub

	}

}
