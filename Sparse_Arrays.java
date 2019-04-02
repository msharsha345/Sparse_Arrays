package com.epam.task4;
/*PROBLEM STATEMENT
 There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings.

For example, given input  and , we find  instances of ',  of '' and  of ''. For each query, we add an element to our return array, .

Function Description

Complete the function matchingStrings in the editor below. The function must return an array of integers representing the frequency of occurrence of each query string in strings.

matchingStrings has the following parameters:

strings - an array of strings to search
queries - an array of query strings

* Input Format

	The first line contains and integer , the size of . 
	Each of the next  lines contains a string . 
	The next line contains , the size of . 
	Each of the next  lines contains a string .

* Constraints

	1<=n<=1000
	1<=q<=1000
	1<=|strings[i]|,|quries[i]|<=20
 
* Output Format

	Return an integer array of the results of all queries in order.


 
* Sample Input 1								* Sample Output 1

		4									2			
		aba									1								
		baba									0
		aba
		xzxb
		3
		aba
		xzxb
		ab


 */


import java.io.*;
import java.util.*;
public class Sparse_Arrays {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] a=new int[queries.length];/*integer array initialization*/
        for(int i=0;i<queries.length;i++)
        {
            for(int j=0;j<strings.length;j++)
            if(strings[j].equals(queries[i]))/*comparing quries string with string if it contains we are incrementing array a*/
            a[i]++;
        }
        return a;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

