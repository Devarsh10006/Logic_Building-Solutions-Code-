#include"stdio.h"

int main()
{
    long long n, square, temp, divisor = 1;
    printf("Enter a non-negative number: ");
    scanf("%lld", &n);
    
    if (n < 0)
    {
        printf("Not an Automorphic number.");
        return 0;
    }

    temp = n;
    do
    {
        divisor *= 10;
        temp /= 10;
    } while (temp > 0);

    square = n * n;
    (square % divisor == n)
        ? printf("%lld is an Automorphic number.", n)
        : printf("%lld is not an Automorphic number.", n)
    ;
    return 0;
}
