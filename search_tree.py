""" Algoritm's
Depth-first search (DFS)
Breadth-first search (BFS)
"""


from collections import deque


class Node:
    def __init__(self, value, left=None, right=None) -> None:
        self.value = value
        self.left = left
        self.right = right

    def __repr__(self) -> str:
        return str(self.value)


def dfs_post_order(node: Node, path=[]):

    if node.left:
        path = dfs_post_order(node.left, path)
    if node.right:
        path = dfs_post_order(node.right, path)

    path += [node]

    return path


def dfs_pre_order(node: Node, path=[]):

    path += [node]

    if node.left:
        path = dfs_pre_order(node.left, path)
    if node.right:
        path = dfs_pre_order(node.right,  path)

    return path


def dfs_in_order(node: Node, path=[]):

    if node.left:
        path = dfs_in_order(node.left, path)

    path += [node]

    if node.right:
        path = dfs_in_order(node.right, path)

    return path


def bfs(root, path=[]):
    deq = deque()
    deq.append(root)

    while deq:
        cur_node = deq.popleft()
        path.append(cur_node)

        if cur_node.left:
            deq.append(cur_node.left)
        if cur_node.right:
            deq.append(cur_node.right)
    return path
