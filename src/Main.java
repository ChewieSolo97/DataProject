import static com.sun.org.apache.xml.internal.serialize.LineSeparator.Macintosh;

import java.io.File;

public class Main {

    public static void main(String[] args) {
      File trainData = new File("Users/Mitchell/Downloads/train");
      //loadEmails(trainData);
      System.out.println(trainData.getName());
      File emails[] = trainData.listFiles();
      System.out.println(emails );
      for (int i = 0; i < emails.length; i++) {

        System.out.println(emails[i]);

      }
    }

  static public void loadEmails(File folder) {
    for (File fileEntry : folder.listFiles()) {

        System.out.println(fileEntry.getName());

    }
  }
}
