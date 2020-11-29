#include <stdio.h>
#include <conio.h>
#include <string.h>
#include <math.h>
int UCLN(int a, int b)
{
    a = abs(a);
    b = abs(b);
    while (a != b)
        if (a > b)
            a = a - b;
        else
            b = b - a;
    return a;
}

typedef struct tagphanso
{
    int tu, mau;
} PHANSO;

PHANSO rutgon(PHANSO a)
{
    PHANSO c;
    c.tu = a.tu / UCLN(a.tu, a.mau);
    c.mau = a.mau / UCLN(a.tu, a.mau);
    return c;
}

PHANSO cong(PHANSO a, PHANSO b)
{
    PHANSO c;
    c.tu = a.tu * b.mau + a.mau * b.tu;
    c.mau = a.mau * b.mau;
    c = rutgon(c);
    return c;
}

PHANSO tru(PHANSO a, PHANSO b)
{
    PHANSO c;
    c.tu = a.tu * b.mau - a.mau * b.tu;
    c.mau = a.mau * b.mau;
    c = rutgon(c);
    return c;
}
void print(PHANSO a)
{
    printf("%d/%d", a.tu, a.mau);
}
int main()
{
    PHANSO a, b, c;
    printf("\nNhap phan so a : ");
    scanf("%d%d", &a.tu, &a.mau);
    printf("\nNhap phan so b : ");
    scanf("%d%d", &b.tu, &b.mau);
    printf("\nRut gon a: ");
    a = rutgon(a);
    print(a);
    printf("\nRut gon b: ");
    b = rutgon(b);
    print(b);
    printf("\nTong = ");
    c = cong(a, b);
    print(c);
    printf("\nHieu = ");
    c = tru(a, b);
    print(c);
    getch();
    return 0;
}