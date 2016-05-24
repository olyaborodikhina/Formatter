import java.io.FileNotFoundException;
import java.io.IOException;

public interface Reader  {
    public char getCurrent()throws FileNotFoundException, IOException;
    public boolean isEOF()throws FileNotFoundException, IOException;
}
