/*
 ============================================================================
 Name        : reverse_string.c
 Author      : Kai Sawler
 Description : simple function that accepts two variables (a string for input
 	 	 	   and a variable to return as the outputted reversed string).
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char *rev_pal(char *pal, char *rpal)
{
	char *pointer_01 = pal + strlen(pal) - 1; // pointing pointer_01 to the last character in string 'pal'
	int i; //string index for print function

	for (i = 0; pointer_01 >= pal; --pointer_01, i++) // as the index moves up, the pointer moves down; reversing the order of the given string
		{
			rpal[i] = *pointer_01; // asigning values in reverse from `p2' but in order for `rpal'
					printf("rpal[i(%d)] = %c, *p2 = %c\n", i, rpal[i], *pointer_01); // debug
		}
			rpal[strlen(pal)] = '\0'; // end the string with a null character to denote string end

		return rpal; // return the first positional pointer in `rpal'; not strictly necessary if you
						 // make this a void function and then return nothing.
}
