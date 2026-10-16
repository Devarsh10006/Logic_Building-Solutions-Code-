#include"stdio.h"
#include <time.h>

void InsertionSort(int arr[], int n)
{
    for(int i = 1; i < n; i++)
    {
        int curr = arr[i];
        int prev = i - 1;

        while(prev >= 0 && arr[prev] > curr)
        {
            arr[prev + 1] = arr[prev];
            prev--;
        }

        arr[prev + 1] = curr;
    }
}

void main()
{
    int n;
    printf("Enter the size of an array: ");
    scanf("%d", &n);

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the ele: ");
        scanf("%d", &arr[i]);
    }
    
    clock_t start, end;
    double time_taken;

    start = clock();
    InsertionSort(arr, n);
    end = clock();

    time_taken = (double)(end - start) / CLOCKS_PER_SEC;
    printf("Insertion Sort: %.6f seconds\n", time_taken);

    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}