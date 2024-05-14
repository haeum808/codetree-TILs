import java.util.*;
public class Main {
    static boolean check = false;
    static int x = 0;
    static int y = 0;
    static int winnerNum = 0;
    public static boolean checkWin(int[][] plate) {
        //가로로 이겼을 경우
        for(int i=0;i<19;i++) {
            for(int j=0;j<14;j++) {
                if(plate[i][j]==1 && plate[i][j+1]==1 && plate[i][j+2]==1 && plate[i][j+3]==1 && plate[i][j+4]==1){
                    x = i;
                    y = j+2;
                    winnerNum = 1;
                    return true;
                }
                if(plate[i][j]==2 && plate[i][j+1]==2 && plate[i][j+2]==2 && plate[i][j+3]==2 && plate[i][j+4]==2){
                    x = i;
                    y = j+2;
                    winnerNum = 2;
                    return true;
                }
            }
        }
        //세로로 이겼을 경우
        for(int i=0;i<14;i++) {
            for(int j=0;j<19;j++) {
                if(plate[i][j]==1 && plate[i+1][j]==1 && plate[i+2][j]==1 && plate[i+3][j]==1 && plate[i+4][j]==1){
                    x = i+2;
                    y = j;
                    winnerNum = 1;
                    return true;
                }
                if(plate[i][j]==2 && plate[i+1][j+1]==2 && plate[i+2][j]==2 && plate[i+3][j]==2 && plate[i+4][j]==2){
                    x = i+2;
                    y = j;
                    winnerNum = 2;
                    return true;
                }
            }
        }
        //대각선으로 이겼을 경우
        for(int i=0;i<14;i++) {
            for(int j=0;j<14;j++) {

                if(plate[i][j]==1 && plate[i+1][j+1]==1 && plate[i+2][j+2]==1 && plate[i+3][j+3]==1 && plate[i+4][j+4]==1){
                    x = i+2;
                    y = j+2;
                    winnerNum = 1;
                    return true;
                }
                if(plate[i][j]==2 && plate[i+1][j+1]==2 && plate[i+2][j+2]==2 && plate[i+3][j+3]==2 && plate[i+4][j+4]==2){
                    x = i+2;
                    y = j+2;
                    winnerNum = 2;
                    return true;
                }
            }
        }
        for(int i=4;i<19;i++) {
            for(int j=4;j<19;j++) {
                if(plate[i][j]==1 & plate[i-1][j-1]==1 &&plate[i-2][j-2]==1 && plate[i-3][j-3]==1 && plate[i-4][j-4]==1) {
                    x = i-2;
                    y = j-2;
                    winnerNum = 1;
                    return true;
                }
                if(plate[i][j]==1 & plate[i-1][j-1]==2 &&plate[i-2][j-2]==2 && plate[i-3][j-3]==2 && plate[i-4][j-4]==2) {
                    x = i-2;
                    y = j-2;
                    winnerNum = 2;
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] plate = new int[19][19];

        for(int i=0;i<19;i++) {
            for(int j=0;j<19;j++) {
                plate[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<19;i++) {
            if(check == true) {
                break;
            }
            for(int j=0;j<19;j++) {
                if(checkWin(plate)==true) {
                    check = true;
                    break;
                }
            }
        }
        if(winnerNum ==0) {
            System.out.println(winnerNum);
        }
        else if(winnerNum == 1) {
            System.out.println(winnerNum);
            x++; y++;
            System.out.print(x + " " +y);
        }
        else if(winnerNum == 2) {
            System.out.println(winnerNum);
            x++; y++;
            System.out.print(x+ " " +y);
        } else {
            return;
        }

    }
}