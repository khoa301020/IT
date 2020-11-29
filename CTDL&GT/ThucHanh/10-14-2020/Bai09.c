#include <stdio.h>
int EvenMax(int arr[], int size)
{
    int max = arr[0], check=0, i=0;
    while (check ==0) {
        if (arr[i]%2==0)
        {
            max=arr[i];
            check=1;
        }
        i++;
        
    }
    for (i = 0; i < size; i++)
    {
        if (arr[i] > max && arr[i] % 2 == 0)
            max = arr[i];
    }
    return max;
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
    if (EvenMax(arr, n) % 2 == 1 || EvenMax(arr, n) % 2 == -1)
    {
        printf("Khong co so chan nao trong mang");
    }
    else
    {
        printf("So chan lon nhat trong mang la: %d", EvenMax(arr, n));
    }
    return 0;
}
