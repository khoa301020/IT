#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <malloc.h>
typedef struct tagnode
{
    int key;
    struct tagnode *left;
    struct tagnode *right;
} node;

typedef node *tree;
#define TRUE 1
#define FALSE 0
//typedef char bool;
node *search(tree t, int x);
bool insert(tree *t, int x);
bool find(tree t, int x);
bool delleft(tree *t, tree q, int x);
bool delright(tree *t, tree q, int x);
int height(tree t);
int max(int a, int b);
int sonutLa(tree t);
int sonut1con(tree t);
int sonut2con(tree t);

void NLR(tree t);
void printtree(tree t, int indent);

/************************************/
/* Tim kiem nut co key x */
/************************************/
bool find(tree t, int x)

{
    if (t != NULL)
    {
        if (x == t->key)
        {
            printf("Da tim thay %d", t->key);
            return TRUE;
        }
        else if (x < t->key)
            find(t->left, x);
        else
            find(t->right, x);
    }
    else
    {
        printf("Khong tim thay ");
        return FALSE;
    }
}