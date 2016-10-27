//27.10.1016
//obiecte // creaza obiectul pe baza clasei cerc ?i dreptunchi
import java.util.Scanner;
public class ex003_clasa_de_baza{
  public static void main (String [] args){
    //scaner
    Scanner input = new Scanner(System.in);
    //creare obiect
    ex003_cerc obj_cerc = new ex003_cerc();
    ex003_dreptunghi obj_dreptunghi = new ex003_dreptunghi();
    //cerc
    System.out.println("======== Cercul ========");
    System.out.print("Introdu raza cerc= ");
    double r = input.nextFloat();//12,5
    obj_cerc.setRaza(r);
    System.out.print("Aria cercului cu raza "+obj_cerc.getRaza()+" = ");
    System.out.format("% 8.2f\n", obj_cerc.Aria());
    System.out.print("Introdu unghiul sectorului circular (0<=alfa<360) = ");
    double alfa = input.nextFloat();//12 //(0<=alfa<360)
    System.out.println("Aria sectorului circular cu raza = "+obj_cerc.getRaza());
    System.out.println("si unghul alfa ="+alfa+" este "+obj_cerc.AriaArc(alfa)+" ;");
    //dreptunghi
    System.out.println("\n======== Dreptunghiul ========");
    System.out.print("Introdu lungimea = ");
    obj_dreptunghi.setLungime(input.nextFloat());
    System.out.print("Introdu latimea = ");
    obj_dreptunghi.setLatime(input.nextFloat());
    System.out.format("Aria = % 8.2f\n",obj_dreptunghi.Aria());
    System.out.format("Perimetrul = % 8.2f\n",obj_dreptunghi.Perimetrul());
    System.out.format("Diagonala = % 8.2f\n",obj_dreptunghi.Diagonala());
    //destrugere obiect
    input=null;//zerografiem obiectul input
    obj_cerc=null;//zerografiem obiectul crerc
    obj_dreptunghi=null;//zerografiem obiectul dreptunghi
  }
}