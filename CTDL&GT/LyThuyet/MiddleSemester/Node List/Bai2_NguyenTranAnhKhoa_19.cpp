#include <stdio.h>
struct dathuc
{
    int base;
    int index;
    dathuc *next;
};
dathuc *addTail(dathuc *KA19, dathuc *inserter)
{
    dathuc *temp;
    if (KA19 == NULL)
    {
        KA19 = inserter;
    }
    else
    {
        temp = KA19;
        while (temp->next != NULL)
            temp = temp->next;
        temp->next = inserter;
    }
    return KA19;
}
dathuc *CreatNewDaThuc()
{
    dathuc *KA19, *add;
    int n;
    KA19 = NULL;
    printf("Nhap so phan tu cua da thuc ");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++)
    {
        add = new dathuc;
        add->next = NULL;
        printf("Co so cua so thu %d ", i);
        scanf("%d", &add->base);
        printf("So mu cua so thu %d ", i);
        scanf("%d", &add->index);
        KA19 = addTail(KA19, add);
    }
    return KA19;
}
void ShowDaThuc(dathuc *KA19)
{
    if (KA19 != NULL)
    {
        dathuc *temp;
        temp = KA19;
        int firstPassed = 0;
        while (temp != NULL)
        {
            if (temp->base % 2 == 0 && temp->base!=0)
            {
                if (firstPassed == 1)
                {
                    printf("+");
                }
                else
                {
                    printf("f(x)=");
                    firstPassed = 1;
                }
                if (temp->index == 0)
                    printf("%d", temp->base);
                else if (temp->index == 1)
                    printf("%d*x", temp->base);
                else
                    printf("%d*x^(%d)", temp->base, temp->index);
            }
            temp = temp->next;
        }
        printf("\n");
    }
    else
        printf("EMPTY\n");
}
main()
{
    dathuc *dathuc;
    dathuc = CreatNewDaThuc();
    ShowDaThuc(dathuc);
}