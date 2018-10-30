import java.util.*;
import java.io.*;

public class RainFall
{
    public static void main(String args[]) throws IOException
    {
        File inputFile = new File("RainIn.txt");
        Scanner input = new Scanner(inputFile);
          
        PrintWriter output = new PrintWriter("RainOut.txt");

        Graph G1 = new Graph();
        output.print(G1.toString("Dipak"));

        output.close();
    }
}