void printCorner(Node *root)
{

   queue<Node *> q;
    q.push(root);
    int first, second;

    while (!q.empty()) {
        int size = q.size();

        for (int i = 0; i < size; i++) {
            Node *node = q.front();
            q.pop();
            Node *left = node->left;

            if (left) {
                q.push(left);
            }
            Node *right = node->right;
            if (right) {
                q.push(right);
            }

            if (i == 0) {
                first = node->data;
            }
            if (i == size - 1) {
                second = node->data;
            }
        }

        if (size == 1) {
            cout << first << " ";
        } else {
            cout << first << " " << second << " ";
        }
    }

}
