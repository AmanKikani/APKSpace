import java.util.Objects;

public class BishopPath2 extends Main{
    BishopPath2(){
        if (b2 != -1 && Lb2 != -1 && LK != -1 && K != -1){
            tester = 15;
            // System.out.println("User Bishop 2 Location");
            // System.out.println(b2 + "," + Lb2);
            // SE Detection
            tempAiBishop2 = b2;
            tempAiLineBishop2 = Lb2;
            if (tempAiBishop2 != 7 && tempAiLineBishop2 != 7)
            {
                if (Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "b")){
                    tempAiBishop2++;
                    tempAiLineBishop2++;
                    userChessBoard[tempAiLineBishop2][tempAiBishop2] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], " ")||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "B") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "Q") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "N") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "P") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "K") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "R")) &&
                        tempAiBishop2 != 7 && tempAiLineBishop2 != 7){
                    if(movingSlotY == tempAiLineBishop2 && movingSlotX == tempAiBishop2){
                        movable = true;
                        if(chessBoard[tempAiLineBishop2][tempAiBishop2].equals(chessBoard[LK][K])){
                            userCheckAttacker = "B2";
                            userCheckAttackers++;
                            CheckTest(1);
                        }
                    }
                    tempAiBishop2++;
                    tempAiLineBishop2++;
                    userChessBoard[tempAiLineBishop2][tempAiBishop2] = "X";
                }
                if((!Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], " "))){
                    tempAiBishop2--;
                    tempAiLineBishop2--;
                }
            }
            validSouthEastB2 = tempAiBishop2;
            validSouthEastLineB2 = tempAiLineBishop2;
            // System.out.println("Final valid southeast coordinate: " + validSouthEastB2 + "," + validSouthEastLineB2);
            tempAiBishop2 = b2;
            tempAiLineBishop2 = Lb2;
            // Southwest Detection
            if (tempAiBishop2 != 0 && tempAiLineBishop2 != 7) {
                if (Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "b")) {
                    userChessBoard[tempAiLineBishop2][tempAiBishop2] = "X";
                    tempAiBishop2--;
                    tempAiLineBishop2++;
                }
                while ((Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], " ")||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "B") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "Q") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "N") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "P") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "K") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "R")) && tempAiBishop2 != 0
                        && tempAiLineBishop2 != 7) {
                    if(movingSlotY == tempAiLineBishop2 && movingSlotX == tempAiBishop2){
                        movable = true;
                        if(chessBoard[tempAiLineBishop2][tempAiBishop2].equals(chessBoard[LK][K])){
                            userCheckAttacker = "B2";
                            userCheckAttackers++;
                            CheckTest(2);
                        }
                    }
                    tempAiBishop2--;
                    // Made By Aman Kikani
                    tempAiLineBishop2++;
                    userChessBoard[tempAiLineBishop2][tempAiBishop2] = "X";
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
            tempAiBishop2 = b2;
            tempAiLineBishop2 = Lb2;
            if (tempAiBishop2 != 0 || tempAiLineBishop2 != 0){
                if (Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "b")){
                    tempAiBishop2--;
                    tempAiLineBishop2--;
                    userChessBoard[tempAiLineBishop2][tempAiBishop2] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], " ")||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "B") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "Q") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "N") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "P") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "K") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "R")) && tempAiBishop2 != 0
                        && tempAiLineBishop2 != 0){
                    if(movingSlotY == tempAiLineBishop2 && movingSlotX == tempAiBishop2){
                        movable = true;
                        if(chessBoard[tempAiLineBishop2][tempAiBishop2].equals(chessBoard[LK][K])){
                            userCheckAttacker = "B2";
                            userCheckAttackers++;
                            CheckTest(3);
                        }
                    }
                    tempAiBishop2--;
                    tempAiLineBishop2--;
                    userChessBoard[tempAiLineBishop2][tempAiBishop2] = "X";
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
            tempAiBishop2 = b2;
            tempAiLineBishop2 = Lb2;
            if (tempAiBishop2 != 7 && tempAiLineBishop2 != 0){
                if (Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "b")){
                    tempAiBishop2++;
                    tempAiLineBishop2--;
                    userChessBoard[tempAiLineBishop2][tempAiBishop2] = "X";
                }
                while((Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], " ")||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "B") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "Q") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "N") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "P") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "K") ||
                        Objects.equals(chessBoard[tempAiLineBishop2][tempAiBishop2], "R")) && tempAiBishop2 != 7
                        && tempAiLineBishop2 != 0){
                    if(movingSlotY == tempAiLineBishop2 && movingSlotX == tempAiBishop2){
                        movable = true;
                        if(chessBoard[tempAiLineBishop2][tempAiBishop2].equals(chessBoard[LK][K])){
                            userCheckAttacker = "B2";
                            userCheckAttackers++;
                            CheckTest(4);
                        }
                    }
                    tempAiBishop2++;
                    tempAiLineBishop2--;
                    userChessBoard[tempAiLineBishop2][tempAiBishop2] = "X";
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
                tempAiBishop1 = b2;
                tempAiLineBishop1 = Lb2;
                if (tempAiBishop1 != 7 && tempAiLineBishop1 != 7) {
                    if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "B")) {
                        tempAiBishop1++;
                        tempAiLineBishop1++;
                        userCheckBoard[tempAiLineBishop1][tempAiBishop1] = "X";
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
                        userCheckBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    }
                }
            }
            case 2 -> {
                tempAiBishop1 = b2;
                tempAiLineBishop1 = Lb2;
                if (tempAiBishop1 != 0 && tempAiLineBishop1 != 7) {
                    if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "B")) {
                        tempAiBishop1--;
                        tempAiLineBishop1++;
                        userCheckBoard[tempAiLineBishop1][tempAiBishop1] = "X";
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
                        userCheckBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    }
                    if((!Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " "))){
                        tempAiBishop1++;
                        tempAiLineBishop1--;
                    }
                }
            }
            case 3 -> {
                tempAiBishop1 = b2;
                tempAiLineBishop1 = Lb2;
                if (tempAiBishop1 != 0 && tempAiLineBishop1 != 0){
                    if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "B")){
                        tempAiBishop1--;
                        tempAiLineBishop1--;
                        userCheckBoard[tempAiLineBishop1][tempAiBishop1] = "X";
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
                        userCheckBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                    }
                    if((!Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " "))){
                        tempAiBishop1++;
                        tempAiLineBishop1++;
                    }
                }
            }
            case 4 -> {
                tempAiBishop1 = b2;
                tempAiLineBishop1 = Lb2;
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
