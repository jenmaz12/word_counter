import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;
/**
 * The WordCounter class uses the LineReader class to read lines from a file 
 * and get their word count.
 * 
 * @author Jennifer Mazanec
 * @version 6/24/20
 */
public class WordCounter
{    
    public static void main(String [] args) throws IOException
    {
        String fileName;
        int totalWords = 0;
        
        fileName = JOptionPane.showInputDialog("Enter a file name");
        LineReader lineReader = new LineReader(fileName);
        
        while(lineReader.readNextLine())
        {
          totalWords += lineReader.getWordCount(); 
        }
        
        lineReader.close();
        JOptionPane.showMessageDialog(null, "The total number of words in " 
        + fileName + " is " + totalWords);
    }
    
}
