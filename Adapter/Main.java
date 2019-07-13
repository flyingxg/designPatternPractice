public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("f.txt");
            f.setValue("year","2004");
            f.setValue("month","4");
            f.setValue("day","24");
            f.writeTofile("newfile.txt");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
