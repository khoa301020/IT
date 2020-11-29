#include <stdio.h>
#include <stdlib.h>
#include <time.h>
struct sglNodeList {
    char value;
    sglNodeList *next;
};
sglNodeList *insToList(sglNodeList *KA19, sglNodeList *inserter) {
    sglNodeList *temp;
    if (KA19 == NULL)
        KA19 = inserter;
    else {
        temp = KA19;
        while (temp->next != NULL)
            temp = temp->next;
        temp->next = inserter;
    }
    return KA19;
}
sglNodeList *genUpperCaseString() {
    sglNodeList *temp, *KA19, *add;
    KA19 = NULL;
    int n = rand() % 100;
    for (int i = 1; i <= n; i++) {
        add = new sglNodeList;
        add->next = NULL;
        add->value = rand() % 25 + 65;
        KA19 = insToList(KA19, add);
    };
    return KA19;
}

void showUpperCaseString(sglNodeList *KA19) {
    if (KA19!=NULL) {
        sglNodeList *tmp;
        tmp = KA19;
        while (tmp!=NULL) {
            printf("%c: %d|",tmp->value,tmp->value);
            tmp = tmp->next;
        }
        printf("\n");        
    }
    else printf("EMPTY\n");
}
main() {
    srand(time(NULL));
    sglNodeList *stringchar;
    stringchar = genUpperCaseString();
    showUpperCaseString(stringchar);
}