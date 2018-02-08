/*
 ============================================================================
 Name        : aux_03.c
 Author      : Kai Sawler
 Description : Bisection!
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <assert.h>

double	s;

double check = 0.0000001;

double bisect(double a, double b, double (*f)(double))
{
	assert((f(a) * f(b)) < 0);
	for(int i = 10000; i >= 0; i--)
	{
		// printf("s is now: %lf", i);
		s = ((a+b)/2);
		// printf("s is now: %lf", s);
		if(f(s) <= (0 + check) && f(s) >= (0 - check))
		{
			// printf("s is now: %lf", s);
			return s;
		}
		else
		{
			if(f(s) >= 0 && f(a) >= 0)
			{
				a = s;
				// printf("s is now: %lf", s);
			}
			else
			{
				b = s;
				// printf("s is now: %lf", s);
			}
		}
	}
	printf("s is: %lf\n", s);
	return -1;
}
