import java.util.Objects;

public class AiRookPaths2 extends Main{
    AiRookPaths2(){
        if (R2 != -1 && LR2 != -1 && Lk != -1 && k != -1){
            // Rook 2
            // System.out.println("AI Rook 2 Location");
            // System.out.print(R2 + ",");
            // System.out.println(LR2);
            // Right and left detection
            // Initializes  variable
            tempAiRook2 = R2;
            tempAiLineRook2 = LR2;
            // Checks for the rook, counts up one and exits
            if (tempAiRook2 < 7) {
                if (Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "R")) {
                    tempAiRook2++;
                    aiChessBoard[tempAiLineRook2][tempAiRook2] = "X";
                }
                while ((Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], " ")||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "b") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "q") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "n") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "p") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "k") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "r")) && tempAiRook2 != 7) {
                    tempAiRook2++;
                    aiChessBoard[tempAiLineRook2][tempAiRook2] = "X";
                    if(movingSlotY == tempAiLineRook2 && movingSlotX == tempAiRook2){
                        movable = true;
                        if(chessBoard[validPawnLine][validPawnSpot].equals(chessBoard[Lk][k])){
                            checkAttacker = "R2";
                            checkAttackers++;
                        }
                    }            }
                if(!Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], " ")){
                    tempAiRook2--;
                }
            }
            else{
                tempAiRook2++;
            }
            ValidRightRook2 = tempAiRook2;
            // System.out.print("Last valid spot to the right: ");
            // System.out.println(ValidRightRook2 + "," + LR2);
            tempAiRook2 = R2;
            tempAiLineRook2 = LR2;
            if(tempAiRook2 > 0) {
                if (Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "R")) {
                    tempAiRook2--;
                    aiChessBoard[tempAiLineRook2][tempAiRook2] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], " ")||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "b") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "q") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "n") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "p") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "k") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "r")) && tempAiRook2 != 0){
                    tempAiRook2--;
                    aiChessBoard[tempAiLineRook2][tempAiRook2] = "X";
                    if(movingSlotY == tempAiLineRook2 && movingSlotX == tempAiRook2){
                        movable = true;
                        if(chessBoard[validPawnLine][validPawnSpot].equals(chessBoard[Lk][k])){
                            checkAttacker = "R2";
                            checkAttackers++;
                        }
                    }            }
                if(!Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], " ")){
                    tempAiRook2++;
                }
            }
            ValidLeftRook2 = tempAiRook2;
            // System.out.print("Last valid spot to the left: ");
            // System.out.println(ValidLeftRook2 + "," + LR2);
            // Up and down detection
            // Initializes  variable
            tempAiRook2 = R2;
            tempAiLineRook2 = LR2;
            // Checks for the rook, counts up one and exits
            if(tempAiLineRook2 < 7){
                if (Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "R")){
                    tempAiLineRook2++;
                    aiChessBoard[tempAiLineRook2][tempAiRook2] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], " ")||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "b") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "q") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "n") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "p") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "k") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "r")) && tempAiLineRook2 != 7){
                    tempAiLineRook2++;
                    aiChessBoard[tempAiLineRook2][tempAiRook2] = "X";
                    if(movingSlotY == tempAiLineRook2 && movingSlotX == tempAiRook2){
                        movable = true;
                        if(chessBoard[validPawnLine][validPawnSpot].equals(chessBoard[Lk][k])){
                            checkAttacker = "R2";
                            checkAttackers++;
                        }
                    }            }
                if(!Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], " ")){
                    tempAiLineRook2--;
                }
            }
            ValidDownAiRook2 = tempAiLineRook2;
            // System.out.print("Last valid spot to the down: ");
            // System.out.println(R2 + "," + ValidDownAiRook2);
            tempAiRook2 = R2;
            tempAiLineRook2 = LR2;
            if (tempAiLineRook2 > 0) {
                if(Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "R")) {
                    tempAiLineRook2--;
                    //System.out.println(tempAiLineRook2);
                    aiChessBoard[tempAiLineRook2][tempAiRook2] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], " ")||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "b") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "q") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "n") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "p") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "k") ||
                        Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], "r")) && tempAiLineRook2 != 0){
                    tempAiLineRook2--;
                    aiChessBoard[tempAiLineRook2][tempAiRook2] = "X";
                    if(movingSlotY == tempAiLineRook2 && movingSlotX == tempAiRook2){
                        movable = true;
                        if(chessBoard[validPawnLine][validPawnSpot].equals(chessBoard[Lk][k])){
                            checkAttacker = "R2";
                            checkAttackers++;
                        }
                    }            }
                if(!Objects.equals(chessBoard[tempAiLineRook2][tempAiRook2], " ")){
                    tempAiLineRook2++;
                }
            }
            ValidUpAiRook2 = tempAiLineRook2;
            // System.out.print("Last valid spot to the up: ");
            // System.out.println(R2 + "," + ValidUpAiRook2);
        }
    }
    void CheckTest(int codeBlock){
        switch (codeBlock){
            case 1 -> {
                tempAiRook1 = R2;
                tempAiLineRook1 = LR2;
                if (tempAiRook1 != 7) {
                    if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "R")) {
                        tempAiRook1++;
                        aiCheckBoard[tempAiLineRook1][tempAiRook1] = "X";
                    }
                    while((Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "b") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "q") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "n") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "p") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "k") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "r")) && tempAiRook1 != 7){
                        tempAiRook1++;
                        aiCheckBoard[tempAiLineRook1][tempAiRook1] = "X";
                    }
                }
            }
            case 2 -> {
                tempAiRook1 = R2;
                tempAiLineRook1 = LR2;
                if(tempAiRook1 != 0) {
                    if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "R")) {
                        tempAiRook1--;
                        aiCheckBoard[tempAiLineRook1][tempAiRook1] = "X";
                    }
                    while((Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "b") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "q") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "n") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "p") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "k") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "r")) && tempAiRook1 != 0){
                        tempAiRook1--;
                        aiCheckBoard[tempAiLineRook1][tempAiRook1] = "X";
                    }

                }
            }
            case 3 -> {
                tempAiRook1 = R2;
                tempAiLineRook1 = LR2;
                // Checks for the rook, counts up one and exits
                if(tempAiLineRook1 != 7){
                    if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "R")){
                        tempAiLineRook1++;
                        aiChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                    }
                    while((Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "b") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "q") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "n") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "p") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "k") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "r")) && tempAiLineRook1 != 7){
                        tempAiLineRook1++;
                        aiChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                    }
                }
            }
            case 4 -> {
                tempAiRook1 = R2;
                tempAiLineRook1 = LR2;
                if (tempAiLineRook1 != 0) {
                    if(Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "R")) {
                        tempAiLineRook1--;
                        aiCheckBoard[tempAiLineRook1][tempAiRook1] = "X";
                    }
                    while((Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "b") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "q") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "n") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "p") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "k") ||
                            Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "r")) && tempAiLineRook1 != 0){
                        tempAiLineRook1--;
                        aiCheckBoard[tempAiLineRook1][tempAiRook1] = "X";
                    }

                }
            }

        }
    }
}
