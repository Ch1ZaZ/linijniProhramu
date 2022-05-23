package com.company;

public class first_task {
    public static void main(String[] args){
        int[] arr= new int[50];
        for(int i=0, k=1; i<50; i++, k+=2){
            arr[i]=k;
            System.out.println(arr[i]);
        }
    }
}
