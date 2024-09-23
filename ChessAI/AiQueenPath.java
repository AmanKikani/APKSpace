import java.util.Objects;

public class AiQueenPath extends Main{
    AiQueenPath(){
        if (Q != -1 && LQ != -1 && Lk != -1 && k != -1){
            // System.out.println("Ai Queen Location");
            // System.out.println(Q + "," + LQ);
            // SE Detection
            tempAiBishop1 = Q;
            tempAiLineBishop1 = LQ;
            if (tempAiBishop1 != 7 && tempAiLineBishop1 != 7)
            {
                if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "Q")){
                    tempAiBishop1++;
                    tempAiLineBishop1++;
                    aiChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " ")||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "b") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "q") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "n") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "p") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "k") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "r")) &&
                        tempAiBishop1 != 7 && tempAiLineBishop1 != 7){
                    tempAiBishop1++;
                    tempAiLineBishop1++;
                    aiChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    if(movingSlotY == tempAiLineBishop1 && movingSlotX == tempAiBishop1){
                        movable = true;
                        KingPath();
                        if(tempAiBishop1 == k && tempAiLineBishop1 == Lk) {
                            checkAttacker = "Q";
                            checkAttackers++;
                            CheckTest(1);
                        }
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
            tempAiBishop1 = Q;
            tempAiLineBishop1 = LQ;
            // Southwest Detection
            if (tempAiBishop1 != 0 && tempAiLineBishop1 != 7) {
                if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "Q")) {
                    tempAiBishop1--;
                    tempAiLineBishop1++;
                    aiChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                }
                while ((Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " ")||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "b") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "q") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "n") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "p") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "k") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "r")) && tempAiBishop1 != 0
                        && tempAiLineBishop1 != 7) {
                    tempAiBishop1--;
                    tempAiLineBishop1++;
                    aiChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    if(movingSlotY == tempAiLineBishop1 && movingSlotX == tempAiBishop1){
                        movable = true;
                        KingPath();
                        if(tempAiBishop1 == k && tempAiLineBishop1 == Lk) {
                            checkAttacker = "Q";
                            checkAttackers++;
                            CheckTest(2);
                        }
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
            tempAiBishop1 = Q;
            tempAiLineBishop1 = LQ;
            if (tempAiBishop1 != 0 && tempAiLineBishop1 != 0){
                if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "Q")){
                    tempAiBishop1--;
                    tempAiLineBishop1--;
                    aiChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " ")||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "b") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "q") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "n") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "p") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "k") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "r")) && tempAiBishop1 != 0
                        && tempAiLineBishop1 != 0){
                    tempAiBishop1--;
                    tempAiLineBishop1--;
                    aiChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    if(movingSlotY == tempAiLineBishop1 && movingSlotX == tempAiBishop1){
                        movable = true;
                        KingPath();
                        if(tempAiBishop1 == k && tempAiLineBishop1 == Lk) {
                            checkAttacker = "Q";
                            checkAttackers++;
                            CheckTest(3);
                        }
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
            tempAiBishop1 = Q;
            tempAiLineBishop1 = LQ;
            if (tempAiBishop1 != 7 && tempAiLineBishop1 != 0){
                if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "Q")){
                    tempAiBishop1++;
                    tempAiLineBishop1--;
                    aiChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " ")||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "b") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "q") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "n") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "p") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "k") ||
                        Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "r")) &&
                        tempAiBishop1 != 7 && tempAiLineBishop1 != 0){
                    tempAiBishop1++;
                    tempAiLineBishop1--;
                    aiChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    if(movingSlotY == tempAiLineBishop1 && movingSlotX == tempAiBishop1){
                        movable = true;
                        KingPath();
                        if(tempAiBishop1 == k && tempAiLineBishop1 == Lk) {
                            checkAttacker = "Q";
                            checkAttackers++;
                            CheckTest(4);
                        }
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
            tempAiRook1 = Q;
            tempAiLineRook1 = LQ;
            // Checks for the rook, counts up one and exits
            if (tempAiRook1 != 7) {
                if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "Q")) {
                    tempAiRook1++;
                    aiChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "b") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "q") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "n") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "p") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "k") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "r")) && tempAiRook1 != 7){
                    tempAiRook1++;
                    aiChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                    if(movingSlotY == tempAiLineRook1 && movingSlotX == tempAiRook1){
                        movable = true;
                        KingPath();
                        if(movingSlotX == k && movingSlotY == Lk){
                            checkAttacker = "Q";
                            checkAttackers ++;
                            CheckTest(5);
                        }
                    }
                }
                if(!Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")){
                    tempAiRook1--;
                }
            }
            ValidRightAiRook1 = tempAiRook1;
            // System.out.print("Last valid spot to the right: ");
            // System.out.println(ValidRightAiRook1 + "," + LQ);
            tempAiRook1 = Q;
            tempAiLineRook1 = LQ;
            if(tempAiRook1 != 0) {
                if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "Q")) {
                    tempAiRook1--;
                    aiChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "b") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "q") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "n") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "p") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "k") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "r")) && tempAiRook1 != 0){
                    tempAiRook1--;
                    aiChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                    if(movingSlotY == tempAiLineRook1 && movingSlotX == tempAiRook1){
                        movable = true;
                        KingPath();
                        if(movingSlotX == k && movingSlotY == Lk){
                            checkAttacker = "Q";
                            checkAttackers ++;
                            CheckTest(6);
                        }
                    }
                }
                if(!Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")){
                    tempAiRook1++;
                }
            }
            ValidLeftAiRook1 = tempAiRook1;
            // System.out.print("Last valid spot to the left: ");
            // System.out.println(ValidLeftAiRook1 + "," + LQ);
            // Up and down detection
            // Initializes  variable
            tempAiRook1 = Q;
            tempAiLineRook1 = LQ;
            // Checks for the rook, counts up one and exits
            if(tempAiLineRook1 != 7){
                if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "Q")){
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
                    if(movingSlotY == tempAiLineRook1 && movingSlotX == tempAiRook1){
                        movable = true;
                        KingPath();
                        if(movingSlotX == k && movingSlotY == Lk){
                            checkAttacker = "Q";
                            checkAttackers ++;
                            CheckTest(7);
                        }
                    }
                }
                if(!Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")){
                    tempAiLineRook1--;
                }
            }

            ValidDownAiRook1 = tempAiLineRook1;
            // System.out.print("Last valid spot to the down: ");
            // System.out.println(q + "," + ValidDownAiRook1);
            tempAiRook1 = Q;
            tempAiLineRook1 = LQ;
            if (tempAiLineRook1 != 0) {
                if(Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "Q")) {
                    tempAiLineRook1--;
                    aiChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], " ")||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "b") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "q") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "n") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "p") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "k") ||
                        Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "r")) && tempAiLineRook1 != 0){
                    tempAiLineRook1--;
                    aiChessBoard[tempAiLineRook1][tempAiRook1] = "X";
                    if(movingSlotY == tempAiLineRook1 && movingSlotX == tempAiRook1){
                        movable = true;
                        KingPath();
                        if(movingSlotX == k && movingSlotY == Lk){
                            checkAttacker = "Q";
                            checkAttackers ++;
                            CheckTest(8);
                        }
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
    void CheckTest(int codeBlock){
        switch (codeBlock){
            case 1 -> {
                tempAiBishop1 = Q;
                tempAiLineBishop1 = LQ;
                if (tempAiBishop1 != 7 && tempAiLineBishop1 != 7) {
                    if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "Q")) {
                        tempAiBishop1++;
                        tempAiLineBishop1++;
                        aiCheckBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    }
                    while ((Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " ") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "b") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "q") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "n") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "p") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "k") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "r")) &&
                            tempAiBishop1 != 7 && tempAiLineBishop1 != 7) {
                        tempAiBishop1++;
                        tempAiLineBishop1++;
                        aiCheckBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    }
                }
            }
            case 2 -> {
                tempAiBishop1 = Q;
                tempAiLineBishop1 = LQ;
                if (tempAiBishop1 != 0 && tempAiLineBishop1 != 7) {
                    if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "Q")) {
                        tempAiBishop1--;
                        tempAiLineBishop1++;
                        aiCheckBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    }
                    while ((Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " ")||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "b") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "q") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "n") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "p") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "k") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "r"))
                            && tempAiBishop1 != 0 && tempAiLineBishop1 != 7) {
                        tempAiBishop1--;
                        tempAiLineBishop1++;
                        aiCheckBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    }
                    if((!Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " "))){
                        tempAiBishop1++;
                        tempAiLineBishop1--;
                    }
                }
            }
            case 3 -> {
                tempAiBishop1 = Q;
                tempAiLineBishop1 = LQ;
                if (tempAiBishop1 != 0 && tempAiLineBishop1 != 0){
                    if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "Q")){
                        tempAiBishop1--;
                        tempAiLineBishop1--;
                        aiCheckBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    }
                    while((Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " ")||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "b") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "q") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "n") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "p") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "k") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "r"))
                            && tempAiBishop1 != 0 && tempAiLineBishop1 != 0){
                        tempAiBishop1--;
                        tempAiLineBishop1--;
                        aiCheckBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    }
                    if((!Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " "))){
                        tempAiBishop1++;
                        tempAiLineBishop1++;
                    }
                }
            }
            case 4 -> {
                tempAiBishop1 = Q;
                tempAiLineBishop1 = LQ;
                if (tempAiBishop1 != 7 && tempAiLineBishop1 != 0){
                    if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "Q")){
                        tempAiBishop1++;
                        tempAiLineBishop1--;
                        aiChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    }
                    while((Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " ")||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "b") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "q") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "n") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "p") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "k") ||
                            Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "r"))  && tempAiBishop1 != 7 && tempAiLineBishop1 != 0){
                        tempAiBishop1++;
                        tempAiLineBishop1--;
                        aiChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    }
                    if((!Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " "))){
                        tempAiBishop1--;
                        tempAiLineBishop1++;
                    }
                }
            }
            case 5 -> {
                tempAiRook1 = Q;
                tempAiLineRook1 = LQ;
                if (tempAiRook1 != 7) {
                    if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "Q")) {
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
            case 6 -> {
                tempAiRook1 = Q;
                tempAiLineRook1 = LQ;
                if(tempAiRook1 != 0) {
                    if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "Q")) {
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
            case 7 -> {
                tempAiRook1 = Q;
                tempAiLineRook1 = LQ;
                // Checks for the rook, counts up one and exits
                if(tempAiLineRook1 != 7){
                    if (Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "Q")){
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
            case 8 -> {
                tempAiRook1 = Q;
                tempAiLineRook1 = LQ;
                if (tempAiLineRook1 != 0) {
                    if(Objects.equals(chessBoard[tempAiLineRook1][tempAiRook1], "Q")) {
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
