#include <time.h>
#include <stdlib.h>
#include <stdio.h>
struct sglNodeList
{
    int value;
    sglNodeList *nodeAftAdd;
};
sglNodeList *insToList(sglNodeList *KA19, sglNodeList *inserter)
{
    sglNodeList *temp;
    if (KA19 == NULL)
    {
        KA19 = inserter;
    }
    else
    {
        temp = KA19;
        while (temp->nodeAftAdd != NULL)
            temp = temp->nodeAftAdd;
        temp->nodeAftAdd = inserter;
    }
    return KA19;
}
int searchByValue(sglNodeList *KA19, int value) {
    sglNodeList *tmp;
    tmp = KA19;
    while (tmp!=NULL)
    {
        if (tmp->value==value)
            return 1;
        else tmp=tmp->nodeAftAdd;
    }
    return 0;  
}
sglNodeList *genNonZeroListRandom(int n)
{
    srand(time(NULL));
    sglNodeList *KA19, *add;
    KA19 = NULL;
    int i = 1;
    while (i<=n)
    {
        add = new sglNodeList;
        add->nodeAftAdd = NULL;
        add->value = rand() % n + 1;
        while (searchByValue(KA19,add->value)) {
            add->value = rand() % n + 1;
        }
        KA19 = insToList(KA19, add);
        i++;
    }
    return KA19;
}
void showSglList(sglNodeList *KA19)
{
    if (KA19 != NULL)
    {
        sglNodeList *temp;
        temp = KA19;
        while (temp != NULL) {
            printf("%d ", temp->value);
            temp = temp->nodeAftAdd;
        }
        printf("\n");
    }
    else printf("EMPTY\n");
}
main()
{
    int n;
    sglNodeList *nonZeroList;
    printf("Nhap n=");
    scanf("%d", &n);
    nonZeroList = genNonZeroListRandom(n);
    showSglList(nonZeroList);
}