#include"stdio.h"

int main()
{
    int n;
    printf("Enter n (4 or 5, or another positive size): ");
    scanf("%d", &n);

    if (n <= 0) return 0;
    for (int  row = 1; row <= n; row++)
    {
        int value = row;
        for (int col = 1; col <= row; col++)
        {
            printf("%d", value);
            if (col < row) printf("\t");
            value += n - col;
        }
        printf("\n");
    }
    return 0;
}