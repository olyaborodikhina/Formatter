import java.io.FileNotFoundException;
import java.io.IOException;

public class Formatter  {
    public int index = 0;
    public char currentElem = ' ';
    public char lastElem = ' ';
    public Reader reader;
    public Writer writer;

    public final int numberSpace = 4;
    Formatter() throws FileNotFoundException, IOException {

        reader = new ReadOfTheConsole();
        writer = new WriteOfTheConsole();

       // writer = new WriteOfTheFile();
      //  reader = new ReadOfTheFile();
    }

    public void format() throws FileNotFoundException, IOException  {
        while (!reader.isEOF()) {
            currentElem = reader.getCurrent();
            switch (currentElem){
                case '{': {
                    index++;
                    writer.addSymbol('{');
                    writer.addSymbol('\n');
                    for(int i = 0; i < 4; i++)
                       writer.addSymbol(' ');
                }
                break;

                case ';':{
                    writer.addSymbol(';');
                    writer.addSymbol('\n');
                    for(int i = 0; i < 4; i++)
                        writer.addSymbol(' ');
                }
                break;
                case '}': {
                    if ((lastElem != ';') && (lastElem != '}'))
                        writer.addSymbol('\n');
                    writer.addSymbol('}');
                    writer.addSymbol('\n');
                    for(int i = 0; i < 4; i++)
                        writer.addSymbol(' ');
                }
                break;
                default: {


                    writer.addSymbol(currentElem);
                    break;
                }
            }
            lastElem = currentElem;

        }
    }

    public void write() throws FileNotFoundException, IOException {
        writer.write();
    }

}
