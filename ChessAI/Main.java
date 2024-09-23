import java.util.Objects;

public class Main {
    // Chess Ai Made by Aman Kikani
    public static String[][] chessBoard = {

            {"R", "N", "B", "K", "Q", "B", "N", "R"},
            {"P", "P", "P", "P", "P", "P", "P", "P"},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {"p", "p", "p", "p", "p", "p", "p", "p"},
            {"r", "n", "b", "k", "q", "b", "n", "r"}
    };
    public static String[][] restartChessBoard = {

            {"R", "N", "B", "K", "Q", "B", "N", "R"},
            {"P", "P", "P", "P", "P", "P", "P", "P"},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {"p", "p", "p", "p", "p", "p", "p", "p"},
            {"r", "n", "b", "k", "q", "b", "n", "r"}
    };
    public static String[][] userChessBoard = {

            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "}
    };
    public static String[][] aiChessBoard = {

            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "}
    };
    public static String[][] userCheckBoard = {

            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "}
    };
    public static String[][] aiCheckBoard = {

            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "}
    };
    static int var1,var2,var3,var4,var5,var6,var7,var8,var9,var10,var11,var12,var13,var14,var15,var16;
    public static int[] availablePieces = {var1,var2,var3,var4,var5,var6,var7,var8,var9,var10,var11,var12,var13,var14,var15,var16};
    public static String line1 = chessBoard[0][0] + chessBoard[0][1] + chessBoard[0][2] + chessBoard[0][3] +
            chessBoard[0][4] + chessBoard[0][5] + chessBoard[0][6] + chessBoard[0][7], line2 = chessBoard[1][0] + chessBoard[1][1] + chessBoard[1][2] + chessBoard[1][3] +
            chessBoard[1][4] + chessBoard[1][5] + chessBoard[1][6] + chessBoard[1][7], line3 = chessBoard[2][0] + chessBoard[2][1] + chessBoard[2][2] + chessBoard[2][3] +
            chessBoard[2][4] + chessBoard[2][5] + chessBoard[2][6] + chessBoard[2][7], line4 = chessBoard[3][0] + chessBoard[3][1] + chessBoard[3][2] + chessBoard[3][3] +
            chessBoard[3][4] + chessBoard[3][5] + chessBoard[3][6] + chessBoard[3][7], line5 = chessBoard[4][0] + chessBoard[4][1] + chessBoard[4][2] + chessBoard[4][3] +
            chessBoard[4][4] + chessBoard[4][5] + chessBoard[4][6] + chessBoard[4][7], line6 = chessBoard[5][0] + chessBoard[5][1] + chessBoard[5][2] + chessBoard[5][3] +
            chessBoard[5][4] + chessBoard[5][5] + chessBoard[5][6] + chessBoard[5][7], line7 = chessBoard[6][0] + chessBoard[6][1] + chessBoard[6][2] + chessBoard[6][3] +
            chessBoard[6][4] + chessBoard[6][5] + chessBoard[6][6] + chessBoard[6][7], line8 = chessBoard[7][0] + chessBoard[7][1] + chessBoard[7][2] + chessBoard[7][3] +
            chessBoard[7][4] + chessBoard[7][5] + chessBoard[7][6] + chessBoard[7][7];
    public static boolean movable = false, protecting = false, checkmate, UserCheck = false, AiCheck = false, start = true;
    public static int R1 = 0,R2 = 0,N1 = 0,N2 = 0,B1 = 0,B2 = 0,K = 0,Q = 0,P1 = 0,P2 = 0,P3 = 0,P4 = 0,P5 = 0,P6 = 0,P7 = 0,
            P8 = 0,r1 = 0,r2 = 0,n1 = 0,n2 = 0,b1 = 0,b2 = 0,k = 0,q = 0,p1 = 0,p2 = 0,p3 = 0,p4 = 0,p5 = 0,p6 = 0,
            p7 = 0,p8 = 0,CR = 0,CN = 0,CB = 0,CP = 0,Cr = 0,Cn = 0,Cb = 0,Cp = 0,LR = 0,LR2 = 0,LN = 0,LN2 = 0,LB = 0,
            LB2 = 0,LK = 0,LQ = 0,LP1 = 0,LP2 = 0,LP3 = 0,LP4 = 0,LP5 = 0,LP6 = 0,LP7 = 0,LP8 = 0,Lr1 = 0,Lr2 = 0,
            Ln1 = 0,Ln2 = 0,Lb1 = 0,Lb2 = 0,Lk = 0,Lq = 0,Lp1 = 0,Lp2 = 0,Lp3 = 0,Lp4 = 0,Lp5 = 0,Lp6 = 0,Lp7 = 0,
            Lp8 = 0,tempHolder1,tempHolder2,tempHolder3,tempHolder4,chosenSlotX,chosenSlotY,movingSlotX,movingSlotY,
            tempAiPawn1,tempAiLinePawn1,validPawnSpot,validPawnLine,tempAiRook1,ValidRightAiRook1,ValidLeftAiRook1,
            tempAiLineRook1,ValidUpAiRook1,ValidDownAiRook1,tempAiRook2,ValidRightRook2,ValidLeftRook2,tempAiLineRook2,
            ValidUpAiRook2,ValidDownAiRook2,tempAiBishop1,validNorthWestAiBishop1,validNorthWestLineB1,
            validNorthEastAiBishop1,validNorthEastLineB1,tempAiLineBishop1,validSouthWestB1,validSouthEastB1,
            validSouthEastLineB1,validSouthWestLineB1,tempAiBishop2,validNorthWestAiBishop2,validNorthWestLineB2,
            validNorthEastAiBishop2,validNorthEastLineB2,tempAiLineBishop2,validSouthWestB2,validSouthEastB2,
            validSouthEastLineB2,validSouthWestLineB2,tempAiKnight1,tempAiLineKnight1,validKingUp,validKingUpLine,
            validKingDown,validKingDownLine,validKingRight,validKingRightLine,validKingLeft,validKingLeftLine,
            validKingNE,validKingNELine,validKingSE,validKingSELine,validKingSW,validKingSWLine,validKingNW,
            validKingNWLine,tempKing,tempKingLine,tester = 0,numberCheckStoppers,checkAttackers,userNumberCheckStoppers,
            userCheckAttackers, fun = 0, moves = 0, cMoves = 0, runs = 0;
    public static double startTime, endTime, totTime, gameTime, finalTime, avgTime;
    static String checkAttacker, userCheckAttacker, finalCheckAttacker;


