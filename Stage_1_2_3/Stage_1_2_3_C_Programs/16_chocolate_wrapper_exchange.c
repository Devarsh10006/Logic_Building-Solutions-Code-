#include"stdio.h"

int main()
{
    int money, price, wrappersPerChocolate;
    int chocolates, wrappers;
    printf("Enter rupees, chocolate price, and wrappers required: ");
    scanf("%d %d %d", &money, &price, &wrappersPerChocolate);

    if (money < 0 || price <= 0 || wrappersPerChocolate <= 1)
    {
        printf("Invalid input.");
        return 0;
    }

    chocolates = money / price;
    wrappers = chocolates;

    while (wrappers >= wrappersPerChocolate)
    {
        int extra = wrappers / wrappersPerChocolate;
        chocolates += extra;
        wrappers = wrappers % wrappersPerChocolate + extra;
    }
    printf("Total chocolates = %d", chocolates);
    return 0;
}
