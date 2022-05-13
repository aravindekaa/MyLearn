/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium Java Test Framework & Best Practices - Masterclass (https://www.udemy.com/course/selenium-java-test-framework/)
 * Tutor: Omprakash Chavan (https://www.udemy.com/user/omprakash-chavan/)
 */
/***************************************************/

package com.learning.java;

public class _25_CS_Loop_WHILE_Break {

    public static void main(String[] args) {

        int i = 5;
        while (i>=0){
            System.out.println("i = " + i);
            i--;
            if(i == 3){
                break; // Come out of the WHILE loop when value of variable 'i' is 3
            }
        }

    }// main
}// class





