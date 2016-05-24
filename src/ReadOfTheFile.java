import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadOfTheFile implements Reader{
    private int index;
    public String Array;

    ReadOfTheFile()  throws FileNotFoundException, IOException {

        index = 0;
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        reader.readLine();
    }

    public char getCurrent() {
        index++;
        return Array.charAt(index - 1);
    }


    public boolean isEOF() {
        if (index < Array.length())
            return false;
        return true;
    }
}
