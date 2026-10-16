#include"stdio.h"

int main()
{
    int a[100], n, i, j;
    printf("Enter size of array: ");
    scanf("%d", &n);

    if (n < 0 || n > 100) return 0;

    printf("Enter elements: ");
    for (i = 0; i < n; i++) scanf("%d", &a[i]);

    for (i = 0; i < n; i++)
    {
        for (j = 0; j < i; j++)
            if (a[j] == a[i]) break;
        if (j < i) a[i] = 0;
    }
    
    for (i = 0; i < n; i++) printf("%d ", a[i]);
    return 0;
}
