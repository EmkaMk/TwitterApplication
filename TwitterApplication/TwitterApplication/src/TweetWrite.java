import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * 
 */

/**
 * @author Emilija
 * 
 */
public class TweetWrite extends TwitterFunctionalities {

	public void writeTweet(String tweet) {

		File f = new File("tweet.txt");

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try (FileWriter writer = new FileWriter(f, true)) {

			writer.write(tweet + "\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void readTweet() {
		// TODO Auto-generated method stub

	}

}
