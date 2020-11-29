#include <stdio.h>
int Min(int arr[], int n)
{
    int min = arr[0];
    for (int i = 0; i < n; i++)
    {
        if (arr[i] < min)
        {
            min = arr[i];
        }
        printf("%d", min);
        return min;
    }
}
int EvenMax(int arr[], int n)
{
    int max;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] % 2 == 0)
        {
            max = arr[i];
            for (int j = 0; j < n; j++)
                if (arr[j] > max && arr[j] % 2 == 0)
                    max = arr[j];
        }
    }
    return max;
}
    void Nhap(int *arr[], int n)
    {
        printf("Nhap cac phan tu: \n");
        for (int i = 0; i < n; i++)
        {
            printf("arr[%d] = ", i);
            scanf("%d", &arr[i]);
        }
    }
    int main(int argc, char const *argv[])
    {
        int n;
        printf("Nhap so phan tu: ");
        scanf("%d", &n);
        int arr[n];
        Nhap(arr, n);
        if (EvenMax(arr, n) == 1)
        {
            printf("Mang khong co so chan");
        }
        else
        {
            printf("So chan lon nhat trong mang la %d", EvenMax(arr, n));
        }
        return 0;
    }
