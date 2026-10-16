#include"stdio.h"
#include"string.h"
#include"ctype.h"

int main()
{
    char s[500], temp;
    int left, right;
    printf("Enter a string: ");
    if (!fgets(s, sizeof(s), stdin)) return 0;
    
    s[strcspn(s, "\n")] = '\0';
    left = 0;
    right = (int)strlen(s) - 1;
    while (left < right)
    {
        if (!isalpha((unsigned char)s[left]))
            left++;
        else if (!isalpha((unsigned char)s[right]))
            right--;
        else
        {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    printf("%s", s);
    return 0;
}
