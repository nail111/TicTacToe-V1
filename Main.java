import java.util.*;
public class Main {
    static Scanner scan = new Scanner(System.in);
    static  Random rand = new Random();
    static int pos;
    static int count=0;
    static char[][] gameBoard = {
            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '}
    };
    public static void main(String[] args) {
        while(true) {
            System.out.print("Enter pos: ");
            pos = scan.nextInt();
            Move(gameBoard,pos,"player");
            pos = rand.nextInt(9)+1;
            Move(gameBoard,pos,"cpu");
            ShowGameBoard(gameBoard);
        }
    }
    public static void ShowGameBoard(char[][] gameBoard) {
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(gameBoard[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void CheckCases(char[][] gameBoard,int pos,String user,char change) {
        if(user.equals("player")) {
            System.out.print("Change your pos: ");
            pos = scan.nextInt();
            Cases(gameBoard,pos,user,change);
        }
        if(user.equals("cpu")) {
            pos = rand.nextInt(9)+1;
            Cases(gameBoard,pos,user,change);
        }
    }
    public static void Cases(char[][] gameBoard,int pos,String user,char change) {
        switch (pos) {
            case 1:
                if(gameBoard[0][0] == ' '){
                    CheckWinLoseDraw(gameBoard,user);
                    gameBoard[0][0] = change;
                    CheckWinLoseDraw(gameBoard,user);
                }
                else {
                    CheckCases(gameBoard,pos,user,change);
                }
                break;
            case 2:
                if(gameBoard[0][1] == ' '){
                    CheckWinLoseDraw(gameBoard,user);
                    gameBoard[0][1] = change;
                    CheckWinLoseDraw(gameBoard,user);
                }
                else {
                    CheckCases(gameBoard,pos,user,change);
                }
                break;
            case 3:
                if(gameBoard[0][2] == ' '){
                    CheckWinLoseDraw(gameBoard,user);
                    gameBoard[0][2] = change;
                    CheckWinLoseDraw(gameBoard,user);
                }
                else {
                    CheckCases(gameBoard,pos,user,change);
                }
                break;
            case 4:
                if(gameBoard[1][0] == ' '){
                    CheckWinLoseDraw(gameBoard,user);
                    gameBoard[1][0] = change;
                    CheckWinLoseDraw(gameBoard,user);
                }
                else {
                    CheckCases(gameBoard,pos,user,change);
                }
                break;
            case 5:
                if(gameBoard[1][1] == ' '){
                    CheckWinLoseDraw(gameBoard,user);
                    gameBoard[1][1] = change;
                    CheckWinLoseDraw(gameBoard,user);
                }
                else {
                    CheckCases(gameBoard,pos,user,change);
                }
                break;
            case 6:
                if(gameBoard[1][2] == ' '){
                    CheckWinLoseDraw(gameBoard,user);
                    gameBoard[1][2] = change;
                    CheckWinLoseDraw(gameBoard,user);
                }
                else {
                    CheckCases(gameBoard,pos,user,change);
                }
                break;
            case 7:
                if(gameBoard[2][0] == ' '){
                    CheckWinLoseDraw(gameBoard,user);
                    gameBoard[2][0] = change;
                    CheckWinLoseDraw(gameBoard,user);
                }
                else {
                    CheckCases(gameBoard,pos,user,change);
                }
                break;
            case 8:
                if(gameBoard[2][1] == ' '){
                    CheckWinLoseDraw(gameBoard,user);
                    gameBoard[2][1] = change;
                    CheckWinLoseDraw(gameBoard,user);
                }
                else {
                    CheckCases(gameBoard,pos,user,change);
                }
                break;
            case 9:
                if(gameBoard[2][2] == ' '){
                    CheckWinLoseDraw(gameBoard,user);
                    gameBoard[2][2] = change;
                    CheckWinLoseDraw(gameBoard,user);
                }
                else {
                    CheckCases(gameBoard,pos,user,change);
                }
                break;
        }
    }
    public static void CheckWinLoseDraw(char[][] gameBoard,String user) {
        if(user.equals("player")) {
            if(
                    gameBoard[0][0]=='X' && gameBoard[0][1]=='X' && gameBoard[0][2]=='X' ||
                            gameBoard[1][0]=='X' && gameBoard[1][1]=='X' && gameBoard[1][2]=='X' ||
                            gameBoard[2][0]=='X' && gameBoard[2][1]=='X' && gameBoard[2][2]=='X' ||
                            gameBoard[0][0]=='X' && gameBoard[1][0]=='X' && gameBoard[2][0]=='X' ||
                            gameBoard[0][1]=='X' && gameBoard[1][1]=='X' && gameBoard[2][1]=='X' ||
                            gameBoard[0][2]=='X' && gameBoard[1][2]=='X' && gameBoard[2][2]=='X' ||
                            gameBoard[0][0]=='X' && gameBoard[1][1]=='X' && gameBoard[2][2]=='X' ||
                            gameBoard[0][2]=='X' && gameBoard[1][1]=='X' && gameBoard[2][0]=='X'
            ) {
                ShowGameBoard(gameBoard);
                System.out.println("Player win");
                System.exit(1);
            }
        }
        if(user.equals("cpu")) {
            if(
                    gameBoard[0][0]=='O' && gameBoard[0][1]=='O' && gameBoard[0][2]=='O' ||
                            gameBoard[1][0]=='O' && gameBoard[1][1]=='O' && gameBoard[1][2]=='O' ||
                            gameBoard[2][0]=='O' && gameBoard[2][1]=='O' && gameBoard[2][2]=='O' ||
                            gameBoard[0][0]=='O' && gameBoard[1][0]=='O' && gameBoard[2][0]=='O' ||
                            gameBoard[0][1]=='O' && gameBoard[1][1]=='O' && gameBoard[2][1]=='O' ||
                            gameBoard[0][2]=='O' && gameBoard[1][2]=='O' && gameBoard[2][2]=='O' ||
                            gameBoard[0][0]=='O' && gameBoard[1][1]=='O' && gameBoard[2][2]=='O' ||
                            gameBoard[0][2]=='O' && gameBoard[1][1]=='O' && gameBoard[2][0]=='O'
            ) {
                ShowGameBoard(gameBoard);
                System.out.println("Cpu win");
                System.exit(1);
            }
        }
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(gameBoard[i][j]!=' ') {
                    count++;
                    if(count==9) {
                        ShowGameBoard(gameBoard);
                        System.out.println("Draw");
                        System.exit(1);
                    }
                }
            }
        }
        count=0;
    }
    public static void Move(char[][] gameBoard,int pos,String user) {
        char change = ' ';
        if(user.equals("player")) {
            change = 'X';
        }
        else if(user.equals("cpu")) {
            change= 'O';
        }
        switch(pos) {
            case 1:
                Cases(gameBoard,pos,user,change);
                break;
            case 2:
                Cases(gameBoard,pos,user,change);
                break;
            case 3:
                Cases(gameBoard,pos,user,change);
                break;
            case 4:
                Cases(gameBoard,pos,user,change);
                break;
            case 5:
                Cases(gameBoard,pos,user,change);
                break;
            case 6:
                Cases(gameBoard,pos,user,change);
                break;
            case 7:
                Cases(gameBoard,pos,user,change);
                break;
            case 8:
                Cases(gameBoard,pos,user,change);
                break;
            case 9:
                Cases(gameBoard,pos,user,change);
                break;
            default:
                System.out.println("Error");
                System.exit(1);
        }
    }
}