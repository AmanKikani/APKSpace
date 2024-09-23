import java.util.Objects;

public class QueenPath extends Main{
    QueenPath(){
        if (q != -1 && Lq != -1 && LK != -1 && K != -1){
            // System.out.println("Queen Location");
            // System.out.println(q + "," + Lq);
            // SE Detection
            tempAiBishop1 = q;
            tempAiLineBishop1 = Lq;
            if (tempAiBishop1 != 7 && tempAiLineBishop1 != 7)
            {
                if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "q")){
                    tempAiBishop1++;
                    tempAiLineBishop1++;
                    userChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " ")||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "B") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "Q") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "N") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "P") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "K") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "R")) &&
                        tempAiBishop1 != 7 && tempAiLineBishop1 != 7){
                    tempAiBishop1++;
                    tempAiLineBishop1++;
                    userChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    if(movingSlotY == tempAiLineBishop1 && movingSlotX == tempAiBishop1){
                        movable = true;
                    }

                }
                if((!Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " "))){
                    tempAiBishop1--;
                    tempAiLineBishop1--;
                }
            }
            validSouthEastB1 = tempAiBishop1;
            validSouthEastLineB1 = tempAiLineBishop1;
            // System.out.println("Final valid southeast coordinate: " + validSouthEastB1 + "," + validSouthEastLineB1);
            tempAiBishop1 = q;
            tempAiLineBishop1 = Lq;
            // Southwest Detection
            if (tempAiBishop1 != 0 && tempAiLineBishop1 != 7) {
                if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "q")) {
                    tempAiBishop1--;
                    tempAiLineBishop1++;
                    userChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                }
                while (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " ") && tempAiBishop1 != 0
                        && tempAiLineBishop1 != 7) {
                    tempAiBishop1--;
                    tempAiLineBishop1++;
                    userChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    if(movingSlotY == tempAiLineBishop1 && movingSlotX == tempAiBishop1){
                        movable = true;
                    }
                }
                if((!Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " "))){
                    tempAiBishop1++;
                    tempAiLineBishop1--;
                }
            }
            validSouthWestB1 = tempAiBishop1;
            validSouthWestLineB1 = tempAiLineBishop1;
            // System.out.println("Final valid southwest coordinates: " + validSouthWestB1 + "," + validSouthWestLineB1);
            // Northwest
            tempAiBishop1 = q;
            tempAiLineBishop1 = Lq;
            if (tempAiBishop1 != 0 && tempAiLineBishop1 != 0){
                if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "q")){
                    tempAiBishop1--;
                    tempAiLineBishop1--;
                    userChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                }
                while(Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " ") && tempAiBishop1 != 0
                        && tempAiLineBishop1 != 0){
                    tempAiBishop1--;
                    tempAiLineBishop1--;
                    userChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    if(movingSlotY == tempAiLineBishop1 && movingSlotX == tempAiBishop1){
                        movable = true;
                    }
                }
                if((!Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " "))){
                    tempAiBishop1++;
                    tempAiLineBishop1++;
                }
            }
            validNorthWestAiBishop1 = tempAiBishop1;
            validNorthWestLineB1 = tempAiLineBishop1;
            // System.out.println("Last valid northwest coordinates: " + validNorthWestAiBishop1 + "," + validNorthWestLineB1);
            // Northeast
            tempAiBishop1 = q;
            tempAiLineBishop1 = Lq;
            if (tempAiBishop1 != 7 && tempAiLineBishop1 != 0){
                if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "q")){
                    tempAiBishop1++;
                    tempAiLineBishop1--;
                    userChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                }
                while(Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " ") &&
                        tempAiBishop1 != 7 && tempAiLineBishop1 != 0){
                    tempAiBishop1++;
                    tempAiLineBishop1--;
                    userChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    if(movingSlotY == tempAiLineBishop1 && movingSlotX == tempAiBishop1){
                        movable = true;
                    }
                }
                if((!Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " "))){
                    tempAiBishop1--;
                    tempAiLineBishop1++;
                }
            }
            validNorthEastAiBishop1 = tempAiBishop1;
            validNorthEastLineB1 = tempAiLineBishop1;
            // System.out.println("Last valid northeast coordinates : " + validNorthEastAiBishop1 + "," + validNorthEastLineB1);
            // Right and left detection
            // Initializes  variable
            tempAiRook1 = q;
            tempAiLineRook1 = Lq;
            // Checks for the rook, counts up one and exits
            if (tempAiRook1 != 7) {
                if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "q")) {
                    tempAiRook1++;
                    userChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                }
                while(Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ") && tempAiRook1 != 7){
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
            // System.out.println(ValidRightAiRook1 + "," + Lq);
            tempAiRook1 = q;
            tempAiLineRook1 = Lq;
            if(tempAiRook1 != 0) {
                if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "q")) {
                    tempAiRook1--;
                    userChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                }
                while(Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ") && tempAiRook1 != 0){
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
            // System.out.println(ValidLeftAiRook1 + "," + Lq);
            // Up and down detection
            // Initializes  variable
            tempAiRook1 = q;
            tempAiLineRook1 = Lq;
            // Checks for the rook, counts up one and exits
            if(tempAiLineRook1 != 7){
                if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "q")){
                    tempAiLineRook1++;
                    userChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                }
                while(Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ") && tempAiLineRook1 != 7){
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
            // System.out.println(q + "," + ValidDownAiRook1);
            tempAiRook1 = q;
            tempAiLineRook1 = Lq;
            if (tempAiLineRook1 != 0) {
                if(Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "q")) {
                    tempAiLineRook1--;
                    userChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                }
                while(Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ") && tempAiLineRook1 != 0){
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
            // System.out.println(q + "," + ValidUpAiRook1);
        }
    }
}
