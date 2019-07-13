import java.io.IOException;

public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeTofile(String filename)throws IOException;
    public void setValue (String key,String value);
    public String getValue(String key);
}
