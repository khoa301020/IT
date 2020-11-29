#include <stdio.h>
#include <math.h>
int sum(int a)
{
    if (a != 0)
        return 1 + sum(a / 10);
    else
        return 0;
}
int main(int argc, char const *argv[])
{
    int a;
    printf("Nhap a: ");
    scanf("%i", &a);
    printf("So cac chu so cua %i la %i", a, (a==0?1:sum(a<0?a:a*(-1))));
    getch();
    return 0;
}
