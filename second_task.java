package com.company;

public class second_task {
    public static void main(String[] args){
        int[] arr=new int[20];
        int i;
        for( i=0; i< arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for( i=0; i< arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
            else{
                System.out.print(0 + " ");
            }

        }
    }
}
