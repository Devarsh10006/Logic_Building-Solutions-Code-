#include"stdio.h"

int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    if (n <= 0)
    {
        printf("Not an Ugly number.");
        return 0;
    }

    int temp = n;
    while (temp % 2 == 0) temp /= 2;
    while (temp % 3 == 0) temp /= 3;
    while (temp % 5 == 0) temp /= 5;
    
    (temp == 1)
        ? printf("%d is an Ugly number.", n)
        : printf("%d is not an Ugly number.", n)
    ;
    return 0;
}
