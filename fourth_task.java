package com.company;

public class fourth_task {
    public static void main(String[] args){
        int[] arr1 = new int[10];
        int i;
        for(i=0; i< arr1.length; i++){
            arr1[i]=(int)(Math.random()*11);
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        int[] arr2=new int[10];
        for(i=0; i< arr2.length; i++){
            arr2[i]=(int)(Math.random()*11);
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        int[] arr3=new int[10];
        for(i=0; i<arr3.length; i++){
            arr3[i]=arr1[i]+arr2[i];
            System.out.print(arr3[i]+" ");
        }
    }
}
