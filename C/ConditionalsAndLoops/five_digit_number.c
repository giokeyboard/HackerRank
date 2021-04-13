#include <stdio.h>
#include <stdlib.h>

int sum_digits(int n);

int main(void)
{
    int n;

    if (scanf("%5d", &n) != 1)
        exit(EXIT_FAILURE);

    printf("%d\n", sum_digits(n));
    return 0;
}

int sum_digits(int n)
{
    int sum = 0;
    while (n > 0)
    {
        sum += (n % 10);
        n /= 10;
    }
    return sum;
}
