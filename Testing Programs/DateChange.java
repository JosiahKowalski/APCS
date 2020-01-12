import java.util.Scanner;

public class DateChang {

    public static String convertDate(String amerDate)
{
        String month,day,year,euDate;
        month = amerDate.substring(0, amerDate.indexOf("/"));
        day = amerDate.substring(amerDate.indexOf("/")+1, amerDate.lastIndexOf("/"));
        year = amerDate.substring(amerDate.lastIndexOf("/")+1, amerDate.length());
        euDate = day + "." + month + "." + year;
        return euDate;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String euDate, amerDate;
        System.out.println("Enter a date in the form month/day/year:");
        amerDate = in.nextLine();

        euDate = DateChange.convertDate(amerDate);
        
        System.out.println("Your date in European form is:\n" + euDate);
        in.close();
    }
}