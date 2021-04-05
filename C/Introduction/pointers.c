#include <stdio.h>

void update(int *a, int *b);

int main(void)
{
    int a, b;
    int *pa = &a, *pb = &b;

    if (scanf("%d %d", &a, &b) > 0)
    {
    }
    update(pa, pb);

    printf("%d\n%d\n", a, b);

    return 0;
}

void update(int *a, int *b)
{
    int sum = *a + *b, abs_diff = (*a > *b) ? *a - *b : *b - *a;

    *a = sum;
    *b = abs_diff;
}