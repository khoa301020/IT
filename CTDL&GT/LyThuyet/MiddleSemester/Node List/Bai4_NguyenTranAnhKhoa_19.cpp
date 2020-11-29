#include <stdio.h>
#include <string.h>
struct sglNode {
    char id[10];
    char name[30];
    char clas[5];
    float ar;
    sglNode *nxt;
};
sglNode *insToList(sglNode *KA19, sglNode *inserter) {
    sglNode *temp;
    if (KA19 == NULL) {
        KA19 = inserter;
    }
    else {
        temp = KA19;
        while (temp->nxt != NULL)
            temp = temp->nxt;
        temp->nxt = inserter;
    }
    return KA19;
}
sglNode *genStudentSglList() {
    sglNode *KA19, *add;
    int n;
    KA19 = NULL;
    printf("Nhap so sinh vien: ");
    scanf("%d", &n);
    for (int i = 1; i<=n; i++) {
        add= new sglNode;
        add->nxt = NULL;
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
void showStudentList(sglNode *KA19) {
    if (KA19==NULL) printf("Danh sach chua co sinh vien nao\n");
    else {
        sglNode *tmp;
        tmp = KA19;
        printf("%10s | %30s | %5s | %3s\n","MaSV","Ten Sinh vien","Lop","DTB");
        while (tmp!=NULL) {
            printf("%10s | %30s | %s | %.2f\n",tmp->id,tmp->name,tmp->clas,tmp->ar);
            tmp = tmp->nxt;
        }
    }
}
sglNode *searchByClass(sglNode *KA19, char clas[]) {
    sglNode *tmp;
    tmp = KA19;
    while (tmp!=NULL) {
        if (strcmp(tmp->clas,clas)==0)
            return tmp;
        tmp = tmp->nxt;
    }
    return NULL;
}
sglNode *removeGivenStudent(sglNode *KA19, sglNode *removed) {
    sglNode *tmp;
    if (removed==KA19) {
        KA19 = KA19->nxt;
        removed->nxt = NULL;
        delete removed;
        removed = NULL;
        }
    else {
        tmp = KA19;
        while (tmp->nxt!=removed)
            tmp = tmp->nxt;
        tmp->nxt = removed->nxt;
        removed->nxt = NULL;
        delete removed;
        removed = NULL;
    }
    return KA19;
}

sglNode *removeAllStudentByClass(sglNode *KA19, char classKeyWord[]) {
    sglNode *tmp, *find;
    find = searchByClass(KA19,classKeyWord);
    while (find!=NULL) {
        KA19 = removeGivenStudent(KA19, find);
        find = searchByClass(KA19,classKeyWord);
    }
    return KA19;
}
sglNode *filterResult(sglNode *KA19, int point, sglNode **lower, sglNode **higher) {
    sglNode *tmp,*add;
    tmp = KA19;
    *lower = NULL;
    *higher = NULL;
    while (tmp!=NULL) {
        add = new sglNode;
        *add = *tmp;
        add->nxt = NULL;
        if (tmp->ar < point)
            *lower = insToList(*lower,add);
        if (tmp->ar > point)
            *higher = insToList(*higher,add);
        tmp = tmp->nxt;
    }
}
int main() {
    sglNode *dssv, *dssvLower5, *dssvHigher5;
    char lop[5];
    dssv = genStudentSglList();
    showStudentList(dssv);
    printf("Nhap lop can xoa toan bo sinh vien: ");
    fflush(stdin);
    gets(lop);
    dssv = removeAllStudentByClass(dssv,lop);
    printf("Danh sach sinh vien sau khi xoa:\n");
    showStudentList(dssv);
    filterResult(dssv,5,&dssvLower5,&dssvHigher5);
    printf("Danh sach sinh vien co dtb be hon 5:\n");
    showStudentList(dssvLower5);
    printf("Danh sach sinh vien co dtb lon hon 5:\n");
    showStudentList(dssvHigher5);
}