//26.10.1016
//vizibilitate variabile //toate variabilele sa fie statice
import java.util.Scanner;
public class ex002_vizibilitate_variabile{
  public static double pi=3.14;
  public static double aria_cerc(double r){
    return pi*r*r;
  }
  public static void main (String [] args){
    System.out.print("Aria cerc= ");
    double s_cerc=aria_cerc(10);
    System.out.format("%08.2f\n", s_cerc);
    System.out.print("Aria cerc= ");
    System.out.format("% 8.2f\n", aria_cerc(12));
    //scaner
    Scanner input = new Scanner(System.in);
    System.out.print("Introdu raza cerc= ");
    double raza = input.nextFloat();//12,5
    System.out.print("Aria cercului cu raza "+raza+" = ");
    System.out.format("% 8.2f\n", aria_cerc(raza));
    input=null;//zerografiem obiectul
  }
}