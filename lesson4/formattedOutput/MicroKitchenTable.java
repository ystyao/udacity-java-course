// BlueJ project: lesson4/formattedOutput
// Video: Formatted Output Practice Part 2

public class MicroKitchenTable
{
    public static void main(String[] args)
    {
        int saraCookiesPerDay = 3;
        double saraCerealPerDay = .06;
        String saraName = "Sara";
        int cayCookiesPerDay = 1;
        double cayCerealPerDay = 0;
        String cayName = "Cay";
        
        String rowPattern = "%8d|%8.2f|%s";
        System.out.println();
        System.out.println("cookies | cereal | name");
        System.out.println("------------------------");
        System.out.printf(rowPattern, saraCookiesPerDay, saraCerealPerDay, saraName);
        System.out.println();
        System.out.printf(rowPattern, cayCookiesPerDay, cayCerealPerDay, cayName);
        System.out.println();
    }
}
