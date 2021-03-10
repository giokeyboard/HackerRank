#include <stdio.h>

int main(void)
{
    char s[100];
    scanf("%[^\n]", s);
    scanf("%*c");

    printf("Hello, World!\n");
    printf("%s\n", s);

    return 0;
}
