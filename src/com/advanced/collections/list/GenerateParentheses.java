package com.advanced.collections.list;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n=3;
        System.out.println(generateParenthesis(n));
    }
        public static List<String> generateParenthesis(int n) {
            List<String> result =new ArrayList<>();
            backtrack(result,new StringBuilder(),0,0,n);
            return result;
        }
        public static void backtrack(List<String> result, StringBuilder current, int close, int open, int max){
            if(current.length()==max*2){
                result.add(current.toString());
                return;
            }
            if(open<max){
                current.append("(");
                backtrack(result,current,close,open+1,max);
                current.deleteCharAt(current.length()-1);
            }
            if(close<open){
                current.append(")");
                backtrack(result,current,close+1,open,max);
                current.deleteCharAt(current.length()-1);
            }
        }
    }
