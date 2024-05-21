public class morsecode {
    public static BSTNode rootnode;
    public void encode(){
        rootnode = new BSTNode("");

        BSTNode E = new BSTNode("E");
        BSTNode T = new BSTNode("T");

        BSTNode I = new BSTNode("I");
        BSTNode A = new BSTNode("A");
        BSTNode N = new BSTNode("N");
        BSTNode M = new BSTNode("M");

        BSTNode S = new BSTNode("S");
        BSTNode U = new BSTNode("U");
        BSTNode R = new BSTNode("R");
        BSTNode W = new BSTNode("W");
        BSTNode D = new BSTNode("D");
        BSTNode K = new BSTNode("K");
        BSTNode G = new BSTNode("G");
        BSTNode O = new BSTNode("O");

        BSTNode H = new BSTNode("H");
        BSTNode V = new BSTNode("V");
        BSTNode F = new BSTNode("F");
        BSTNode L = new BSTNode("L");
        BSTNode P = new BSTNode("P");
        BSTNode J = new BSTNode("J");
        BSTNode B = new BSTNode("B");
        BSTNode X = new BSTNode("X");
        BSTNode C = new BSTNode("C");
        BSTNode Y = new BSTNode("Y");
        BSTNode Z = new BSTNode("Z");
        BSTNode Q = new BSTNode("Q");

        rootnode.setLeft(E);
        rootnode.setRight(T);

        E.setLeft(I);
        E.setRight(A);

        T.setLeft(N);
        T.setRight(M);

        I.setLeft(S);
        I.setRight(U);

        A.setLeft(R);
        A.setRight(W);

        N.setLeft(D);
        N.setRight(K);

        M.setLeft(G);
        M.setRight(O);

        S.setLeft(H);
        S.setRight(V);

        U.setLeft(F);
        U.setRight(null);

        R.setLeft(L);
        R.setRight(null);

        W.setLeft(J);
        W.setRight(B);

        D.setLeft(X);
        D.setRight(C);

        K.setLeft(Y);
        K.setRight(Z);

        O.setRight(null);
        O.setLeft(null);
    }

    public morsecode() {
        encode();
    }

}
