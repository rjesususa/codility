package br.com.codility;

import static java.lang.Integer.max;
import static java.util.Objects.isNull;

/**
 * Created by Raneves on 22/03/18.
 */
public class Tree {
    private Tree parent;
    private Integer value;
    private Tree leftNodes;
    private Tree rightNodes;

    public Tree(Integer value) {
        this.value = value;
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

    private int maxValue(int value) {
        int maxValue = max(value, isNull(leftNodes) ? 0 : leftNodes.value);
        maxValue = max(maxValue, isNull(rightNodes) ? 0 : rightNodes.value);

        if (!isNull(rightNodes)) {
            maxValue = rightNodes.maxValue(maxValue);
        }

        if (!isNull(leftNodes)) {
            maxValue = leftNodes.maxValue(maxValue);
        }

        return maxValue;
    }

    public int maxValue() {
        return maxValue(value);
    }


}