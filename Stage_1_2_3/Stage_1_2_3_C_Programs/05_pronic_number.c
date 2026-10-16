#include"stdio.h"

int main()
{
    long long n;
    printf("Enter a number: ");
    scanf("%lld", &n);

    if (n < 0)
    {
        printf("Not a Pronic number.");
        return 0;
    }

    for (int i = 0; i * (i + 1) <= n; i++)
    {
        if (i * (i + 1) == n)
        {
            printf("%lld is a Pronic number.", n);
            return 0;
        }
    }
    printf("%lld is not a Pronic number.", n);

    return 0;
}