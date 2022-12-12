package com.HarryProject;

public class check_value {

	public static void main(String[] args) {
	int [] ttt = {4,5,6,7};
	int toCheckValue = 4;
	boolean test = false;
    for (int element : ttt) {
        if (toCheckValue== element) {
            test = true;
            break;
        }}
        if(test) {
        System.out.println("the value" );
        
    }
        else {
        	System.out.println("not");
        }
}
}