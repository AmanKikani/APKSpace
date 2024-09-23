import java.util.Objects;

public class KnightPath1 extends Main{
    KnightPath1(){
        if (n1 != -1 && Ln1 != -1 && LK != -1 && K != -1){
            // System.out.println("User Knight Location");
            // System.out.println(n1 + "," + Ln1);
            tempAiKnight1 = n1;
            tempAiLineKnight1 = Ln1;
            // Left 2, Up 1
            if (tempAiKnight1 > 1 && tempAiLineKnight1 >= 1){
                if (Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2], " ") ||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2], "B")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2], "R")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2], "N")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2], "Q")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2], "K")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2], "P")){
                    // System.out.println("Left 2, Up 1 is valid");
                    userChessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 1] = "X";
                    if(movingSlotY == tempAiLineKnight1 - 1 && movingSlotX == tempAiKnight1 - 2){
                        movable = true;
                    }
                }
                else{
                    userChessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2] = "X";
                    // System.out.println("Left 2, Up 1 is not valid");
                }
            }
            else{
                // System.out.println("Left 2, Up 1 is not valid");
            }

            // Left 2, Down 1
            if (tempAiKnight1 > 1 && tempAiLineKnight1 <= 6){
                if (Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2], " ") ||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2], "B")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2], "R")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2], "N")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2], "Q")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2], "K")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2], "P")){
                    // System.out.println("Left 2, Down 1 is valid");
                    userChessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2] = "X";
                    if(movingSlotY == tempAiLineKnight1 + 1 && movingSlotX == tempAiKnight1 - 2){
                        movable = true;
                    }
                }
                else{
                    // System.out.println("Left 2, Down 1 is not valid");
                }
            }
            else{
                // System.out.println("Left 2, Down 1 is not valid");
            }
            // Right 2, Up 1
            if (tempAiKnight1 < 6 && tempAiLineKnight1 >= 1){
                if (Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2], " ") ||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2], "B")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2], "R")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2], "N")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2], "Q")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2], "K")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2], "P")){
                    // System.out.println("Right 2, Up 1 is valid");
                    userChessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2] = "X";
                    if(movingSlotY == tempAiLineKnight1 - 1 && movingSlotX == tempAiKnight1 + 2){
                        movable = true;
                    }

                }
                else{
                    userChessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2] = "X";
                    // System.out.println("Right 2, Up 1 is not valid");
                }
            }
            else{
                // System.out.println("Right 2, Up 1 is not valid");
            }
            // Right 2, Down 1
            if (tempAiKnight1 < 6 && tempAiLineKnight1 <= 6){
                if (Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2], " ") ||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2], "B")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2], "R")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2], "N")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2], "Q")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2], "K")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2], "P")){
                    // System.out.println("Right 2, Down 1 is valid");
                    userChessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2] = "X";
                    if(movingSlotY == tempAiLineKnight1 + 1 && movingSlotX == tempAiKnight1 + 2){
                        movable = true;
                    }
                }
                else{
                    userChessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2] = "X";
                    // System.out.println("Right 2, Down 1 is not valid");
                }
            }
            else{
                // System.out.println("Right 2, Down 1 is not valid");
            }
            // Up 2, Right 1
            if (tempAiKnight1 <= 6 && tempAiLineKnight1 >= 2){
                if (Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1], " ") ||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1], "B")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1], "R")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1], "N")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1], "Q")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1], "K")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1], "P")){
                    // System.out.println("Up 2, Right 1 is valid");
                    userChessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1] = "X";
                    if(movingSlotY == tempAiLineKnight1 - 2 && movingSlotX == tempAiKnight1 + 1){
                        movable = true;
                    }
                }
                else{
                    userChessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1] = "X";
                    // System.out.println("Up 2, Right 1 is not valid");
                }
            }
            else{
                // System.out.println("Up 2, Right 1 is not valid");
            }
            // Up 2, Left 1
            if (tempAiKnight1 >= 1 && tempAiLineKnight1 < 6){
                if (Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], " ") ||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "B")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "R")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "N")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "Q")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "K")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "P")){
                    // System.out.println("Up 2, Left 1 is valid");
                    userChessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1] = "X";
                    if(movingSlotY == tempAiLineKnight1 - 2 && movingSlotX == tempAiKnight1 - 1){
                        movable = true;
                    }
                }
                else{
                    userChessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1] = "X";
                    // System.out.println("Up 2, Left 1 is not valid");
                }
            }
            else{
                // System.out.println("Up 2, Left 1 is not valid");
            }
            // Down 2, Right 1
            if (tempAiKnight1 <= 6 && tempAiLineKnight1 < 6){
                if (Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1], " ") ||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1], "B")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1], "R")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1], "N")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1], "Q")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1], "K")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1], "P")){
                    // System.out.println("Down 2, Right 1 is valid");
                    userChessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1] = "X";
                    if(movingSlotY == tempAiLineKnight1 + 2 && movingSlotX == tempAiKnight1 + 1){
                        movable = true;
                    }
                }
                else{
                    userChessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1] = "X";
                    // System.out.println("Down 2, Right 1 is not valid");
                }
            }
            else{
                // System.out.println("Down 2, Right 1 is not valid");
            }
            // Down 2, Left 1
            if (tempAiKnight1 >= 1 && tempAiLineKnight1 < 6){
                if (Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], " ") ||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "B")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "R")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "N")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "Q")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "K")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "P")){
                    // System.out.println("Down 2, Left 1 is valid");
                    userChessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1] = "X";
                    if(movingSlotY == tempAiLineKnight1 + 2 && movingSlotX == tempAiKnight1 - 1){
                        movable = true;
                    }
                }
                else{
                    userChessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1] = "X";
                    // System.out.println("Down 2, Left 1 is not valid");
                }
            }
            else{
                // System.out.println("Down 2, Left 1 is not valid");
            }
        }
    }
}
