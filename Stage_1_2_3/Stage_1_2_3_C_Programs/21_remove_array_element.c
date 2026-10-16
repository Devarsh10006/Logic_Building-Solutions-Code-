#include"stdio.h"

int main()
{
    int a[100], n, target, i, newSize = 0;
    printf("Enter size of array: ");
    scanf("%d", &n);

    if (n < 0 || n > 100) return 0;

    printf("Enter elements: ");
    for (i = 0; i < n; i++) scanf("%d", &a[i]);

    printf("Enter element to remove: ");
    scanf("%d", &target);

    for (i = 0; i < n; i++)
    {
        if (a[i] != target)
            a[newSize++] = a[i];
    }

    printf("Output: ");
    for (i = 0; i < newSize; i++) printf("%d ", a[i]);
    printf("\nNew size = %d", newSize);
    
    return 0;
}
