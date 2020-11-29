#include <stdio.h>
int Min(int arr[], int size)
{
    int min = arr[0];
    for (int i = 0; i < size; i++)
    {
        if (arr[i] < min)
            min = arr[i];
    }
    return min;
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
    printf("So nho nhat trong mang la: %d", Min(arr, n));
    return 0;
}
