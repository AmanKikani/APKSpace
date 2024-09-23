import java.util.Objects;

public class BishopPath1 extends Main{
     BishopPath1(){
         if (b1 != -1 && Lb1 != -1 && LK != -1 && K != -1){
             // System.out.println("User Bishop 1 Location");
             // System.out.println(b1 + "," + Lb1);
             // SE Detection
             tempAiBishop1 = b1;
             tempAiLineBishop1 = Lb1;
             if (tempAiBishop1 != 7 && tempAiLineBishop1 != 7)
             {
                 if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "b")){
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
                         tempAiBishop1 < 7 && tempAiLineBishop1 < 7){
                     if(movingSlotY == tempAiLineBishop1 && movingSlotX == tempAiBishop1){
                         movable = true;
                         if(chessBoard[tempAiLineBishop1][tempAiBishop1].equals(chessBoard[LK][K])){
                             userCheckAttacker = "B1";
                             userCheckAttackers++;
                             CheckTest(1);
                         }
                     }
                     tempAiBishop1++;
                     tempAiLineBishop1++;
                     userChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                 }
                 if((!Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " "))){
                     tempAiBishop1--;
                     tempAiLineBishop1--;
                 }
             }
             validSouthEastB1 = tempAiBishop1;
             validSouthEastLineB1 = tempAiLineBishop1;
             // System.out.println("Final valid southeast coordinate: " + validSouthEastB1 + "," + validSouthEastLineB1);
             tempAiBishop1 = b1;
             tempAiLineBishop1 = Lb1;
             // Southwest Detection
             if (tempAiBishop1 != 0 && tempAiLineBishop1 != 7) {
                 if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "b")) {
                     tempAiBishop1--;
                     tempAiLineBishop1++;
                     userChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                 }
                 while ((Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " ")||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "B") ||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "Q") ||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "N") ||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "P") ||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "K") ||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "R")) && tempAiBishop1 != 0
                         && tempAiLineBishop1 != 7) {
                     if(movingSlotY == tempAiLineBishop1 && movingSlotX == tempAiBishop1){
                         movable = true;
                         if(chessBoard[tempAiLineBishop1][tempAiBishop1].equals(chessBoard[LK][K])){
                             userCheckAttacker = "B1";
                             userCheckAttackers++;
                             CheckTest(2);
                         }
                     }
                     tempAiBishop1--;
                     tempAiLineBishop1++;
                     userChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
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
             tempAiBishop1 = b1;
             tempAiLineBishop1 = Lb1;
             if (tempAiBishop1 != 0 && tempAiLineBishop1 != 0){
                 if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "b")){
                     tempAiBishop1--;
                     tempAiLineBishop1--;
                     userChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                 }
                 while((Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " ")||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "B") ||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "Q") ||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "N") ||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "P") ||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "K") ||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "R")) && tempAiBishop1 != 0
                         && tempAiLineBishop1 != 0){
                     if(movingSlotY == tempAiLineBishop1 && movingSlotX == tempAiBishop1){
                         movable = true;
                         if(chessBoard[tempAiLineBishop1][tempAiBishop1].equals(chessBoard[LK][K])){
                             userCheckAttacker = "B1";
                             userCheckAttackers++;
                             CheckTest(3);
                         }
                     }
                     tempAiBishop1--;
                     tempAiLineBishop1--;
                     userChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
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
             tempAiBishop1 = b1;
             tempAiLineBishop1 = Lb1;
             if (tempAiBishop1 != 7 && tempAiLineBishop1 != 0){
                 if (Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "b")){
                     tempAiBishop1++;
                     tempAiLineBishop1--;
                     userChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                 }
                 while((Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " ")||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "B") ||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "Q") ||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "N") ||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "P") ||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "K") ||
                         Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], "R")) &&
                         tempAiBishop1 != 7 && tempAiLineBishop1 != 0){
                     if(movingSlotY == tempAiLineBishop1 && movingSlotX == tempAiBishop1){
                         movable = true;
                         if(chessBoard[tempAiLineBishop1][tempAiBishop1].equals(chessBoard[LK][K])){
                             userCheckAttacker = "B1";
                             userCheckAttackers++;
                             CheckTest(4);
                         }
                     }
                     tempAiBishop1++;
                     tempAiLineBishop1--;
                     userChessBoard[tempAiLineBishop1][tempAiBishop1] = "X";
                 }
                 if((!Objects.equals(chessBoard[tempAiLineBishop1][tempAiBishop1], " "))){
                     tempAiBishop1--;
                     tempAiLineBishop1++;
                 }
             }
             validNorthEastAiBishop1 = tempAiBishop1;
             validNorthEastLineB1 = tempAiLineBishop1;
             // System.out.println("Last valid northeast coordinates : " + validNorthEastAiBishop1 + "," + validNorthEastLineB1);
         }

    }
    void CheckTest(int codeBlock){
        switch (codeBlock){
            case 1 -> {
                tempAiBishop1 = b1;
                tempAiLineBishop1 = Lb1;
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
                tempAiBishop1 = b1;
                tempAiLineBishop1 = Lb1;
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
                tempAiBishop1 = b1;
                tempAiLineBishop1 = Lb1;
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
                tempAiBishop1 = b1;
                tempAiLineBishop1 = Lb1;
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
