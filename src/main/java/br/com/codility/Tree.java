package br.com.codility;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.max;
import static java.util.Objects.isNull;

/**
 * Created by Raneves on 22/03/18.
 */
public class Tree {
    private Tree parent;
    private Integer value;
    private Tree leftNode;
    private Tree rightNode;

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

    public Tree getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Tree leftNode) {
        this.leftNode = leftNode;
    }

    public Tree getRightNode() {
        return rightNode;
    }

    public void setRightNode(Tree rightNode) {
        this.rightNode = rightNode;
    }

    private int maxValue(int value) {
        int maxValue = max(value, isNull(leftNode) ? 0 : leftNode.value);
        maxValue = max(maxValue, isNull(rightNode) ? 0 : rightNode.value);

        if (!isNull(rightNode)) {
            maxValue = rightNode.maxValue(maxValue);
        }

        if (!isNull(leftNode)) {
            maxValue = leftNode.maxValue(maxValue);
        }

        return maxValue;
    }

    public int maxValue() {
        return maxValue(value);
    }

    public int maxRepeatableValue() {
        Map<Integer, Integer> leftNodeValues = new HashMap<>();
        Map<Integer, Integer> rightNodeValues = new HashMap<>();

        int keyLeftMaxValue = maxRepeatableValue(leftNodeValues, leftNode);
        int keyRightMaxValue = maxRepeatableValue(rightNodeValues, rightNode);

        final Integer leftNodeMaxNumberOfIterations = leftNodeValues.get(keyLeftMaxValue) == null ? 0: leftNodeValues.get(keyLeftMaxValue);
        final Integer rightNodeMaxNumberOfIterations = rightNodeValues.get(keyRightMaxValue) == null ? 0 : rightNodeValues.get(keyRightMaxValue);

        if (leftNodeMaxNumberOfIterations > rightNodeMaxNumberOfIterations) {
            return keyLeftMaxValue;
        }

        return keyRightMaxValue;
    }

    private int maxRepeatableValue(Map<Integer, Integer> nodeValues, Tree node) {

        if (node != null) {
            Integer previousExistingValue = nodeValues.get(node.getValue()) == null ? 0 : nodeValues.get(node.getValue());
            nodeValues.put(node.getValue(), ++previousExistingValue);


            if (node.leftNode != null) {
                Integer previousLeftExistingValue = nodeValues.get(node.leftNode.getValue()) == null ? 0 : nodeValues.get(node.leftNode.getValue());
                nodeValues.put(node.leftNode.getValue(), ++previousLeftExistingValue);
            }

            if (node.rightNode != null) {
                Integer previousRightExistingValue = nodeValues.get(node.rightNode.getValue()) == null ? 0 : nodeValues.get(node.rightNode.getValue());
                nodeValues.put(node.rightNode.getValue(), ++previousRightExistingValue);
            }

            if (node.leftNode != null) {
                node.leftNode.maxRepeatableValue(nodeValues, node.leftNode);
            }

            if (node.rightNode != null) {
                node.rightNode.maxRepeatableValue(nodeValues, node.rightNode);
            }
        }

        final Integer[] maxRepeatableInteraction = {0};
        final Integer[] keyOfMaxRepeatableInteraction = {0};
        nodeValues.forEach((key, value) -> {
            if (value > maxRepeatableInteraction[0]) {
                maxRepeatableInteraction[0] = value;
                keyOfMaxRepeatableInteraction[0] = key;
            }
        });

        return keyOfMaxRepeatableInteraction[0];
    }
}