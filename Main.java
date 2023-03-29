import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("Podaj wysokosc ");
        int height = o.nextInt();
  
  
        for (int i = 0; i < height; i++)
        {
            for(int j=0; j < height; j++)
              System.out.print(" *");
            System.out.println(" ");
        }
    }
}