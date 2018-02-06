/*
 * aux_03.c
 *
 *  Created on: Feb 5, 2018
 *      Author: kai
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int palin_func()
{
	FILE *fp;
	char str[100];

	fp = fopen("input.txt", "r");
	if(fp == NULL)
	{
		perror("Error opening file!! Check input.txt");
		return(-1);
	}

	printf("Please enter a string to check for palindrome:\n");
	fgets(str, 100, fp);

	char revarr = strrev(str);

	printf("The reversed string is \n%s\n", str);

	if(revarr == str)
	{
		printf("The string is a palindrome!");
	}
	else
	{
		printf("The string is NOT a palindrome!");
	}
}
