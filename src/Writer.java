import java.io.FileNotFoundException;
import java.io.IOException;

public interface Writer {
    public void write()throws FileNotFoundException, IOException;
    public void addSymbol(char symbol)throws FileNotFoundException, IOException ;
}
