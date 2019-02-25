import java.util.Scanner;
public class Marubatu{
   public static void main(String[] args){
      int win=1;
      int size = 3;
      int[][]board = new  int[size][size];//

       for(int i = 0; i < size; i++ ){
          for(int j = 0; j < size; j++ ){
            board[i][j] =  50;//
              
 	      	if(j ==2){ 
			System.out.println(" |");
	       }else{
			System.out.print(" |");
           } 
	    	}
	   }
	   
	   String []koma = new String[101];
	   koma[0] = "O";
	   koma[50] = " "	;
	   koma[100] = "X";  
	  Scanner sc = new Scanner(System.in);
	   for(int m = 0; m< size*size; m++){
	        int turn = m%2+1;// 1 or 2
			int player = m%2*100;// 0 or 100
	        System.out.println(turn+" player");
         
		 int  tate; int yoko;
		   System.out.println("tate");
            tate  = sc.nextInt();
            System.out.println("yoko");
            yoko  = sc.nextInt();
        
       while(tate<0 || yoko < 0  || tate >= size || yoko >= size || board[tate][yoko]!= 50 );
	     board [tate][yoko] = player;
       
  	     for(int i=0; i<size; i++){
              String row = "";
              for(int j=0; j<size; j++){
                    row+= koma[board[i][j]]+"|";
                }
                System.out.println(row);
           }
		   
		if(board[0][0] + board[0][1] + board[0][2] == 0 || board[1][0]+  board[1][1] + board[1][2] ==0 || board[2][0] + board[2][1] + board[2][2] == 0 
		|| board[0][0] + board[1][0] + board[2][0] == 0 || board[0][1]+  board[1][1] + board[2][1] == 0 || board[0][2] + board[1][2] + board[2][2] == 0 
		|| board[0][0] + board[1][1] + board[2][2] == 0 || board[0][2] + board[1][1] + board[2][0] == 0){
		System.out.println("1 win");
		break;	
		}
		if(board[0][0] + board[0][1] + board[0][2] ==300 ||  board[1][0] + board[1][1] + board[1][2] ==300  ||  board[2][0] + board[2][1] + board[2][2] ==300 
		|| board[0][0] + board[1][0] + board[2][0] == 300 || board[0][1] +  board[1][1] + board[2][1] == 300 || board[0][2] + board[1][2] + board[2][2] == 300
		|| board[0][0] + board[1][1] + board[2][2] ==300 || board[0][2] + board[1][1] + board[2][0] ==300){
		System.out.println("2 win");
		break;	
	    }else if(board[0][0] != 50 && board[0][1] != 50 && board[0][2] != 50
		&& board[1][0] != 50 && board[1][1] != 50 && board[1][2] != 50
		&& board[2][0] != 50 && board[2][1] != 50 && board[2][2] != 50 ){
		System.out.println("drow");
        break;
	    }
	 }
	 }
	 }
	
	  
			  
			  	
	 
	
	  
	  
	    
		