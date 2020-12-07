//  STANDART INPUT:
//

//  Neither
//  IPv4
//  IPv6

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            String s = sc.nextLine();

            if (s.replaceFirst("^\\d{2,3}\\.\\d{2,3}.\\d{2,3}\\.\\d{2,3}$","q").equals("q"))
                System.out.println("IPv4");
            else if (s.replaceFirst("^([a-z0-9]{1,4}:[a-z0-9]{1,4}:[a-z0-9]{1,4}:[a-z0-9]{1,4}:[a-z0-9]{1,4}:[a-z0-9]{1,4}:[a-z0-9]{1,4}:[a-z0-9]{1,4})$","q").equals("q"))
                System.out.println("IPv6");
            else
                System.out.println("Neither");
            }
    }
}
