import java.util.Scanner;

public class ConversionTable{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

System.out.println("  Miles  Kilometers  Miles  Kilometers" );

System.out.println("-------------------------------------------------");



double mile =10;

double kilometer=10;

double distance = MileToKilometer(mile, kilometer);

double distance2 = KilometersToMile(kilometer, mile);

for (int i = 1; i <= 10;  i++)

{

  System.out.println(i+"  " + distance); }

}

public static double MileToKilometer(double mile, double kilometer){

 

kilometer = mile/1.609;

return mile;

}

public static double KilometersToMile(double kilometer, double mile){

mile = kilometer * 1.609;

return kilometer;
}
}