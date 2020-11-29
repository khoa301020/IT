#include <stdio.h>
#include <math.h>
int sum(int n)
{
    if (n == 1)
        return 1;
    else if (n%2==0)
        return sum(n - 1)-n;
    else 
        return sum(n - 1)+n;
}
int main(int argc, char const *argv[])
{
    int n;
    printf("Nhap n: ");
    scanf("%i", &n);
    printf("S = 1 - 2 + 3 - 4 ... +- %d = %d", n, sum(n));
    getch();
    return 0;
}
