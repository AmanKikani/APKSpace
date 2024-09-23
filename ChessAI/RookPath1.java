import java.util.Objects;

public class RookPath1 extends Main{
    RookPath1(){
        if (r1 != -1 && Lr1 != -1 && LK != -1 && K != -1){
            // System.out.println("User Rook Location");
            // System.out.print(r1 + ",");
            // System.out.println(Lr1);
            // Right and left detection
            // Initializes  variable
            tempAiRook1 = r1;
            tempAiLineRook1 = Lr1;
            // Checks for the rook, counts up one and exits
            if (tempAiRook1 < 7) {
                if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "r")) {
                    tempAiRook1++;
                    userChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "B") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "Q") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "N") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "P") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "K") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "R")) && tempAiRook1 != 7){
                    tempAiRook1++;
                    userChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                    if(movingSlotY == tempAiLineRook1 && movingSlotX == tempAiRook1){
                        movable = true;
                    }
                }
                if(!Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")){
                    tempAiRook1--;
                }
            }
            ValidRightAiRook1 = tempAiRook1;
            // System.out.print("Last valid spot to the right: ");
            // System.out.println(ValidRightAiRook1 + "," + Lr1);
            tempAiRook1 = r1;
            tempAiLineRook1 = Lr1;
            if(tempAiRook1 > 0) {
                if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "r")) {
                    tempAiRook1--;
                    userChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "B") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "Q") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "N") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "P") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "K") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "R")) && tempAiRook1 != 0){
                    tempAiRook1--;
                    userChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                    if(movingSlotY == tempAiLineRook1 && movingSlotX == tempAiRook1){
                        movable = true;
                    }
                }
                if(!Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")){
                    tempAiRook1++;
                }
            }
            ValidLeftAiRook1 = tempAiRook1;
            // System.out.print("Last valid spot to the left: ");
            // System.out.println(ValidLeftAiRook1 + "," + Lr1);
            // Up and down detection
            // Initializes  variable
            tempAiRook1 = r1;
            tempAiLineRook1 = Lr1;
            // Checks for the rook, counts up one and exits
            if(tempAiLineRook1 < 7){
                if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "r")){
                    tempAiLineRook1++;
                    userChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "B") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "Q") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "N") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "P") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "K") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "R")) && tempAiLineRook1 != 7){
                    tempAiLineRook1++;
                    userChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                    if(movingSlotY == tempAiLineRook1 && movingSlotX == tempAiRook1){
                        movable = true;
                    }
                }
                if(!Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")){
                    tempAiLineRook1--;
                }
            }

            ValidDownAiRook1 = tempAiLineRook1;
            // System.out.print("Last valid spot to the down: ");
            // System.out.println(r1 + "," + ValidDownAiRook1);
            tempAiRook1 = r1;
            tempAiLineRook1 = Lr1;
            if (tempAiLineRook1 > 0) {
                if(Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "r")) {
                    tempAiLineRook1--;
                    userChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "B") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "Q") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "N") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "P") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "K") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "R")) && tempAiLineRook1 != 0){
                    tempAiLineRook1--;
                    userChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                    if(movingSlotY == tempAiLineRook1 && movingSlotX == tempAiRook1){
                        movable = true;
                    }
                }
                if(!Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")){
                    tempAiLineRook1++;
                }
            }
            ValidUpAiRook1 = tempAiLineRook1;
            // System.out.print("Last valid spot to the up: ");
            // System.out.println(r1 + "," + ValidUpAiRook1);
        }
    }
}
