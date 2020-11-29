/* Ackerman: A(m,n)
    Nếu m=0 thì A(m,n) = n+1
    Nếu m>0 & n=0 thì A(m,n) = A(m-1,m)
    Nếu m>0 & n>0 thì A(m,n) = A(m-1,A(m,n-1))
*/
#include <stdio.h>
int ackerman(int m, int n)
{
    if (m == 0)
        return (n + 1);
    else if (n == 0)
        return ackerman(m - 1, 1);
    else
        return ackerman(m - 1, ackerman(m, n - 1));
}
int main(int argc, char const *argv[])
{
    int m,n;
    printf("Nhap m, n: ");
    scanf("%i %i",&m,&n);
    printf("Answer: %d",ackerman(m,n));
    getch();
    return 0;
    
}
