/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cc.openhome;

import java.util.*;
import static java.util.stream.Collectors.toList;

public class Test {

    public static void main(String[] args) {
    	var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

    	var biggerThan5s = numbers.parallelStream()
    	                 .filter(number -> number > 5)
    	                 .collect(toList());
    	        
    	biggerThan5s.forEach(System.out::println);
    	        
    	var added10s = biggerThan5s.parallelStream()
    	                .map(number -> number + 10)
    	                .collect(toList());


    }

    private static class Order {

        public Order() {
        }

        private List<LineItem> getLineItems() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class LineItem {

        public LineItem() {
        }
        
        String getName() {
            return null;
        }
    }
}
