import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int d=sc.nextInt();
    for(int i=1;i<=d;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j);
      }
  System.out.println();
    }
  }
}
/* input :5
 output : 1 
          12 
          123
          1234
          12345
*/
