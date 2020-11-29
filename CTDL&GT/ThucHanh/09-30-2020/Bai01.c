#include <stdio.h>
#include <math.h>
const g = 9.8, pi=3.1416;
float Chuky(float l){
    return 2*pi*sqrt(l/g);
}
float Chuvi(float r){
    return 2*r*pi;
}
void main() {
    int bai;
    float l,r;
    printf("\nNhap bai muon tinh\n1 - Chu vi hinh tron\n2 - Chu ky con lac\n");
    scanf("%i", &bai);
    switch (bai)
    {   
    case 1:
        printf("Nhap ban kinh r: ");
        scanf("%f",&r);
        printf("Chu vi hinh tron co r = %f la: %f",r,Chuvi(r));
        break;
    case 2:
        printf("Nhap chieu dai l: ");
        scanf("%f",&l);
        printf("Chu ky con lac co l = %f la: %f",l,Chuky(l));
        break;
    default:
        break;
    }
}

