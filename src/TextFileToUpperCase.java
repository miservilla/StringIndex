import java.io.*;
import java.util.Scanner;

public class TextFileToUpperCase
{
    public static void main(String[] args) throws IOException
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Type in name of file: ");
        File file = new File(console.nextLine());
        Scanner scanner = new Scanner(file);
        PrintWriter out = new PrintWriter("uppercase.txt");


        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            line = line.toUpperCase();
            out.println(line);
        }
        scanner.close();
        out.close();
    }
}
