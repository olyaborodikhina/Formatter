public class WriteOfTheConsole implements Writer {
    private StringBuilder Array;

    WriteOfTheConsole()
    {
        Array = new StringBuilder(" ");
    }

    @Override
    public void write(){
        System.out.print(Array);
    }
    @Override
    public void addSymbol(char symbol)
    {
        Array.append(symbol);
    }

}
