import java.util.Objects;

public class AiRookPath1 extends Main{
    AiRookPath1() {
        if (R1 != -1 && LR != -1 && Lk != -1 && k != -1) {
            // System.out.println("AI Rook Location");
            // System.out.print(R1 + ",");
            // System.out.println(LR);
            // Right and left detection
            // Initializes  variable
            tempAiRook1 = R1;
            tempAiLineRook1 = LR;
            // Checks for the rook, counts up one and exits
            if (tempAiRook1 < 7) {
                if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "R")) {
                    tempAiRook1++;
                    aiChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                }
                while ((Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "b") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "q") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "n") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "p") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "k") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "r")) && tempAiRook1 != 7) {
                    tempAiRook1++;
                    aiChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                    if (movingSlotY == tempAiLineRook1 && movingSlotX == tempAiRook1) {
                        movable = true;
                        if (chessBoard[validPawnLine][validPawnSpot].equals(chessBoard[Lk][k])) {
                            checkAttacker = "R1";
                            checkAttackers++;
                            CheckTest(1);
                        }
                    }
                }
                if (!Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")) {
                    tempAiRook1--;
                }
            }
            ValidRightAiRook1 = tempAiRook1;
            // System.out.print("Last valid spot to the right: ");
            // System.out.println(ValidRightAiRook1 + "," + LR);
            tempAiRook1 = R1;
            tempAiLineRook1 = LR;
            if (tempAiRook1 > 0) {
                if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "R")) {
                    tempAiRook1--;
                    aiChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                }
                while ((Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "b") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "q") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "n") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "p") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "k") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "r")) && tempAiRook1 != 0) {
                    tempAiRook1--;
                    aiChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                    if (movingSlotY == tempAiLineRook1 && movingSlotX == tempAiRook1) {
                        movable = true;
                        if (chessBoard[validPawnLine][validPawnSpot].equals(chessBoard[Lk][k])) {
                            checkAttacker = "R1";
                            checkAttackers++;
                            CheckTest(2);
                        }
                    }
                }
                if (!Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")) {
                    tempAiRook1++;
                }
            }
            ValidLeftAiRook1 = tempAiRook1;
            // System.out.print("Last valid spot to the left: ");
            // System.out.println(ValidLeftAiRook1 + "," + LR);
            // Up and down detection
            // Initializes  variable
            tempAiRook1 = R1;
            tempAiLineRook1 = LR;
            // Checks for the rook, counts up one and exits
            if (tempAiLineRook1 < 7) {
                if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "R")) {
                    tempAiLineRook1++;
                    aiChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                }
                while ((Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "b") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "q") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "n") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "p") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "k") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "r")) && tempAiLineRook1 != 7) {
                    tempAiLineRook1++;
                    aiChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                    if (movingSlotY == tempAiLineRook1 && movingSlotX == tempAiRook1) {
                        movable = true;
                        if (chessBoard[validPawnLine][validPawnSpot].equals(chessBoard[Lk][k])) {
                            checkAttacker = "R1";
                            checkAttackers++;
                            CheckTest(3);
                        }
                    }
                }
                if (!Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")) {
                    tempAiLineRook1--;
                }
            }

            ValidDownAiRook1 = tempAiLineRook1;
            // System.out.print("Last valid spot to the down: ");
            // System.out.println(R1 + "," + ValidDownAiRook1);
            tempAiRook1 = R1;
            tempAiLineRook1 = LR;
            if (tempAiLineRook1 > 0) {
                if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "R")) {
                    tempAiLineRook1--;
                    aiChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                }
                while ((Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "b") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "q") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "n") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "p") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "k") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "r")) && tempAiLineRook1 != 0) {
                    tempAiLineRook1--;
                    aiChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                    if (movingSlotY == tempAiLineRook1 && movingSlotX == tempAiRook1) {
                        movable = true;
                        if (chessBoard[validPawnLine][validPawnSpot].equals(chessBoard[Lk][k])) {
                            checkAttacker = "R1";
                            checkAttackers++;
                            CheckTest(4);
                        }
                    }
                }
                if (!Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")) {
                    tempAiLineRook1++;
                }
            }
            ValidUpAiRook1 = tempAiLineRook1;
            // System.out.print("Last valid spot to the up: ");
            // System.out.println(R1 + "," + ValidUpAiRook1);
        }
    }
    void CheckTest(int codeBlock){
        switch (codeBlock){
            case 1 -> {
                tempAiRook1 = R1;
                tempAiLineRook1 = LR;
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
                tempAiRook1 = R1;
                tempAiLineRook1 = LR;
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
                tempAiRook1 = R1;
                tempAiLineRook1 = LR;
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
                tempAiRook1 = R1;
                tempAiLineRook1 = LR;
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
