package com.company;

public class AlternatePrime {
    public static void main(String[] args) {
        int num=20,i,j,count=0,k=2;
        for(i=0;i<=num;i++){
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }if(count==2){
                if(k%2==0) {
                    System.out.println(i);
                }
                    k++;
                }count=0;
            }
        }
    }