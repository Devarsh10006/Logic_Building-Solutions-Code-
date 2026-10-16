#include"stdio.h"

int main()
{
    int a[100], n, i, max, count = 0;
    printf("Enter size of array: ");
    scanf("%d", &n);

    if (n <= 0 || n > 100) return 0;

    printf("Enter elements: ");
    for (i = 0; i < n; i++) scanf("%d", &a[i]);
    
    max = a[0];
    count = 1;
    for (i = 1; i < n; i++)
    {
        if (a[i] > max)
        {
            count++;
            max = a[i];
        }
    }
    printf("Count = %d", count);
    return 0;
}
