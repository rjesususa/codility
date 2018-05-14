package br.com.codility;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.max;

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

    public int getValue() {
        return value;
    }

    public void setLeftNode(Tree leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Tree rightNode) {
        this.rightNode = rightNode;
    }

    private int maxValue(int value) {
        int maxValue = max(value, leftNode == null ? 0 : leftNode.value);
        maxValue = max(maxValue, rightNode == null ? 0 : rightNode.value);

        if (rightNode != null) {
            maxValue = rightNode.maxValue(maxValue);
        }

        if (leftNode != null) {
            maxValue = leftNode.maxValue(maxValue);
        }

        return maxValue;
    }

    public int maxValue() {
        return maxValue(value);
    }

    public int maxRepeatableValue() {
        Map<Integer, Integer> leftNodeValues = createMapWithTheMostRepeatedValue(leftNode);
        Map<Integer, Integer> rightNodeValues = createMapWithTheMostRepeatedValue(rightNode);

        return findTheKeyWithTheMostRepeatedValuesInThisMap(leftNodeValues, rightNodeValues);
    }

    private int findTheKeyWithTheMostRepeatedValuesInThisMap(Map<Integer, Integer> leftNodeValues, Map<Integer, Integer> rightNodeValues) {
        int keyWithTheMostRepeatedValuesByLeftNodeValues = retrieveKeyOfTheMostRepeatedValueFromNodes(leftNodeValues);
        int keyWithTheMostRepeatedValuesByRightNodeValues = retrieveKeyOfTheMostRepeatedValueFromNodes(rightNodeValues);
        int KeyWithTheMostRepeatedValue = keyWithTheMostRepeatedValuesByRightNodeValues;

        final Integer leftNodeMaxNumberOfIterations = leftNodeValues.get(keyWithTheMostRepeatedValuesByLeftNodeValues) == null ? 0 : leftNodeValues.get(keyWithTheMostRepeatedValuesByLeftNodeValues);
        final Integer rightNodeMaxNumberOfIterations = rightNodeValues.get(keyWithTheMostRepeatedValuesByRightNodeValues) == null ? 0 : rightNodeValues.get(keyWithTheMostRepeatedValuesByRightNodeValues);

        if (leftNodeMaxNumberOfIterations > rightNodeMaxNumberOfIterations) {
            KeyWithTheMostRepeatedValue = keyWithTheMostRepeatedValuesByLeftNodeValues;
        }

        return KeyWithTheMostRepeatedValue;
    }

    private Map<Integer, Integer> createMapWithTheMostRepeatedValue(Tree node) {
        Map<Integer, Integer> nodeValues = new HashMap<>();
        populateMapWithTheMostRepeatedValue(nodeValues, node);
        return nodeValues;
    }

    private int retrieveKeyOfTheMostRepeatedValueFromNodes(Map<Integer, Integer> nodeValues) {
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

    private void populateMapWithTheMostRepeatedValue(Map<Integer, Integer> nodeValues, Tree node) {

        if (node != null) {
            Integer previousExistingValue = nodeValues.get(node.getValue()) == null ? 0 : nodeValues.get(node.getValue());
            nodeValues.put(node.getValue(), ++previousExistingValue);

            if (node.leftNode != null) {
                final int keyOfLeftNodeValue = node.leftNode.getValue();
                Integer numberOfLeftNodeValueIteractions = nodeValues.get(keyOfLeftNodeValue) == null ? 0 : nodeValues.get(keyOfLeftNodeValue);
                nodeValues.put(keyOfLeftNodeValue, ++numberOfLeftNodeValueIteractions);
                node.leftNode.populateMapWithTheMostRepeatedValue(nodeValues, node.leftNode);
            }

            if (node.rightNode != null) {
                Integer previousRightExistingValue = nodeValues.get(node.rightNode.getValue()) == null ? 0 : nodeValues.get(node.rightNode.getValue());
                nodeValues.put(node.rightNode.getValue(), ++previousRightExistingValue);
                node.rightNode.populateMapWithTheMostRepeatedValue(nodeValues, node.rightNode);
            }
        }

    }
}