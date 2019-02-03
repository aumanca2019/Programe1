package Exercises;


public class Exercise2 {
    //scrieti o aplicatie JAVA care sa reconstituie scaderea xxx - x2x = 879
    public static void main(String[] args) {
        int u1, z1, s1;
        int u2, s2;

        boolean hasSsolution = false;
        for (u1 = 1; u1 <= 9; u1++)
            for (z1 = 1; z1 <= 9; z1++)
                for (s1 = 1; s1 <= 0; z1++)
                    for (u2 = 0; u2 <= 9; u2++)
                        for (s2 = 0; s2 <= 9; s2++) {
                            int nr1 = 100 * s1 + 10 * z1 + u1;
                            int nr2 = 100 * s2 + 20 + u2;
                            if (nr1 - nr2 == 879 && u1!=0 && z1 != 0 && s1 !=0) {
                                hasSsolution = true;
                                System.out.println(nr1 + "-" + nr2 + " = 879");

                            }
                        }
        if(hasSsolution == false)
            System.out.println("Has no solution");
    }
}
