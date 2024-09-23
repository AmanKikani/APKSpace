import java.util.Objects;

public class AiBishopPath2 extends Main{
    AiBishopPath2(){
        if (B2 != -1 && LB2 != -1 && Lk != -1 && k != -1){
            // System.out.println("Bishop 2 Location");
            // System.out.println(B2 + "," + LB2);
            // SE Detection
            tempAiBishop2 = B2;
            tempAiLineBishop2 = LB2;
            if (tempAiBishop2 != 7 && tempAiLineBishop2 != 7)
            {
                if (Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "B")){
                    tempAiBishop2++;
                    tempAiLineBishop2++;
                    aiChessBoard[tempAiLineBishop2][tempAiBishop2] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], " ")||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "b") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "q") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "n") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "p") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "k") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "r")) &&
                        tempAiBishop2 != 7 && tempAiLineBishop2 != 7){
                    if(movingSlotY == tempAiLineBishop2 && movingSlotX == tempAiBishop2){
                        movable = true;
                        KingPath();
                        if(tempAiBishop2 == k && tempAiLineBishop2 == Lk){
                            checkAttacker = "B2";
                            checkAttackers++;
                            CheckTest(1);
                        }
                    }
                    tempAiBishop2++;
                    tempAiLineBishop2++;
                    aiChessBoard[tempAiLineBishop2][tempAiBishop2] = "X";
                }
                if((!Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], " "))){
                    tempAiBishop2--;
                    tempAiLineBishop2--;
                }
            }
            validSouthEastB2 = tempAiBishop2;
            validSouthEastLineB2 = tempAiLineBishop2;
            // System.out.println("Final valid southeast coordinate: " + validSouthEastB2 + "," + validSouthEastLineB2);
            tempAiBishop2 = B2;
            tempAiLineBishop2 = LB2;
            // Southwest Detection
            if (tempAiBishop2 != 0 && tempAiLineBishop2 != 8) {
                if (Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "B")) {
                    tempAiBishop2--;
                    tempAiLineBishop2++;
                    aiChessBoard[tempAiLineBishop2][tempAiBishop2] = "X";
                }
                while ((Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], " ")||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "b") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "q") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "n") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "p") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "k") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "r")) && tempAiBishop2 != 0
                        && tempAiLineBishop2 != 7) {
                    if(movingSlotY == tempAiLineBishop2 && movingSlotX == tempAiBishop2){
                        movable = true;
                        KingPath();
                        if(tempAiBishop2 == k && tempAiLineBishop2 == Lk){
                            checkAttacker = "B2";
                            checkAttackers++;
                            CheckTest(2);
                        }
                    }
                    tempAiBishop2--;
                    tempAiLineBishop2++;
                    aiChessBoard[tempAiLineBishop2][tempAiBishop2] = "X";

                }
                if((!Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], " "))){
                    tempAiBishop2++;
                    tempAiLineBishop2--;
                }
            }
            validSouthWestB2 = tempAiBishop2;
            validSouthWestLineB2 = tempAiLineBishop2;
            // System.out.println("Final valid southwest coordinates: " + validSouthWestB2 + "," + validSouthWestLineB2);
            // Northwest
            tempAiBishop2 = B2;
            tempAiLineBishop2 = LB2;
            if (tempAiBishop2 != 0 && tempAiLineBishop2 != 0){
                if (Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "B")){
                    tempAiBishop2--;
                    tempAiLineBishop2--;
                    aiChessBoard[tempAiLineBishop2][tempAiBishop2] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], " ")||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "b") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "q") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "n") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "p") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "k") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "r")) && tempAiBishop2 != 0
                        && tempAiLineBishop2 != 0){
                    if(movingSlotY == tempAiLineBishop2 && movingSlotX == tempAiBishop2){
                        movable = true;
                        KingPath();
                        if(tempAiBishop2 == k && tempAiLineBishop2 == Lk){
                            checkAttacker = "B2";
                            checkAttackers++;
                            CheckTest(3);
                        }
                    }
                    tempAiBishop2--;
                    tempAiLineBishop2--;
                    aiChessBoard[tempAiLineBishop2][tempAiBishop2] = "X";
                }
                if((!Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], " "))){
                    tempAiBishop2++;
                    tempAiLineBishop2++;
                }
            }
            validNorthWestAiBishop2 = tempAiBishop2;
            validNorthWestLineB2 = tempAiLineBishop2;
            // System.out.println("Last valid northwest coordinates: " + validNorthWestAiBishop2 + "," + validNorthWestLineB2);
            // Northeast
            tempAiBishop2 = B2;
            tempAiLineBishop2 = LB2;
            if (tempAiBishop2 != 7 && tempAiLineBishop2 != 0){
                if (Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "B")){
                    tempAiBishop2++;
                    tempAiLineBishop2--;
                    aiChessBoard[tempAiLineBishop2][tempAiBishop2] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], " ")||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "b") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "q") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "n") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "p") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "k") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "r")) && tempAiBishop2 != 7
                        && tempAiLineBishop2 != 0){
                    if(movingSlotY == tempAiLineBishop2 && movingSlotX == tempAiBishop2){
                        movable = true;
                        KingPath();
                        if(tempAiBishop2 == k && tempAiLineBishop2 == Lk){
                            checkAttacker = "B2";
                            checkAttackers++;
                            CheckTest(4);
                        }
                    }
                    tempAiBishop2++;
                    tempAiLineBishop2--;
                    aiChessBoard[tempAiLineBishop2][tempAiBishop2] = "X";
                }
                if((!Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], " "))){
                    tempAiBishop2--;
                    tempAiLineBishop2++;
                }
            }
            validNorthEastAiBishop2 = tempAiBishop2;
            validNorthEastLineB2 = tempAiLineBishop2;
            // System.out.println("Last valid northeast coordinates : " + validNorthEastAiBishop2 + "," + validNorthEastLineB2);
        }



    }
    void CheckTest(int codeBlock){
        switch (codeBlock){
            case 1 -> {
                tempAiBishop1 = B2;
                tempAiLineBishop1 = LB2;
                if (tempAiBishop1 != 7 && tempAiLineBishop1 != 7) {
                    if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "B")) {
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
                tempAiBishop1 = B2;
                tempAiLineBishop1 = LB2;
                if (tempAiBishop1 != 0 && tempAiLineBishop1 != 7) {
                    if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "B")) {
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
                tempAiBishop1 = B2;
                tempAiLineBishop1 = LB2;
                if (tempAiBishop1 != 0 && tempAiLineBishop1 != 0){
                    if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "B")){
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
                tempAiBishop1 = B2;
                tempAiLineBishop1 = LB2;
                if (tempAiBishop1 != 7 && tempAiLineBishop1 != 0){
                    if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "B")){
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
        }
    }
}
