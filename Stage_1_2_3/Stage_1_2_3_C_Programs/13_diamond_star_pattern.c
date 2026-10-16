#include"stdio.h"

int main()
{
    for (int row = 0; row < 7; row++)
    {
        for (int col = 0; col < 7; col++)
        {
            if (row == 0 || row == 6 || col == row || col == 6 - row)
                printf("*");
            else
                printf(" ");
            if (col < 6) printf(" ");
        }
        printf("\n");
    }
    return 0;
}
