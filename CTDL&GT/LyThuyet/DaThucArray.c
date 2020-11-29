#include <stdio.h>
void main()
{
    int n;
    printf("Nhap so bac cua da thuc: ");
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i <= n; i++)
    {
        printf("arr[%d] = ", i);
        scanf("%d", &arr[i]);
    }
    printf("Da thuc da nhap la: ");
    Xuat(arr, n);
    printf("\nDa thuc sau khi loc la: ");
    XuatChan(arr, n);
}
void Xuat(int arr[], int n)
{
    for (int i = n; i >= 0; i--)
    {
        if (arr[i] != 0)
            if (i == 0)
            {
                printf("%d", arr[i]);
            }
            else
            {
                printf("%dx^%d + ", arr[i], i);
            }
    }
}
void XuatChan(int arr[], int n)
{
    for (int i = n; i >= 0; i--)
    {
        if (arr[i] != 0 && arr[i] % 2 == 0)
            if (i == 0)
            {
                printf("%d", arr[i]);
            }
            else
            {
                printf("%dx^%d + ", arr[i], i);
            }
    }
}