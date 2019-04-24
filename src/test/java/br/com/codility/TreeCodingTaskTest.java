package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TreeCodingTaskTest {

    @Test
    public void returnsTheMaxValue5WhenTreeHasNodesJustInLeftDirection() {
        TreeCodingTask root = new TreeCodingTask(0);
        final TreeCodingTask leftNode1 = new TreeCodingTask(root, 1);
        TreeCodingTask leftNode2 = new TreeCodingTask(leftNode1, 5);
        leftNode1.setLeftNode(leftNode2);
        root.setLeftNode(leftNode1);

        assertThat(root.maxValue(), equalTo(5));
    }

    @Test
    public void returnsTheMaxValue7WhenTreeHasNodesJustInRightDirection() {
        TreeCodingTask root = new TreeCodingTask(0);

        TreeCodingTask rightNode1 = new TreeCodingTask(root, 3);
        TreeCodingTask rightNode2 = new TreeCodingTask(rightNode1, 7);
        TreeCodingTask rightNode3 = new TreeCodingTask(rightNode2, 2);

        rightNode2.setRightNode(rightNode3);
        rightNode1.setRightNode(rightNode2);
        root.setRightNode(rightNode1);


        assertThat(root.maxValue(), is(7));
    }

    @Test
    public void returnsTheMaxValue8WhenTreeHasNodesInLeftAndRightDirections() {
        TreeCodingTask root = new TreeCodingTask(0);
        final TreeCodingTask leftNode1 = new TreeCodingTask(root, 5);
        TreeCodingTask leftNode2 = new TreeCodingTask(leftNode1, 2);
        leftNode1.setLeftNode(leftNode2);
        root.setLeftNode(leftNode1);

        TreeCodingTask rightNode1 = new TreeCodingTask(root, 3);
        TreeCodingTask rightNode2 = new TreeCodingTask(rightNode1, 6);
        TreeCodingTask rightNode3 = new TreeCodingTask(rightNode2, 8);

        rightNode2.setRightNode(rightNode3);
        rightNode1.setRightNode(rightNode2);
        root.setRightNode(rightNode1);


        assertThat(root.maxValue(), is(8));
    }

    @Test
    public void returnsTheMaxValue9WhenTreeHasNodesWithManyLeftAndRightDirections() {
        TreeCodingTask root = new TreeCodingTask(0);
        final TreeCodingTask leftNode1 = new TreeCodingTask(root, 5);
        TreeCodingTask leftNode2 = new TreeCodingTask(leftNode1, 2);
        TreeCodingTask rightNode11 = new TreeCodingTask(leftNode2, 9);
        leftNode2.setRightNode(rightNode11);
        leftNode1.setLeftNode(leftNode2);
        root.setLeftNode(leftNode1);

        TreeCodingTask rightNode1 = new TreeCodingTask(root, 3);
        TreeCodingTask rightNode2 = new TreeCodingTask(rightNode1, 8);
        TreeCodingTask rightNode3 = new TreeCodingTask(rightNode2, 7);

        rightNode2.setRightNode(rightNode3);
        rightNode1.setRightNode(rightNode2);
        root.setRightNode(rightNode1);


        assertThat(root.maxValue(), is(9));
    }

    @Test
    public void returnsTheMaxValue10WhenTreeHasNodesWithManyLeftAndRightDirections() {
        TreeCodingTask root = new TreeCodingTask(8);
        final TreeCodingTask leftNode1 = new TreeCodingTask(root, 5);
        TreeCodingTask leftNode2 = new TreeCodingTask(leftNode1, 2);

        TreeCodingTask rightNode11 = new TreeCodingTask(leftNode2, 9);
        TreeCodingTask left2Node1 = new TreeCodingTask(rightNode11, 3);
        TreeCodingTask right3Node2 = new TreeCodingTask(left2Node1, 4);
        left2Node1.setRightNode(right3Node2);
        TreeCodingTask left3Node2 = new TreeCodingTask(left2Node1, 9);
        TreeCodingTask expectedNodeValue = new TreeCodingTask(left3Node2, 10);
        left3Node2.setRightNode(expectedNodeValue);
        left2Node1.setLeftNode(left3Node2);
        TreeCodingTask right2Node1 = new TreeCodingTask(rightNode11, 5);

        rightNode11.setLeftNode(left2Node1);
        rightNode11.setRightNode(right2Node1);

        leftNode2.setRightNode(rightNode11);
        leftNode1.setLeftNode(leftNode2);
        root.setLeftNode(leftNode1);

        TreeCodingTask rightNode1 = new TreeCodingTask(root, 3);
        TreeCodingTask rightNode2 = new TreeCodingTask(rightNode1, 8);
        TreeCodingTask rightNode3 = new TreeCodingTask(rightNode2, 7);

        rightNode2.setRightNode(rightNode3);
        rightNode1.setRightNode(rightNode2);
        root.setRightNode(rightNode1);


        assertThat(root.maxValue(), is(10));
    }

    @Test
    public void returnsTheMaxValue11WhenTreeHasNodesWithManyLeftAndRightDirections() {
        TreeCodingTask root = new TreeCodingTask(8);
        final TreeCodingTask leftNode1 = new TreeCodingTask(root, 5);
        TreeCodingTask leftNode2 = new TreeCodingTask(leftNode1, 2);

        TreeCodingTask rightNode11 = new TreeCodingTask(leftNode2, 9);
        TreeCodingTask left2Node1 = new TreeCodingTask(rightNode11, 3);
        TreeCodingTask right3Node2 = new TreeCodingTask(left2Node1, 4);
        left2Node1.setRightNode(right3Node2);
        TreeCodingTask left3Node2 = new TreeCodingTask(left2Node1, 9);
        TreeCodingTask expectedNodeValue = new TreeCodingTask(left3Node2, 10);
        left3Node2.setRightNode(expectedNodeValue);
        left2Node1.setLeftNode(left3Node2);
        TreeCodingTask right2Node1 = new TreeCodingTask(rightNode11, 5);

        rightNode11.setLeftNode(left2Node1);
        rightNode11.setRightNode(right2Node1);

        leftNode2.setRightNode(rightNode11);
        leftNode1.setLeftNode(leftNode2);
        root.setLeftNode(leftNode1);

        TreeCodingTask rightNode1 = new TreeCodingTask(root, 3);
        TreeCodingTask rightNode2 = new TreeCodingTask(rightNode1, 8);
        TreeCodingTask rightNode3 = new TreeCodingTask(rightNode2, 11);

        rightNode2.setRightNode(rightNode3);
        rightNode1.setRightNode(rightNode2);
        root.setRightNode(rightNode1);


        assertThat(root.maxValue(), is(11));
    }

    @Test
    public void returnsTheMaxValue15WhenTreeHasNodesWithManyLeftAndRightDirections() {
        TreeCodingTask root = new TreeCodingTask(8);
        final TreeCodingTask leftNode1 = new TreeCodingTask(root, 5);
        TreeCodingTask leftNode2 = new TreeCodingTask(leftNode1, 2);

        TreeCodingTask rightNode11 = new TreeCodingTask(leftNode2, 9);
        TreeCodingTask left2Node1 = new TreeCodingTask(rightNode11, 3);
        TreeCodingTask right3Node2 = new TreeCodingTask(left2Node1, 4);
        left2Node1.setRightNode(right3Node2);
        TreeCodingTask left3Node2 = new TreeCodingTask(left2Node1, 9);
        TreeCodingTask expectedNodeValue = new TreeCodingTask(left3Node2, 10);
        left3Node2.setRightNode(expectedNodeValue);
        left2Node1.setLeftNode(left3Node2);
        TreeCodingTask right2Node1 = new TreeCodingTask(rightNode11, 5);

        rightNode11.setLeftNode(left2Node1);
        rightNode11.setRightNode(right2Node1);

        leftNode2.setRightNode(rightNode11);
        leftNode1.setLeftNode(leftNode2);
        root.setLeftNode(leftNode1);

        TreeCodingTask rightNode1 = new TreeCodingTask(root, 3);
        TreeCodingTask rightNode2 = new TreeCodingTask(rightNode1, 8);
        TreeCodingTask rightNode3 = new TreeCodingTask(rightNode2, 11);

        TreeCodingTask right3Node1 = new TreeCodingTask(rightNode3, 2);
        TreeCodingTask right4Node1 = new TreeCodingTask(right3Node1, 9);
        TreeCodingTask left4Node1 = new TreeCodingTask(right3Node1, 13);
        right3Node1.setRightNode(right4Node1);
        right3Node1.setLeftNode(left4Node1);

        TreeCodingTask left3Node1 = new TreeCodingTask(rightNode3, 6);
        TreeCodingTask right5Node1 = new TreeCodingTask(left3Node1, 15);
        TreeCodingTask left5Node1 = new TreeCodingTask(left3Node1, 14);
        left3Node1.setLeftNode(left5Node1);
        left3Node1.setRightNode(right5Node1);
        rightNode3.setRightNode(right3Node1);
        rightNode3.setLeftNode(left3Node1);

        rightNode2.setRightNode(rightNode3);
        rightNode1.setRightNode(rightNode2);
        root.setRightNode(rightNode1);


        assertThat(root.maxValue(), is(15));
    }

    @Test
    public void returnsTheMaxRepeatableValue3WhenTreeHasNodesWithManyLeftAndRightDirections() {
        TreeCodingTask root = new TreeCodingTask(0);

        TreeCodingTask leftNodeValue3 = new TreeCodingTask(root, 3);
        TreeCodingTask leftNodeValue5 = new TreeCodingTask(leftNodeValue3, 5);
        TreeCodingTask leftNodeValue4 = new TreeCodingTask(leftNodeValue5, 4);
        TreeCodingTask rightNodeValue3 = new TreeCodingTask(leftNodeValue5, 3);
        TreeCodingTask leftNodeValue1 = new TreeCodingTask(rightNodeValue3, 1);
        TreeCodingTask rightNodeValue7 = new TreeCodingTask(rightNodeValue3, 7);
        TreeCodingTask leftNodeValue05 = new TreeCodingTask(rightNodeValue7, 5);
        TreeCodingTask rightNodeValue03 = new TreeCodingTask(rightNodeValue7, 3);

        rightNodeValue7.setRightNode(rightNodeValue03);
        rightNodeValue7.setLeftNode(leftNodeValue05);
        rightNodeValue3.setRightNode(rightNodeValue7);
        rightNodeValue3.setLeftNode(leftNodeValue1);
        leftNodeValue5.setRightNode(rightNodeValue3);
        leftNodeValue5.setLeftNode(leftNodeValue4);
        leftNodeValue3.setLeftNode(leftNodeValue5);
        root.setLeftNode(leftNodeValue3);

        TreeCodingTask rightNodeValue9 = new TreeCodingTask(root, 9);
        TreeCodingTask rightNodeValue10 = new TreeCodingTask(rightNodeValue9, 10);
        TreeCodingTask leftNodeValue2 = new TreeCodingTask(rightNodeValue9, 2);
        TreeCodingTask leftNodeValue8 = new TreeCodingTask(leftNodeValue2, 8);
        TreeCodingTask rightNodeValue5 = new TreeCodingTask(leftNodeValue2, 5);
        TreeCodingTask leftNodeValue10 = new TreeCodingTask(rightNodeValue5, 10);

        rightNodeValue5.setLeftNode(leftNodeValue10);
        leftNodeValue2.setRightNode(rightNodeValue5);
        leftNodeValue2.setLeftNode(leftNodeValue8);
        rightNodeValue9.setLeftNode(leftNodeValue2);
        rightNodeValue9.setRightNode(rightNodeValue10);
        root.setRightNode(rightNodeValue9);

        assertThat(root.maxRepeatableValue(), is(3));
    }

    @Test
    public void returnsTheMaxRepeatableValue10WhenTreeHasNodesWithManyLeftAndRightDirectionsAndTheSameRepeatableNumbers() {
        TreeCodingTask root = new TreeCodingTask(0);

        TreeCodingTask leftNodeValue3 = new TreeCodingTask(root, 3);
        TreeCodingTask leftNodeValue5 = new TreeCodingTask(leftNodeValue3, 5);
        TreeCodingTask leftNodeValue4 = new TreeCodingTask(leftNodeValue5, 4);
        TreeCodingTask rightNodeValue3 = new TreeCodingTask(leftNodeValue5, 3);
        TreeCodingTask leftNodeValue1 = new TreeCodingTask(rightNodeValue3, 1);
        TreeCodingTask rightNodeValue7 = new TreeCodingTask(rightNodeValue3, 7);
        TreeCodingTask leftNodeValue05 = new TreeCodingTask(rightNodeValue7, 5);
        TreeCodingTask rightNodeValue03 = new TreeCodingTask(rightNodeValue7, 3);

        rightNodeValue7.setRightNode(rightNodeValue03);
        rightNodeValue7.setLeftNode(leftNodeValue05);
        rightNodeValue3.setRightNode(rightNodeValue7);
        rightNodeValue3.setLeftNode(leftNodeValue1);
        leftNodeValue5.setRightNode(rightNodeValue3);
        leftNodeValue5.setLeftNode(leftNodeValue4);
        leftNodeValue3.setLeftNode(leftNodeValue5);
        root.setLeftNode(leftNodeValue3);

        TreeCodingTask rightNodeValue9 = new TreeCodingTask(root, 9);
        TreeCodingTask rightNodeValue10 = new TreeCodingTask(rightNodeValue9, 10);
        TreeCodingTask leftNodeValue2 = new TreeCodingTask(rightNodeValue9, 2);
        TreeCodingTask leftNodeValue8 = new TreeCodingTask(leftNodeValue2, 8);
        TreeCodingTask rightNodeValue5 = new TreeCodingTask(leftNodeValue2, 5);
        TreeCodingTask leftNodeValue10 = new TreeCodingTask(rightNodeValue5, 10);
        TreeCodingTask rightNodeValue010 = new TreeCodingTask(leftNodeValue10, 10);

        leftNodeValue10.setRightNode(rightNodeValue010);
        rightNodeValue5.setLeftNode(leftNodeValue10);
        leftNodeValue2.setRightNode(rightNodeValue5);
        leftNodeValue2.setLeftNode(leftNodeValue8);
        rightNodeValue9.setLeftNode(leftNodeValue2);
        rightNodeValue9.setRightNode(rightNodeValue10);
        root.setRightNode(rightNodeValue9);

        assertThat(root.maxRepeatableValue(), is(10));
    }

    @Test
    public void returnsTheMaxRepeatableValue5WhenTreeHasNodesJustInLeftDirections() {
        TreeCodingTask root = new TreeCodingTask(0);

        final TreeCodingTask leftNode1 = new TreeCodingTask(root, 5);
        TreeCodingTask leftNode2 = new TreeCodingTask(leftNode1, 2);
        TreeCodingTask rightNode10 = new TreeCodingTask(leftNode1, 10);
        TreeCodingTask leftNode05 = new TreeCodingTask(rightNode10, 5);
        TreeCodingTask rightNode3 = new TreeCodingTask(rightNode10, 3);

        rightNode10.setRightNode(rightNode3);
        rightNode10.setLeftNode(leftNode05);
        leftNode1.setRightNode(rightNode10);
        leftNode1.setLeftNode(leftNode2);
        root.setLeftNode(leftNode1);


        assertThat(root.maxRepeatableValue(), is(5));
    }

    @Test
    public void returnsTheMaxRepeatableValue5WhenTreeHasNodesJustInRightDirections() {
        TreeCodingTask root = new TreeCodingTask(0);

        final TreeCodingTask rightNode1 = new TreeCodingTask(root, 5);
        TreeCodingTask leftNode2 = new TreeCodingTask(rightNode1, 2);
        TreeCodingTask rightNode10 = new TreeCodingTask(rightNode1, 10);
        TreeCodingTask leftNode05 = new TreeCodingTask(rightNode10, 5);
        TreeCodingTask rightNode3 = new TreeCodingTask(rightNode10, 3);

        rightNode10.setRightNode(rightNode3);
        rightNode10.setLeftNode(leftNode05);
        rightNode1.setRightNode(rightNode10);
        rightNode1.setLeftNode(leftNode2);

        root.setRightNode(rightNode1);


        assertThat(root.maxRepeatableValue(), is(5));
    }

}