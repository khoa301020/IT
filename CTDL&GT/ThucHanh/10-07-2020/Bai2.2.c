#include <stdio.h>
int gcd(int a, int b) {
    while (a!=b) {
        if (b==0) 
            return a;
        else if (a>b)
            return gcd(a-b,b);
        else
            return gcd(a,b-a);
    }
}
int main(int argc, char const *argv[])
{
    int a, b;
    printf("Nhap a, b: ");
    scanf("%i %i",&a,&b);
    printf("UCLN cua %d va %d la: %d",a,b,gcd(a,b));
    getch();
    return 0;
}
