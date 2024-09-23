public class PieceLocation extends Main{
    PieceLocation() {
        // Line 1
        DeadPiece();
        int indexR = -1, indexN = -1, indexB = -1, indexQ = -1, indexK = -1, indexP = -1, indexLr = -1, indexLn = -1,
                indexLb = -1, indexLq = -1, indexLk = -1, indexLp = -1;
        for (indexR = line1.indexOf("R");
             indexR >= 0;
             indexR = line1.indexOf("R", indexR + 1))
        {
            if(CR == 0){
                R1 = indexR;
                CR = CR + 1;
                LR = 0;
            }
            else{
                R2 = indexR;
                CR = CR + 1;
                LR2 = 0;
            }
        }
        for (indexN = line1.indexOf("N");
             indexN >= 0;
             indexN = line1.indexOf("N", indexN + 1))
        {
            if(CN == 0){
                N1 = indexN;
                CN = CN + 1;
                LN = 0;
            }
            else{
                N2 = indexN;
                CN = CN + 1;
                LN2 = 0;
            }

        }
        for (indexB= line1.indexOf("B");
             indexB>= 0;
             indexB= line1.indexOf("B", indexB + 1))
        {
            if(CB == 0){
                B1 = indexB;
                LB = 0;
            }
            else{
                B2 = indexB;
                LB2 = 0;
            }
            CB = CB + 1;
        }
        for (indexK= line1.indexOf("K");
             indexK>= 0;
             indexK= line1.indexOf("K", indexK+ 1))
        {
            LK = 0;
            K = indexK;
        }
        for (indexQ= line1.indexOf("Q");
             indexQ>= 0;
             indexQ= line1.indexOf("Q", indexQ+ 1))
        {
            LQ = 0;
            Q = indexQ;
        }
        for (indexP= line1.indexOf("P");
             indexP>= 0;
             indexP= line1.indexOf("P", indexP+ 1))
        {
            if(CP == 0){
                P1 = indexP;
                LP1 = 0;
                CP = CP + 1;
            }
            else if(CP == 1){
                P2 = indexP;
                LP2 = 0;
                CP = CP + 1;
            }
            else if(CP == 2){
                P3 = indexP;
                LP3 = 0;
                CP = CP + 1;
            }
            else if(CP == 3){
                P4 = indexP;
                LP4 = 0;
                CP = CP + 1;
            }
            else if(CP == 4){
                P5 = indexP;
                LP5 = 0;
                CP = CP + 1;
            }
            else if(CP == 5){
                P6 = indexP;
                LP6 = 0;
                CP = CP + 1;
            }
            else if(CP == 6){
                P7 = indexP;
                LP7 = 0;
                CP = CP + 1;
            }
            else if(CP == 7){
                P8 = indexP;
                LP8 = 0;
                CP = CP + 1;
            }
        }
        for (indexLr= line1.indexOf("r");
             indexLr>= 0;
             indexLr= line1.indexOf("r", indexLr+ 1))
        {
            if(Cr == 0){
                r1 = indexLr;
                Lr1 = 0;
            }
            else{
                r2 = indexLr;
                Lr2 = 0;
            }
            Cr = Cr + 1;
        }
        for (indexLn= line1.indexOf("n");
             indexLn>= 0;
             indexLn= line1.indexOf("n", indexLn+ 1))
        {
            if(Cn == 0){
                n1 = indexLn;
                Ln1 = 0;
            }
            else{
                n2 = indexLn;
                Ln2 = 0;
            }
            Cn = Cn + 1;
        }
        for (indexLb= line1.indexOf("b");
             indexLb>= 0;
             indexLb= line1.indexOf("b", indexLb+ 1))
        {
            if(Cb == 0){
                b1 = indexLb;
                Lb1 = 0;
            }
            else{
                b2 = indexLb;
                Lb2 = 0;
            }
            Cb = Cb + 1;
        }
        for (indexLk= line1.indexOf("k");
             indexLk>= 0;
             indexLk= line1.indexOf("k", indexLk+ 1))
        {
            Lk = 0;
            k = indexLk;
        }
        for (indexLq= line1.indexOf("q");
             indexLq>= 0;
             indexLq= line1.indexOf("q", indexLq+ 1))
        {
            Lq = 0;
            q = indexLq;

        }
        for (indexLp= line1.indexOf("p");
             indexLp>= 0;
             indexLp= line1.indexOf("p", indexLp+ 1))
        {
            if(Cp == 0){
                p1 = indexLp;
                Lp1 = 0;
                Cp = Cp + 1;
            }
            else if(Cp == 1){
                p2 = indexLp;
                Lp2 = 0;
                Cp = Cp + 1;
            }
            else if(Cp == 2){
                p3 = indexLp;
                Lp3 = 0;
                Cp = Cp + 1;
            }
            else if(Cp == 3){
                p4 = indexLp;
                Lp4 = 0;
                Cp = Cp + 1;
            }
            else if(Cp == 4){
                p5 = indexLp;
                Lp5 = 0;
                Cp = Cp + 1;
            }
            else if(Cp == 5){
                p6 = indexLp;
                Lp6 = 0;
                Cp = Cp + 1;
            }
            else if(Cp == 6){
                p7 = indexLp;
                Lp7 = 0;
                Cp = Cp + 1;
            }
            else if(Cp == 7){
                p8 = indexLp;
                Lp8 = 0;
                Cp = Cp + 1;
            }
        }
        // System.out.println(" ");
        // Line 2
        for (indexR = line2.indexOf("R");
             indexR >= 0;
             indexR = line2.indexOf("R", indexR + 1))
        {
            if(CR == 0){
                R1 = indexR;
                CR = CR + 1;
                LR = 2 - 1;
            }
            else{
                R2 = indexR;
                CR = CR + 1;
                LR2 = 2 - 1;
            }
        }
        for (indexN = line2.indexOf("N");
             indexN >= 0;
             indexN = line2.indexOf("N", indexN + 1))
        {
            if(CN == 0){
                N1 = indexN;
                CN = CN + 1;
                LN = 2 - 1;
            }
            else{
                N2 = indexN;
                CN = CN + 1;
                LN2 = 2 - 1;
            }
        }
        for (indexB= line2.indexOf("B");
             indexB>= 0;
             indexB= line2.indexOf("B", indexB + 1))
        {
            if(CB == 0){
                B1 = indexB;
                CB = CB + 1;
                LB = 2 - 1;
            }
            else{
                B2 = indexB;
                CB = CB + 1;
                LB2 = 2 - 1;
            }
        }
        for (indexK= line2.indexOf("K");
             indexK>= 0;
             indexK= line2.indexOf("K", indexK+ 1))
        {
            K = indexK;
            LK = 2;
        }
        for (indexQ= line2.indexOf("Q");
             indexQ>= 0;
             indexQ= line2.indexOf("Q", indexQ+ 1))
        {
            Q = indexQ;
            LQ = 2;
        }
        for (indexP= line2.indexOf("P");
             indexP>= 0;
             indexP= line2.indexOf("P", indexP+ 1))
        {
            if(CP == 0){
                P1 = indexP;
                CP = CP + 1;
                LP1 = 2 - 1;
            }
            else if(CP == 1){
                P2 = indexP;
                CP = CP + 1;
                LP2 = 2 - 1;
            }
            else if(CP == 2){
                P3 = indexP;
                CP = CP + 1;
                LP3 = 2 - 1;
            }
            else if(CP == 3){
                P4 = indexP;
                CP = CP + 1;
                LP4 = 2 - 1;
            }
            else if(CP == 4){
                P5 = indexP;
                CP = CP + 1;
                LP5 = 2 - 1;
            }
            else if(CP == 5){
                P6 = indexP;
                CP = CP + 1;
                LP6 = 2 - 1;
            }
            else if(CP == 6){
                P7 = indexP;
                CP = CP + 1;
                LP7 = 2 - 1;
            }
            else if(CP == 7){
                P8 = indexP;
                CP = CP + 1;
                LP8 = 2 - 1;
            }
        }
        for (indexLr= line2.indexOf("r");
             indexLr>= 0;
             indexLr= line2.indexOf("r", indexLr+ 1))
        {
            if(Cr == 0){
                r1 = indexLr;
                Cr = Cr + 1;
                Lr1 = 2 - 1;
            }
            else{
                r2 = indexLr;
                Cr = Cr + 1;
                Lr2 = 2 - 1;
            }
        }
        for (indexLn= line2.indexOf("n");
             indexLn>= 0;
             indexLn= line2.indexOf("n", indexLn+ 1))
        {
            if(Cn == 0){
                n1 = indexLn;
                Cn = Cn + 1;
                Ln1 = 2 - 1;
            }
            else{
                n2 = indexLn;
                Cn = Cn + 1;
                Ln2 = 2 - 1;
            }
            //(A)m@n K!K@n!
        }
        for (indexLb= line2.indexOf("b");
             indexLb>= 0;
             indexLb= line2.indexOf("b", indexLb+ 1))
        {
            if(Cb == 0){
                b1 = indexLb;
                Cb = Cb + 1;
                Lb1 = 2 - 1;
            }
            else{
                b2 = indexLb;
                Cb = Cb + 1;
                Lb2 = 2 - 1;
            }
        }
        for (indexLk= line2.indexOf("k");
             indexLk>= 0;
             indexLk= line2.indexOf("k", indexLk+ 1))
        {
            k = indexLk;
            Lk = 2 - 1;
        }
        for (indexLq= line2.indexOf("q");
             indexLq>= 0;
             indexLq= line2.indexOf("q", indexLq+ 1))
        {
            q = indexLq;
            Lq = 2 - 1;
        }
        for (indexLp= line2.indexOf("p");
             indexLp>= 0;
             indexLp= line2.indexOf("p", indexLp+ 1))
        {
            if(Cp == 0){
                p1 = indexLp;
                Cp = Cp + 1;
                Lp1 = 2 - 1;
            }
            else if(Cp == 1){
                p2 = indexLp;
                Cp = Cp + 1;
                Lp2 = 2 - 1;
            }
            else if(Cp == 2){
                p3 = indexLp;
                Cp = Cp + 1;
                Lp3 = 2 - 1;
            }
            else if(Cp == 3){
                p4 = indexLp;
                Cp = Cp + 1;
                Lp4 = 2 - 1;
            }
            else if(Cp == 4){
                p5 = indexLp;
                Cp = Cp + 1;
                Lp5 = 2 - 1;
            }
            else if(Cp == 5){
                p6 = indexLp;
                Cp = Cp + 1;
                Lp6 = 2 - 1;
            }
            else if(Cp == 6){
                p7 = indexLp;
                Cp = Cp + 1;
                Lp7 = 2 - 1;
            }
            else if(Cp == 7){
                p8 = indexLp;
                Cp = Cp + 1;
                Lp8 = 2 - 1;
            }
        }
        // System.out.println(" ");
        // Line 3
        for (indexR = line3.indexOf("R");
             indexR >= 0;
             indexR = line3.indexOf("R", indexR + 1))
        {
            if(CR == 0){
                R1 = indexR;
                CR = CR + 1;
                LR = 3 - 1;
            }
            else{
                R2 = indexR;
                CR = CR + 1;
                LR2 = 3 - 1;
            }
        }
        for (indexN = line3.indexOf("N");
             indexN >= 0;
             indexN = line3.indexOf("N", indexN + 1))
        {
            if(CN == 0){
                N1 = indexN;
                CN = CN + 1;
                LN = 3 - 1;
            }
            else{
                N2 = indexN;
                CN = CN + 1;
                LN2 = 3 - 1;
            }
        }
        for (indexB= line3.indexOf("B");
             indexB>= 0;
             indexB= line3.indexOf("B", indexB + 1))
        {
            if(CB == 0){
                B1 = indexB;
                CB = CB + 1;
                LB = 3 - 1;
            }
            else{
                B2 = indexB;
                CB = CB + 1;
                LB2 = 3 - 1;
            }
        }
        for (indexK= line3.indexOf("K");
             indexK>= 0;
             indexK= line3.indexOf("K", indexK+ 1))
        {
            K = indexK;
            LK = 3 - 1;
        }
        for (indexQ= line3.indexOf("Q");
             indexQ>= 0;
             indexQ= line3.indexOf("Q", indexQ+ 1))
        {
            Q = indexQ;
            LQ = 3 - 1;
        }
        for (indexP= line3.indexOf("P");
             indexP>= 0;
             indexP= line3.indexOf("P", indexP+ 1))
        {
            if(CP == 0){
                P1 = indexP;
                CP = CP + 1;
                LP1 = 3 - 1;
            }
            else if(CP == 1){
                P2 = indexP;
                CP = CP + 1;
                LP2 = 3 - 1;
            }
            else if(CP == 2){
                P3 = indexP;
                CP = CP + 1;
                LP3 = 3 - 1;
            }
            else if(CP == 3){
                P4 = indexP;
                CP = CP + 1;
                LP4 = 3 - 1;
            }
            else if(CP == 4){
                P5 = indexP;
                CP = CP + 1;
                LP5 = 3 - 1;
            }
            else if(CP == 5){
                P6 = indexP;
                CP = CP + 1;
                LP6 = 3 - 1;
            }
            else if(CP == 6){
                P7 = indexP;
                CP = CP + 1;
                LP7 = 3 - 1;
            }
            else if(CP == 7){
                P8 = indexP;
                CP = CP + 1;
                LP8 = 3 - 1;
            }
        }
        for (indexLr= line3.indexOf("r");
             indexLr>= 0;
             indexLr= line3.indexOf("r", indexLr+ 1))
        {
            if(Cr == 0){
                r1 = indexLr;
                Cr = Cr + 1;
                Lr1 = 3 - 1;
            }
            else{
                r2 = indexLr;
                Cr = Cr + 1;
                Lr2 = 3 - 1;
            }
        }
        for (indexLn= line3.indexOf("n");
             indexLn>= 0;
             indexLn= line3.indexOf("n", indexLn+ 1))
        {
            if(Cn == 0){
                n1 = indexLn;
                Cn = Cn + 1;
                Ln1 = 3 - 1;
            }
            else{
                n2 = indexLn;
                Cn = Cn + 1;
                Ln2 = 3 - 1;
            }
        }
        for (indexLb= line3.indexOf("b");
             indexLb>= 0;
             indexLb= line3.indexOf("b", indexLb+ 1))
        {
            if(Cb == 0){
                b1 = indexLb;
                Cb = Cb + 1;
                Lb1 = 3 - 1;
            }
            else{
                b2 = indexLb;
                Cb = Cb + 1;
                Lb2 = 3 - 1;
            }
        }
        for (indexLk= line3.indexOf("k");
             indexLk>= 0;
             indexLk= line3.indexOf("k", indexLk+ 1))
        {
            k = indexLk;
            Lk = 3 - 1;
        }
        for (indexLq= line3.indexOf("q");
             indexLq>= 0;
             indexLq= line3.indexOf("q", indexLq+ 1))
        {
            q = indexLq;
            Lq = 3 - 1;
        }
        for (indexLp= line3.indexOf("p");
             indexLp>= 0;
             indexLp= line3.indexOf("p", indexLp+ 1))
        {
            if(Cp == 0){
                p1 = indexLp;
                Cp = Cp + 1;
                Lp1 = 3 - 1;
            }
            else if(Cp == 1){
                p2 = indexLp;
                Cp = Cp + 1;
                Lp2 = 3 - 1;
            }
            else if(Cp == 2){
                p3 = indexLp;
                Cp = Cp + 1;
                Lp3 = 3 - 1;
            }
            else if(Cp == 3){
                p4 = indexLp;
                Cp = Cp + 1;
                Lp4 = 3 - 1;
            }
            else if(Cp == 4){
                p5 = indexLp;
                Cp = Cp + 1;
                Lp5 = 3 - 1;
            }
            else if(Cp == 5){
                p6 = indexLp;
                Cp = Cp + 1;
                Lp6 = 3 - 1;
            }
            else if(Cp == 6){
                p7 = indexLp;
                Cp = Cp + 1;
                Lp7 = 3 - 1;
            }
            else if(Cp == 7){
                p8 = indexLp;
                Cp = Cp + 1;
                Lp8 = 3 - 1;
            }
        }
        // System.out.println(" ");
        // Line 4
        for (indexR = line4.indexOf("R");
             indexR >= 0;
             indexR = line4.indexOf("R", indexR + 1))
        {
            if(CR == 0){
                R1 = indexR;
                CR = CR + 1;
                LR = 4 - 1;
            }
            else{
                R2 = indexR;
                CR = CR + 1;
                LR2 = 4 - 1;
            }
        }
        for (indexN = line4.indexOf("N");
             indexN >= 0;
             indexN = line4.indexOf("N", indexN + 1))
        {
            if(CN == 0){
                N1 = indexN;
                CN = CN + 1;
                LN = 4 - 1;
            }
            else{
                N2 = indexN;
                CN = CN + 1;
                LN2 = 4 - 1;
            }
        }
        for (indexB= line4.indexOf("B");
             indexB>= 0;
             indexB= line4.indexOf("B", indexB + 1))
        {
            if(CB == 0){
                B1 = indexB;
                CB = CB + 1;
                LB = 4 - 1;
            }
            else{
                B2 = indexB;
                CB = CB + 1;
                LB2 = 4 - 1;
            }
        }
        for (indexK= line4.indexOf("K");
             indexK>= 0;
             indexK= line4.indexOf("K", indexK+ 1))
        {
            K = indexK;
            LK = 4 - 1;
        }
        for (indexQ= line4.indexOf("Q");
             indexQ>= 0;
             indexQ= line4.indexOf("Q", indexQ+ 1))
        {
            Q = indexQ;
            LQ = 4 - 1;
        }
        for (indexP= line4.indexOf("P");
             indexP>= 0;
             indexP= line4.indexOf("P", indexP+ 1))
        {
            if(CP == 0){
                P1 = indexP;
                CP = CP + 1;
                LP1 = 4 - 1;
            }
            else if(CP == 1){
                P2 = indexP;
                CP = CP + 1;
                LP2 = 4 - 1;
            }
            else if(CP == 2){
                P3 = indexP;
                CP = CP + 1;
                LP3 = 4 - 1;
            }
            else if(CP == 3){
                P4 = indexP;
                CP = CP + 1;
                LP4 = 4 - 1;
            }
            else if(CP == 4){
                P5 = indexP;
                CP = CP + 1;
                LP5 = 4 - 1;
            }
            else if(CP == 5){
                P6 = indexP;
                CP = CP + 1;
                LP6 = 4 - 1;
            }
            else if(CP == 6){
                P7 = indexP;
                CP = CP + 1;
                LP7 = 4 - 1;
            }
            else if(CP == 7){
                P8 = indexP;
                CP = CP + 1;
                LP8 = 4 - 1;
            }
        }
        for (indexLr= line4.indexOf("r");
             indexLr>= 0;
             indexLr= line4.indexOf("r", indexLr+ 1))
        {
            if(Cr == 0){
                r1 = indexLr;
                Cr = Cr + 1;
                Lr1 = 4 - 1;
            }
            else{
                r2 = indexLr;
                Cr = Cr + 1;
                Lr2 = 4 - 1;
            }
        }
        for (indexLn= line4.indexOf("n");
             indexLn>= 0;
             indexLn= line4.indexOf("n", indexLn+ 1))
        {
            if(Cn == 0){
                n1 = indexLn;
                Cn = Cn + 1;
                Ln1 = 4 - 1;
            }
            else{
                n2 = indexLn;
                Cn = Cn + 1;
                Ln2 = 4 - 1;
            }
        }
        for (indexLb= line4.indexOf("b");
             indexLb>= 0;
             indexLb= line4.indexOf("b", indexLb+ 1))
        {
            if(Cb == 0){
                b1 = indexLb;
                Cb = Cb + 1;
                Lb1 = 4 - 1;
            }
            else{
                b2 = indexLb;
                Cb = Cb + 1;
                Lb2 = 4 - 1;
            }
        }
        for (indexLk= line4.indexOf("k");
             indexLk>= 0;
             indexLk= line4.indexOf("k", indexLk+ 1))
        {
            k = indexLk;
            Lk = 4 - 1;
        }
        for (indexLq= line4.indexOf("q");
             indexLq>= 0;
             indexLq= line4.indexOf("q", indexLq+ 1))
        {
            q = indexLq;
            Lq = 4 - 1;
        }
        for (indexLp= line4.indexOf("p");
             indexLp>= 0;
             indexLp= line4.indexOf("p", indexLp+ 1))
        {
            if(Cp == 0){
                p1 = indexLp;
                Cp = Cp + 1;
                Lp1 = 4 - 1;
            }
            else if(Cp == 1){
                p2 = indexLp;
                Cp = Cp + 1;
                Lp2 = 4 - 1;
            }
            else if(Cp == 2){
                p3 = indexLp;
                Cp = Cp + 1;
                Lp3 = 4 - 1;
            }
            else if(Cp == 3){
                p4 = indexLp;
                Cp = Cp + 1;
                Lp4 = 4 - 1;
            }
            else if(Cp == 4){
                p5 = indexLp;
                Cp = Cp + 1;
                Lp5 = 4 - 1;
            }
            else if(Cp == 5){
                p6 = indexLp;
                Cp = Cp + 1;
                Lp6 = 4 - 1;
            }
            else if(Cp == 6){
                p7 = indexLp;
                Cp = Cp + 1;
                Lp7 = 4 - 1;
            }
            else if(Cp == 7){
                p8 = indexLp;
                Cp = Cp + 1;
                Lp8 = 4 - 1;
            }
        }
        // System.out.println(" ");
        // Line 5
        for (indexR = line5.indexOf("R");
             indexR >= 0;
             indexR = line5.indexOf("R", indexR + 1))
        {
            if(CR == 0){
                R1 = indexR;
                CR = CR + 1;
                LR = 5 - 1;
            }
            else{
                R2 = indexR;
                CR = CR + 1;
                LR2 = 5 - 1;
            }
        }
        for (indexN = line5.indexOf("N");
             indexN >= 0;
             indexN = line5.indexOf("N", indexN + 1))
        {
            if(CN == 0){
                N1 = indexN;
                CN = CN + 1;
                LN = 5 - 1;
            }
            else{
                N2 = indexN;
                CN = CN + 1;
                LN2 = 5 - 1;
            }
        }
        for (indexB= line5.indexOf("B");
             indexB>= 0;
             indexB= line5.indexOf("B", indexB + 1))
        {
            if(CB == 0){
                B1 = indexB;
                CB = CB + 1;
                LB = 5 - 1;
            }
            else{
                B2 = indexB;
                CB = CB + 1;
                LB2 = 5 - 1;
            }
        }
        for (indexK= line5.indexOf("K");
             indexK>= 0;
             indexK= line5.indexOf("K", indexK+ 1))
        {
            K = indexK;
            LK = 5 - 1;
        }
        for (indexQ= line5.indexOf("Q");
             indexQ>= 0;
             indexQ= line5.indexOf("Q", indexQ+ 1))
        {
            Q = indexQ;
            LQ = 5 - 1;
        }
        for (indexP= line5.indexOf("P");
             indexP>= 0;
             indexP= line5.indexOf("P", indexP+ 1))
        {
            if(CP == 0){
                P1 = indexP;
                CP = CP + 1;
                LP1 = 5 - 1;
            }
            else if(CP == 1){
                P2 = indexP;
                CP = CP + 1;
                LP2 = 5 - 1;
            }
            else if(CP == 2){
                P3 = indexP;
                CP = CP + 1;
                LP3 = 5 - 1;
            }
            else if(CP == 3){
                P4 = indexP;
                CP = CP + 1;
                LP4 = 5 - 1;
            }
            else if(CP == 4){
                P5 = indexP;
                CP = CP + 1;
                LP5 = 5 - 1;
            }
            else if(CP == 5){
                P6 = indexP;
                CP = CP + 1;
                LP6 = 5 - 1;
            }
            else if(CP == 6){
                P7 = indexP;
                CP = CP + 1;
                LP7 = 5 - 1;
            }
            else if(CP == 7){
                P8 = indexP;
                CP = CP + 1;
                LP8 = 5 - 1;
            }
        }
        for (indexLr= line5.indexOf("r");
             indexLr>= 0;
             indexLr= line5.indexOf("r", indexLr+ 1))
        {
            if(Cr == 0){
                r1 = indexLr;
                Cr = Cr + 1;
                Lr1 = 5 - 1;
            }
            else{
                r2 = indexLr;
                Cr = Cr + 1;
                Lr2 = 5 - 1;
            }
        }
        for (indexLn= line5.indexOf("n");
             indexLn>= 0;
             indexLn= line5.indexOf("n", indexLn+ 1))
        {
            if(Cn == 0){
                n1 = indexLn;
                Cn = Cn + 1;
                Ln1 = 5 - 1;
            }
            else{
                n2 = indexLn;
                Cn = Cn + 1;
                Ln2 = 5 - 1;
            }
        }
        for (indexLb= line5.indexOf("b");
             indexLb>= 0;
             indexLb= line5.indexOf("b", indexLb+ 1))
        {
            if(Cb == 0){
                b1 = indexLb;
                Cb = Cb + 1;
                Lb1 = 5 - 1;
            }
            else{
                b2 = indexLb;
                Cb = Cb + 1;
                Lb2 = 5 - 1;
            }
        }
        for (indexLk= line5.indexOf("k");
             indexLk>= 0;
             indexLk= line5.indexOf("k", indexLk+ 1))
        {
            k = indexLk;
            Lk = 5 - 1;
        }
        for (indexLq= line5.indexOf("q");
             indexLq>= 0;
             indexLq= line5.indexOf("q", indexLq+ 1))
        {
            q = indexLq;
            Lq = 5 - 1;
        }
        for (indexLp= line5.indexOf("p");
             indexLp>= 0;
             indexLp= line5.indexOf("p", indexLp+ 1))
        {
            if(Cp == 0){
                p1 = indexLp;
                Cp = Cp + 1;
                Lp1 = 5 - 1;
            }
            else if(Cp == 1){
                p2 = indexLp;
                Cp = Cp + 1;
                Lp2 = 5 - 1;
            }
            else if(Cp == 2){
                p3 = indexLp;
                Cp = Cp + 1;
                Lp3 = 5 - 1;
            }
            else if(Cp == 3){
                p4 = indexLp;
                Cp = Cp + 1;
                Lp4 = 5 - 1;
            }
            else if(Cp == 4){
                p5 = indexLp;
                Cp = Cp + 1;
                Lp5 = 5 - 1;
            }
            else if(Cp == 5){
                p6 = indexLp;
                Cp = Cp + 1;
                Lp6 = 5 - 1;
            }
            else if(Cp == 6){
                p7 = indexLp;
                Cp = Cp + 1;
                Lp7 = 5 - 1;
            }
            else if(Cp == 7){
                p8 = indexLp;
                Cp = Cp + 1;
                Lp8 = 5 - 1;
            }
        }
        // System.out.println(" ");
        // Line 6
        for (indexR = line6.indexOf("R");
             indexR >= 0;
             indexR = line6.indexOf("R", indexR + 1))
        {
            if(CR == 0){
                R1 = indexR;
                CR = CR + 1;
                LR = 6 - 1;
            }
            else{
                R2 = indexR;
                CR = CR + 1;
                LR2 = 6 - 1;
            }
        }
        for (indexN = line6.indexOf("N");
             indexN >= 0;
             indexN = line6.indexOf("N", indexN + 1))
        {
            if(CN == 0){
                N1 = indexN;
                CN = CN + 1;
                LN = 6 - 1;
            }
            else{
                N2 = indexN;
                CN = CN + 1;
                LN2 = 6 - 1;
            }
        }
        for (indexB= line6.indexOf("B");
             indexB>= 0;
             indexB= line6.indexOf("B", indexB + 1))
        {
            if(CB == 0){
                B1 = indexB;
                CB = CB + 1;
                LB = 6 - 1;
            }
            else{
                B2 = indexB;
                CB = CB + 1;
                LB2 = 6 - 1;
            }
        }
        for (indexK= line6.indexOf("K");
             indexK>= 0;
             indexK= line6.indexOf("K", indexK+ 1))
        {
            K = indexK;
            LK = 6 - 1;
        }
        for (indexQ= line6.indexOf("Q");
             indexQ>= 0;
             indexQ= line6.indexOf("Q", indexQ+ 1))
        {
            Q = indexQ;
            LQ = 6 - 1;
        }
        for (indexP= line6.indexOf("P");
             indexP>= 0;
             indexP= line6.indexOf("P", indexP+ 1))
        {
            if(CP == 0){
                P1 = indexP;
                CP = CP + 1;
                LP1 = 6 - 1;
            }
            else if(CP == 1){
                P2 = indexP;
                CP = CP + 1;
                LP2 = 6 - 1;
            }
            else if(CP == 2){
                P3 = indexP;
                CP = CP + 1;
                LP3 = 6 - 1;
            }
            else if(CP == 3){
                P4 = indexP;
                CP = CP + 1;
                LP4 = 6 - 1;
            }
            else if(CP == 4){
                P5 = indexP;
                CP = CP + 1;
                LP5 = 6 - 1;
            }
            else if(CP == 5){
                P6 = indexP;
                CP = CP + 1;
                LP6 = 6 - 1;
            }
            else if(CP == 6){
                P7 = indexP;
                CP = CP + 1;
                LP7 = 6 - 1;
            }
            else if(CP == 7){
                P8 = indexP;
                CP = CP + 1;
                LP8 = 6 - 1;
            }
        }
        for (indexLr= line6.indexOf("r");
             indexLr>= 0;
             indexLr= line6.indexOf("r", indexLr+ 1))
        {
            if(Cr == 0){
                r1 = indexLr;
                Cr = Cr + 1;
                Lr1 = 6 - 1;
            }
            else{
                r2 = indexLr;
                Cr = Cr + 1;
                Lr2 = 6 - 1;
            }
        }
        for (indexLn= line6.indexOf("n");
             indexLn>= 0;
             indexLn= line6.indexOf("n", indexLn+ 1))
        {
            if(Cn == 0){
                n1 = indexLn;
                Cn = Cn + 1;
                Ln1 = 6 - 1;
            }
            else{
                n2 = indexLn;
                Cn = Cn + 1;
                Ln2 = 6 - 1;
            }
        }
        for (indexLb= line6.indexOf("b");
             indexLb>= 0;
             indexLb= line6.indexOf("b", indexLb+ 1))
        {
            if(Cb == 0){
                b1 = indexLb;
                Cb = Cb + 1;
                Lb1 = 6 - 1;
            }
            else{
                b2 = indexLb;
                Cb = Cb + 1;
                Lb2 = 6 - 1;
            }
        }
        for (indexLk= line6.indexOf("k");
             indexLk>= 0;
             indexLk= line6.indexOf("k", indexLk+ 1))
        {
            k = indexLk;
            Lk = 6 - 1;
        }
        for (indexLq= line6.indexOf("q");
             indexLq>= 0;
             indexLq= line6.indexOf("q", indexLq+ 1))
        {
            q = indexLq;
            Lq = 6 - 1;
        }
        for (indexLp= line6.indexOf("p");
             indexLp>= 0;
             indexLp= line6.indexOf("p", indexLp+ 1))
        {
            if(Cp == 0){
                p1 = indexLp;
                Cp = Cp + 1;
                Lp1 = 6 - 1;
            }
            else if(Cp == 1){
                p2 = indexLp;
                Cp = Cp + 1;
                Lp2 = 6 - 1;
            }
            else if(Cp == 2){
                p3 = indexLp;
                Cp = Cp + 1;
                Lp3 = 6 - 1;
            }
            else if(Cp == 3){
                p4 = indexLp;
                Cp = Cp + 1;
                Lp4 = 6 - 1;
            }
            else if(Cp == 4){
                p5 = indexLp;
                Cp = Cp + 1;
                Lp5 = 6 - 1;
            }
            else if(Cp == 5){
                p6 = indexLp;
                Cp = Cp + 1;
                Lp6 = 6 - 1;
            }
            else if(Cp == 6){
                p7 = indexLp;
                Cp = Cp + 1;
                Lp7 = 6 - 1;
            }
            else if(Cp == 7){
                p8 = indexLp;
                Cp = Cp + 1;
                Lp8 = 6 - 1;
            }
        }
        // System.out.println(" ");
        // Line 7
        for (indexR = line7.indexOf("R");
             indexR >= 0;
             indexR = line7.indexOf("R", indexR + 1))
        {
            if(CR == 0){
                R1 = indexR;
                CR = CR + 1;
                LR = 7 - 1;
            }
            else{
                R2 = indexR;
                CR = CR + 1;
                LR2 = 7 - 1;
            }
        }
        for (indexN = line7.indexOf("N");
             indexN >= 0;
             indexN = line7.indexOf("N", indexN + 1))
        {
            if(CN == 0){
                N1 = indexN;
                CN = CN + 1;
                LN = 7 - 1;
            }
            else{
                N2 = indexN;
                CN = CN + 1;
                LN2 = 7 - 1;
            }
        }
        for (indexB= line7.indexOf("B");
             indexB>= 0;
             indexB= line7.indexOf("B", indexB + 1))
        {
            if(CB == 0){
                B1 = indexB;
                CB = CB + 1;
                LB = 7 - 1;
            }
            else{
                B2 = indexB;
                CB = CB + 1;
                LB2 = 7 - 1;
            }
        }
        for (indexK= line7.indexOf("K");
             indexK>= 0;
             indexK= line7.indexOf("K", indexK+ 1))
        {
            K = indexK;
            LK = 7 - 1;
        }
        for (indexQ= line7.indexOf("Q");
             indexQ>= 0;
             indexQ= line7.indexOf("Q", indexQ+ 1))
        {
            Q = indexQ;
            LQ = 7 - 1;
        }
        for (indexP= line7.indexOf("P");
             indexP>= 0;
             indexP= line7.indexOf("P", indexP+ 1))
        {
            if(CP == 0){
                P1 = indexP;
                CP = CP + 1;
                LP1 = 7 - 1;
            }
            else if(CP == 1){
                P2 = indexP;
                CP = CP + 1;
                LP2 = 7 - 1;
            }
            else if(CP == 2){
                P3 = indexP;
                CP = CP + 1;
                LP3 = 7 - 1;
            }
            else if(CP == 3){
                P4 = indexP;
                CP = CP + 1;
                LP4 = 7 - 1;
            }
            else if(CP == 4){
                P5 = indexP;
                CP = CP + 1;
                LP5 = 7 - 1;
            }
            else if(CP == 5){
                P6 = indexP;
                CP = CP + 1;
                LP6 = 7 - 1;
            }
            else if(CP == 6){
                P7 = indexP;
                CP = CP + 1;
                LP7 = 7 - 1;
            }
            else if(CP == 7){
                P8 = indexP;
                CP = CP + 1;
                LP8 = 7 - 1;
            }
        }
        for (indexLr= line7.indexOf("r");
             indexLr>= 0;
             indexLr= line7.indexOf("r", indexLr+ 1))
        {
            if(Cr == 0){
                r1 = indexLr;
                Cr = Cr + 1;
                Lr1 = 7 - 1;
            }
            else{
                r2 = indexLr;
                Cr = Cr + 1;
                Lr2 = 7 - 1;
            }
        }
        for (indexLn= line7.indexOf("n");
             indexLn>= 0;
             indexLn= line7.indexOf("n", indexLn+ 1))
        {
            if(Cn == 0){
                n1 = indexLn;
                Cn = Cn + 1;
                Ln1 = 7 - 1;
            }
            else{
                n2 = indexLn;
                Cn = Cn + 1;
                Ln2 = 7 - 1;
            }
        }
        for (indexLb= line7.indexOf("b");
             indexLb>= 0;
             indexLb= line7.indexOf("b", indexLb+ 1))
        {
            if(Cb == 0){
                b1 = indexLb;
                Cb = Cb + 1;
                Lb1 = 7 - 1;
            }
            else{
                b2 = indexLb;
                Cb = Cb + 1;
                Lb2 = 7 - 1;
            }
        }
        for (indexLk= line7.indexOf("k");
             indexLk>= 0;
             indexLk= line7.indexOf("k", indexLk+ 1))
        {
            k = indexLk;
            Lk = 7 - 1;
        }
        for (indexLq= line7.indexOf("q");
             indexLq>= 0;
             indexLq= line7.indexOf("q", indexLq+ 1))
        {
            q = indexLq;
            Lq = 7 - 1;
        }
        for (indexLp= line7.indexOf("p");
             indexLp>= 0;
             indexLp= line7.indexOf("p", indexLp+ 1))
        {
            if(Cp == 0){
                p1 = indexLp;
                Cp = Cp + 1;
                Lp1 = 7 - 1;
            }
            else if(Cp == 1){
                p2 = indexLp;
                Cp = Cp + 1;
                Lp2 = 7 - 1;
            }
            else if(Cp == 2){
                p3 = indexLp;
                Cp = Cp + 1;
                Lp3 = 7 - 1;
            }
            else if(Cp == 3){
                p4 = indexLp;
                Cp = Cp + 1;
                Lp4 = 7 - 1;
            }
            else if(Cp == 4){
                p5 = indexLp;
                Cp = Cp + 1;
                Lp5 = 7 - 1;
            }
            else if(Cp == 5){
                p6 = indexLp;
                Cp = Cp + 1;
                Lp6 = 7 - 1;
            }
            else if(Cp == 6){
                p7 = indexLp;
                Cp = Cp + 1;
                Lp7 = 7 - 1;
            }
            else if(Cp == 7){
                p8 = indexLp;
                Cp = Cp + 1;
                Lp8 = 7 - 1;
            }
        }
        // System.out.println(" ");
        // Line 8
        for (indexR = line8.indexOf("R");
             indexR >= 0;
             indexR = line8.indexOf("R", indexR + 1))
        {
            if(CR == 0){
                R1 = indexR;
                CR = CR + 1;
                LR = 8 - 1;
            }
            else{
                R2 = indexR;
                CR = CR + 1;
                LR2 = 8 - 1;
            }
        }
        for (indexN = line8.indexOf("N");
             indexN >= 0;
             indexN = line8.indexOf("N", indexN + 1))
        {
            if(CN == 0){
                N1 = indexN;
                CN = CN + 1;
                LN = 8 - 1;
            }
            else{
                N2 = indexN;
                CN = CN + 1;
                LN2 = 8 - 1;
            }
        }
        for (indexB= line8.indexOf("B");
             indexB>= 0;
             indexB= line8.indexOf("B", indexB + 1))
        {
            if(CB == 0){
                B1 = indexB;
                CB = CB + 1;
                LB = 8 - 1;
            }
            else{
                B2 = indexB;
                CB = CB + 1;
                LB2 = 8 - 1;
            }
        }
        for (indexK= line8.indexOf("K");
             indexK>= 0;
             indexK= line8.indexOf("K", indexK+ 1))
        {
            K = indexK;
            LK = 8 - 1;
        }
        for (indexQ= line8.indexOf("Q");
             indexQ>= 0;
             indexQ= line8.indexOf("Q", indexQ+ 1))
        {
            Q = indexQ;
            LQ = 8 - 1;
        }
        for (indexP= line8.indexOf("P");
             indexP>= 0;
             indexP= line8.indexOf("P", indexP+ 1))
        {
            if(CP == 0){
                P1 = indexP;
                CP = CP + 1;
                LP1 = 8 - 1;
            }
            else if(CP == 1){
                P2 = indexP;
                CP = CP + 1;
                LP2 = 8 - 1;
            }
            else if(CP == 2){
                P3 = indexP;
                CP = CP + 1;
                LP3 = 8 - 1;
            }
            else if(CP == 3){
                P4 = indexP;
                CP = CP + 1;
                LP4 = 8 - 1;
            }
            else if(CP == 4){
                P5 = indexP;
                CP = CP + 1;
                LP5 = 8 - 1;
            }
            else if(CP == 5){
                P6 = indexP;
                CP = CP + 1;
                LP6 = 8 - 1;
            }
            else if(CP == 6){
                P7 = indexP;
                CP = CP + 1;
                LP7 = 8 - 1;
            }
            else if(CP == 7){
                P8 = indexP;
                CP = CP + 1;
                LP8 = 8 - 1;
            }
        }
        for (indexLr= line8.indexOf("r");
             indexLr>= 0;
             indexLr= line8.indexOf("r", indexLr+ 1))
        {
            if(Cr == 0){
                r1 = indexLr;
                Cr = Cr + 1;
                Lr1 = 8 - 1;
            }
            else{
                r2 = indexLr;
                Cr = Cr + 1;
                Lr2 = 8 - 1;
            }
        }
        for (indexLn= line8.indexOf("n");
             indexLn>= 0;
             indexLn= line8.indexOf("n", indexLn+ 1))
        {
            if(Cn == 0){
                n1 = indexLn;
                Cn = Cn + 1;
                Ln1 = 8 - 1;
            }
            else{
                n2 = indexLn;
                Cn = Cn + 1;
                Ln2 = 8 - 1;
            }
        }
        for (indexLb= line8.indexOf("b");
             indexLb>= 0;
             indexLb= line8.indexOf("b", indexLb+ 1))
        {
            if(Cb == 0){
                b1 = indexLb;
                Cb = Cb + 1;
                Lb1 = 8 - 1;
            }
            else{
                b2 = indexLb;
                Cb = Cb + 1;
                Lb2 = 8 - 1;
            }
        }
        for (indexLk= line8.indexOf("k");
             indexLk>= 0;
             indexLk= line8.indexOf("k", indexLk+ 1))
        {
            k = indexLk;
            Lk = 8 - 1;
        }
        for (indexLq= line8.indexOf("q");
             indexLq>= 0;
             indexLq= line8.indexOf("q", indexLq+ 1))
        {
            q = indexLq;
            Lq = 8 - 1;
        }
        for (indexLp= line8.indexOf("p");
             indexLp>= 0;
             indexLp= line8.indexOf("p", indexLp+ 1))
        {
            if(Cp == 0){
                p1 = indexLp;
                Cp = Cp + 1;
                Lp1 = 8 - 1;
            }
            else if(Cp == 1){
                p2 = indexLp;
                Cp = Cp + 1;
                Lp2 = 8 - 1;
            }
            else if(Cp == 2){
                p3 = indexLp;
                Cp = Cp + 1;
                Lp3 = 8 - 1;
            }
            else if(Cp == 3){
                p4 = indexLp;
                Cp = Cp + 1;
                Lp4 = 8 - 1;
            }
            else if(Cp == 4){
                p5 = indexLp;
                Cp = Cp + 1;
                Lp5 = 8 - 1;
            }
            else if(Cp == 5){
                p6 = indexLp;
                Cp = Cp + 1;
                Lp6 = 8 - 1;
            }
            else if(Cp == 6){
                p7 = indexLp;
                Cp = Cp + 1;
                Lp7 = 8 - 1;
            }
            else if(Cp == 7){
                p8 = indexLp;
                Cp = Cp + 1;
                Lp8 = 8 - 1;
            }
        }

        // System.out.print(R1);
        // System.out.print(R2);
        // System.out.print(N1);
        // System.out.print(N2);
        // System.out.print(B1);
        // System.out.print(B2);
        // System.out.print(K);
        // System.out.println(Q);
        // System.out.print(P1);
        // System.out.print(P2);
        // System.out.print(P3);
        // System.out.print(P4);
        // System.out.print(P5);
        // System.out.print(P6);
        // System.out.print(P7);
        // System.out.println(P8);
        // System.out.print(r1);
        // System.out.print(r2);
        // System.out.print(n1);
        // System.out.print(n2);
        // System.out.print(b1);
        // System.out.print(b2);
        // System.out.print(k);
        // System.out.println(q);
        // System.out.print(p1);
        // System.out.print(p2);
        // System.out.print(p3);
        // System.out.print(p4);
        // System.out.print(p5);
        // System.out.print(p6);
        // System.out.print(p7);
        // System.out.println(p8);
    }
}
