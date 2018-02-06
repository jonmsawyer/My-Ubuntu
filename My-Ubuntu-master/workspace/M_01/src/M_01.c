/*
 ============================================================================
 Name        : M_01.c
 Author      : Kai
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main()
{
	int array_01[25];
	int i;

	for(i=0;i<25;i++)
	{
		printf("Please enter any number of integers seperated by spaces\n");
		scanf("%d", (array_01+i));
	}

	return  0;
}
