import java.util.Scanner;

public class ReadOfTheConsole implements Reader {
    private String Array;
    private int index;

    ReadOfTheConsole(){
        Scanner in = new Scanner(System.in);
        Array = in.nextLine();
        index = 0;
    }

    @Override
    public char getCurrent() {
        index++;
        return Array.charAt(index - 1);
    }

    @Override
    public boolean isEOF() {
        if (index < Array.length())
            return false;
        return true;
    }
}
