import java.util.Objects;

public class KingPath extends Main{
    KingPath(){
        if (k != -1 && Lk != -1){
            // System.out.println("User King Location");
            // System.out.println(k + "," + Lk);
            tempKing = k;
            tempKingLine = Lk;
            // Up detection
            if (tempKingLine >= 1){
                if ((Objects.equals(chessBoard[tempKingLine - 1][tempKing], " ")||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing], "B") ||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing], "Q") ||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing], "N") ||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing], "P") ||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing], "K") ||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing], "R")) && Objects.equals(aiChessBoard
                        [tempKingLine - 1][tempKing], " ")){
                    validKingUpLine = tempKingLine - 1;
                    validKingUp = tempKing;
                    // System.out.println("Up is valid");
                    userChessBoard[validKingUpLine][validKingUp] = "X";
                    if(movingSlotY == validKingUpLine && movingSlotX == validKingUp){
                        movable = true;
                    }            }
                else if(aiChessBoard[tempKingLine - 1][tempKing].equals(" ")){
                    userChessBoard[tempKingLine - 1][tempKing].equals("X");
                }
                else{
                    // System.out.println("Up is not valid");
                }
            }
            else{
                // System.out.println("Up is not valid");
            }
            //Down Detection
            if (tempKingLine <= 6){
                if ((Objects.equals(chessBoard[tempKingLine + 1][tempKing], " ")||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing], "B") ||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing], "Q") ||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing], "N") ||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing], "P") ||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing], "K") ||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing], "R")) && Objects.equals(aiChessBoard
                        [tempKingLine + 1][tempKing], " ")){
                    validKingDownLine = tempKingLine + 1;
                    validKingDown = tempKing;
                    // System.out.println("Down is valid");
                    userChessBoard[validKingDownLine][validKingDown] = "X";
                    if(movingSlotY == validKingDownLine && movingSlotX == validKingDown){
                        movable = true;
                    }            }
                else if(aiChessBoard[tempKingLine + 1][tempKing].equals(" ")){
                    userChessBoard[tempKingLine + 1][tempKing].equals("X");
                }
                else{
                    // System.out.println("Down is not valid");
                }
            }
            else{
                // System.out.println("Down is not valid");
            }
            // Right Detection
            if (tempKing <= 6){
                if((Objects.equals(chessBoard[tempKingLine][tempKing + 1], " ")||
                        Objects.equals(chessBoard[tempKingLine][tempKing + 1], "B") ||
                        Objects.equals(chessBoard[tempKingLine][tempKing + 1], "Q") ||
                        Objects.equals(chessBoard[tempKingLine][tempKing + 1], "N") ||
                        Objects.equals(chessBoard[tempKingLine][tempKing + 1], "P") ||
                        Objects.equals(chessBoard[tempKingLine][tempKing + 1], "K") ||
                        Objects.equals(chessBoard[tempKingLine][tempKing + 1], "R")) &&
                        Objects.equals(aiChessBoard[tempKingLine][tempKing + 1], " ")){
                    validKingRightLine = tempKingLine;
                    validKingRight = tempKing + 1;
                    // System.out.println("Right is valid");
                    userChessBoard[validKingRightLine][validKingRight] = "X";
                    if(movingSlotY == validKingRightLine && movingSlotX == validKingRight){
                        movable = true;
                    }            }
                else if(aiChessBoard[tempKingLine][tempKing + 1].equals(" ")){
                    userChessBoard[tempKingLine][tempKing + 1].equals("X");
                }
                else{
                    // System.out.println("Right is not valid");
                }
            }
            else{
                // System.out.println("Right is not valid");
            }
            // Left Detection
            if (tempKing >= 1){
                if((Objects.equals(chessBoard[tempKingLine][tempKing - 1], " ")||
                        Objects.equals(chessBoard[tempKingLine][tempKing - 1], "B") ||
                        Objects.equals(chessBoard[tempKingLine][tempKing - 1], "Q") ||
                        Objects.equals(chessBoard[tempKingLine][tempKing - 1], "N") ||
                        Objects.equals(chessBoard[tempKingLine][tempKing - 1], "P") ||
                        Objects.equals(chessBoard[tempKingLine][tempKing - 1], "K") ||
                        Objects.equals(chessBoard[tempKingLine][tempKing - 1], "R")) &&
                        Objects.equals(aiChessBoard[tempKingLine][tempKing - 1], " "))
                {
                    validKingLeftLine = tempKingLine;
                    validKingLeft = tempKing - 1;
                    // System.out.println("Left is valid");
                    userChessBoard[validKingLeftLine][validKingLeft] = "X";
                    if(movingSlotY == validKingLeftLine && movingSlotX == validKingLeft){
                        movable = true;
                    }            }
                else if(aiChessBoard[tempKingLine][tempKing - 1].equals(" ")){
                    userChessBoard[tempKingLine][tempKing - 1].equals("X");
                }
                else{
                    // System.out.println("Left is not valid");
                }
            }
            else{
                // System.out.println("Left is not valid");
            }
            // Northwest Detection
            if(tempKing >= 1 && tempKingLine >= 1){
                if((Objects.equals(chessBoard[tempKingLine - 1][tempKing - 1], " ")||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing - 1], "B") ||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing - 1], "Q") ||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing - 1], "N") ||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing - 1], "P") ||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing - 1], "K") ||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing - 1], "R")) &&
                        Objects.equals(aiChessBoard[tempKingLine - 1][tempKing - 1] , " ")){
                    validKingNWLine = tempKingLine - 1;
                    validKingNW = tempKing - 1;
                    // System.out.println("NW King is valid");
                    userChessBoard[validKingNWLine][validKingNW] = "X";
                    if(movingSlotY == validKingNWLine && movingSlotX == validKingNW){
                        movable = true;
                    }            }
                else if(aiChessBoard[tempKingLine - 1][tempKing - 1].equals(" ")){
                    userChessBoard[tempKingLine - 1][tempKing - 1].equals("X");
                }
                else{
                    // System.out.println("NW King is not valid");
                }

            }
            else{
                // System.out.println("NW King is not valid");
            }
            // Northeast Detection
            if(tempKing < 7 && tempKingLine >= 1){
                if((Objects.equals(chessBoard[tempKingLine - 1][tempKing + 1], " ")||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing + 1], "B") ||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing + 1], "Q") ||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing + 1], "N") ||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing + 1], "P") ||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing + 1], "K") ||
                        Objects.equals(chessBoard[tempKingLine - 1][tempKing + 1], "R")) &&
                        Objects.equals(aiChessBoard[tempKingLine - 1][tempKing + 1] , " ")){
                    validKingNELine = tempKingLine - 1;
                    validKingNE = tempKing + 1;
                    // System.out.println("NE King is valid");
                    userChessBoard[validKingNELine][validKingNE] = "X";
                    if(movingSlotY == validKingNELine && movingSlotX == validKingNE){
                        movable = true;
                    }            }
                else if(aiChessBoard[tempKingLine - 1][tempKing + 1].equals(" ")){
                    userChessBoard[tempKingLine - 1][tempKing + 1].equals("X");
                }
                else{
                    // System.out.println("NE King is not valid");
                }

            }
            else{
                // System.out.println("NE King is not valid");
            }
            // Southwest Detection
            if(tempKing >= 1 && tempKingLine < 7){
                if((Objects.equals(chessBoard[tempKingLine + 1][tempKing - 1], " ")||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing - 1], "B") ||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing - 1], "Q") ||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing - 1], "N") ||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing - 1], "P") ||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing - 1], "K") ||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing - 1], "R")) &&
                        Objects.equals(aiChessBoard[tempKingLine + 1][tempKing - 1] , " ")){
                    validKingNELine = tempKingLine + 1;
                    validKingNE = tempKing - 1;
                    // System.out.println("SW King is valid");
                    userChessBoard[validKingSWLine][validKingSW] = "X";
                    if(movingSlotY == validKingSWLine && movingSlotX == validKingSW){
                        movable = true;
                    }            }
                else if(aiChessBoard[tempKingLine + 1][tempKing - 1].equals(" ")){
                    userChessBoard[tempKingLine + 1][tempKing - 1].equals("X");
                }
                else{
                    // System.out.println("SW King is not valid");
                }

            }
            else{
                // System.out.println("SW King is not valid");
            }
            // Southeast Detection
            if(tempKing < 7 && tempKingLine < 7){
                if((Objects.equals(chessBoard[tempKingLine + 1][tempKing + 1], " ")||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing + 1], "B") ||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing + 1], "Q") ||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing + 1], "N") ||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing + 1], "P") ||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing + 1], "K") ||
                        Objects.equals(chessBoard[tempKingLine + 1][tempKing + 1], "R")) &&
                        Objects.equals(aiChessBoard[tempKingLine + 1][tempKing + 1] , " ")){
                    validKingNELine = tempKingLine + 1;
                    validKingNE = tempKing + 1;
                    // System.out.println("SE King is valid");
                    userChessBoard[validKingSELine][validKingSE] = "X";
                    if(movingSlotY == validKingSELine && movingSlotX == validKingSE){
                        movable = true;
                    }            }
                else if(aiChessBoard[tempKingLine + 1][tempKing + 1].equals(" ")){
                    userChessBoard[tempKingLine + 1][tempKing + 1].equals("X");
                }
                else{
                    // System.out.println("SE King is not valid");
                }

            }
            else{
                // System.out.println("SE King is not valid");
            }
            if(!movable && aiChessBoard[tempKingLine][tempKing].equals("X")){
                checkmate = true;
            }
            if(aiChessBoard[tempKingLine][tempKing].equals("X")){
                UserCheck = true;
                // AiPrintBoard();
                // System.out.println("LOOk here " + aiChessBoard[tempKingLine][tempKing] + " now for Lk and k " + aiChessBoard[Lk][k]);

            }
        }
    }
}
