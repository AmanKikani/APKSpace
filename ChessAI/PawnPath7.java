import java.util.Objects;

public class PawnPath7 extends Main{
    PawnPath7(){
        if (p7 != -1 && Lp7 != -1 && LK != -1 && K != -1){
            // System.out.println("Pawn 7 location:" + p7 + "," + Lp7);
            tempAiPawn1 = p7;
            tempAiLinePawn1 = Lp7;
            if (tempAiLinePawn1 == 6 && ((chessBoard[tempAiLinePawn1 - 2][tempAiPawn1]).equals(" ")) &&
                    ((chessBoard[tempAiLinePawn1 - 1][tempAiPawn1]).equals(" "))){
                validPawnSpot = tempAiPawn1;
                validPawnLine = tempAiLinePawn1 - 2;
                if(movingSlotX == validPawnSpot && movingSlotY == validPawnLine){
                    movable = true; // System.out.println("case");
                }
                else{

                }
            }
            if (tempAiLinePawn1 !=  0 && ((chessBoard[tempAiLinePawn1 - 1][tempAiPawn1]).equals(" "))){
                validPawnSpot = tempAiPawn1;
                validPawnLine = tempAiLinePawn1 - 1;
                if (movingSlotX == validPawnSpot && movingSlotY == validPawnLine){
                    movable = true; // System.out.println("case");
                }
                else{

                }
            }
            if (tempAiPawn1 != 7 && tempAiLinePawn1 != 0){
                if(chessBoard[tempAiLinePawn1 - 1][tempAiPawn1 + 1].equals("B") ||
                        chessBoard[tempAiLinePawn1 - 1][tempAiPawn1 + 1].equals("Q") ||
                        chessBoard[tempAiLinePawn1 - 1][tempAiPawn1 + 1].equals("K") ||
                        chessBoard[tempAiLinePawn1 - 1][tempAiPawn1 + 1].equals("R") ||
                        chessBoard[tempAiLinePawn1 - 1][tempAiPawn1 + 1].equals("P") ||
                        chessBoard[tempAiLinePawn1 - 1][tempAiPawn1 + 1].equals("N")){
                    validPawnSpot = tempAiPawn1 + 1;
                    validPawnLine = tempAiLinePawn1 - 1;
                    if(movingSlotX == validPawnSpot && movingSlotY == validPawnLine){
                        movable = true; // System.out.println("case");
                    }
                    else{

                    }
                    userChessBoard[validPawnLine][validPawnSpot] = "X";
                }
                else{
                    userChessBoard[tempAiLinePawn1 - 1][tempAiPawn1 + 1] = "X";
                }
            }
            if (tempAiPawn1 != 0 && tempAiLinePawn1 != 0){
                if (chessBoard[tempAiLinePawn1 - 1][tempAiPawn1 - 1].equals("B") ||
                        chessBoard[tempAiLinePawn1 - 1][tempAiPawn1 - 1].equals("Q") ||
                        chessBoard[tempAiLinePawn1 - 1][tempAiPawn1 - 1].equals("K") ||
                        chessBoard[tempAiLinePawn1 - 1][tempAiPawn1 - 1].equals("R") ||
                        chessBoard[tempAiLinePawn1 - 1][tempAiPawn1 - 1].equals("P") ||
                        chessBoard[tempAiLinePawn1 - 1][tempAiPawn1 - 1].equals("N")){
                    validPawnLine = tempAiLinePawn1 - 1;
                    validPawnSpot = tempAiPawn1 - 1;
                    if(movingSlotX == validPawnSpot && movingSlotY == validPawnLine){
                        movable = true; // System.out.println("case");
                    }
                    else{

                    }
                    userChessBoard[validPawnLine][validPawnSpot] = "X";
                }
                else{
                    userChessBoard[tempAiLinePawn1 - 1][tempAiPawn1 - 1] = "X";
                }
            }
        }
    }
}