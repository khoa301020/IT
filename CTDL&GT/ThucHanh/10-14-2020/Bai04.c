#include <stdio.h>
int Sum(int arr[], int size)
{
    int sum = 0;
    for (int i = 0; i < size; i++)
    {
        if (arr[i] < 0)
            sum = sum + arr[i];
    }
    return sum;
}
int main(int argc, char const *argv[])
{
    int arr[100], n;
    printf("Nhap so phan tu: ");
    scanf("%d", &n);
    printf("Nhap cac phan tu: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("Tong cac so chan trong mang la: %d", Sum(arr, n));
    return 0;
}
