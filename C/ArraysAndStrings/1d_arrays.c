#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int n, sum = 0, *arr = NULL;

    if (scanf("%d", &n) != 1)
        exit(EXIT_FAILURE);
    arr = (int *)malloc(n * sizeof(int));

    for (int *p = arr; p < arr + n; p++)
    {
        if (scanf("%d", p) != 1)
            exit(EXIT_FAILURE);
    }

    for (int *p = arr; p < arr + n; p++)
    {
        sum += *p;
    }

    free(arr);

    printf("%d\n", sum);

    return 0;
}
