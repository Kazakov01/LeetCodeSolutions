package org.solutions.p112;


// правила для решения задач на деревья с рекурсией
// 1. решить задачу на тривиальном дереве (дерево состоящее из одного узла). Это и является обрывом рекурсии как правило
// 2. Разделить задачи на подзадачи (в которых уже фигурируют правое и левое поддеревья)
// 3. В конце все сведется к тривиальному дереву из пункта 1

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

class SolutionAlt {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        Deque<Integer> sumStack = new ArrayDeque<>();
        stack.push(root);
        sumStack.push(root.val);
        int sum = 0;

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            sum += sumStack.pop();

            if (node.left != null) {
                stack.push(node.left);
                sumStack.push(node.left.val + sum);
            }

            if (node.right != null) {
                stack.push(node.right);
                sumStack.push(node.right.val + sum);
            }

            if (node.right == null && node.left == null) {
                if (sum == targetSum) {
                    return true;
                } else {
                    sum = sumStack.peekFirst();
                }
            }
        }
        return false;
    }
}