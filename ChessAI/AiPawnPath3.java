import java.util.Objects;

public class AiPawnPath3 extends Main{
    AiPawnPath3(){
        if(P3 != -1 && LP3 != -1 && Lk != -1 && k != -1){
            // System.out.println("Ai Pawn 3 location:" + P3 + "," + LP3);
            tempAiPawn1 = P3;
            tempAiLinePawn1 = LP3;
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
                            checkAttacker = "P3";
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
                            checkAttacker = "P3";
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

