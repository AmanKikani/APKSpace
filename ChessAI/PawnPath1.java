import java.util.Objects;

public class PawnPath1 extends Main{
    PawnPath1(){
        if (p1 != -1 && Lp1 != -1 && LK != -1 && K != -1){
            // System.out.println("Pawn 1 location:" + p1 + "," + Lp1);
            tempAiPawn1 = p1;
            tempAiLinePawn1 = Lp1;
            if (tempAiLinePawn1 == 6 && ((chessBoard[tempAiLinePawn1 - 2][tempAiPawn1]).equals(" ")) &&
                    ((chessBoard[tempAiLinePawn1 - 1][tempAiPawn1]).equals(" "))){
                validPawnSpot = tempAiPawn1;
                validPawnLine = tempAiLinePawn1 - 2;
                if(movingSlotX == validPawnSpot && movingSlotY == validPawnLine){
                    movable = true;
                }

            }
            if (tempAiLinePawn1 !=  0 && ((chessBoard[tempAiLinePawn1 - 1][tempAiPawn1]).equals(" "))){
                validPawnSpot = tempAiPawn1;
                validPawnLine = tempAiLinePawn1 - 1;
                if (movingSlotX == validPawnSpot && movingSlotY == validPawnLine){
                    movable = true;
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
                        movable = true;
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
                        movable = true;
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