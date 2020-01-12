import java.util.ArrayList;
class CircleStats
{
CircleStats()
{
}

public int calcCircleCircumf(int diameter) 
{
    return (int) (Math.PI * diameter);
}
public double calcCircleCircumf(double radius)   
{
    return (int)(Math.PI * (2 * radius));
}

}

public class CircleStatsTester
{
public static void main(String[] args)
{
    int o = 10;
while (o >= 0)
 {
            if ((o % 3) >= 2) 
              {
                        System.out.print(o + " ");
              }
              o -= 2;
}
    String[] fruits = { "apple", "banana", "peach", "strawberry" };
String str = "a";
for (String item : fruits) 
{
           str += item.substring(1, 2);
}
System.out.println(str);
    ArrayList<Integer> grades = new ArrayList<Integer>();
grades.add(88);
grades.add(92);
grades.add(95);
grades.add(1, 80);
grades.add(83);
System.out.println(grades.get(2));
    int sum = 0, k, val = 1;
for (k = 0; k <= 5; k++) 
{
        sum += val;
        val++;
}
System.out.println(sum);
    int[][] alpha = new int[10][5];
    System.out.println(alpha);
    int[] a = {1,2};
    

    for (int i : a)
              {
                        System.out.println(i);
              }
    
    
    String st = "Grand Canyon";
    System.out.println(st.substring(7));

    char[][] array1 = new char[15][10];
    System.out.println(array1);
    System.out.println((double)(11 / 2));
    System.out.println( 11 / (double)2 );
    System.out.println( 11 / 2.0);

    int diameter = 5;
double radius = 2.5;
CircleStats cStats = new CircleStats();

System.out.println("The circumference = " + cStats.calcCircleCircumf (diameter));
System.out.println("The circumference = " + cStats.calcCircleCircumf (radius));

}
}

 