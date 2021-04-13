#include <stdio.h>
#include <stdlib.h>

void reverse_array(int *a, int n);
void display_array(int *a, int n);

int main(void)
{
    int n, *arr = NULL;

    if (scanf("%d", &n) != 1)
        exit(EXIT_FAILURE);
    arr = (int *)malloc(n * sizeof(int));
    for (int *a = arr; a < arr + n; a++)
    {
        if (scanf("%d", a) != 1)
            exit(EXIT_FAILURE);
    }
    reverse_array(arr, n);
    display_array(arr, n);
    free(arr);

    return 0;
}

void display_array(int *a, int n)
{
    for (int *p = a; p < a + n; p++)
        printf("%d ", *p);
    printf("\n");
}

void reverse_array(int *a, int n)
{
    int temp, *p = a, *q = a + n - 1;
    while (p < q)
    {
        temp = *p;
        *p++ = *q;
        *q-- = temp;
    }
}