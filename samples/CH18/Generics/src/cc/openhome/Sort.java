package cc.openhome;

import java.util.Arrays;

public class Sort {
    public static <T extends Comparable<T>> T[] sorted(T[] array) {
        T[] arr = Arrays.copyOf(array, array.length);
        sort(arr, 0, arr.length - 1);
        return arr;
    }
    
    private static <T extends Comparable<T>> void sort(T[] array, int left, int right) {
        if(left < right) { 
            var q = partition(array, left, right); 
            sort(array, left, q - 1); 
            sort(array, q + 1, right); 
        } 
    }

    private static <T extends Comparable<T>> int partition(T[] array, int left, int right) {  
        var i = left - 1; 
        for(var j = left; j < right; j++) { 
            if(array[j].compareTo(array[right]) <= 0) {
                i++; 
                swap(array, i, j); 
            } 
        } 
        swap(array, i+1, right); 
        return i + 1; 
    } 

    private static void swap(Object[] array, int i, int j) {
        var t = array[i]; 
        array[i] = array[j]; 
        array[j] = t;
    }
} 
