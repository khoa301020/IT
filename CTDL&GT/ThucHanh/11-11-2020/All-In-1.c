#include <stdio.h>
#include <stdlib.h>

struct LinkedList
{
    int data;
    struct LinkedList *next;
};

typedef struct LinkedList *node;

node CreateNode(int value)
{
    node temp;
    temp = (node)malloc(sizeof(struct LinkedList));
    temp->next = NULL;
    temp->data = value;
    return temp;
}

node AddTail(node head, int value)
{
    node temp, p;
    temp = CreateNode(value);
    if (head == NULL)
    {
        head = temp;
    }
    else
    {
        p = head;
        while (p->next != NULL)
        {
            p = p->next;
        }
        p->next = temp;
    }
    return head;
}

node AddHead(node head, int value)
{
    node temp = CreateNode(value);
    if (head == NULL)
    {
        head = temp;
    }
    else
    {
        temp->next = head;
        head = temp;
    }
    return head;
}

node AddAt(node head, int value, int position)
{
    if (position == 0 || head == NULL)
    {
        head = AddHead(head, value);
    }
    else
    {

        int k = 1;
        node p = head;
        while (p != NULL && k != position)
        {
            p = p->next;
            ++k;
        }

        if (k != position)
        {

            head = AddTail(head, value);
        }
        else
        {
            node temp = CreateNode(value);
            temp->next = p->next;
            p->next = temp;
        }
    }
    return head;
}

node DelHead(node head)
{
    if (head == NULL)
    {
        printf("\nCha co gi de xoa het!");
    }
    else
    {
        head = head->next;
    }
    return head;
}

node DelTail(node head)
{
    if (head == NULL || head->next == NULL)
    {
        return DelHead(head);
    }
    node p = head;
    while (p->next->next != NULL)
    {
        p = p->next;
    }
    p->next = p->next->next;

    return head;
}

node DelAt(node head, int position)
{
    if (position == 0 || head == NULL || head->next == NULL)
    {
        head = DelHead(head);
    }
    else
    {

        int k = 1;
        node p = head;
        while (p->next->next != NULL && k != position)
        {
            p = p->next;
            ++k;
        }

        if (k != position)
        {

            head = DelTail(head);
        }
        else
        {
            p->next = p->next->next;
        }
    }
    return head;
}

int Get(node head, int index)
{
    int k = 0;
    node p = head;
    while (p != NULL && k != index)
    {
        p = p->next;
    }
    return p->data;
}

int Search(node head, int value)
{
    int position = 0;
    for (node p = head; p != NULL; p = p->next)
    {
        if (p->data == value)
        {
            return position;
        }
        ++position;
    }
    return -1;
}

node DelByVal(node head, int value)
{
    int position = Search(head, value);
    while (position != -1)
    {
        DelAt(head, position);
        position = Search(head, value);
    }
    return head;
}

void Traverser(node head)
{
    printf("\n");
    for (node p = head; p != NULL; p = p->next)
    {
        printf("%5d", p->data);
    }
}

node InitHead()
{
    node head;
    head = NULL;
    return head;
}

int Length(node head)
{
    int length = 0;
    for (node p = head; p != NULL; p = p->next)
    {
        ++length;
    }
    return length;
}

node Input()
{
    node head = InitHead();
    int n, value;
    do
    {
        printf("\nNhap so luong phan tu n = ");
        scanf("%d", &n);
    } while (n <= 0);

    for (int i = 0; i < n; ++i)
    {
        printf("\nNhap gia tri can them: ");
        scanf("%d", &value);
        head = AddTail(head, value);
    }
    return head;
}

void bubbleSort(struct LinkedList *start)
{
    int swapped, i;
    struct LinkedList *ptr1;
    struct LinkedList *lptr = NULL;

    if (start == NULL)
        return;

    do
    {
        swapped = 0;
        ptr1 = start;

        while (ptr1->next != lptr)
        {
            if (ptr1->data > ptr1->next->data)
            {
                swap(ptr1, ptr1->next);
                swapped = 1;
            }
            ptr1 = ptr1->next;
        }
        lptr = ptr1;
    } while (swapped);
}

void swap(struct LinkedList *a, struct LinkedList *b)
{
    int temp = a->data;
    a->data = b->data;
    b->data = temp;
}

int main()
{
    int n, position;
    printf("\n==Tao 1 danh sach lien ket==");
    node head = Input();
    Traverser(head);

    printf("\n==1. Tim kiem 1 phan tu trong linked list==");
    printf("\nNhap so muon tim kiem: ");
    scanf("%d", &n);
    int index = Search(head, n);
    printf("\nTim thay tai chi so %d", index);

    printf("\n==2. Them 1 phan tu vao linked list==");
    printf("\nNhap so muon chen va vi tri muon chen: ");
    scanf("%d%d", &n, &position);
    head = AddAt(head, n, position);
    Traverser(head);

    printf("\n==3. Sap xep lai va chen phan tu vao linked list==");
    bubbleSort(head);
    Traverser(head);
    printf("\nNhap so muon chen va vi tri muon chen: ");
    scanf("%d%d", &n, &position);
    head = AddAt(head, n, position);
    Traverser(head);

    printf("\n==4. Xoa 1 phan tu khoi linked list==");
    printf("\nNhap vi tri muon xoa: ");
    scanf("%d", &position);
    head = DelAt(head, position);
    Traverser(head);
}