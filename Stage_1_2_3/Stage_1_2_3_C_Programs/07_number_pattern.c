#include"stdio.h"

int main()
{
    for (int i = 1; i <= 4; i++)
    {
        for (int j = 1; j <= 2 * i - 1; j++)
        {
            if (j <= i) printf("%d", 2 * j - 1);
            else printf("%d", 2 * (2 * i - j) - 1);
            if (j < 2 * i - 1) printf("*");
        }
        printf("\n");
    }
    return 0;
}