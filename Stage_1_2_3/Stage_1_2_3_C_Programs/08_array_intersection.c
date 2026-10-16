#include"stdio.h"

int main()
{
    int a[100], b[100], used[100] = {0}, result[100];
    int n, m, i, j, count = 0, temp;

    printf("Enter size of first array: ");
    scanf("%d", &n);

    if (n < 0 || n > 100) return 0;

    printf("Enter first array: ");
    for (i = 0; i < n; i++) scanf("%d", &a[i]);

    printf("Enter size of second array: ");
    scanf("%d", &m);

    if (m < 0 || m > 100) return 0;
    printf("Enter second array: ");

    for (i = 0; i < m; i++) scanf("%d", &b[i]);

    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
            if (!used[j] && a[i] == b[j])
            {
                result[count++] = a[i];
                used[j] = 1;
                break;
            }
        }
    }
    for (i = 0; i < count; i++)
        for (j = i + 1; j < count; j++)
            if (result[i] > result[j])
            {
                temp = result[i];
                result[i] = result[j];
                result[j] = temp;
            }
    printf("Intersection: ");

    for (i = 0; i < count; i++) printf("%d ", result[i]);

    return 0;
}