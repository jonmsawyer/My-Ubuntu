/*
 ============================================================================
 Name        : aux_03.c
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
#include <string.h>

char *rev_pal(char *pal, char *rpal)
{
	int i; // string index
	char *p2 = pal + strlen(pal) - 1; // point p2 to the last character in string `pal'
	
	for (i = 0; p2 >= pal; --p2, i++) // walk down the string `pal' in reverse, increment index for `rpal'
	{
		rpal[i] = *p2; // asigning values in reverse from `p2' but in order for `rpal'
                printf("rpal[i(%d)] = %c, *p2 = %c\n", i, rpal[i], *p2); // debug
	}
        rpal[strlen(pal)] = '\0'; // end the string with a null character to denote string end

	return rpal; // return the first positional pointer in `rpal'; not strictly necessary if you
                     // make this a void function and then return nothing.
}

int palin_func()
{
	char str[100]; // user input string
	char pal[100]; // reversed string of `str' input string
	char *r_pal; // pointer to what eventually becomes pal[0]

	//Asking for user input, saved to 'str'
	printf("Please enter a string to check for palindrome:\n");
	fgets(str, 100, stdin); // use fgets here as it checks for buffer overflows
	str[strlen(str) - 1] = '\0'; // chop off the newline entered from stdin

	r_pal = rev_pal(str, pal); // reverse the input string and store the results in `pal'

	printf("The original string is \n%s\n", str);
	printf("The reversed string is \n%s\n", r_pal);

	if(strcmp(r_pal, str) == 0) // Don't do r_pal == str, as you're comparing string pointers.
                                    // To compare strings, use strcmp().
	{
		printf("The string is a palindrome!\n");
		return 1;
	}
	else
	{
		printf("The string is NOT a palindrome!\n");
		return 2;
	}
}

