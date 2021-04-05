#include <stdio.h>

int max_of_four(int a, int b, int c, int d);
int max(int a, int b);

int main(void)
{
    int a, b, c, d;

    if (scanf("%d %d %d %d", &a, &b, &c, &d) == 4)
    {
    }

    printf("%d\n", max_of_four(a, b, c, d));

    return 0;
}

int max_of_four(int a, int b, int c, int d)
{
    return max(max(a, b), max(c, d));
}

int max(int a, int b)
{
    return a > b ? a : b;
}