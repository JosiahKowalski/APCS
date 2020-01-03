import java.util.Random;
public class random
{
public static void main(String[] args)
{
int randNum = 0;
Random randNumList = new Random();

for(int n = 1; n <= 10; n++)
{
randNum = randNumList.nextInt(6) + 1;
System.out.println(randNum + " ");
}
}
} 