#include <stdio.h>
int Reverse(int n) {
    int sum=0, rem;
    do
    {
        rem = n%10;
        sum = sum*10 + rem;
        n=n/10;
    } while (n!=0);
    return sum;
}
void main() {
    int n;
    printf("\nNhap n: ");
    scanf("%i", &n);
    printf("So dao nguoc cua %i la %i",n,Reverse(n));
}
/*int Reverse(int n) {
    int sum=0, rem;
    if (n!=0)
    {
        rem = n%10;
        sum = sum*10 + rem;
        Reverse(n/10);
    }
    else
    {
        return sum;
    }
    return sum;
}*/

