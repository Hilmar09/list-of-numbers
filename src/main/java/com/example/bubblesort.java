package com.example;

import java.util.ArrayList;

public  class bubblesort {
    public static void bubblesort(int[] myArray){
     int n = myArray.length;
     for (int i=0; i < n-1; i++){
        for (int j=0;j<n -i -1; j++){
            if(myArray[j] >myArray[j + 1]){
                int temp = myArray[j];
                myArray[j] = myArray[j + 1];
                myArray[j + 1] = temp;
            }
        }
    }
     }

   public static void main(String[] args){
    int [] arr ={10,9,8,7,6,5};

    System.out.println("Array before sorting:");
    for(int num: arr){
        System.out.println(num +"");
    }
    bubblesort(arr);
    System.out.println("\n Array after sorting:");
    for(int num : arr){
        System.out.println(num +"");
    }
   }
}  

