import java.util.Scanner;

public class PatternPrint {

    private char pattern = '\u0000';
    private int size = 0;

    private char getPattern()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose the pattern");
        this.pattern = input.next().charAt(0);
        return pattern;
    }

    public int getSize(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose the size");
        this.size = input.nextInt();
        return size;
    }

    public void Print() {
        if (pattern == 'a') {
            for (int i = 0; i < size; i++) {
                if (i > 0 && i < size - 1) {
                    for (int j = 0; j < size; j++) {
                        if (j == 0) {
                            System.out.print(" #");
                        } else if (j == size - 1) {
                            System.out.print(" #\n");
                        } else {
                            System.out.print("  ");
                        }
                    }
                } else {
                    for (int j = 0; j < size; j++) {
                        System.out.print(" #");
                        if (j == size - 1) {
                            System.out.printf("\n");
                        }
                    }

                }
            }
        }
        if (pattern == 'b') {
            for (int i = 0; i < size; i++) {
                if (i > 0 && i < size - 1) {
                    for (int j = 0; j < size; j++) {
                        if (j == i) {
                            System.out.print(" #");
                        } else {
                            System.out.print("  ");
                        }
                        if (j == size - 1) {
                            System.out.printf("\n");
                        }
                    }
                } else {
                    for (int j = 0; j < size; j++) {
                        System.out.print(" #");
                        if (j == size - 1) {
                            System.out.printf("\n");
                        }
                    }

                }
            }
        }

        if (pattern == 'c') {
            for (int i = 0; i < size; i++) {
                if (i > 0 && i < size - 1) {
                    for (int j = 0; j < size; j++) {
                        if (j == size - i - 1) {
                            System.out.print(" #");
                        } else {
                            System.out.print("  ");
                        }
                        if (j == size - 1) {
                            System.out.printf("\n");
                        }
                    }
                } else {
                    for (int j = 0; j < size; j++) {
                        System.out.print(" #");
                        if (j == size - 1) {
                            System.out.printf("\n");
                        }
                    }

                }
            }

        }



        if (pattern == 'd') {
            for (int i = 0; i < size; i++) {
                if (i > 0 && i < size - 1) {
                    for (int j = 0; j < size; j++) {
                        if (j == size - i - 1 || j==i) {
                            System.out.print(" #");
                        } else {
                            System.out.print("  ");
                        }
                        if (j == size - 1) {
                            System.out.printf("\n");
                        }
                    }
                } else {
                    for (int j = 0; j < size; j++) {
                        System.out.print(" #");
                        if (j == size - 1) {
                            System.out.printf("\n");
                        }
                    }

                }
            }

        }


        if (pattern == 'e') {
            for (int i = 0; i < size; i++) {
                if (i > 0 && i < size - 1) {
                    for (int j = 0; j < size; j++) {
                        if (j == size - i - 1 || j==i || j==0 || j==size-1) {
                            System.out.print(" #");
                        } else {
                            System.out.print("  ");
                        }
                        if (j == size - 1) {
                            System.out.printf("\n");
                        }
                    }
                } else {
                    for (int j = 0; j < size; j++) {
                        System.out.print(" #");
                        if (j == size - 1) {
                            System.out.printf("\n");
                        }
                    }

                }
            }

        }
    }






    public static void main(String[] args) {

        PatternPrint pr = new PatternPrint();
        pr.getPattern();
        pr.getSize();
        pr.Print();
    }
}
