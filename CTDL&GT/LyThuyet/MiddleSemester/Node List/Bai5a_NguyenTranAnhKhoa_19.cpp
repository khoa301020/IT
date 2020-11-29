#include <stdio.h>
#include <string.h>
struct dlinkNode {
    dlinkNode *prev;
    char id[10];
    char name[30];
    char clas[5];
    float ar;
    dlinkNode *nxt;
};
dlinkNode *insToList(dlinkNode *KA19, dlinkNode *inserter) {
    dlinkNode *temp;
    if (KA19 == NULL) {
        KA19 = inserter;
    }
    else {
        temp = KA19;
        while (temp->nxt != NULL)
            temp = temp->nxt;
        inserter->prev = temp;
        temp->nxt = inserter;
    }
    return KA19;
}
dlinkNode *genStudentDLinkList() {
    dlinkNode *KA19, *add;
    int n;
    KA19 = NULL;
    printf("Nhap so sinh vien: ");
    scanf("%d", &n);
    for (int i = 1; i<=n; i++) {
        add= new dlinkNode;
        add->nxt = NULL;
        add->prev = NULL;
        fflush(stdin);
        printf("Sinh vien thu %d:\nMASV ", i);
        gets(add->id);
        printf("Ten sinh vien: ");
        gets(add->name);
        printf("Lop: ");
        gets(add->clas);
        printf("Diem trung binh: ");
        scanf("%f", &add->ar);
        KA19 = insToList(KA19, add);
    }
    return KA19;
}
dlinkNode *getReversedList(dlinkNode *KA19) {
    dlinkNode *tmp;
    if (KA19!=NULL)
        if (KA19->prev==NULL && KA19->nxt != NULL) {
            tmp = KA19;
            while (tmp->nxt!=NULL)
                tmp = tmp->nxt;
            return tmp;
            }
        else if (KA19->nxt==NULL && KA19->prev!=NULL) {
            tmp = KA19;
            while (tmp->prev!=NULL)
                tmp = tmp->prev;
            return tmp;
            }
    return KA19;    
}
void showStudentList(dlinkNode *KA19) {
    if (KA19==NULL) printf("Danh sach chua co sinh vien nao\n");
    else {
        dlinkNode *tmp;
        tmp = KA19;
        printf("%10s | %30s | %5s | %3s\n","MaSV","Ten Sinh vien","Lop","DTB");
        while (tmp!=NULL) {
            printf("%10s | %30s | %s | %.2f\n",tmp->id,tmp->name,tmp->clas,tmp->ar);
            if (KA19->prev==NULL)
                tmp = tmp->nxt;
            else if (KA19->nxt==NULL)
                tmp = tmp->prev;
            else tmp = NULL;
        }
    }
    
}
dlinkNode *searchByClass(dlinkNode *KA19, char clas[]) {
    dlinkNode *tmp;
    tmp = KA19;
    if (KA19!=NULL)
        while (tmp!=NULL) {
            if (strcmp(tmp->clas,clas)==0)
                return tmp;
            if (KA19->prev==NULL)
                tmp = tmp->nxt;
            else if (KA19->nxt==NULL)
                tmp = tmp->prev;
            else tmp = NULL;
        }
    return NULL;
    
}
dlinkNode *removeGivenStudent(dlinkNode *KA19, dlinkNode *removed) {
    dlinkNode *prev, *nxt;
    if (KA19->prev==NULL) {
        if (removed==KA19) {
            KA19 = KA19->nxt;
            if (KA19!=NULL) KA19->prev = NULL;
            delete removed;
            removed = NULL;
        }
        else {
            prev = removed->prev;
            nxt = removed->nxt;
            prev->nxt = nxt;
            if (nxt != NULL) nxt->prev = prev;
            delete removed;
            removed = NULL;
        }
    }
    else if (KA19->nxt==NULL) {
        if (removed==KA19) {
            KA19 = KA19->prev;
            if (KA19!=NULL) KA19->nxt = NULL;
            delete removed;
            removed = NULL;
        }
        else {
            prev = removed->nxt;
            nxt = removed->prev;
            prev->prev = nxt;
            if (nxt != NULL) nxt->nxt = prev;
            delete removed;
            removed = NULL;
        }
    }
    return KA19;
}
dlinkNode *removeAllStudentByClass(dlinkNode *KA19, char classKeyWord[]) {
    dlinkNode *find;
    find = searchByClass(KA19,classKeyWord);
    while (find!=NULL) {
        KA19 = removeGivenStudent(KA19,find);
        find = searchByClass(KA19,classKeyWord);
    }
    return KA19;
    
}
void filterResult(dlinkNode *KA19, int point, dlinkNode **lower, dlinkNode **higher) {
    dlinkNode *tmp,*add;
    *lower = NULL;
    *higher = NULL;
    tmp = KA19;
    while (tmp!=NULL) {
            add = new dlinkNode;
            *add = *tmp;
            add->nxt = NULL;
            add->prev = NULL;
        if (tmp->ar < point)
            *lower = insToList(*lower,add);
        if (tmp->ar > point)
            *higher = insToList(*higher,add);
        if (KA19->prev==NULL)
            tmp = tmp->nxt;
        else if (KA19->nxt==NULL)
            tmp = tmp->prev;
        else tmp = NULL;
    }
}
int main() {
    dlinkNode *dssv, *dssvReversed, *dssvLower5, *dssvHigher5;
    char lop[5];
    dssv = genStudentDLinkList();
    printf("Danh sach sinh vien: \n");
    showStudentList(dssv);

    printf("Danh sach sinh vien theo chieu nguoc: \n");
    dssvReversed = getReversedList(dssv);
    showStudentList(dssvReversed);

    printf("Nhap lop can xoa toan bo sinh vien: ");
    fflush(stdin);
    gets(lop);
    dssv = removeAllStudentByClass(dssv,lop);
    dssvReversed = getReversedList(dssv);
    printf("Danh sach sinh vien sau khi xoa:\n");
    showStudentList(dssv);

    printf("Nhap lop can xoa toan bo sinh vien theo chieu nguoc lai: ");
    fflush(stdin);
    gets(lop);
    dssvReversed = removeAllStudentByClass(dssvReversed,lop);
    dssv = getReversedList(dssvReversed);
    printf("Danh sach sinh vien sau khi xoa theo chieu nguoc:\n");
    showStudentList(dssv);

    filterResult(dssv,5,&dssvLower5,&dssvHigher5);
    printf("Danh sach sinh vien co dtb be hon 5:\n");
    showStudentList(dssvLower5);
    printf("Danh sach sinh vien co dtb lon hon 5:\n");
    showStudentList(dssvHigher5);

    filterResult(dssvReversed,5,&dssvLower5,&dssvHigher5);
    printf("Danh sach sinh vien co dtb be hon 5 theo chieu tach nguoc:\n");
    showStudentList(dssvLower5);
    printf("Danh sach sinh vien co dtb lon hon 5 theo chieu tach nguoc:\n");
    showStudentList(dssvHigher5);
}
