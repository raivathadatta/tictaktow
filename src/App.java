import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       char [] board =new char[10];
       for(int i=0;i<board.length;i++){
           board[i]= ' ';
       }
       Scanner sc= new Scanner(System.in);
      char playerCharacter= chooseLetter(sc);
      

      char systemChar= (playerCharacter=='x')?'o':'x';
      //System.in is a standard input stream.
    //    System.out.print("Enter a string: ");
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
