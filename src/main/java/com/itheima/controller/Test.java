package com.itheima.controller;


/**
 * Author: Mr.Wu
 * 日期：2018/10/18  23:28
 * company：Itheima
 * 业精于勤荒于嬉、行成于思毁于随
 * 加油加油加油
 */
public class Test {


    public static void main(String[] args) {

        int[] arr={1,0,0,8,6};

        long start = System.currentTimeMillis();

        for (int i=0;i<arr.length-1;i++){

            for (int j=0;j<arr.length-i-1;j++){

                if (arr[j]<arr[j+1]){
                    int temp=arr[j];

                    arr[j]=arr[j+1];

                    arr[j+1]=temp;
                }
            }
        }
        long end=System.currentTimeMillis();

        System.out.println(end-start);

    }
}
