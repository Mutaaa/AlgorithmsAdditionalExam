/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author muta
 */
public class Method {
    int ans;
    
    public int GCDBruteforce(int a, int b) {
        int smaller, bigger;
        if(a<b) {
            smaller = a;
            bigger = b;
        } else {
            smaller = b;
            bigger = a;
        }
        for (int i = 1 ; i<=smaller ; i++){
            if (bigger % i == 0 && smaller % i == 0){
                ans = i;
            }
        }
        return ans;
    }
    
    public int euclid(int a, int b){
        int smaller, bigger;
        if(a<b) {
            smaller = a;
            bigger = b;
        } else {
            smaller = b;
            bigger = a;
        }

        if(bigger%smaller == 0){
            return smaller;
        } else {
            int temp = smaller;
            smaller = bigger%smaller;
            bigger = temp;
            return euclid(smaller, bigger);
        }
    }
    
    public boolean prime(int a){
        boolean isPrime = true;
        for(int i = 2 ; i < a ; i++){
            if(a % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    
    public boolean highschoolPrime(int a){
        boolean isPrime = true;
        for(int i = 2 ; i< Math.sqrt(a) ; i++){
            if( a%i==0 ){
                isPrime = false;
            }
        }
        return isPrime;
    }
    
    public boolean[] sievePrime(int a){
        boolean[] isNotPrime = new boolean[a+1];
        int i =2;
        while(!isNotPrime[i]) {
            int n=i*i;
            while(n<isNotPrime.length) {
                isNotPrime[n]=true;
                n+=i;
            }
            i++;
        }
        return isNotPrime;
    }
    
    public int linearSearch(int value){
        int[] arr = {3,5,2,6,8,0,44,26,60,32};
        for ( int i = 0 ; i < arr.length ; i++ ){
            if(arr[i] == value){
                ans = i+1;
            }
        }
        return ans;
    }
    
    public int russianMultiply(int n, int m){
        int sum = 0;
        if (n == 0 || m == 0){
            ans = 0;
        } else {
            while(n>1){
                if(n%2!=0){
                    sum+= m;
                }
                m *= 2;
                n = n/2;
            }
            ans = m+sum;
        }
        return ans;
    }
    
    public int[] selectionSort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int min = i;
            for( int j = i+1 ; j < arr.length ; j++){
                if( arr[j] < arr[min]) {
                    min = j; 
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;  
            
        }
        
        return arr;
    }
    
    
    
}
