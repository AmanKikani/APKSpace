import java.util.Objects;

public class AiPawnPath4 extends Main{
    AiPawnPath4(){
        if(P4 != -1 && LP4 != -1 && Lk != -1 && k != -1){
            // System.out.println("Ai Pawn 1 location:" + P4 + "," + LP4);
            tempAiPawn1 = P4;
            tempAiLinePawn1 = LP4;
            if (tempAiLinePawn1 == 1 && ((chessBoard[tempAiLinePawn1 + 2][tempAiPawn1]).equals(" ")) &&
                    ((chessBoard[tempAiLinePawn1 - 1][tempAiPawn1]).equals(" "))){
                validPawnSpot = tempAiPawn1;
                validPawnLine = tempAiLinePawn1 + 2;
                if(movingSlotY == validPawnLine && movingSlotX == validPawnSpot){
                    movable = true;
                }
            }
            if (tempAiLinePawn1 != 7 && ((chessBoard[tempAiLinePawn1 + 1][tempAiPawn1]).equals(" "))){
                validPawnSpot = tempAiPawn1;
                validPawnLine = tempAiLinePawn1 + 1;
                if (movingSlotY == validPawnLine && movingSlotX == validPawnSpot){
                    movable = true;
                }
            }
            if (tempAiPawn1 != 7 && tempAiLinePawn1 != 7){
                if(chessBoard[tempAiLinePawn1 + 1][tempAiPawn1 + 1].equals("b") ||
                        chessBoard[tempAiLinePawn1 + 1][tempAiPawn1 + 1].equals("q") ||
                        chessBoard[tempAiLinePawn1 + 1][tempAiPawn1 + 1].equals("k") ||
                        chessBoard[tempAiLinePawn1 + 1][tempAiPawn1 + 1].equals("r") ||
                        chessBoard[tempAiLinePawn1 + 1][tempAiPawn1 + 1].equals("p") ||
                        chessBoard[tempAiLinePawn1 + 1][tempAiPawn1 + 1].equals("n")){
                    validPawnSpot = tempAiPawn1 + 1;
                    validPawnLine = tempAiLinePawn1 + 1;
                    if(movingSlotY == validPawnLine && movingSlotX == validPawnSpot){
                        movable = true;
                        if(tempAiLinePawn1 == Lk && tempAiPawn1 == k){
                            checkAttacker = "P4";
                            checkAttackers++;
                        }
                    }
                    aiChessBoard[validPawnLine][validPawnSpot] = "X";
                }
                else{
                    aiChessBoard[tempAiLinePawn1 + 1][tempAiPawn1 + 1] = "X";
                }
            }
            if (tempAiPawn1 != 0 && tempAiLinePawn1 != 7){
                if (chessBoard[tempAiLinePawn1 + 1][tempAiPawn1 - 1].equals("b") ||
                        chessBoard[tempAiLinePawn1 + 1][tempAiPawn1 - 1].equals("q") ||
                        chessBoard[tempAiLinePawn1 + 1][tempAiPawn1 - 1].equals("k") ||
                        chessBoard[tempAiLinePawn1 + 1][tempAiPawn1 - 1].equals("r") ||
                        chessBoard[tempAiLinePawn1 + 1][tempAiPawn1 - 1].equals("p") ||
                        chessBoard[tempAiLinePawn1 + 1][tempAiPawn1 - 1].equals("n")){
                    validPawnLine = tempAiLinePawn1 + 1;
                    validPawnSpot = tempAiPawn1 - 1;
                    if(movingSlotY == validPawnLine && movingSlotX == validPawnSpot){
                        movable = true;
                        if(tempAiLinePawn1 == Lk && tempAiPawn1 == k){
                            checkAttacker = "P4";
                            checkAttackers++;
                        }
                    }
                    aiChessBoard[validPawnLine][validPawnSpot] = "X";
                }
                else{
                    aiChessBoard[tempAiLinePawn1 + 1][tempAiPawn1 - 1] = "X";
                }
            }
        }
    }
}