    public static void main(String[] args){
        while(start) {
            if(runs == 0){
                gameTime = System.currentTimeMillis();
            }
            else if (runs == 100){
                finalTime = System.currentTimeMillis();
            }
            else if (runs == 500){
                avgTime = (finalTime - gameTime )/ 100;
                System.out.println(avgTime);
            }
            runs++;
            System.out.println(runs);
            ReStart();
            ReZero();
            while(!checkmate) {
                movable = false;
                ClearBoards();
                ReZero();
                //PrintBoard();
                PieceLocation();
                PieceBounds();
                PrintBoard();
                Move();
                CheckDetection();
                PieceLocation();
                PieceBounds();
                //AiPrintBoard();
                //System.out.println(" ");
                //UserPrintBoard();

            while(AiCheck || UserCheck && !checkmate){
                // System.out.println("You are still in check");
                String temp = chessBoard[movingSlotY][movingSlotX];

                //AiPrintBoard();
                // System.out.println(" ");
                //UserPrintBoard();
                String chosen = chessBoard[chosenSlotY][chosenSlotY];
                if (AiCheck){
                    moves = 1;
                    Move();
                }
                else if (UserCheck){
                    moves = 0;
                    Move();
                }
                CheckDetection();

            }


                // System.out.println("Made by Aman Kikani");
                // Made By Aman Kikani
            }

            System.out.println("GAME OVER");
            System.out.println("Amount of moves tried: " + fun);
            System.out.println("The amount of valid moves made: " + cMoves);
            PrintBoard();
            System.out.println("Killing Attacker: " + finalCheckAttacker);


            checkmate = false;
            cMoves = 0;
            fun = 0;
        }

    }
    public static void ClearBoards(){
        int i = 0;
        int j = 0;
        for(i = 0; i < 8; i++){
            for(j = 0; j < 8; j++){
                userChessBoard[i][j] = " ";
                aiChessBoard[i][j] = " ";
            }
        }

    }
    public static void ReZero(){
        line1 = chessBoard[0][0] + chessBoard[0][1] + chessBoard[0][2] + chessBoard[0][3] +
                chessBoard[0][4] + chessBoard[0][5] + chessBoard[0][6] + chessBoard[0][7];
        line2 = chessBoard[1][0] + chessBoard[1][1] + chessBoard[1][2] + chessBoard[1][3] +
                chessBoard[1][4] + chessBoard[1][5] + chessBoard[1][6] + chessBoard[1][7];
        line3 = chessBoard[2][0] + chessBoard[2][1] + chessBoard[2][2] + chessBoard[2][3] +
                chessBoard[2][4] + chessBoard[2][5] + chessBoard[2][6] + chessBoard[2][7];
        line4 = chessBoard[3][0] + chessBoard[3][1] + chessBoard[3][2] + chessBoard[3][3] +
                chessBoard[3][4] + chessBoard[3][5] + chessBoard[3][6] + chessBoard[3][7];
        line5 = chessBoard[4][0] + chessBoard[4][1] + chessBoard[4][2] + chessBoard[4][3] +
                chessBoard[4][4] + chessBoard[4][5] + chessBoard[4][6] + chessBoard[4][7];
        line6 = chessBoard[5][0] + chessBoard[5][1] + chessBoard[5][2] + chessBoard[5][3] +
                chessBoard[5][4] + chessBoard[5][5] + chessBoard[5][6] + chessBoard[5][7];
        line7 = chessBoard[6][0] + chessBoard[6][1] + chessBoard[6][2] + chessBoard[6][3] +
                chessBoard[6][4] + chessBoard[6][5] + chessBoard[6][6] + chessBoard[6][7];
        line8 = chessBoard[7][0] + chessBoard[7][1] + chessBoard[7][2] + chessBoard[7][3] +
                chessBoard[7][4] + chessBoard[7][5] + chessBoard[7][6] + chessBoard[7][7];
    }
    public static void ReStart(){
        int i = 0;
        int j = 0;
        for(i = 0; i < 8; i++){
            for(j = 0; j < 8; j++){
                chessBoard[i][j] = restartChessBoard[i][j];
            }
        }

    }
    public static void DeadPiece(){
        R1 = -1;R2 = -1;N1 = -1;N2 = -1;B1 = -1;B2 = -1;K = -1;Q = -1;P1 = -1;P2 = -1;P3 = -1;P4 = -1;P5 = -1;P6 = -1;P7 = -1;
        P8 = -1;r1 = -1;r2 = -1;n1 = -1;n2 = -1;b1 = -1;b2 = -1;k = -1;q = -1;p1 = -1;p2 = -1;p3 = -1;p4 = -1;p5 = -1;p6 = -1;
        p7 = -1;p8 = -1;CR = 0;CN = 0;CB = 0;CP = 0;Cr = 0;Cn = 0;Cb = 0;Cp = 0;LR = -1;LR2 = -1;LN = -1;LN2 = -1;LB = -1;
        LB2 = -1;LK = -1;LQ = -1;LP1 = -1;LP2 = -1;LP3 = -1;LP4 = -1;LP5 = -1;LP6 = -1;LP7 = -1;LP8 = -1;Lr1 = -1;Lr2 = -1;
        Ln1 = -1;Ln2 = -1;Lb1 = -1;Lb2 = -1;Lk = -1;Lq = -1;Lp1 = -1;Lp2 = -1;Lp3 = -1;Lp4 = -1;Lp5 = -1;Lp6 = -1;Lp7 = -1;
        Lp8 = -1; checkAttacker = ""; checkAttackers = 0; userCheckAttacker = ""; userCheckAttackers = 0;
    }
    public static void PieceBounds(){
        PieceLocation();
        AiRookPath1();
        AiRookPaths2();
        RookPath1();
        RookPath2();
        AiBishopPath1();
        AiBishopPath2();
        BishopPath1();
        BishopPath2();
        QueenPath();
        AiQueenPath();
        AiKnightPath1();
        AiKnightPath2();
        KnightPath1();
        KnightPath2();
        AiPawnPath1();
        AiPawnPath2();
        AiPawnPath3();
        AiPawnPath4();
        AiPawnPath5();
        AiPawnPath6();
        AiPawnPath7();
        AiPawnPath8();
        PawnPath1();
        PawnPath2();
        PawnPath3();
        PawnPath4();
        PawnPath5();
        PawnPath6();
        PawnPath7();
        PawnPath8();
        KingPath();
        AiKingPath();
    }
    public static void CheckDetection(){
        CheckDetection m = new CheckDetection();
    }
    public static void BishopPath1(){
        BishopPath1 m = new BishopPath1();
        
    }
    public static void BishopPath2(){
        BishopPath2 m = new BishopPath2();
        
    }
    public static void AiBishopPath1(){
        AiBishopPath1 m = new AiBishopPath1();
        
    }
    public static void AiBishopPath2(){
        AiBishopPath2 m = new AiBishopPath2();
        
    }
    public static void RookPath1(){
        RookPath1 m = new RookPath1();
        
    }
    public static void RookPath2(){
        RookPath2 m = new RookPath2();
        
    }
    public static void AiRookPath1(){
        AiRookPath1 m = new AiRookPath1();
        
    }
    public static void AiRookPaths2(){
        AiRookPaths2 m = new AiRookPaths2();
        
    }
    public static void QueenPath(){
        QueenPath m = new QueenPath();
        
    }
    public static void AiQueenPath(){
        AiQueenPath m = new AiQueenPath();
        
    }
    public static void KnightPath1(){
        KnightPath1 m = new KnightPath1();
        
    }
    public static void KnightPath2(){
        KnightPath2 m = new KnightPath2();
        
    }
    public static void AiKnightPath1(){
        AiKnightPath1 m = new AiKnightPath1();
        
    }
    public static void AiKnightPath2(){
        AiKnightPath2 m = new AiKnightPath2();
        
    }
    public static void KingPath(){
        KingPath m = new KingPath();
        
    }
    public static void AiKingPath(){
        AiKingPath m = new AiKingPath();
        
    }
    public static void Move(){
        Move m = new Move();
        
    }
    public static void PieceLocation(){
        PieceLocation m = new PieceLocation();
        
    }
    public static void PrintBoard(){
        PrintBoard m = new PrintBoard();
        
    }
    public static void UserPrintBoard(){
        UserPrintBoard m = new UserPrintBoard();
        
    }
    public static void AiPrintBoard(){
        AiPrintBoard m = new AiPrintBoard();
        
    }
    public static void AiPawnPath1(){
        AiPawnPath1 m = new AiPawnPath1();
        
    }
    public static void AiPawnPath2(){
        AiPawnPath2 m = new AiPawnPath2();
        
    }
    public static void AiPawnPath3(){
        AiPawnPath3 m = new AiPawnPath3();
        
    }
    public static void AiPawnPath4(){
        AiPawnPath4 m = new AiPawnPath4();
        
    }
    public static void AiPawnPath5(){
        AiPawnPath5 m = new AiPawnPath5();
        
    }
    public static void AiPawnPath6(){
        AiPawnPath6 m = new AiPawnPath6();
        
    }
    public static void AiPawnPath7(){
        AiPawnPath7 m = new AiPawnPath7();
        
    }
    public static void AiPawnPath8(){
        AiPawnPath8 m = new AiPawnPath8();
        
    }
    public static void PawnPath1(){
        PawnPath1 m = new PawnPath1();
        
    }
    public static void PawnPath2(){
        PawnPath2 m = new PawnPath2();
        
    }
    public static void PawnPath3(){
        PawnPath3 m = new PawnPath3();
        
    }
    public static void PawnPath4(){
        PawnPath4 m = new PawnPath4();
        
    }
    public static void PawnPath5(){
        PawnPath5 m = new PawnPath5();
        
    }
    public static void PawnPath6(){
        PawnPath6 m = new PawnPath6();
        
    }
    public static void PawnPath7(){
        PawnPath7 m = new PawnPath7();
        
    }
    public static void PawnPath8(){
        PawnPath8 m = new PawnPath8();
        
    }
    
    
}