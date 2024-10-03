import java.io.File;
import java.io.IOException;

public class Third {
    public static void main(String[] args) throws IOException {
        String path = "abc.txt";
        File file = new File(path);
        boolean isFileCreated = file.createNewFile();
        System.out.println("File created " + isFileCreated);
        System.out.println("File length " + file.length());

    }
}
