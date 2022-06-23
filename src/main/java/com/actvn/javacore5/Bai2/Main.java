/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.javacore5.Bai2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Tan khoa
 */
class Main {
     static Scanner sc = new Scanner(System.in);

    static void nhap(int a[], int n)
{
    for(int i=0; i<n; i++)
    {
        a[i] = sc.nextInt();
    }
}
 
static void hienThi(int a[], int n)
{
    for(int k=0; k<n; k++)
    {
        System.out.printf("%4d", a[k]);
    }
 
}
 
static void swap(int a[], int i, int j)
{
    int tg = a[i];
    a[i] = a[j];
    a[j] = tg;
}
 
 
 
static void sap_xep_chon(int x[],int n)
{
    int dong=1;
    int i,j,index_min;
    for(i=n-1; i>0; i--)
    {
        index_min = i;
        for(j=i+1; j<n; j++)
        {
            if(x[j]>x[index_min])
            {
                index_min = j;
            }
        }
        if(index_min != i)
        {
            swap(x,i,index_min);
            System.out.printf("%4d: ", dong);
            hienThi(x,n);
            dong++;
            System.out.printf("\n");
        }
         
    }
}

    public static void main(String[] args) {
        //System.setIn(new FileInputStream("D:\\Input\\input.txt"));
        int n;
        int arr[] = new int[1000];
        n = sc.nextInt();
        nhap(arr, n);
        int i = 0;
        System.out.printf("%4d: ", i);
        hienThi(arr, n);
        System.out.println();
        sap_xep_chon(arr, n);
    }
}
