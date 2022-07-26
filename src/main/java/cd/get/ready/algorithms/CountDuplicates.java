package cd.get.ready.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input) {
        HashMap<String, Integer> numbersAmount = new HashMap<String, Integer>();
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (!numbersAmount.containsKey(input[i])) {
                numbersAmount.put(input[i], 1);
            } else {
                numbersAmount.put(input[i], numbersAmount.get(input[i]) + 1);
            }
        }
        for (Map.Entry<String, Integer> set :
                numbersAmount.entrySet()) {
            // Printing all elements of a Map
            if(set.getValue()>1){
                count++;
            }
        }

            return count;
    }

        /**
         * Example of overloading a function that accepts a Array of Integers
         * @param input
         * @return
         */
        public Integer countDuplicates(Integer[]input){
            String str = Arrays.toString(input)
                    .replaceAll("\\s+", "");
            String[] strArray = str.substring(1, str.length() - 1)
                    .split(",");
           return countDuplicates(strArray);

        }
    }

