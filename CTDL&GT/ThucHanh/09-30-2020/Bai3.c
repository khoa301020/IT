#include <stdio.h>
#include <math.h>
double Calc(double a, double b) {
    return (pow(a,3)-pow(a+b,1.0/4))/(a+2);
}
void main() {
    double a,b;
    printf("Nhap a, b: ");
    scanf("%d %d",&a,&b);
    printf("Ket qua cua bieu thuc la: %d",Calc(a,b));
}