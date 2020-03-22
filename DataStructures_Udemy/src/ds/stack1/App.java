/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.stack1;

/**
 *
 * @author Owner
 */
public class App {
//    public static void main(String[] args){
//        Stack theStack = new Stack(4);
//        theStack.push('h');
//        theStack.push('e');
//        theStack.push('l');
//        theStack.push('l');
//
//        while(!theStack.isEmpty()){
//            char c = theStack.pop();
//            System.out.println(c);    
//        }
//        System.out.println(reverseString("Hello"));
//    }
//    
//    public static String reverseString(String str){
//        int stackSize = str.length(); //get max size
//        Stack theStack = new Stack(stackSize); // create stack with size of string
//        char ch; // char var to add to and read from
//        
//        for(int j = 0; j<str.length();j++){
//            ch = str.charAt(j);
//            theStack.push(ch);
//        }
    
//        String result = "";
//        while(!theStack.isEmpty()){
//            ch = theStack.pop();
//            result = result + ch + "\n"; //appends to output
//        }
//
//        return result; 
//    }

    
    // REVERSE A STRING WITHOUT ITERATION UTILIZING RECURSION*************************************************
    public static void reverse(String str, int r){
        if(r >= 0){ //base case
            System.out.println(str.charAt(r));
            r--;
            reverse(str,r); //Recursive call 
        }
    }

// ******QUEUE PRACTICE******
    public static void main(String[] args){
//        Queue q = new Queue(5);
//        q.insert(100);
//        q.insert(1000);
//        q.insert(14);
//        q.insert(12);
//        q.insert(44);
//        q.insert(766);
//        q.view();

//        String str = "hello";
//        int r = 5;
//        reverse(str,r); // recursive function to print reverse
//        for(int i = str.length()-1;i>=0;i--){
//            System.out.println(str.charAt(i));

//        int[] a = {5,4};
//        
//        
//        for(int i=0; i < a.length; i++){
//            
//            System.out.print(a[i]+" ");
//            int temp = a[i];
//            a[i]=a[i+1];
//            a[i+1] = temp;
            
////           if(a[i] > a[i+1]){
//               int temp = a[i];
//               a[i] = a[i+1];
//               a[i+1] = temp;
//           } //end if
//            System.out.print(a[i]+" ");
            
            
//        } //end for
        
//        System.out.println("DEGUBEGGING " + a.length);/
    
    
    int x = 0;
    while(x<6){
        x++;
        System.out.println(x);
    }
    
    
    
    
    
    
    
    
    
    } //end main
} //end App 

