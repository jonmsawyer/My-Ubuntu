/*
 ============================================================================
 Name        : Module_03_Home.c
 Author      : Kai Sawler
 Description : Part II: Easy Strings

 Write a function that decides whether or not its a palindrome and returns 0 or 1 (true/false).

 Use your function in a profram that:
 	 reads a string using formatted input (scanf)
 	 reads a line (using fgets)
 and, in each case, prints a message announcing that the input was (or was not) a palindrome...
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
int palin_func_scanf();
int palin_func_fgets();

int main(void) {
	palin_func_fgets();
	palin_func_scanf();


	return EXIT_SUCCESS;
}
