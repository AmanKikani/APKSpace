import java.util.Objects;

public class AiKingPath extends Main{
    AiKingPath(){
        if (LK != -1 && K != -1){
            // System.out.println("Ai Kind Location");
            // System.out.println(K + "," + LK);
            tempKing = K;
            tempKingLine = LK;
            // Up detection
            if (tempKingLine >= 1){
                if (Objects.equals(userChessBoard[tempKingLine - 1][tempKing], " ") &&
                        (Objects.equals(chessBoard[tempKingLine - 1][tempKing], " ")||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing], "b") ||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing], "q") ||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing], "n") ||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing], "p") ||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing], "k") ||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing], "r"))){
                    validKingUpLine = tempKingLine - 1;
                    validKingUp = tempKing;
                    // System.out.println("Up is valid");
                    aiChessBoard[validKingUpLine][validKingUp] = "X";
                    if(movingSlotY == validKingUpLine && movingSlotX == validKingUp){
                        movable = true;
                    }            }
                else if(userChessBoard[tempKingLine - 1][tempKing].equals(" ")){
                    aiChessBoard[tempKingLine - 1][tempKing] = "X";
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
                if (Objects.equals(userChessBoard[tempKingLine + 1][tempKing], " ") &&
                        (Objects.equals(chessBoard[tempKingLine + 1][tempKing], "b") ||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing], "q") ||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing], "n") ||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing], "p") ||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing], "k") ||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing], "r") ||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing], " "))){
                    validKingDownLine = tempKingLine + 1;
                    validKingDown = tempKing;
                    // System.out.println("Down is valid");
                    aiChessBoard[validKingDownLine][validKingDown] = "X";
                    if(movingSlotY == validKingDownLine && movingSlotX == validKingDown){
                        movable = true;
                    }            }
                else if(userChessBoard[tempKingLine + 1][tempKing].equals(" ")){
                    aiChessBoard[tempKingLine + 1][tempKing] = "X";
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
                if(Objects.equals(userChessBoard[tempKingLine][tempKing + 1], " ") &&
                        (Objects.equals(chessBoard[tempKingLine][tempKing + 1], " ")||
                                Objects.equals(chessBoard[tempKingLine][tempKing + 1], "b") ||
                                Objects.equals(chessBoard[tempKingLine][tempKing + 1], "q") ||
                                Objects.equals(chessBoard[tempKingLine][tempKing + 1], "n") ||
                                Objects.equals(chessBoard[tempKingLine][tempKing + 1], "p") ||
                                Objects.equals(chessBoard[tempKingLine][tempKing + 1], "k") ||
                                Objects.equals(chessBoard[tempKingLine][tempKing + 1], "r"))){
                    validKingRightLine = tempKingLine;
                    validKingRight = tempKing + 1;
                    // System.out.println("Right is valid");
                    aiChessBoard[validKingRightLine][validKingRight] = "X";
                    if(movingSlotY == validKingRightLine && movingSlotX == validKingRight){
                        movable = true;
                    }            }
                else if(userChessBoard[tempKingLine][tempKing + 1].equals(" ")){
                    aiChessBoard[tempKingLine][tempKing + 1] = "X";
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
                if(Objects.equals(userChessBoard[tempKingLine][tempKing - 1], " ") &&
                        (Objects.equals(chessBoard[tempKingLine][tempKing - 1], " ")||
                                Objects.equals(chessBoard[tempKingLine][tempKing - 1], "b") ||
                                Objects.equals(chessBoard[tempKingLine][tempKing - 1], "q") ||
                                Objects.equals(chessBoard[tempKingLine][tempKing - 1], "n") ||
                                Objects.equals(chessBoard[tempKingLine][tempKing - 1], "p") ||
                                Objects.equals(chessBoard[tempKingLine][tempKing - 1], "k") ||
                                Objects.equals(chessBoard[tempKingLine][tempKing - 1], "r")))
                {
                    validKingLeftLine = tempKingLine;
                    validKingLeft = tempKing - 1;
                    // System.out.println("Left is valid");
                    aiChessBoard[validKingLeftLine][validKingLeft] = "X";
                    if(movingSlotY == validKingLeftLine && movingSlotX == validKingLeft){
                        movable = true;
                    }            }
                else{
                    // System.out.println("Left is not valid");
                }
            }
            else{
                // System.out.println("Left is not valid");
            }
            // Northwest Detection
            if(tempKing >= 1 && tempKingLine >= 1){
                if(Objects.equals(userChessBoard[tempKingLine - 1][tempKing - 1] , " ") &&
                        (Objects.equals(chessBoard[tempKingLine - 1][tempKing - 1], " ")||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing - 1], "b") ||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing - 1], "q") ||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing - 1], "n") ||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing - 1], "p") ||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing - 1], "k") ||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing - 1], "r"))){
                    validKingNWLine = tempKingLine - 1;
                    validKingNW = tempKing - 1;
                    // System.out.println("NW King is valid");
                    aiChessBoard[validKingNWLine][validKingNW] = "X";
                    if(movingSlotY == validKingNWLine && movingSlotX == validKingNW){
                        movable = true;
                    }            }
                else if(userChessBoard[tempKingLine - 1][tempKing - 1].equals(" ")){
                    aiChessBoard[tempKingLine - 1][tempKing - 1] = "X";
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
                if(Objects.equals(userChessBoard[tempKingLine - 1][tempKing + 1] , " ") &&
                        (Objects.equals(chessBoard[tempKingLine - 1][tempKing + 1], " ")||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing + 1], "b") ||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing + 1], "q") ||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing + 1], "n") ||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing + 1], "p") ||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing + 1], "k") ||
                                Objects.equals(chessBoard[tempKingLine - 1][tempKing + 1], "r"))){
                    validKingNELine = tempKingLine - 1;
                    validKingNE = tempKing + 1;
                    // System.out.println("NE King is valid");
                    aiChessBoard[validKingNELine][validKingNE] = "X";
                    if(movingSlotY == validKingNELine && movingSlotX == validKingNE){
                        movable = true;
                    }            }
                else if(userChessBoard[tempKingLine - 1][tempKing + 1].equals(" ")){
                    aiChessBoard[tempKingLine - 1][tempKing + 1] = "X";
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
                if(Objects.equals(userChessBoard[tempKingLine + 1][tempKing - 1] , " ") &&
                        (Objects.equals(chessBoard[tempKingLine + 1][tempKing - 1], " ")||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing - 1], "b") ||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing - 1], "q") ||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing - 1], "n") ||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing - 1], "p") ||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing - 1], "k") ||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing - 1], "r"))){
                    validKingNELine = tempKingLine + 1;
                    validKingNE = tempKing - 1;
                    // System.out.println("SW King is valid");
                    aiChessBoard[validKingSWLine][validKingSW] = "X";
                    if(movingSlotY == validKingSWLine && movingSlotX == validKingSW){
                        movable = true;
                    }            }
                else if(userChessBoard[tempKingLine + 1][tempKing - 1].equals(" ")){
                    aiChessBoard[tempKingLine + 1][tempKing - 1] = "X";
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
                if(Objects.equals(userChessBoard[tempKingLine + 1][tempKing + 1] , " ") &&
                        (Objects.equals(chessBoard[tempKingLine + 1][tempKing + 1], " ")||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing + 1], "b") ||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing + 1], "q") ||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing + 1], "n") ||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing + 1], "p") ||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing + 1], "k") ||
                                Objects.equals(chessBoard[tempKingLine + 1][tempKing + 1], "r"))){
                    validKingNELine = tempKingLine + 1;
                    validKingNE = tempKing + 1;
                    // System.out.println("SE King is valid");
                    aiChessBoard[validKingSELine][validKingSE] = "X";
                    if(movingSlotY == validKingSELine && movingSlotX == validKingSE){
                        movable = true;
                    }            }
                else if(userChessBoard[tempKingLine + 1][tempKing + 1].equals(" ")){
                    aiChessBoard[tempKingLine + 1][tempKing + 1] = "X";
                }
                else{
                    // System.out.println("SE King is not valid");
                }

            }
            else{
                // System.out.println("SE King is not valid");
            }
            if(!movable && userChessBoard[tempKingLine][tempKing].equals("X")){
                checkmate = true;
            }
            if(userChessBoard[tempKingLine][tempKing].equals("X")){
                AiCheck = true;
                // System.out.println("I am here");
                // System.out.println(userChessBoard[tempKingLine][tempKing]);
                // System.out.println("I am here");
            }
        }

    }
}
