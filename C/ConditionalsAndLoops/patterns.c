#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int n, i, j, len, dist;

    if (scanf("%d", &n) != 1)
        exit(EXIT_FAILURE);

    len = 2 * n - 1;

    for (i = 0; i < len; i++)
    {
        for (j = 0; j < len; j++)
        {
            dist = (i < j) ? i : j;
            dist = (dist < len - i - 1) ? dist : len - i - 1;
            dist = (dist < len - j - 1) ? dist : len - j - 1;
            printf("%d ", n - dist);
        }
        printf("\n");
    }

    return 0;
}
