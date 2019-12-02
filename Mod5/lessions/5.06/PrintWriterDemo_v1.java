import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
class PrintWriterDemo_v1
{
public static void main (String [ ] args) throws IOException
{
 double randomNum = 0.0;
 Random randNumList = new Random();
 PrintWriter outFile = new PrintWriter (new File("kitty.txt"));
 
 for (int loop = 1; loop <= 5; loop++)
{
randomNum = randNumList.nextDouble() * 1000.0;
outFile.println(randomNum);
System.out.println(randomNum);
}
outFile.close ( );
}
} 