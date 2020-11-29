#include <stdio.h>
int Check(int arr[], int n, int x) {
    int check = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i]==x)
        {
            check = 1;
        }
        
    }
    return check;
}
void Nhap(int *arr[], int n) {
    printf("Nhap cac phan tu: \n");
    for (int i = 0; i < n; i++)
    {
        printf("arr[%d] = ",i);
        scanf("%d", &arr[i]);
    }
}
int main(int argc, char const *argv[])
{
    int  x, n;
    printf("Nhap so phan tu: ");
    scanf("%d", &n);
    int arr[n];
    Nhap(arr,n);
    printf("\nNhap x: ");
    scanf("%d",&x);
    if (Check(arr,n,x)==1)
    {
        printf("So %d co trong mang",x);
    } else
    {
        printf("So %d khong co trong mang",x);
    }
    return 0;
}
