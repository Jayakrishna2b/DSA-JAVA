//for loop
package com.krishna;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int n = input.nextInt();
        for (int num = 1; num <= n ; num++) {
            System.out.println("krishna");

        }
    }
}


//while loop

package com.krishna;

public class whileloop {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 10){
            System.out.println(num);
            num += 1;
        }
    }
}


//do while loop

package com.krishna;

public class dowhileloop {
    public static void main(String[] args) {
        int n = 1;
        do{
            System.out.println("krishna");
        }while (n != 1);
    }
}
