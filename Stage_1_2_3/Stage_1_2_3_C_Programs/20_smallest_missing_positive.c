#include"stdio.h"

int main()
{
    int a[100], n, i, candidate, found;
    printf("Enter size of array: ");
    scanf("%d", &n);

    if (n < 0 || n > 100) return 0;

    printf("Enter elements: ");
    for (i = 0; i < n; i++) scanf("%d", &a[i]);
    
    for (candidate = 1; candidate <= n + 1; candidate++)
    {
        found = 0;
        for (i = 0; i < n; i++)
            if (a[i] == candidate)
            {
                found = 1;
                break;
            }
        if (!found)
        {
            printf("Smallest missing positive number = %d", candidate);
            return 0;
        }
    }
    return 0;
}
