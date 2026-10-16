#include"stdio.h"

int main()
{
    int a[100], n, k, i, temp, step;
    printf("Enter size of array: ");
    scanf("%d", &n);
    
    if (n < 0 || n > 100) return 0;
    printf("Enter elements: ");

    for (i = 0; i < n; i++) scanf("%d", &a[i]);

    printf("Enter k: ");
    scanf("%d", &k);

    if (n == 0) return 0;

    if (k < 0)
    {
        printf("k must be non-negative.");
        return 0;
    }

    k %= n;
    for (step = 0; step < k; step++)
    {
        temp = a[n - 1];
        for (i = n - 1; i > 0; i--) a[i] = a[i - 1];
        a[0] = temp;
    }

    printf("Rotated array: ");
    for (i = 0; i < n; i++) printf("%d ", a[i]);

    return 0;
}
