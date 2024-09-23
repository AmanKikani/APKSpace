import java.util.Objects;

public class CheckDetection extends Main {
    CheckDetection() {
        String tempAttack;
        PieceLocation();
        StringBuilder checkStoppers = new StringBuilder();
        if((LK!=-1) && (K!=-1) && (k!=-1) && (Lk!=-1)) {
            if (!userChessBoard[LK][K].equals(" ")) {
                System.out.println("User King is in check");
                AiCheck = true;
            } else if (!aiChessBoard[Lk][k].equals(" ")) {
                System.out.println("AI King is in check");
                UserCheck = true;
            }
            while (AiCheck && !checkmate) {
                if (userCheckAttackers > 1) {

                    checkmate = true;
                    System.out.println("Checkmate");
                } else {
                    switch (checkAttacker) {
                        case "B1" -> {
                            tempAttack = "b";
                            movingSlotY = Lb1;
                            movingSlotX = b1;
                        }
                        case "B2" -> {
                            tempAttack = "b";
                            movingSlotY = Lb2;
                            movingSlotX = b2;
                        }
                        case "R1" -> {
                            tempAttack = "r";
                            movingSlotY = Lr1;
                            movingSlotX = r1;
                        }
                        case "R2" -> {
                            tempAttack = "r";
                            movingSlotY = Lr2;
                            movingSlotX = r2;
                        }
                        case "N1" -> {
                            tempAttack = "n";
                            movingSlotY = Ln1;
                            movingSlotX = n1;
                        }
                        case "N2" -> {
                            tempAttack = "n";
                            movingSlotY = Ln2;
                            movingSlotX = n2;
                        }
                        case "Q" -> {
                            tempAttack = "q";
                            movingSlotY = Lq;
                            movingSlotX = q;
                        }
                        case "P1" -> {
                            tempAttack = "p";
                            movingSlotY = Lp1;
                            movingSlotX = p1;
                        }
                        case "P2" -> {
                            tempAttack = "p";
                            movingSlotY = Lp2;
                            movingSlotX = p2;
                        }
                        case "P3" -> {
                            tempAttack = "p";
                            movingSlotY = Lp3;
                            movingSlotX = p3;
                        }
                        case "P4" -> {
                            tempAttack = "p";
                            movingSlotY = Lp4;
                            movingSlotX = p4;
                        }
                        case "P5" -> {
                            tempAttack = "p";
                            movingSlotY = Lp5;
                            movingSlotX = p5;
                        }
                        case "P6" -> {
                            tempAttack = "p";
                            movingSlotY = Lp6;
                            movingSlotX = p6;
                        }
                        case "P7" -> {
                            tempAttack = "p";
                            movingSlotY = Lp7;
                            movingSlotX = p7;
                        }
                        case "P8" -> {
                            tempAttack = "P";
                            movingSlotY = LP8;
                            movingSlotX = P8;
                        }
                        default -> tempAttack = " ";
                    }
                    movable = false;
                    AiRookPath1();
                    if (movable && R1 != -1) {
                        // System.out.println("Rook 1 is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = R1;
                        tempHolder1 = LR;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "R";
                        PieceBounds();
                        if (userChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The rook cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "R";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            // Make sure that the user is allowed to choose which piece they want to use to
                            // protect the king with. Don't let the program default to using the first working
                            // piece available to protect the king with.
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();
                    }
                    AiRookPaths2();
                    if (movable && R2 != -1) {
                        // System.out.println("Rook 2 is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = R2;
                        tempHolder1 = LR2;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "R";
                        PieceBounds();
                        if (userChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The rook cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "R";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    AiBishopPath1();
                    if (movable && B1 != -1) {
                        // System.out.println("Bishop 1 is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = B1;
                        tempHolder1 = LB;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "B";
                        PieceBounds();
                        if (userChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The bishop cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "B";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    AiBishopPath2();
                    if (movable && B2 != -1) {
                        // System.out.println("Bishop 2 is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = B2;
                        tempHolder1 = LB2;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "B";
                        PieceBounds();
                        if (userChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The bishop cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "B";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    AiQueenPath();
                    if (movable && Q != -1) {
                        // System.out.println("The Queen is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = Q;
                        tempHolder1 = LQ;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "Q";
                        PieceBounds();
                        if (userChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The Queen cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "Q";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    AiKnightPath1();
                    if (movable && N1 != -1) {
                        // System.out.println("The Queen is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = N1;
                        tempHolder1 = LN;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "N";
                        PieceBounds();
                        if (userChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The Knight cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "N";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    AiKnightPath2();
                    if (movable && N2 != -1) {
                        // System.out.println("The Queen is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = N2;
                        tempHolder1 = LN2;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "N";
                        PieceBounds();
                        if (userChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The Knight cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "N";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    AiPawnPath1();
                    if (movable && P1 != -1) {
                        // System.out.println("The Pawn is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = P1;
                        tempHolder1 = LP1;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "P";
                        PieceBounds();
                        if (userChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The pawn cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "P";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    AiPawnPath2();
                    if (movable && P2 != -1) {
                        // System.out.println("The Pawn is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = P2;
                        tempHolder1 = LP2;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "P";
                        PieceBounds();
                        if (userChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The Pawn cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "P";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    AiPawnPath3();
                    if (movable && P3 != -1) {
                        // System.out.println("The Pawn is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = P3;
                        tempHolder1 = LP3;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "P";
                        PieceBounds();
                        if (userChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The pawn cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "P";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    AiPawnPath4();
                    if (movable && P4 != -1) {
                        // System.out.println("The Pawn is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = P4;
                        tempHolder1 = LP4;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "P";
                        PieceBounds();
                        if (userChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The pawn cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "P";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    AiPawnPath5();
                    if (movable && P5 != -1) {
                        // System.out.println("The Pawn is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = P5;
                        tempHolder1 = LP5;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "P";
                        PieceBounds();
                        if (userChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The pawn cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "P";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    AiPawnPath6();
                    if (movable && P6 != -1) {
                        // System.out.println("The Pawn is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = P6;
                        tempHolder1 = LP6;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "P";
                        PieceBounds();
                        if (userChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The pawn cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "P";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    AiPawnPath7();
                    if (movable && P7 != -1) {
                        // System.out.println("The Pawn is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = P7;
                        tempHolder1 = LP7;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "P";
                        PieceBounds();
                        if (userChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The pawn cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "P";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    AiPawnPath8();
                    if (movable && P8 != -1) {
                        // System.out.println("The Pawn is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = P8;
                        tempHolder1 = LP8;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "P";
                        PieceBounds();
                        if (userChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The pawn cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "P";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    AiKingPath();
                    if (movable && K != -1) {
                        // System.out.println("The King is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = K;
                        tempHolder1 = LK;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "K";
                        PieceBounds();
                        if (userChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The King cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "K";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();
                        if (userChessBoard[LK][K].equals("X")) {
                            AiCheck = true;
                        }
                        if (AiCheck) {
                            movingSlotX = tempHolder1 + 1;
                            movingSlotY = tempHolder2;
                            AiKingPath();
                            if (movable && !userChessBoard[LK][K].equals("X")) {
                                AiCheck = false;
                            }
                            movingSlotX = tempHolder1 + 1;
                            movingSlotY = tempHolder2 + 1;
                            AiKingPath();
                            if (movable && !userChessBoard[LK][K].equals("X")) {
                                AiCheck = false;
                            }
                            movingSlotX = tempHolder1;
                            movingSlotY = tempHolder2 + 1;
                            AiKingPath();
                            if (movable && !userChessBoard[LK][K].equals("X")) {
                                AiCheck = false;
                            }
                            movingSlotX = tempHolder1 - 1;
                            movingSlotY = tempHolder2;
                            AiKingPath();
                            if (movable && !userChessBoard[LK][K].equals("X")) {
                                AiCheck = false;
                            }
                            movingSlotX = tempHolder1 - 1;
                            movingSlotY = tempHolder2 - 1;
                            AiKingPath();
                            if (movable && !userChessBoard[LK][K].equals("X")) {
                                AiCheck = false;
                            }
                            movingSlotX = tempHolder1;
                            movingSlotY = tempHolder2 - 1;
                            AiKingPath();
                            if (movable && !userChessBoard[LK][K].equals("X")) {
                                AiCheck = false;
                            }
                            movingSlotX = tempHolder1 - 1;
                            movingSlotY = tempHolder2 + 1;
                            AiKingPath();
                            if (movable && !userChessBoard[LK][K].equals("X")) {
                                AiCheck = false;
                            }
                            movingSlotX = tempHolder1 + 1;
                            movingSlotY = tempHolder2 - 1;
                            AiKingPath();
                            if (movable && !userChessBoard[LK][K].equals("X")) {
                                AiCheck = false;
                            }
                        }
                    }
                    if (AiCheck) {
                        checkmate = true;
                        System.out.println("Checkmate");
                    }


                }
            }
            while (UserCheck && !checkmate) {
                //System.out.println("UCheck");
                if (checkAttackers > 1) {
                    checkmate = true;
                    System.out.println("Checkmate");

                } else {
                    // System.out.println("The piece attacking the King is " + userCheckAttacker);
                    switch (checkAttacker) {
                        case "B1" -> {
                            tempAttack = "B";
                            movingSlotY = LB;
                            movingSlotX = B1;
                        }
                        case "B2" -> {
                            tempAttack = "B";
                            movingSlotY = LB2;
                            movingSlotX = B2;
                        }
                        case "R1" -> {
                            tempAttack = "R";
                            movingSlotY = LR;
                            movingSlotX = R1;
                        }
                        case "R2" -> {
                            tempAttack = "R";
                            movingSlotY = LR2;
                            movingSlotX = R2;
                        }
                        case "N1" -> {
                            tempAttack = "N";
                            movingSlotY = LN;
                            movingSlotX = N1;
                        }
                        case "N2" -> {
                            tempAttack = "N";
                            movingSlotY = LN2;
                            movingSlotX = N2;
                        }
                        case "Q" -> {
                            tempAttack = "Q";
                            movingSlotY = LQ;
                            movingSlotX = Q;
                        }
                        case "P1" -> {
                            tempAttack = "P";
                            movingSlotY = LP1;
                            movingSlotX = P1;
                        }
                        case "P2" -> {
                            tempAttack = "P";
                            movingSlotY = LP2;
                            movingSlotX = P2;
                        }
                        case "P3" -> {
                            tempAttack = "P";
                            movingSlotY = LP3;
                            movingSlotX = P3;
                        }
                        case "P4" -> {
                            tempAttack = "P";
                            movingSlotY = LP4;
                            movingSlotX = P4;
                        }
                        case "P5" -> {
                            tempAttack = "P";
                            movingSlotY = LP5;
                            movingSlotX = P5;
                        }
                        case "P6" -> {
                            tempAttack = "P";
                            movingSlotY = LP6;
                            movingSlotX = P6;
                        }
                        case "P7" -> {
                            tempAttack = "P";
                            movingSlotY = LP7;
                            movingSlotX = P7;
                        }
                        case "P8" -> {
                            tempAttack = "P";
                            movingSlotY = LP8;
                            movingSlotX = P8;
                        }
                        default -> tempAttack = " ";
                    }
                    movable = false;
                    // System.out.println("Testing Rook 1");
                    RookPath1();
                    if (movable) {
                        // System.out.println("Rook 1 is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = r1;
                        tempHolder1 = Lr1;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "r";
                        PieceBounds();
                        if (aiChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The rook cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "r";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            // Make sure that the user is allowed to choose which piece they want to use to
                            // protect the king with. Don't let the program default to using the first working
                            // piece available to protect the king with.
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();
                    }
                    movable = false;
                    RookPath2();
                    if (movable) {
                        // System.out.println("Rook 2 is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = r2;
                        tempHolder1 = Lr2;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "r";
                        PieceBounds();
                        if (aiChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The rook cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "r";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    movable = false;
                    BishopPath1();
                    if (movable) {
                        // System.out.println("Bishop 1 is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = b1;
                        tempHolder1 = Lb1;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "b";
                        PieceBounds();
                        if (aiChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The bishop cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "b";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    movable = false;
                    BishopPath2();
                    if (movable) {
                        // System.out.println("Bishop 2 is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = b2;
                        tempHolder1 = Lb2;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "b";
                        PieceBounds();
                        if (aiChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The bishop cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "b";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    movable = false;
                    QueenPath();
                    if (movable) {
                        // System.out.println("The Queen is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = q;
                        tempHolder1 = Lq;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "q";
                        PieceBounds();
                        if (aiChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The Queen cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "q";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    movable = false;
                    KnightPath1();
                    if (movable) {
                        // System.out.println("The Queen is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = n1;
                        tempHolder1 = Ln1;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "n";
                        PieceBounds();
                        if (aiChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The Knight cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "n";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    movable = false;
                    KnightPath2();
                    if (movable) {
                        // System.out.println("The Queen is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = n2;
                        tempHolder1 = Ln2;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "n";
                        PieceBounds();
                        if (aiChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The Knight cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "n";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    movable = false;
                    PawnPath1();
                    if (movable) {
                        // System.out.println("The Pawn is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = p1;
                        tempHolder1 = Lp1;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "p";
                        PieceBounds();
                        if (aiChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The pawn cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "p";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    movable = false;
                    PawnPath2();
                    if (movable) {
                        // System.out.println("The Pawn is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = p2;
                        tempHolder1 = Lp2;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "p";
                        PieceBounds();
                        if (aiChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The Pawn cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "p";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    movable = false;
                    PawnPath3();
                    if (movable) {
                        // System.out.println("The Pawn is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = p3;
                        tempHolder1 = Lp3;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "p";
                        PieceBounds();
                        if (aiChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The pawn cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "p";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    movable = false;
                    PawnPath4();
                    if (movable) {
                        // System.out.println("The Pawn is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = p4;
                        tempHolder1 = Lp4;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "p";
                        PieceBounds();
                        if (aiChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The pawn cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "p";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    movable = false;
                    PawnPath5();
                    if (movable) {
                        // System.out.println("The Pawn is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = p5;
                        tempHolder1 = Lp5;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "p";
                        PieceBounds();
                        if (aiChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The pawn cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "p";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    movable = false;
                    PawnPath6();
                    if (movable) {
                        // System.out.println("The Pawn is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = p6;
                        tempHolder1 = Lp6;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "p";
                        PieceBounds();
                        if (aiChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The pawn cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "p";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    movable = false;
                    PawnPath7();
                    if (movable) {
                        // System.out.println("The Pawn is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = p7;
                        tempHolder1 = Lp7;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "p";
                        PieceBounds();
                        if (aiChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The pawn cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "p";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    movable = false;
                    PawnPath8();
                    if (movable) {
                        // System.out.println("The Pawn is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = p8;
                        tempHolder1 = Lp8;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "p";
                        PieceBounds();
                        if (aiChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The pawn cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "p";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();

                    }
                    movable = false;
                    KingPath();
                    if (movable) {
                        // System.out.println("The King is able to kill the attacker");
                        // System.out.println("Testing to make sure moving the rook won't put the king in check");
                        tempHolder2 = k;
                        tempHolder1 = Lk;
                        chessBoard[tempHolder1][tempHolder2] = " ";
                        chessBoard[movingSlotY][movingSlotX] = "k";
                        PieceBounds();
                        if (aiChessBoard[Lk][k].equals("X")) {
                            // System.out.println("The King cannot protect the King");
                            chessBoard[tempHolder1][tempHolder2] = "k";
                            chessBoard[movingSlotY][movingSlotX] = tempAttack;
                            protecting = false;
                        } else {
                            checkStoppers.append(chessBoard[tempHolder1][tempHolder2]);
                        }
                        PieceBounds();
                        if (Objects.equals(aiChessBoard[Lk][k], "X")) {
                            UserCheck = true;
                        }
                        if (UserCheck) {
                            movingSlotX = tempHolder1 + 1;
                            movingSlotY = tempHolder2;
                            KingPath();
                            if (movable && !aiChessBoard[Lk][k].equals("X")) {
                                UserCheck = false;
                            }
                            movingSlotX = tempHolder1 + 1;
                            movingSlotY = tempHolder2 + 1;
                            KingPath();
                            if (movable && !aiChessBoard[Lk][k].equals("X")) {
                                UserCheck = false;
                            }
                            movingSlotX = tempHolder1;
                            movingSlotY = tempHolder2 + 1;
                            KingPath();
                            if (movable && !aiChessBoard[Lk][k].equals("X")) {
                                UserCheck = false;
                            }
                            movingSlotX = tempHolder1 - 1;
                            movingSlotY = tempHolder2;
                            KingPath();
                            if (movable && !aiChessBoard[Lk][k].equals("X")) {
                                UserCheck = false;
                            }
                            movingSlotX = tempHolder1 - 1;
                            movingSlotY = tempHolder2 - 1;
                            KingPath();
                            if (movable && !aiChessBoard[Lk][k].equals("X")) {
                                UserCheck = false;
                            }
                            movingSlotX = tempHolder1;
                            movingSlotY = tempHolder2 - 1;
                            KingPath();
                            if (movable && !aiChessBoard[Lk][k].equals("X")) {
                                UserCheck = false;
                            }
                            movingSlotX = tempHolder1 - 1;
                            movingSlotY = tempHolder2 + 1;
                            KingPath();
                            if (movable && !aiChessBoard[Lk][k].equals("X")) {
                                UserCheck = false;
                            }
                            movingSlotX = tempHolder1 + 1;
                            movingSlotY = tempHolder2 - 1;
                            KingPath();
                            if (movable && !aiChessBoard[Lk][k].equals("X")) {
                                AiCheck = false;
                            }
                        }


                    }


                }
            }
        }
        else{
            System.out.println("One of the kings is dead. This isnt really supposed to happen but its fine :|");
            checkmate = true;
        }
        finalCheckAttacker = checkAttacker;
        finalCheckAttacker = finalCheckAttacker + ", " + userCheckAttacker;
    }

}
