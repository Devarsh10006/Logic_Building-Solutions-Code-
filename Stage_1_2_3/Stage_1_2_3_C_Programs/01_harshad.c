#include"stdio.h"

int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    if (n <= 0)
    {
        printf("Please enter a positive integer.");
        return 0;
    }

    int temp = n, sum = 0;
    while (temp > 0)
    {
        sum += temp % 10;
        temp /= 10;
    }

    (sum != 0 && n % sum == 0)
        ? printf("%d is a Harshad number.", n)
        : printf("%d is not a Harshad number.", n)
    ;
    return 0;
}
