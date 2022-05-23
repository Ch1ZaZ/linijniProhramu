package com.company;

public class third_task {
    public static void main(String[] args){
        int[] arr1=new int[5];
        int sum1=0, sum2=0, sum3=0;
        for(int i=0; i< arr1.length; i++){
            arr1[i]=(int)(Math.random()*6);
            System.out.print(arr1[i]+" ");
            sum1 = sum1+arr1[i];
        }
        System.out.println();

        int[] arr2=new int[5];
        for(int i=0; i< arr2.length; i++){
            arr2[i]=(int)(Math.random()*6);
            System.out.print(arr2[i]+" ");
            sum2 = sum2+arr2[i];
        }
        System.out.println();

        int[] arr3=new int[5];
        for(int i=0; i< arr3.length; i++){
            arr3[i]=(int)(Math.random()*6);
            System.out.print(arr3[i]+" ");
            sum3 = sum3+arr3[i];
        }
        double sz1, sz2, sz3;
        sz1=sum1/5.0;
        sz2=sum2/5.0;
        sz3=sum3/5.0;

        System.out.println();

        if(sz1>sz2 && sz1>sz3) {
            System.out.println("Середнє значення 1-го масиву найбльше");
        }
        if(sz2>sz1 && sz2>sz3) {
            System.out.println("Середнє значення 2-го масиву найбльше");
        }
        if(sz3>sz2 && sz3>sz1) {
            System.out.println("Середнє значення 3-го масиву найбльше");
        }
        if (sz1==sz2 && sz1==sz3){
            System.out.println("Средні значення масивів рівні");
        }
        if(sz1==sz2){
            System.out.println("Середні значення 1-го та 2-го масивів рівні та найбільші");
        }
        if(sz1==sz3){
            System.out.println("Середні значення 1-го та 3-го масивів рівні та найбільші");
        }
        if(sz2==sz3){
            System.out.println("Середні значення 2-го та 3-го масивів рівні та найбільші");
        }


    }
}
