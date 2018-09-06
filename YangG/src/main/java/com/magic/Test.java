package com.magic;

import java.util.*;

    public class Test{
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        while(in.hasNext()) {
            String[] str = in.nextLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int l = Integer.parseInt(str[1]);
            int[] lamp = new int[n];
            int maxDist = 0;
            String[] allLamp = in.nextLine().split(" ");
            for (int i = 0; i < n; i++) {
                lamp[i] = Integer.parseInt(allLamp[i]);
            }
            Arrays.sort(lamp);
            for (int i = 1; i < n; i++) {
                maxDist = Math.max(maxDist, lamp[i] - lamp[i - 1]);
            }
            maxDist = Math.max(maxDist, 2 * Math.max(lamp[0], l - lamp[n - 1]));
            System.out.println(String.format("%.2f", maxDist / 2.0));
        }
    }
}