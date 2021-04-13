#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int main(void)
{
    char *s = NULL;

    s = (char *)malloc(1024 * sizeof(char));
    if (scanf("%[^\n]", s) != 1)
        exit(EXIT_FAILURE);
    s = realloc(s, strlen(s) + 1);

    while (isspace(*s))
        s++;
    while (*s)
    {
        if (isspace(*s))
            printf("\n");
        else
            putchar(*s);
        s++;
    }

    printf("\n");
    // free(s);
    return 0;
}
