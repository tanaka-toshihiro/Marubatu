import java.util.Scanner;
public class marubatu{
   public static void main(String[] args){
      String[][]board;
      board = new String[3][3];

       for(int i = 0;i < 3;i++ ){
       for(int j = 0;j < 3;j++ ){
       board[i][j] = " ";
       }
       }  
       for(int k = 0;k < 3;k++ ){
       for(int l = 0;l < 3;l++ ){
       System.out.print(board[k][l]);

       if(l==2){
	   continue;
       }
        System.out.print(" |");
       } 
      System.out.println();
      }
    String x = "O";
    String y = "X";
    boolean repeat = true;
    int m = 0;

    while(repeat){
      String a;
      if (m%2==0){
        a = x;
      } else {
        a = y;
      }
      System.out.println(a + "turn");
      Scanner scan = new Scanner(System.in);
      System.out.println("depth");
      int number1 = scan.nextInt();

      if(number1 <0|number1>2){
        System.out.println("retry");
        continue;
      }
      System.out.println("width");
      int number2 = scan.nextInt();
      if(number2 <0|number2>2){
        System.out.println("retry");
        continue;
      }
      if (board[number1][number2] != " "){
        System.out.println("can't put");
        continue;
      }
      board[number1][number2] = a;
      for(int k = 0;k < 3;k++ ){
        for(int l = 0;l < 3;l++ ){
          System.out.print(board[k][l]);
          if(l==2){
            continue;
          }
          System.out.print(" |");
        }
        System.out.println();
      }
     if((board[0][0]==a&&board[0][1]==a&& board[0][2]==a )||(board[1][0] == a&&board[1][1]==a&&board[1][2]==a )||(board[2][0]==a&&board[2][1]==a&&board[2][2]==a )){
        System.out.println(a + "win");
        break;
      }
      if((board[0][0]==a && board[1][0]==a && board[2][0]==a )||(board[0][1]==a && board[1][1]==a && board[2][1]==a )||(board[0][2]==a && board[1][2]==a && board[2][2]==a )){
        System.out.println(a + "win");
        break;
      }
      if(board[0][0]==a && board[1][1]==a && board[2][2]==a){
        System.out.println(a + "win");
        break;
      }
      if(board[0][2]==a && board[1][1]==a && board[2][0]==a){
        System.out.println(a + "win");
        break;
      }
      repeat = false;
      for(int k = 0;k < 3;k++ ){
        for(int l = 0;l < 3;l++ ){
          if (board[k][l] == " "){
            repeat = true;
          }
        }
      }
      if (!repeat){
        System.out.println("draw");
      }
      m++;
    }
  }
}