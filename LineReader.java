import java.io.*;
import java.util.Scanner;

/**
 * The LineReader reads words as tokens from a file and calculates the number
 * of words in each line.
 *
 * @author Jennifer Mazanec
 * @version 06/27/2020
 */
public class LineReader
{
    private Scanner inputFile;
    private String line;

    /**
     * Constructor for objects of class LineReader
     */
    
    public LineReader(String fileName) throws IOException
    {
        File file = new File(fileName);
        inputFile = new Scanner(file,"ISO-8859-1");
    }

    /**
     * Determines whether the file has a next line. If so, reads line and 
     * returns true for lineRead.
     *
     * @return    lineRead
     */
    public boolean readNextLine() throws IOException
    {
        boolean lineRead;
        lineRead = inputFile.hasNextLine();
        
        if(lineRead) 
        {
               line = inputFile.nextLine();
               
        }
        
        return lineRead;
    }
    
    /**
     * The getWordCount method gets the word count for the last line read
     * from the file.
     * @return the word count.
     */
    
    public int getWordCount()
    {
       int wordCount;
       
       //Tokenize last line read from the file by splitting at one or more spaces.
       String[] tokens = line.split("\\s+");    
       
       //Length of the tokens array equals the number of words in the line
       wordCount = tokens.length;
       
       //Return the word count
       return wordCount;
    }
    
    public void close() throws IOException
    {
       inputFile.close();
    }
}
