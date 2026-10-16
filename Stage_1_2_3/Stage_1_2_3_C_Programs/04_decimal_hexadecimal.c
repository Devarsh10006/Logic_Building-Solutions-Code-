#include"stdio.h"

int main()
{
    int choice, decimal, i = 0, j;
    char hex[20], temp;
    printf("1. Decimal to Hexadecimal\n2. Hexadecimal to Decimal\nEnter choice: ");
    scanf("%d", &choice);
    if (choice == 1)
    {
        printf("Enter a non-negative decimal number: ");
        scanf("%d", &decimal);

        if (decimal < 0)
        {
            printf("Invalid number.");
            return 0;
        }

        if (decimal == 0) hex[i++] = '0';
        while (decimal > 0)
        {
            int rem = decimal % 16;
            hex[i++] = rem < 10 ? (char)('0' + rem) : (char)('A' + rem - 10);
            decimal /= 16;
        }

        hex[i] = '\0';
        for (j = 0; j < i / 2; j++)
        {
            temp = hex[j];
            hex[j] = hex[i - j - 1];
            hex[i - j - 1] = temp;
        }
        printf("Hexadecimal = %s", hex);
    }

    else if (choice == 2)
    {
        char input[30], c;
        long long value = 0;
        printf("Enter a hexadecimal number: ");
        scanf("%29s", input);
        for (i = 0; input[i] != '\0'; i++)
        {
            c = input[i];
            if (c >= '0' && c <= '9') value = value * 16 + c - '0';
            else if (c >= 'A' && c <= 'F') value = value * 16 + c - 'A' + 10;
            else if (c >= 'a' && c <= 'f') value = value * 16 + c - 'a' + 10;
            else
            {
                printf("Invalid hexadecimal number.");
                return 0;
            }
        }
        printf("Decimal = %lld", value);
    }
    else printf("Invalid choice.");
    
    return 0;
}
