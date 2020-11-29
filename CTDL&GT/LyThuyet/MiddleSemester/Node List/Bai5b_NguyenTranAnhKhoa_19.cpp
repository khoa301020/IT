#include <stdio.h>
#include <string.h>
struct sglCNode {
    char id[10];
    char name[30];
    char clas[5];
    float ar;
    sglCNode *nxt;
};

sglCNode *insToList(sglCNode *KA19, sglCNode *inserter) {
    sglCNode *temp;
    if (KA19==NULL) {
        KA19 = inserter;
        KA19->nxt = KA19;
    }
    else {
        temp = KA19;
        while (temp->nxt!=KA19)
            temp = temp->nxt;
        inserter->nxt = KA19;
        temp->nxt = inserter;
    }
    return KA19;
    
}
sglCNode *genStudentSglList() {
    sglCNode *KA19, *add;
    int n;
    KA19 = NULL;
    printf("Nhap so sinh vien: ");
    scanf("%d", &n);
    for (int i = 1; i<=n; i++) {
        add = new sglCNode;
        add->nxt = NULL;
        fflush(stdin);
        printf("Sinh vien thu %d:\nMASV ", i);
        gets(add->id);
        printf("Ten sinh vi en: ");
        gets(add->name);
        printf("Lop: ");
        gets(add->clas);
        printf("Diem trung binh: ");
        scanf("%f", &add->ar);
        KA19 = insToList(KA19, add);
    }
    return KA19;
}
void showStudentList(sglCNode *KA19) {
    if (KA19==NULL) printf("Danh sach khong co sinh vien nao\n");
    else {
        sglCNode *tmp;
        tmp = KA19;
        printf("%10s | %30s | %5s | %3s\n","MaSV","Ten Sinh vien","Lop","DTB");
        do {
            printf("%10s | %30s | %s | %.2f\n",tmp->id,tmp->name,tmp->clas,tmp->ar);
            tmp = tmp->nxt;
        }
        while (tmp!=KA19);
    }
}
sglCNode *searchByClass(sglCNode *KA19, char classKeyWord[]) {
    sglCNode *tmp;
    tmp = KA19;
    if (KA19!=NULL)
        do {
            if (strcmp(tmp->clas,classKeyWord)==0)
                return tmp;
            tmp = tmp->nxt;
        }
        while (tmp!=KA19);
    return NULL;
}
sglCNode *removeGivenStudent(sglCNode *KA19, sglCNode *removed) {
    sglCNode *tmp;
    if (KA19==removed) {
        if (KA19->nxt==KA19) KA19 = NULL;
        else
        {
            KA19 = KA19->nxt;
            tmp = KA19;
            while (tmp->nxt!=removed)
                tmp = tmp->nxt;
            tmp->nxt = KA19;
            
        }            
    }
    else {
        tmp = KA19;
        while (tmp->nxt!=removed)
            tmp =tmp->nxt;
        tmp->nxt = removed->nxt;        
    }
    return KA19;
}

sglCNode *removeAllStudentByClass(sglCNode *KA19, char classKeyWord[]) {
    sglCNode *tmp, *find;
    find = searchByClass(KA19,classKeyWord);
    while (find!=NULL) {
        KA19 = removeGivenStudent(KA19, find);
        find = searchByClass(KA19,classKeyWord);
    }
    return KA19;
}
    
void filterResult(sglCNode *KA19, int point, sglCNode **lower, sglCNode **higher) {
    sglCNode *tmpList, *tmp, *add;
    *lower = NULL;
    *higher = NULL;
    tmp = KA19;
    if (KA19!=NULL)
        do {
            add = new sglCNode;
            *add = *tmp;
            add->nxt = NULL;
            if (tmp->ar < point)
                *lower = insToList(*lower,add);
            if (tmp->ar > point)
                *higher = insToList(*higher,add);
            tmp = tmp->nxt;
        }
        while (tmp!=KA19);
}

main() {
    sglCNode *dssvCircle, *dssvLower5, *dssvHigher5;
    char lop[5];
    dssvCircle = genStudentSglList();
    showStudentList(dssvCircle);
    printf("Nhap lop can xoa toan bo sinh vien: ");
    fflush(stdin);
    gets(lop);
    dssvCircle = removeAllStudentByClass(dssvCircle,lop);
    printf("Danh sach sinh vien sau khi xoa: \n");
    showStudentList(dssvCircle);
    filterResult(dssvCircle,5,&dssvLower5,&dssvHigher5);
    printf("Danh sach sinh vien co dtb be hon 5:\n");
    showStudentList(dssvLower5);
    printf("Danh sach sinh vien co dtb lon hon 5:\n");
    showStudentList(dssvHigher5);
}