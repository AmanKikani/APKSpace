import java.util.Objects;

public class RookPath2 extends Main{
    RookPath2(){
        if (r2 != -1 && Lr2 != -1 && LK != -1 && K != -1){
            // Rook 2
            // System.out.println("User Rook 2 Location");
            // System.out.print(r2 + ",");
            // System.out.println(Lr2);
            // Right and left detection
            // Initializes  variable
            tempAiRook2 = r2;
            tempAiLineRook2 = Lr2;
            // Checks for the rook, counts up one and exits
            if (tempAiRook2 < 7) {
                if (Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "r")) {
                    tempAiRook2++;
                    userChessBoard[tempAiLineRook2][tempAiRook2] = "X";
                }
                while ((Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], " ")||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "B") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "Q") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "N") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "P") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "K") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "R")) && tempAiRook2 != 7) {
                    tempAiRook2++;
                    userChessBoard[tempAiLineRook2][tempAiRook2] = "X";
                    if(movingSlotY == tempAiLineRook2 && movingSlotX == tempAiRook2){
                        movable = true;
                    }
                }
                if(!Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], " ")){
                    tempAiRook2--;
                }
            }
            ValidRightRook2 = tempAiRook2;
            // System.out.print("Last valid spot to the right: ");
            // System.out.println(ValidRightRook2 + "," + Lr2);
            tempAiRook2 = r2;
            tempAiLineRook2 = Lr2;
            if(tempAiRook2 > 0) {
                if (Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "r")) {
                    tempAiRook2--;
                    userChessBoard[tempAiLineRook2][tempAiRook2] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], " ")||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "B") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "Q") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "N") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "P") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "K") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "R")) && tempAiRook2 != 0){
                    tempAiRook2--;
                    userChessBoard[tempAiLineRook2][tempAiRook2] = "X";
                    if(movingSlotY == tempAiLineRook2 && movingSlotX == tempAiRook2){
                        movable = true;
                    }
                }
                if(!Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], " ")){
                    tempAiRook2++;
                }
            }
            ValidLeftRook2 = tempAiRook2;
            // System.out.print("Last valid spot to the left: ");
            // System.out.println(ValidLeftRook2 + "," + Lr2);
            // Up and down detection
            // Initializes  variable
            tempAiRook2 = r2;
            tempAiLineRook2 = Lr2;
            // Checks for the rook, counts up one and exits
            if(tempAiLineRook2 < 7){
                if (Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "r")){
                    tempAiLineRook2++;
                    userChessBoard[tempAiLineRook2][tempAiRook2] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], " ")||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "B") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "Q") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "N") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "P") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "K") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "R")) && tempAiLineRook2 != 7){
                    tempAiLineRook2++;
                    userChessBoard[tempAiLineRook2][tempAiRook2] = "X";
                    if(movingSlotY == tempAiLineRook2 && movingSlotX == tempAiRook2){
                        movable = true;
                    }
                }
                if(!Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], " ")){
                    tempAiLineRook2--;
                }
            }
            ValidDownAiRook2 = tempAiLineRook2;
            // System.out.print("Last valid spot to the down: ");
            // System.out.println(r2 + "," + ValidDownAiRook2);
            tempAiRook2 = r2;
            tempAiLineRook2 = Lr2;
            if (tempAiLineRook2 > 0) {
                if(Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "r")) {
                    tempAiLineRook2--;
                    userChessBoard[tempAiLineRook2][tempAiRook2] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], " ")||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "B") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "Q") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "N") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "P") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "K") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "R")) && tempAiLineRook2 != 0){
                    tempAiLineRook2--;
                    userChessBoard[tempAiLineRook2][tempAiRook2] = "X";
                    if(movingSlotY == tempAiLineRook2 && movingSlotX == tempAiRook2){
                        movable = true;
                    }
                }
                if(!Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], " ")){
                    tempAiLineRook2++;
                }
            }
            ValidUpAiRook2 = tempAiLineRook2;
            // System.out.print("Last valid spot to the up: ");
            // System.out.println(r2 + "," + ValidUpAiRook2);
        }
    }
}
