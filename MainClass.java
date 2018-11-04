/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beforeadditionalexam;

/**
 *
 * @author muta
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Method m = new Method();
        
        System.out.println(36%24); //Test result 36%24
        System.out.println(m.GCDBruteforce(24,36)); //GCD by bruteforce way
        System.out.println(m.euclid(24,36)); //GCD by euclid's way
        
        /**
        * Find Prime number 
        */
        System.out.println(m.prime(24)); //Bruteforce prime
        System.out.println(m.highschoolPrime(24)); //highschool prime
        
        //sieve prime
        boolean []sieve = m.sievePrime(24);
        for(int i=2;i<sieve.length;i++) {
            if(!sieve[i]) {
                System.out.println(i+" is prime");
            }
        }
        
        System.out.println(m.linearSearch(3)); //linear search
        System.out.println(m.russianMultiply(0,9)); //russianMultiply
        
        int arr[] = {40,30,20,10,24,52}; //just declaring an array whatever to test
        int[] arr2 = m.selectionSort(arr); //get data from method selection Sort in array int arr2
        for(int x: arr2) System.out.print(x + " "); //print it with for each
        
    }
    
}
