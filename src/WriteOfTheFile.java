import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOfTheFile implements Writer {
    private FileWriter writer;
    private StringBuilder Array;

    WriteOfTheFile() throws FileNotFoundException, IOException {

        FileWriter writer = new FileWriter("output.txt",false);

    }

    public void addSymbol(char symbol)throws FileNotFoundException, IOException{
        Array.append(symbol);
    }

    public void write()throws FileNotFoundException, IOException{
        String str = Array.toString();
        writer.write(str);
        writer.flush();
        writer.close();
    }

}
