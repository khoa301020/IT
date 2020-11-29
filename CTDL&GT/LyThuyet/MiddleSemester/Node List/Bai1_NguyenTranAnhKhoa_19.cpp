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
sglNodeList *genNonZeroList()
{
    sglNodeList *KA19, *add;
    KA19 = NULL;
    int i = 1;
    while (1)
    {
        add = new sglNodeList;
        printf("Nhap so thu %d: ",i);
        scanf("%d", &add->value);
        add->nodeAftAdd = NULL;
        if (add->value != 0)
            KA19 = insToList(KA19, add);
        else break; 
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
    sglNodeList *nonZeroList;
    nonZeroList = genNonZeroList();
    showSglList(nonZeroList);
}