import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       char [] board =new char[10];
       for(int i=0;i<board.length;i++){
           board[i]= ' ';
       }
       Scanner sc= new Scanner(System.in);
      var playerCharacter= chooseLetter(sc);
      

      char systemChar= (playerCharacter=='x')?'o':'x';

      showBoard(board);
      //System.in is a standard input stream.
    //    System.out.print("Enter a string: ");
    }

    private static void showBoard(char[] board) {
      System.out.println("***TicTacToe Board***");
      System.out.println("|  ${board[1]}  ||  ${board[2]}  ||  ${board[3]}  |");
      System.out.println("|  ${board[4]}  ||  ${board[5]}  ||  ${board[6]}  |");
      System.out.println("|  ${board[7]}  ||  ${board[8]}  ||  ${board[9]}  |");
    }

    private static char chooseLetter(Scanner sc) {
        System.err.println("choose a letter between X or O for the game");
        String a = sc.next();
        char returChar=' ';
        switch (a) {
            case "X":
            returChar= 'x';
            break;
             case "O":
             returChar= 'o'; 
            case "x":
            returChar= 'x';
            break;
            case "o":
            returChar= 'o';
            break;
            default:{
                System.out.println("you have choosen an wrong input");
                chooseLetter(sc);
            }
           
        }
        return returChar;
        
    }
}
