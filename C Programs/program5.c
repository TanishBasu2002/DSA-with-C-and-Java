// This is a partially implemented code snippet
#include <stdio.h>
#include <stdlib.h>
int sum(node)
{
    if (node == NULL)
    {
        return 0;
    }
    return sum(node.left) + node.value + sum(node.right);
}