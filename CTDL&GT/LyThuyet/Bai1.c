//Chèn phần tử vào mảng biết vị trí vt
#include <stdio.h>
void insert(int arr[], int *arr2[], int vt, int size, int num)
{
    for (int i = 0; i < size; i++)
    {
        arr2[i] = arr[i];
    }
    for (int i = size; i >= vt; i--)
    {
        arr2[i] = arr2[i-1];
    }
    arr2[vt-1] = num;
    size++;
}
void main()
{
    int arr[100], arr2[100];
    int i, size, num, vt;
    printf("Nhap so phan tu: ");
    scanf("%d", &size);
    printf("Nhap cac phan tu: ");
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("Nhap phan tu can chen: ");
    scanf("%d", &num);
    printf("Nhap vi tri: ");
    scanf("%d", &vt);
    printf("Chuoi cu la: ");
    for (i = 0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\nChuoi moi la: ");
    insert(arr, arr2, vt, size, num);
    for (i = 0; i < size+1; i++)
        printf("%d ", arr2[i]);
    
}