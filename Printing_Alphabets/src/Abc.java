public class Abc {
    public static void main(String[] args) {
        String[] A = {
                "  *  ",
                " * * ",
                "*   *",
                "*****",
                "*   *"
        };

        String[] B = {
                "**** ",
                "*   *",
                "**** ",
                "*   *",
                "**** "
        };

        String[] C = {
                " ****",
                "*    ",
                "*    ",
                "*    ",
                " ****"
        };

        String[][] letters = {A, B, C};

        for (int i = 0; i < 5; i++) {
            for (String[] letter : letters) {
                System.out.print(letter[i] + "  ");
            }
            System.out.println();
        }
    }
}