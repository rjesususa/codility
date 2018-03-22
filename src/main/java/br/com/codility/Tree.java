package br.com.codility;

/**
 * Created by Raneves on 22/03/18.
 */
public class Tree {
    private Tree parent;
    private Integer value;
    private Tree leftNodes;
    private Tree rightNodes;

    public Tree() {
    }

    public Tree(Tree parent, Integer value) {
        this.parent = parent;
        this.value = value;
    }

    public Tree getParent() {
        return parent;
    }

    public void setParent(Tree parent) {
        this.parent = parent;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Tree getLeftNodes() {
        return leftNodes;
    }

    public void setLeftNodes(Tree leftNodes) {
        this.leftNodes = leftNodes;
    }

    public Tree getRightNodes() {
        return rightNodes;
    }

    public void setRightNodes(Tree rightNodes) {
        this.rightNodes = rightNodes;
    }

    public int maxValue() {
        int maxValueOnLeftNodes = getValue();
        Tree tree = getLeftNodes();
        if(tree != null) {
            do {
                if (tree.getValue() > maxValueOnLeftNodes) {
                    maxValueOnLeftNodes = tree.getValue();
                }
            } while ((tree = tree.getLeftNodes()) != null);
        }

        int maxValueOnRightNodes = 0;

        tree = getRightNodes();
        if(tree!= null) {
            do {
                if (tree.getValue() > maxValueOnRightNodes) {
                    maxValueOnRightNodes = tree.getValue();
                }
            } while ((tree = tree.getRightNodes()) != null);
        }

        return maxValueOnLeftNodes > maxValueOnRightNodes ? maxValueOnLeftNodes : maxValueOnRightNodes;
    }
}