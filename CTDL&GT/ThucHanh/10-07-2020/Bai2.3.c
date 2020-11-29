#include <stdio.h>
#include <math.h>
int sum(int a) {
    if (a<0) a=sqrt(a*a);
    if (a>0)
        return a%10+sum(a/10);
}
int main(int argc, char const *argv[])
{
    int a;
    printf("Nhap a: ");
    scanf("%i",&a);
    printf("Tong cac chu so cua %i la %i",a,sum(a));
    getch();
    return 0;
}
