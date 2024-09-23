import java.util.Objects;

public class AiKnightPath1 extends Main{
    AiKnightPath1(){
        if (LN != -1 && N1 != -1 && Lk != -1 && k != -1){
            // System.out.println("Ai Knight Location");
            // System.out.println(N1 + "," + LN);
            tempAiKnight1 = N1;
            tempAiLineKnight1 = LN;
            // Left 2, Up 1
            if (tempAiKnight1 > 1 && tempAiLineKnight1 >= 1){
                if (Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2], " ") ||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2], "b")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2], "r")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2], "n")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2], "q")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2], "k")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2], "p")){
                    // System.out.println("Left 2, Up 1 is valid");
                    aiChessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2] = "X";
                    if(movingSlotY == tempAiLineKnight1 - 1 && movingSlotX == tempAiKnight1 - 2){
                        movable = true;
                        if(tempAiKnight1 - 2 == k && tempAiLineKnight1 - 1 == Lk){
                            checkAttacker = "N1";
                            checkAttackers++;
                        }
                    }
                }
                else{
                    aiChessBoard[tempAiLineKnight1 - 1][tempAiKnight1 - 2] = "X";
                    // System.out.println("Left 2, Up 1 is not valid");
                }
            }
            else{
                // System.out.println("Left 2, Up 1 is not valid");
            }

            // Left 2, Down 1
            if (tempAiKnight1 > 1 && tempAiLineKnight1 <= 6){
                if (Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2], " ") ||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2], "b")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2], "r")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2], "n")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2], "q")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2], "k")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2], "p")){
                    // System.out.println("Left 2, Down 1 is valid");
                    aiChessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2] = "X";
                    if(movingSlotY == tempAiLineKnight1 + 1 && movingSlotX == tempAiKnight1 - 2){
                        movable = true;
                        if(tempAiKnight1 - 2 == k && tempAiLineKnight1 + 1 == Lk){
                            checkAttacker = "N1";
                            checkAttackers++;
                        }
                    }
                }
                else{
                    aiChessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 2] = "X";
                    // System.out.println("Left 2, Down 1 is not valid");
                }
            }
            else{
                // System.out.println("Left 2, Down 1 is not valid");
            }
            // Right 2, Up 1
            if (tempAiKnight1 < 6 && tempAiLineKnight1 >= 1){
                if (Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2], " ") ||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2], "b")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2], "r")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2], "n")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2], "q")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2], "k")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2], "p")){
                    // System.out.println("Right 2, Up 1 is valid");
                    aiChessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2] = "X";
                    if(movingSlotY == tempAiLineKnight1 - 1 && movingSlotX == tempAiKnight1 + 2){
                        movable = true;
                        if(tempAiKnight1 + 2 == k && tempAiLineKnight1 - 1 == Lk){
                            checkAttacker = "N1";
                            checkAttackers++;
                        }
                    }
                }
                else{
                    aiChessBoard[tempAiLineKnight1 - 1][tempAiKnight1 + 2] = "X";
                    // System.out.println("Right 2, Up 1 is not valid");
                }
            }
            else{
                // System.out.println("Right 2, Up 1 is not valid");
            }
            // Right 2, Down 1
            if (tempAiKnight1 < 6 && tempAiLineKnight1 <= 6){
                if (Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2], " ") ||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2], "b")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2], "r")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2], "n")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2], "q")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2], "k")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2], "p")){
                    // System.out.println("Right 2, Down 1 is valid");
                    aiChessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2] = "X";
                    if(movingSlotY == tempAiLineKnight1 + 1 && movingSlotX == tempAiKnight1 + 2){
                        movable = true;
                        if(tempAiKnight1 + 2 == k && tempAiLineKnight1 + 1 == Lk){
                            checkAttacker = "N1";
                            checkAttackers++;
                        }
                    }
                }
                else{
                    aiChessBoard[tempAiLineKnight1 + 1][tempAiKnight1 + 2] = "X";
                    // System.out.println("Right 2, Down 1 is not valid");
                }
            }
            else{
                // System.out.println("Right 2, Down 1 is not valid");
            }
            // Up 2, Right 1
            if (tempAiKnight1 <= 6 && tempAiLineKnight1 >= 2){
                if (Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1], " ") ||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1], "b")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1], "r")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1], "n")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1], "q")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1], "k")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1], "p")){
                    // System.out.println("Up 2, Right 1 is valid");
                    aiChessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1] = "X";
                    if(movingSlotY == tempAiLineKnight1 - 2 && movingSlotX == tempAiKnight1 + 1){
                        movable = true;
                        if(tempAiKnight1 + 1 == k && tempAiLineKnight1 - 2 == Lk){
                            checkAttacker = "N1";
                            checkAttackers++;
                        }
                    }
                }
                else{
                    aiChessBoard[tempAiLineKnight1 - 2][tempAiKnight1 + 1] = "X";
                    // System.out.println("Up 2, Right 1 is not valid");
                }
            }
            else{
                // System.out.println("Up 2, Right 1 is not valid");
            }
            // Up 2, Left 1
            if (tempAiKnight1 >= 1 && tempAiLineKnight1 >= 2){
                if (Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 - 1], " ") ||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 - 1], "b")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 - 1], "r")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 - 1], "n")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 - 1], "q")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 - 1], "k")||
                        Objects.equals(chessBoard[tempAiLineKnight1 - 2][tempAiKnight1 - 1], "p")){
                    // System.out.println("Up 2, Left 1 is valid");
                    aiChessBoard[tempAiLineKnight1 - 2][tempAiKnight1 - 1] = "X";
                    if(movingSlotY == tempAiLineKnight1 - 2 && movingSlotX == tempAiKnight1 - 1){
                        movable = true;
                        if(tempAiKnight1 - 1 == k && tempAiLineKnight1 - 2 == Lk){
                            checkAttacker = "N1";
                            checkAttackers++;
                        }
                    }
                }
                else{
                    aiChessBoard[tempAiLineKnight1 - 2][tempAiKnight1 - 1] = "X";
                    // System.out.println("Up 2, Left 1 is not valid");
                }
            }
            else{
                // System.out.println("Up 2, Left 1 is not valid");
            }
            // Down 2, Right 1
            if (tempAiKnight1 <= 6 && tempAiLineKnight1 < 6){
                if (Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1], " ") ||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1], "b")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1], "r")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1], "n")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1], "q")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1], "k")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1], "p")){
                    // System.out.println("Down 2, Right 1 is valid");
                    aiChessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1] = "X";
                    if(movingSlotY == tempAiLineKnight1 + 2 && movingSlotX == tempAiKnight1 + 1){
                        movable = true;
                        if(tempAiKnight1 + 1 == k && tempAiLineKnight1 + 2 == Lk){
                            checkAttacker = "N1";
                            checkAttackers++;
                        }
                    }
                }
                else{
                    aiChessBoard[tempAiLineKnight1 + 2][tempAiKnight1 + 1] = "X";
                    // System.out.println("Down 2, Right 1 is not valid");
                }
            }
            else{
                // System.out.println("Down 2, Right 1 is not valid");
            }
            // Down 2, Left 1
            if (tempAiKnight1 >= 1 && tempAiLineKnight1 < 6){
                if (Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], " ") ||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "b")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "r")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "n")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "q")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "k")||
                        Objects.equals(chessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1], "p")){
                    // System.out.println("Down 2, Left 1 is valid");
                    aiChessBoard[tempAiLineKnight1 + 2][tempAiKnight1 - 1] = "X";
                    if(movingSlotY == tempAiLineKnight1 + 2 && movingSlotX == tempAiKnight1 - 1){
                        movable = true;
                        if(tempAiKnight1 - 1 == k && tempAiLineKnight1 + 2 == Lk){
                            checkAttacker = "N1";
                            checkAttackers++;
                        }
                    }
                }
                else{
                    aiChessBoard[tempAiLineKnight1 + 1][tempAiKnight1 - 1] = "X";
                    // System.out.println("Down 2, Left 1 is not valid");
                }
            }
            else{
                // System.out.println("Down 2, Left 1 is not valid");
            }
        }

    }
}
