package com.java.basic.exercise;

public class Exercise9 {

    	    public boolean isValid(String s) {
    	    	int length = s.length()/2;
    	    	int [] arr = new int[length];
    	        
    	        for(int i=0;i<length;i++)
    	        {
    	        	if(s.charAt(i)== '(' && s.charAt(s.length()-1-i) == ')') {
    	        		arr[i] = 1;
    	        		//s.charAt(i) = 'x';
    	        		
    	        		
    	        	}
    	        	else if (s.charAt(i)== '[' && s.charAt(s.length()-1-i) == ']') {
    	        		arr[i] = 1;
    	        		
    	        	}
    	        	else if(s.charAt(i)== '{' && s.charAt(s.length()-1-i) == '}') {
    	        		arr[i] = 1;
    	        	}
    	        	else {
    	        		arr[i] = 0;
    	        		
    	        	}
    	        }
    	        
    	        for(int j=0;j<length;j++) {
    	        	if (arr[j] == 0) {
    	        		//System.out.print(false);
    	        		return false;
    	        	}
    	        }     
    	    
    			return true;
    	    
    	}
    public static void main(String[] args) {
		Exercise9 a =new Exercise9();
		a.isValid("([]");

	}}

