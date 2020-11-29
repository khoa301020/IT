#include <stdio.h>
void Rearrange(int *arr[], int n) {
    int tg;
    for(int i = 0; i < n - 1; i++){
        for(int j = i + 1; j < n; j++){
            if(arr[i] > arr[j]){
                // Hoan vi 2 so a[i] va a[j]
                tg = arr[i];
                arr[i] = arr[j];
                arr[j] = tg;        
            }
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
    int n;
    printf("Nhap so phan tu: ");
    scanf("%d", &n);
    int arr[n];
    Nhap(arr,n);
    printf("Day truoc khi sap xep: \n");
    Xuat(arr,n);
    printf("Day sau khi sap xep: \n");
    Rearrange(arr,n);
    Xuat(arr,n);
    return 0;
}
