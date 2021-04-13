#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int n, k, a, b, c = 0, d = 0, e = 0;

    if (scanf("%d %d", &n, &k) != 2)
        exit(EXIT_FAILURE);
    for (a = 1; a < n; a++)
    {
        for (b = n; b > a; b--)
        {
            if ((a & b) < k && (a & b) > c)
                c = a & b;
            if ((a | b) < k && (a | b) > d)
                d = a | b;
            if ((a ^ b) < k && (a ^ b) > e)
                e = a ^ b;
        }
    }

    printf("%d\n%d\n%d\n", c, d, e);
    return 0;
}
