#include <stdio.h>
int OddMin(int arr[], int size)
{
    int min = arr[0];
    for (int i = 0; i < size; i++)
    {
        if (arr[i] < min && (arr[i] % 2 == 1 || arr[i] % 2 == -1))
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
    if (OddMin(arr, n) % 2 == 0)
    {
        printf("Khong co so le nao trong mang");
    }
    else
    {
        printf("So le nho nhat trong mang la: %d", OddMin(arr, n));
    }

    return 0;
}
