import java.util.Scanner;
public class BoardGame {
    private char[][] boardcontent = new char[17][17];
    private int line = 0;
    private int row = 0;
    int tempt=0;
    private int sameNum = 0;

    public BoardGame() {
        char[] tempt = {32,48,49,50,51,52,53,54,55,56,57,97,98,99,100,101,102};
        boardcontent[0] = tempt;
        for(int i=1; i<=16; i++){
            boardcontent[i][0] = tempt[i];
            for(int j=1; j<=16; j++) {
                boardcontent[i][j] =43;
            }
        }
    }

    public void show(){
        for(int j=0; j<17; j++){
            for(int k=0; k<17; k++){
                System.out.print(boardcontent[j][k]+" ");
            }
            System.out.println();
        }
    }

    public char[][] getBoardcontent() {
        return boardcontent;
    }
    public void play (boolean isBlack){
        if(isBlack){
            System.out.println("请走黑棋的玩家输入位置的行和列(空格隔开):");
            Scanner sc = new Scanner(System.in);
            line = sc.nextInt();
            row = sc.nextInt();
            boardcontent[line+1][row+1] = 66;
            show();
        }
        else{
            System.out.println("请走白棋的玩家输入位置的行和列(空格隔开):");
            Scanner sc = new Scanner(System.in);
            line = sc.nextInt();
            row = sc.nextInt();
            boardcontent[line+1][row+1] = 87;
            show();
        }

    }

    public int recursionFindSame(int dirX,int dirY,char player){
        line = line+dirX;
        row = row+dirY;
        if(line<=16 && row<=16){
            if(boardcontent[line][row]==player){
                tempt++;
                return recursionFindSame(dirX,dirY,player);
            }else{
                return tempt;
            }
        }
        return tempt;


    }

    public char judge(){
        line++;
        row++;
        char player = boardcontent[line][row];
        int temptline = line;
        int temptrow = row;
        int x=0;
        int y=0;
        int z=0;
        int k=0;
        for(int i= 0;i<4;i++){
            sameNum =0;
            switch (i){
                case 0:
                    x=-1;y=-1;z=1;k=1;
                    break;
                case 1:
                    x=-1;y=0;z=1;k=0;
                    break;
                case 2:
                    x=-1;y=1;z=1;k=-1;
                    break;
                case 3:
                    x=0;y=1;z=0;k=-1;
                    break;
                default:
                    x=0;
                    break;
            }
            tempt =0;
            sameNum = recursionFindSame(x,y,player);
            line = temptline;
            row = temptrow;
            tempt =0;
            sameNum = sameNum+recursionFindSame(z,k,player);
            if(sameNum==4){
                return player;
            }else{
                sameNum=0;
                line = temptline;
                row = temptrow;
            }

        }
        return 0;
    }

    public static void main(String[] args){
        BoardGame bg = new BoardGame();
        bg.show();
        boolean gamestate = false;
        boolean isBlack = true;
        char winner=0;
        while(gamestate == false){
            bg.play(isBlack);
            isBlack = !isBlack;
            winner = bg.judge();
            if(winner==66||winner==87){
                gamestate = true;
            }
        }
        if (winner==66){
            System.out.println("游戏结束，黑棋赢了！");
        }
        else{
            System.out.println("游戏结束，白棋赢了！");
        }

    }
}
