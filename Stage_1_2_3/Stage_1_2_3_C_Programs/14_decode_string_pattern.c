#include"stdio.h"
#include"ctype.h"

int main()
{
    char input[500];
    int i = 0, count, j;
    printf("Enter encoded string: ");
    scanf("%499s", input);
    while (input[i] != '\0')
    {
        if (!isdigit((unsigned char)input[i]))
        {
            printf("Invalid encoded string.");
            return 0;
        }
        count = 0;
        while (isdigit((unsigned char)input[i]))
        {
            count = count * 10 + input[i] - '0';
            i++;
        }
        if (input[i] == '\0')
        {
            printf("Invalid encoded string.");
            return 0;
        }
        for (j = 0; j < count; j++) printf("%c", input[i]);
        i++;
    }
    return 0;
}
