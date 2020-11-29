#include <stdio.h>
void main()
{
    int m, n, a[100], b[100];
    printf("Nhap so bac da thuc 1: ");
    scanf("%d", &m);
    printf("Nhap cac phan tu da thuc 1: ");
    for (int i = m; i >= 0; i--)
    {
        printf("a[%d] = ", i);
        scanf("%d", &a[i]);
    }

    printf("Nhap so bac da thuc 2: ");
    scanf("%d", &n);
    printf("Nhap cac phan tu da thuc 2: ");
    for (int i = n; i >= 0; i--)
    {
        printf("b[%d] = ", i);
        scanf("%d", &b[i]);
    }

    NhanDaThuc(a, b, m, n);
}
void NhanDaThuc(int a[], int b[], int m, int n)
{
    int c[100];
    for (int i = 0; i <= m + n; i++)
        c[i] = 0;
    for (int i = 0; i <= m; i++)
    {
        for (int j = 0; j <= n; j++)
        {
            c[i + j] = c[i + j] + a[i] * b[j];
        }
    }
    printf("Ket qua: ");
    for (int i = m + n; i >= 0; i--)
    {
        if (c[i] != 0)
            if (i == 0)
            {
                printf("%d", c[i]);
            }
            else
            {
                printf("%dx^%d + ", c[i], i);
            }
    }
}