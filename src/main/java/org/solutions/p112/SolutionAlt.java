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

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (node.left != null) {
                stack.push(node.left);
                sumStack.push(node.val);
            }

            if (node.right != null) {
                stack.push(node.right);
                sumStack.push(node.val);
            }

            if (node.right == null && node.left == null) {

            }
        }
        return false;
    }
}