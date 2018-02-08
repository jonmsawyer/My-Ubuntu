/*
 ============================================================================
 Name        : main.c
 Author      : Kai Sawler
 Description : Bisection!
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
double bisect(double a, double b, double (*f)(double));

int main(void)
{
	printf("Bisect is: %lf", bisect(0.0, 3.0, cos));
	return 1;
}
