package com.engeto;

   import java.util.ArrayList;
import java.util.List;

    public class Main {

        //region Demo
        /**
         * Example of use of {@link Support#safeReadInt()}
         *
         * Read one integer from input and print it to output
         * @return integer from input
         */
        public static void readOneIntFromInputAndPrintIt() {
            int input = Support.safeReadInt();
            System.out.println("You entered: "+input);
        }
        //endregion

        //region Loops
        /**
         * Read integers from input and print them until negative
         * input.
         */
        public static void readIntsFromInputAndPrintItUntilNegative() {
            int input;
            do {
                input = Support.safeReadInt();
                System.out.println("You entered: " + input);
            } while (input >= 0);
        }

        /**
         * Sum all input numbers (negative number terminates reading) and return result.
         * @return Sum of input numbers expect of terminating negative number.
         */
        public static int sumAllInputUntilNegative() {
            int sum = 0, input = 0;
            while (input >= 0) {
                sum += input;
                input = Support.safeReadInt();
            }
            return sum;
        }

        public static List storeAllInputInArrayListUntilNegative() {
            int input = 0;
            List<Integer> result = new ArrayList<>();
            while (input >= 0) {
                input = Support.safeReadInt();
                result.add(input);
            }
            result.remove(result.size()-1);
            return result;
        }

        public static void printAllIntegersFromList(List<Integer> list) {
            for (Integer i : list) {
                System.out.println(i);
            }
        }

        public static Integer sumAllIntegersFromList(List<Integer> list) {
            Integer result = 0;
            for (Integer i : list) {
                result += i;
            }
            return result;
        }

        public static void printIntegersUnderLimit(List<Integer> list, int limit) {
            for (Integer i : list) {
                if (i < limit) System.out.println(i);
            }
        }

        public static void printIntegersWithReplace(List<Integer> list) {
            for (Integer i : list) {
                switch(i) {
                    case 1: System.out.println("one"); break;
                    case 2: System.out.println("two"); break;
                    case 3: System.out.println("three"); break;
                    default: System.out.println(i); break;
                }
            }
        }

        public static void main(String[] args) {
            // Example
            System.out.println("--- P????klad - Na??ti a vypi?? jedno cel?? ????slo ---");
            readOneIntFromInputAndPrintIt();
            // ---
            System.out.println("--- ??kol 1 - Na??ti a vypi?? cel?? ????sla dokud nenaraz???? na z??porn?? ---");
            readIntsFromInputAndPrintItUntilNegative();
            // ---
            System.out.println("--- ??kol 2 - s????tej cel?? ????sla dokod nen?? v??sledek z??porn?? ---");
            System.out.println("Total sum: " + sumAllInputUntilNegative());;
            // ---
            System.out.println("--- ??kol 3 - Na????tej do seznamu dokud nen?? v??sledek z??porn?? ---");
            List<Integer> list = storeAllInputInArrayListUntilNegative();
            System.out.println(list);
            // ---
            System.out.println("--- ??kol 4 - Vypi?? v??echna cel?? ????sla ze seznamu ---");
            printAllIntegersFromList(list);
            // ---
            System.out.println("--- ??kol 5 - se??ti v??echno ????sla ze seznamu ---");
            System.out.println("Total sum: " + sumAllIntegersFromList(list));
            // ---
            System.out.println("--- ??kol 6 - Vypi?? v??echna ????sla men???? ne?? p??t ze seznamu ---");
            printIntegersUnderLimit(list, 5);
            // ---
            System.out.println("--- Task 7 - Vypi?? cel?? ????sla - nahra??: 1 => \"Jedna\", 2 => \"Dva\", 3 => \"T??i\" ---");
            printIntegersWithReplace(list);
        }
}
