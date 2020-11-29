#include <stdio.h>
void Delete(int *arr[], int *n, int x) {
    for (int i = 0; i < n; i++)
    {
        if (arr[i]==x)
        {
            for (int j = i; j<n; j++)
            {
                arr[j]=arr[j+1];
            }
            n--;
            break;
        }
    }
}
void Nhap(int *arr[], int n) {
    printf("Nhap cac phan tu: \n");
    for (int i = 0; i < n; i++)
    {
        printf("arr[%d] = ",i);
        scanf("%d", &arr[i]);
    }
}
void Xuat(int arr[], int n) {
    printf("Cac phan tu: \n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ",arr[i]);
    }
}
int main(int argc, char const *argv[])
{
    int  x, n;
    printf("Nhap so phan tu: ");
    scanf("%d", &n);
    int arr[n];
    Nhap(arr,n);
    printf("Day truoc khi xoa: \n");
    Xuat(arr,n);
    printf("\nNhap x: ");
    scanf("%d",&x);
    printf("Day sau khi xoa: \n");
    Delete(arr,n,x);
    Xuat(arr,n-1);
    return 0;
}
