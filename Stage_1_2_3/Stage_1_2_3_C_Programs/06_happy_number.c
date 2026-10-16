#include"stdio.h"

int digitSquareSum(int n)
{
    int sum = 0, digit;
    while (n > 0)
    {
        digit = n % 10;
        sum += digit * digit;
        n /= 10;
    }
    return sum;
}

int main()
{
    int n, slow, fast;
    printf("Enter a positive integer: ");
    scanf("%d", &n);
    if (n <= 0)
    {
        printf("Not a Happy number.");
        return 0;
    }
    slow = n;
    fast = n;
    do
    {
        slow = digitSquareSum(slow);
        fast = digitSquareSum(digitSquareSum(fast));
    } while (slow != fast && fast != 1);

    (fast == 1 || slow == 1)
        ? printf("%d is a Happy number.", n)
        : printf("%d is not a Happy number.", n)
    
        ;
    return 0;
}