import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    private int[] array = new int[1];
    private int count = 0;

    public void menu() {
        Scanner scan = new Scanner(System.in);
        boolean exit = true;
        do {
            System.out.println("Enter The Numbers : ");
            System.out.println("\t1. Input the Number.");
            System.out.println("\t2. View the Number.");
            System.out.println("\t3. Exit.");
            System.out.print("Enter Number;");
            int choice = scan.nextInt();

            switch (choice) {
                case 1 : {
                    boolean out = true;
                    do {
                        System.out.print("Enter negative Number to exit : ");
                        int num = scan.nextInt();

                        if(num<0) {
                            out = false;
                        }else {
                            array = this.addMoreArray(array);
                            array[count] = num;
                            count++;
                        }

                    }while(out);

                    break;
                }
                case 2 : {
                    this.show();
                    break;
                }
                case 3 : {
                    exit = false;
                    break;
                }
                default: {
                    System.out.println("mtfker Wrong choice !");
                }
            }


        }while(exit);
    }



    public int[] addMoreArray (int[] value) {
        int[] result = new int[count+1];

        for(int i=0; i< array.length; i++) {
            result[i] = array[i];
        }

        return result;
    }

    public void show () {
        System.out.println(Arrays.toString(this.array));
    }
}