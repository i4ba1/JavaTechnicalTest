/**
 * 
 */
package id.mni.app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;

/**
 * @author iqbal
 *
 */
public class GenerateUniqueString {
	
	private static final int LEN = 100;
	
	public void writeCharacter(int x) {
		
		File myFile = null;
		FileWriter myWriter = null;
		try {
			myFile = new File("file_"+System.currentTimeMillis()+".txt");
			if(myFile.createNewFile()) {
				System.out.println("File created");
				myWriter = new FileWriter(myFile);
				for (int i = 0; i <= x-1; i++) {
					myWriter.write(getRandomText());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				myWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	private String getRandomText() {
        StringBuilder b = new StringBuilder();
        SecureRandom r = new SecureRandom();
        for (int i = 0; i<LEN;i++) {
            char c = (char)(65+r.nextInt(25));
            b.append(c);
        }
        b.append("\n");
        return b.toString();
    }
}
