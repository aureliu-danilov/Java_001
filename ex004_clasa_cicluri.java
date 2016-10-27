//27.10.1016
//obiecte // cicluri //afisare matrice aliatoare
import java.util.Scanner;
public class ex004_clasa_cicluri{
  public static void main (String [] args){
    //scaner
    Scanner input = new Scanner(System.in);
    System.out.print("Introdu Dimensiune tabel patrat (0<n<10) = ");
    int n = input.nextInt();
    int a=0;
    int b=99;
    int rnd=-1;
    if((n<10)&&(n>0)){
      for (int i=0;i<n ;i++ ) {
        for (int j=0;j<n ;j++ ) {
          rnd=(int)(a+(b-a)*Math.random());
          System.out.format("% 5d", rnd);  
        }
        System.out.println();
      }
    }
    else
    {
      System.out.println("Introdu Dimensiune tabel CORECT (n<10) !!!");
    } 
    //destrugere obiect
    input=null;//zerografiem obiectul input
  }
}