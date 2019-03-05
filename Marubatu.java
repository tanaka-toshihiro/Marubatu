import java.util.Scanner;
public class Marubatu{
  public static void main(String[] args){
    int size = 3;
    int[][] board = new  int[size][size];
  
    for(int i = 0; i < size; i++ ){
      for(int j = 0; j < size; j++ ){
        board[i][j] =  0;
      }
    }
   
    String []koma = new String[3];
    koma[0] = " ";
    koma[1] = "O";
    koma[2] = "X";  
    Scanner sc = new Scanner(System.in);
    
    for(int m = 0; m< size*size; m++){
      int turn = m%2+1;// 1 or 2
      System.out.println(turn+" player");
      
      int  tate; int yoko;
      do{
        System.out.println("tate");
        tate  = sc.nextInt();
        System.out.println("yoko");
        yoko  = sc.nextInt();
      }while(tate<0 || yoko < 0  || tate >= size || yoko >= size || board[tate][yoko]!= 0 );
      board [tate][yoko] = turn; 	
      
      for(int i=0; i<size; i++){
        String row = "";
        for(int j=0; j<size; j++){
          row+= koma[board[i][j]]+"|";
        }
        System.out.println(row);
      }
      
      if(board[0][0] * board[0][1] * board[0][2] == 1 || board[1][0] *  board[1][1] * board[1][2] ==1 || board[2][0] * board[2][1] * board[2][2] == 1 
      || board[0][0] * board[1][0] * board[2][0] == 1 || board[0][1] *  board[1][1] * board[2][1] == 1 || board[0][2] * board[1][2] * board[2][2] == 1 
      || board[0][0] * board[1][1] * board[2][2] == 1 || board[0][2] * board[1][1] * board[2][0] == 1){
      System.out.println("1  player wins"); 
      System.exit(0);	
      }
      
      if(board[0][0] * board[0][1] * board[0][2] ==8 ||  board[1][0] * board[1][1] * board[1][2] ==8  ||  board[2][0] * board[2][1] * board[2][2] ==8 
      || board[0][0] * board[1][0] * board[2][0] == 8 || board[0][1] *  board[1][1] * board[2][1] == 8 || board[0][2] * board[1][2] * board[2][2] == 8
      || board[0][0] * board[1][1] * board[2][2] ==8 || board[0][2] * board[1][1] * board[2][0] ==8){
      System.out.println("2  player wins");
      System.exit(0);   
      }     
    }   
    System.out.println("draw");
  }
 
}
