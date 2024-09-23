import java.util.Scanner;
import java.util.Random;
public class Move extends Main{
    Move()
    {

        boolean validMove = false;
        while(!validMove) {
            ClearBoards();
            fun = fun + 1;

            if(fun == 100000){
                checkmate = true;
                validMove = true;
                PrintBoard();
                //UserPrintBoard();
                //AiPrintBoard();
                // System.out.println("100,000");
                //System.out.println("Total moves made: "  + cMoves);
            }
            /*
            else if (fun == 200000){
                PrintBoard();
                 System.out.println("200,000");
                System.out.println("Total moves made: "  + cMoves);

            }
            else if (fun == 500000){
                PrintBoard();
                 System.out.println("500,000");
                System.out.println("Total moves made: "  + cMoves);

            }
            else if(fun == 1000000){
                PrintBoard();
                 System.out.println("1,000,000");
                System.out.println("Total moves made: "  + cMoves);

            }
            else if(fun == 10000000){
                PrintBoard();
                 System.out.println("10,000,000");
                System.out.println("Total moves made: "  + cMoves);
                 System.out.println("Progress Bar Loading. . . ");
                 startTime = System.currentTimeMillis();

            }
            else if (fun == 10000001){
                System.out.println("0[X         ]100,000,00");
            }
            else if (fun == 20000000){
                endTime = System.currentTimeMillis();
                double estTime = endTime - startTime;
                estTime = estTime * 9;
                estTime = estTime / 60000;
                System.out.println("The estimated time of completion is in " + estTime + " minutes");
                System.out.println("0[XX        ]100,000,00");
                System.out.println("Total moves made: "  + cMoves);
            }
            else if (fun == 30000000){
                System.out.println("0[XXX       ]100,000,00");
                System.out.println("Total moves made: "  + cMoves);
            }
            else if (fun == 40000000){
                System.out.println("0[XXXX      ]100,000,00");
                System.out.println("Total moves made: "  + cMoves);
            }
            else if (fun == 50000000){
                System.out.println("0[XXXXX     ]100,000,00");
                System.out.println("Total moves made: "  + cMoves);
            }
            else if (fun == 60000000){
                System.out.println("0[XXXXXX    ]100,000,00");
                System.out.println("Total moves made: "  + cMoves);
            }
            else if (fun == 70000000){
                System.out.println("0[XXXXXXX   ]100,000,00");
                System.out.println("Total moves made: "  + cMoves);
            }
            else if (fun == 80000000){
                System.out.println("0[XXXXXXXX  ]100,000,00");
                System.out.println("Total moves made: "  + cMoves);
            }
            else if (fun == 90000000){
                System.out.println("0[XXXXXXXXX ]100,000,00");
                System.out.println("Total moves made: "  + cMoves);
            }
            else if(fun == 100000000){
                endTime = System.currentTimeMillis();
                totTime = endTime - startTime;
                totTime = totTime / 60000;
                System.out.println("0[XXXXXXXXXX]100,000,00");
                PrintBoard();
                System.out.println("Total time to completion is " + totTime + " minutes");
                System.out.println("100,000,000");
                System.out.println("Total moves made: "  + cMoves);
            }
            if (fun % 100000000 == 0){
                System.out.println("cMoves" + cMoves);
                System.out.println("fun" + fun);
                endTime = System.currentTimeMillis();
                totTime = endTime - startTime;
                System.out.println("Run time: " + totTime);
                PrintBoard();



            }
            */
            movable = false;
                Random rand = new Random();
                Scanner in = new Scanner(System.in);
                //// System.out.println("Enter in the space you want to move (X)");
                chosenSlotX = rand.nextInt(8);
                //chosenSlotX = in.nextInt();
                //// System.out.println("Enter in the space you want to move (Y)");
                chosenSlotY = rand.nextInt(8);
                //chosenSlotY = in.nextInt();
                //// System.out.println("Enter the place you want to move to (X)");
                movingSlotX = rand.nextInt(8);
                //movingSlotX = in.nextInt();
                //// System.out.println("Enter the place you want to move to (Y)");
                movingSlotY = rand.nextInt(8);
                //movingSlotY = in.nextInt();
                //System.out.println("Moving from " + chosenSlotX + "," + chosenSlotY + " to " + movingSlotX + "," + movingSlotY);




            if((chosenSlotY <=7) && (chosenSlotX <= 7) && (movingSlotX <= 7) && (movingSlotY <= 7)) {
                String temp = chessBoard[chosenSlotY][chosenSlotX];
                if((moves == 0) && (chessBoard[chosenSlotY][chosenSlotX].equals("b") || chessBoard[chosenSlotY][chosenSlotX].equals("n") ||
                        chessBoard[chosenSlotY][chosenSlotX].equals("p") || chessBoard[chosenSlotY][chosenSlotX].equals("k") ||
                        chessBoard[chosenSlotY][chosenSlotX].equals("q") || chessBoard[chosenSlotY][chosenSlotX].equals("r")) )
                {
                    // Even Plays
                    switch (temp) {
                        case "b" -> {
                            if(chosenSlotX == b1) {
                                BishopPath1();
                            }
                            else if(chosenSlotX == b2) {
                                BishopPath2();
                            }
                            if (movable) {
                                printMove();
                                chessBoard[movingSlotY][movingSlotX] = "b";
                                chessBoard[chosenSlotY][chosenSlotX] = " ";
                                //// System.out.println("-------");
                                //////PrintBoard();
                                //// System.out.println("-------");
                            } else {
                                //// System.out.println("Placement not valid. Try again");
                            }
                        }
                        case "r" -> {
                            if(chosenSlotX == r1) {
                                RookPath1();
                            }
                            else if (chosenSlotX == r2) {
                                RookPath2();
                            }
                            if (movable) {
                                printMove();
                                chessBoard[movingSlotY][movingSlotX] = "r";
                                chessBoard[chosenSlotY][chosenSlotX] = " ";
                                //// System.out.println("-------");
                                //PrintBoard();
                                //// System.out.println("-------");
                            }else {
                                //// System.out.println("Placement not valid. Try again");
                            }
                        }
                        case "q" -> {
                            QueenPath();
                            if (movable) {
                                printMove();
                                chessBoard[movingSlotY][movingSlotX] = "q";
                                chessBoard[chosenSlotY][chosenSlotX] = " ";
                                //// System.out.println("-------");
                                //PrintBoard();
                                //// System.out.println("-------");
                            }else {
                                //// System.out.println("Placement not valid. Try again");
                            }
                        }
                        case "n" -> {
                            if(chosenSlotX == n1) {
                                KnightPath1();
                            }
                            else if(chosenSlotX == n2) {
                                KnightPath2();
                            }
                            if (movable) {
                                printMove();
                                chessBoard[movingSlotY][movingSlotX] = "n";
                                chessBoard[chosenSlotY][chosenSlotX] = " ";
                                //// System.out.println("-------");
                                //PrintBoard();
                                //// System.out.println("-------");
                            }else {
                                //// System.out.println("Placement not valid. Try again");
                            }
                        }
                        case "k" -> {
                            KingPath();
                            if (movable) {
                                printMove();
                                chessBoard[movingSlotY][movingSlotX] = "k";
                                chessBoard[chosenSlotY][chosenSlotX] = " ";
                                //// System.out.println("-------");
                                //PrintBoard();
                                //// System.out.println("-------");
                            }else {
                                //// System.out.println("Placement not valid. Try again");
                            }
                        }
                        case "p" -> {
                            movable = false;
                            if(chosenSlotX == p1){
                                PawnPath1();
                            }
                            else if(chosenSlotX == p2){
                                PawnPath2();
                            }
                            else if(chosenSlotX == p3){
                                PawnPath3();
                            }
                            else if(chosenSlotX == p4){
                                PawnPath4();
                            }
                            else if(chosenSlotX == p5){
                                PawnPath5();
                            }
                            else if(chosenSlotX == p6){
                                PawnPath6();
                            }
                            else if(chosenSlotX == p7){
                                PawnPath7();
                            }
                            else if (chosenSlotX == p8){
                                PawnPath8();
                            }
                            if (movable) {
                                printMove();
                                chessBoard[movingSlotY][movingSlotX] = "p";
                                chessBoard[chosenSlotY][chosenSlotX] = " ";
                                //// System.out.println("-------");
                                //PrintBoard();
                                //// System.out.println("-------");
                            }else {
                                //// System.out.println("Placement not valid. Try again");
                            }
                        }
                    }
                    if(movable){
                        cMoves++;
                    }
                }
                else if ((moves == 1)&& (chessBoard[chosenSlotY][chosenSlotX].equals("B") || chessBoard[chosenSlotY][chosenSlotX].equals("N") ||
                        chessBoard[chosenSlotY][chosenSlotX].equals("P") || chessBoard[chosenSlotY][chosenSlotX].equals("K") ||
                        chessBoard[chosenSlotY][chosenSlotX].equals("Q") || chessBoard[chosenSlotY][chosenSlotX].equals("R")) ) {
                    // Odd Plays

                    switch (temp) {
                        case "B" -> {
                            if(chosenSlotX == B1) {
                                AiBishopPath1();
                            }
                            else if(chosenSlotX == B2) {
                                AiBishopPath2();
                            }
                            if (movable) {
                                printMove();
                                chessBoard[movingSlotY][movingSlotX] = "B";
                                chessBoard[chosenSlotY][chosenSlotX] = " ";
                                //// System.out.println("-------");
                                //PrintBoard();
                                //// System.out.println("-------");
                            } else {
                                //// System.out.println("Placement not valid. Try again");
                            }
                        }
                        case "R" -> {
                            if(chosenSlotX == R1) {
                                AiRookPath1();
                            }
                            else if(chosenSlotX == R2) {
                                AiRookPaths2();
                            }
                            if (movable) {
                                printMove();
                                chessBoard[movingSlotY][movingSlotX] = "R";
                                chessBoard[chosenSlotY][chosenSlotX] = " ";
                                //// System.out.println("-------");
                                //PrintBoard();
                                //// System.out.println("-------");
                            }else {
                                //// System.out.println("Placement not valid. Try again");
                            }
                        }
                        case "Q" -> {
                            AiQueenPath();
                            if (movable) {
                                printMove();
                                chessBoard[movingSlotY][movingSlotX] = "Q";
                                chessBoard[chosenSlotY][chosenSlotX] = " ";
                                //// System.out.println("-------");
                                //PrintBoard();
                                //// System.out.println("-------");
                            }else {
                                //// System.out.println("Placement not valid. Try again");
                            }
                        }
                        case "N" -> {
                            if(chosenSlotX == N1) {
                                AiKnightPath1();
                            }
                            else if(chosenSlotX == N2) {
                                AiKnightPath2();
                            }
                            if (movable) {
                                printMove();
                                chessBoard[movingSlotY][movingSlotX] = "N";
                                chessBoard[chosenSlotY][chosenSlotX] = " ";
                                //// System.out.println("-------");
                                //PrintBoard();
                                //// System.out.println("-------");
                            }else {
                                //// System.out.println("Placement not valid. Try again");
                            }
                        }
                        case "K" -> {
                            AiKingPath();
                            if (movable) {
                                printMove();
                                chessBoard[movingSlotY][movingSlotX] = "K";
                                chessBoard[chosenSlotY][chosenSlotX] = " ";
                                //// System.out.println("-------");
                                //PrintBoard();
                                //// System.out.println("-------");
                            }else {
                                //// System.out.println("Placement not valid. Try again");
                            }
                        }
                        case "P" -> {
                            movable = false;
                            if(chosenSlotX == P1){
                                AiPawnPath1();
                            }
                            else if(chosenSlotX == P2){
                                AiPawnPath2();
                            }
                            else if(chosenSlotX == P3){
                                AiPawnPath3();
                            }
                            else if(chosenSlotX == P4){
                                AiPawnPath4();
                            }
                            else if(chosenSlotX == P5){
                                AiPawnPath5();
                            }
                            else if(chosenSlotX == P6){
                                AiPawnPath6();
                            }
                            else if(chosenSlotX == P7){
                                AiPawnPath7();
                            }
                            else if(chosenSlotX == P8){
                                AiPawnPath8();
                            }
                            if (movable) {
                                printMove();
                                chessBoard[movingSlotY][movingSlotX] = "P";
                                chessBoard[chosenSlotY][chosenSlotX] = " ";
                                //// System.out.println("-------");
                                //PrintBoard();
                                //// System.out.println("-------");
                            }else {
                                //// System.out.println("Placement not valid. Try again");
                            }
                        }
                        // default -> // System.out.println("Piece not valid, Try Again");
                    }
                    if(movable){
                        cMoves++;
                    }
                }
                else{
                    validMove = false;
                }
            }

            if (movable){
                validMove = true;
            }

        }

    }
    void printMove(){
        //System.out.println(moves);
        if (moves == 0){
            moves++;
        }
        else{
            moves--;
        }
        //System.out.println("Moving from " + chosenSlotX + "," + chosenSlotY + " to " + movingSlotX + "," + movingSlotY);
    }
}
