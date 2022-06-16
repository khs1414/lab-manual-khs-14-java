import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
class prac9_3
{
    public static void main(String[] args) throws IOException
    {
        String str = "we are in the endgame now";
        FileWriter fin = new FileWriter("prac9_3.txt");
        fin.write(str);
        System.out.println("Data added in the file");
        fin.close();
        FileReader fout = new FileReader("prac9_3.txt");
        int ch;
        while ((ch=fout.read())!=-1)
            System.out.print((char)ch);
        fout.close();
    }
}



