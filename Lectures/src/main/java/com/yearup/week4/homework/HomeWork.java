package com.yearup.week4.homework;

import com.yearup.week4.code.linkedlist.SinglyLinkedList;

public class HomeWork {
    public static void generateTable(int n){
        for (int i = 1; i <= 10; i++){
            System.out.println(n + "x" +i+ "=" + n*i);
        }
    }

    /**
     * takes a String input and returns a char array of reversed string
     * @param input
     * @return
     */
    public static char[] reverseString(String input){
        int c = 0;
        char [] out = new char[input.length()];
        for (int i = input.length()-1; i>=0; i--){
            out[c++] = input.charAt(i);
        }
        return out;
    }

    /**
     * returns true if element is contained in the array else false
     * @param arr
     * @param element
     * @return
     */
    public static boolean containsElement(int[] arr, int element){
        for (int i = 0; i < arr.length; i++ ){
            if(arr[i] == element)
                return true;
        }
        return false;
    }

    /**
     * returns the sum of primary diagonal of given 2d int array n*n
     * @param arr
     * @return
     */
    public static int diagonalSumOfArray(int[][] arr){
        return 0;
    }

    /**
     *
     * @param arr player X ,player O
     * @return X, O or D for draw
     */
    public static char ticTacToeWinner(char[][] arr){
        return 0;
    }
    /**
     * returns the array with duplicates removed
     * @param arr
     * @return
     */
    public static int[] removeDuplicates(int[] arr){
        return null;
    }

    /**
     * returns the reversed linked list
     * @param input
     * @return
     */
    public static SinglyLinkedList<Integer> reverseLinkedList(SinglyLinkedList<Integer> input){
        return null;
    }

    /**
     * implement this interface to create your own arraylist
     */
    interface MyArrayList{
        int size();
        void add(int element);
        int remove(int pos);
    }

    public static int[] main(String[] args) {
        //generateTable(10);
        int[] out = HomeWork.getElement(2, 5);
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i] + "");
        }


        return out;
    }

    public int _2ndArray(int arr[][]) {
        int sum = 0;
        for (int i = 0; i <= arr.length; i++) {
            for (int x = 0; x <= arr[0].length; x--) {
                if (i + x == arr.length - 1) {
                    sum = sum + arr[i][x];
                }
            }
        }
        return sum;
    }

    /*
    public class int addarrays(int[][] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length; i++) {
            for (int b = 0; b <= arr.length; b++) {
                if (i == b) {
                    sum = sum + arr[i][b];
                }
                System.out.println(arr[i][b]);
            }
        }

        return sum;
    }
}


    public static int [] getEvenElements(int arr, int total ){
        int array []= {2, 3, 4, 5, 6};
        for (int i = 0; i< arr; i++){
            if (total[arr] %2 ==0 ){
                System.out.println(array);
            }
        }

        return new int[]{arr};
    }
*/
    public static int [] getElement(int start, int total){
        //generate a list when given a start
        int [] out = new int [total];
        if (start % 2 != 0);

        for (int i = 0; i<total; i++){
            out[i] = start = start+2;

        }

        return out;


    }


    public static int [] progressiveDecreasingSeries(int start, int limit) {
        //start = 10 //
        int out []= new int[limit] ;
        for (int i = 0; i<limit; i++){
            start = start-i;
            out [-1] = start;

        }
        return out;
    }
    public static int [] removeElement(int arr, int pos){
        int elm [] = new int []{5, 1, 3, 9,8};

        for (int i = 0, b = 0; i < elm.length; i++) {
        if (i != pos) elm[b++] = elm[i];
    }
        return elm;
    }}

