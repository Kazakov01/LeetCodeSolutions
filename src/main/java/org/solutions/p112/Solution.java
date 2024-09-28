package org.solutions.p112;


// правила для решения задач на деревья с рекурсией
// 1. решить задачу на тривиальном дереве (дерево состоящее из одного узла). Это и является обрывом рекурсии как правило
// 2. Разделить задачи на подзадачи (в которых уже фигурируют правое и левое поддеревья)
// 3. В конце все сведется к тривиальному дереву из пункта 1

class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root.right == null && root.left == null) {
            return targetSum == root.val;
        }
        if (root.left != null) {
            if (hasPathSum(root.left, targetSum - root.val))
                return true;
        }

        if (root.right != null) {
            if (hasPathSum(root.right, targetSum - root.val))
                return true;
        }
        return false;
    }
}