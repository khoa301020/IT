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
void Merge(int arr1[], int arr2[], int *arr3[], int n, int m) {
    int index=0;
    for (int i = 0; i < n; i++)
    {
        arr3[index] = arr1[i];
        index++;
    }   
    for (int j = 0; j < m; j++)
    {
        arr3[index] = arr2[j];
        index++;
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
    printf("\nCac phan tu: \n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ",arr[i]);
    }
}
int main(int argc, char const *argv[])
{
    int n, m;
    printf("Nhap so phan tu day 1: ");
    scanf("%d", &n);
    int arr1[n];
    Nhap(arr1,n);
    printf("Nhap so phan tu day 2: ");
    scanf("%d", &m);
    int arr2[m], arr3[m+n];
    Nhap(arr2,m);
    printf("Day 1:");
    Xuat(arr1,n);
    printf("\nDay 2:");
    Xuat(arr2,m);
    printf("\nDay sau khi them va sap xep:");
    Merge(arr1,arr2,arr3,n,m);
    Rearrange(arr3,m+n);
    Xuat(arr3,m+n);
    return 0;
}
