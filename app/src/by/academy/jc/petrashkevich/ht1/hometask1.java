package by.academy.jc.petrashkevich.ht1;
import java.util.Scanner;
public class hometask1 {
 //int x,y;
  public static class Welcome {// creating new class(создание второго класса)
    public Welcome(int i){ // creating new construktor ( создание нового конструктора)
      System.out.println("Hi! I am constructor! Enter "+(i+1)+" pair of integrs");
    }
    public static int result(int x,int y) { // метод вычисления суммы произвеедения и суммы введенных величин
       int z= (x+y)+x*y;
      return (z);
    }
    public static void replace (int x,int y) { // метод перемены мест
      x = x + y;
      y = x - y;
      x = x - y;
      System.out.println(" The replacement was successful!");
      System.out.println("First integr: "+x+"  Second integr: "+y);
     //return ;
    }
  public static void main(String[] args) {
    Scanner in=new Scanner (System.in);
    System.out.println("Congratulations! You are in JAVA-paradise!");
    for (int i=0; i<3; i++){
      /* Welcom s1 = */
      new Welcome(i);// вызов конструктора приветсвия
      System.out.print("Enter the first integr:  "); // ввод первой переменной с терминала
      int x = in.nextInt();
      System.out.print("Enter the second integr: ");// ввод второй переменной с терминала
      int y = in.nextInt();
      //int z = result(x, y);// вызов метода расчета суммы произведения и суммы

      System.out.println("Result: " + result(x, y));
      replace(x, y); // вызов метода замены местами переменных
    }
    }
  }
}


