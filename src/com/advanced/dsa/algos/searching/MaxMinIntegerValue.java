package com.advanced.dsa.algos.searching;

import java.sql.SQLIntegrityConstraintViolationException;

public class MaxMinIntegerValue {
    public static void main(String[] args) {
        System.out.println("Maximum value:"+Integer.MAX_VALUE);
        System.out.println("Maximum value:"+Integer.MIN_VALUE);
        System.out.println("Maximum value:"+(Integer.MAX_VALUE+1));
        System.out.println("Maximum value:"+(Integer.MIN_VALUE-1));
    }//m=(s+e)/2-> gives negative value
}
