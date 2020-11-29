#include <string.h>

int main()
{
    char s[1000];
    int i, j, count = 0, n;

    printf("Nhap chuoi: ");
    gets(s);

    for (j = 0; s[j]; j++)
        ;
    n = j;

    printf("So lan xuat hien:\n");

    for (i = 0; i < n; i++)
    {
        count = 1;
        if (s[i] && s[i] != 32)
        {
            for (j = i + 1; j < n; j++)
            {
                if ((s[i] == s[j] || s[i] == (s[j] >= 97 ? s[j] - 32 : s[j] + 32)) && s[i] != 32)
                {
                    count++;
                    s[j] = '\0';
                }
            }
            printf(" '%c' = %d \n", s[i] >= 97 ? s[i] : s[i] + 32, count);
        }
    }

    return 0;
}