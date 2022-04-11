package com.company;

public class DivideString {
    public static void main(String[] args) {
        String s="aabccb";
        int size=s.length();
        int n=3;
        int partsize=size/n;
        for(int i=0;i<size;i++){
        if(i%partsize==0)
        System.out.println();
        System.out.print(s.charAt(i));
    }
    }
}
