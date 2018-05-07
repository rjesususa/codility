package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TreeTest {

    @Test
    public void returnsTheMaxValue5WhenTreeHasNodesJustInLeftDirection() {
        Tree root = new Tree(0);
        final Tree leftNode1 = new Tree(root, 1);
        Tree leftNode2 = new Tree(leftNode1, 5);
        leftNode1.setLeftNode(leftNode2);
        root.setLeftNode(leftNode1);

        assertThat(root.maxValue(), equalTo(5));
    }

    @Test
    public void returnsTheMaxValue7WhenTreeHasNodesJustInRightDirection() {
        Tree root = new Tree(0);

        Tree rightNode1 = new Tree(root, 3);
        Tree rightNode2 = new Tree(rightNode1, 7);
        Tree rightNode3 = new Tree(rightNode2, 2);

        rightNode2.setRightNode(rightNode3);
        rightNode1.setRightNode(rightNode2);
        root.setRightNode(rightNode1);


        assertThat(root.maxValue(), is(7));
    }

    @Test
    public void returnsTheMaxValue8WhenTreeHasNodesInLeftAndRightDirections() {
        Tree root = new Tree(0);
        final Tree leftNode1 = new Tree(root, 5);
        Tree leftNode2 = new Tree(leftNode1, 2);
        leftNode1.setLeftNode(leftNode2);
        root.setLeftNode(leftNode1);

        Tree rightNode1 = new Tree(root, 3);
        Tree rightNode2 = new Tree(rightNode1, 6);
        Tree rightNode3 = new Tree(rightNode2, 8);

        rightNode2.setRightNode(rightNode3);
        rightNode1.setRightNode(rightNode2);
        root.setRightNode(rightNode1);


        assertThat(root.maxValue(), is(8));
    }

    @Test
    public void returnsTheMaxValue9WhenTreeHasNodesWithManyLeftAndRightDirections() {
        Tree root = new Tree(0);
        final Tree leftNode1 = new Tree(root, 5);
        Tree leftNode2 = new Tree(leftNode1, 2);
        Tree rightNode11 = new Tree(leftNode2, 9);
        leftNode2.setRightNode(rightNode11);
        leftNode1.setLeftNode(leftNode2);
        root.setLeftNode(leftNode1);

        Tree rightNode1 = new Tree(root, 3);
        Tree rightNode2 = new Tree(rightNode1, 8);
        Tree rightNode3 = new Tree(rightNode2, 7);

        rightNode2.setRightNode(rightNode3);
        rightNode1.setRightNode(rightNode2);
        root.setRightNode(rightNode1);


        assertThat(root.maxValue(), is(9));
    }

    @Test
    public void returnsTheMaxValue10WhenTreeHasNodesWithManyLeftAndRightDirections() {
        Tree root = new Tree(8);
        final Tree leftNode1 = new Tree(root, 5);
        Tree leftNode2 = new Tree(leftNode1, 2);

        Tree rightNode11 = new Tree(leftNode2, 9);
        Tree left2Node1 = new Tree(rightNode11, 3);
        Tree right3Node2 = new Tree(left2Node1, 4);
        left2Node1.setRightNode(right3Node2);
        Tree left3Node2 = new Tree(left2Node1, 9);
        Tree expectedNodeValue = new Tree(left3Node2, 10);
        left3Node2.setRightNode(expectedNodeValue);
        left2Node1.setLeftNode(left3Node2);
        Tree right2Node1 = new Tree(rightNode11, 5);

        rightNode11.setLeftNode(left2Node1);
        rightNode11.setRightNode(right2Node1);

        leftNode2.setRightNode(rightNode11);
        leftNode1.setLeftNode(leftNode2);
        root.setLeftNode(leftNode1);

        Tree rightNode1 = new Tree(root, 3);
        Tree rightNode2 = new Tree(rightNode1, 8);
        Tree rightNode3 = new Tree(rightNode2, 7);

        rightNode2.setRightNode(rightNode3);
        rightNode1.setRightNode(rightNode2);
        root.setRightNode(rightNode1);


        assertThat(root.maxValue(), is(10));
    }

    @Test
    public void returnsTheMaxValue11WhenTreeHasNodesWithManyLeftAndRightDirections() {
        Tree root = new Tree(8);
        final Tree leftNode1 = new Tree(root, 5);
        Tree leftNode2 = new Tree(leftNode1, 2);

        Tree rightNode11 = new Tree(leftNode2, 9);
        Tree left2Node1 = new Tree(rightNode11, 3);
        Tree right3Node2 = new Tree(left2Node1, 4);
        left2Node1.setRightNode(right3Node2);
        Tree left3Node2 = new Tree(left2Node1, 9);
        Tree expectedNodeValue = new Tree(left3Node2, 10);
        left3Node2.setRightNode(expectedNodeValue);
        left2Node1.setLeftNode(left3Node2);
        Tree right2Node1 = new Tree(rightNode11, 5);

        rightNode11.setLeftNode(left2Node1);
        rightNode11.setRightNode(right2Node1);

        leftNode2.setRightNode(rightNode11);
        leftNode1.setLeftNode(leftNode2);
        root.setLeftNode(leftNode1);

        Tree rightNode1 = new Tree(root, 3);
        Tree rightNode2 = new Tree(rightNode1, 8);
        Tree rightNode3 = new Tree(rightNode2, 11);

        rightNode2.setRightNode(rightNode3);
        rightNode1.setRightNode(rightNode2);
        root.setRightNode(rightNode1);


        assertThat(root.maxValue(), is(11));
    }

    @Test
    public void returnsTheMaxValue15WhenTreeHasNodesWithManyLeftAndRightDirections() {
        Tree root = new Tree(8);
        final Tree leftNode1 = new Tree(root, 5);
        Tree leftNode2 = new Tree(leftNode1, 2);

        Tree rightNode11 = new Tree(leftNode2, 9);
        Tree left2Node1 = new Tree(rightNode11, 3);
        Tree right3Node2 = new Tree(left2Node1, 4);
        left2Node1.setRightNode(right3Node2);
        Tree left3Node2 = new Tree(left2Node1, 9);
        Tree expectedNodeValue = new Tree(left3Node2, 10);
        left3Node2.setRightNode(expectedNodeValue);
        left2Node1.setLeftNode(left3Node2);
        Tree right2Node1 = new Tree(rightNode11, 5);

        rightNode11.setLeftNode(left2Node1);
        rightNode11.setRightNode(right2Node1);

        leftNode2.setRightNode(rightNode11);
        leftNode1.setLeftNode(leftNode2);
        root.setLeftNode(leftNode1);

        Tree rightNode1 = new Tree(root, 3);
        Tree rightNode2 = new Tree(rightNode1, 8);
        Tree rightNode3 = new Tree(rightNode2, 11);

        Tree right3Node1 = new Tree(rightNode3, 2);
        Tree right4Node1 = new Tree(right3Node1, 9);
        Tree left4Node1 = new Tree(right3Node1, 13);
        right3Node1.setRightNode(right4Node1);
        right3Node1.setLeftNode(left4Node1);

        Tree left3Node1 = new Tree(rightNode3, 6);
        Tree right5Node1 = new Tree(left3Node1, 15);
        Tree left5Node1 = new Tree(left3Node1, 14);
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
        Tree root = new Tree(0);

        Tree leftNodeValue3 = new Tree(root, 3);
        Tree leftNodeValue5 = new Tree(leftNodeValue3, 5);
        Tree leftNodeValue4 = new Tree(leftNodeValue5, 4);
        Tree rightNodeValue3 = new Tree(leftNodeValue5, 3);
        Tree leftNodeValue1 = new Tree(rightNodeValue3, 1);
        Tree rightNodeValue7 = new Tree(rightNodeValue3, 7);
        Tree leftNodeValue05 = new Tree(rightNodeValue7, 5);
        Tree rightNodeValue03 = new Tree(rightNodeValue7, 3);

        rightNodeValue7.setRightNode(rightNodeValue03);
        rightNodeValue7.setLeftNode(leftNodeValue05);
        rightNodeValue3.setRightNode(rightNodeValue7);
        rightNodeValue3.setLeftNode(leftNodeValue1);
        leftNodeValue5.setRightNode(rightNodeValue3);
        leftNodeValue5.setLeftNode(leftNodeValue4);
        leftNodeValue3.setLeftNode(leftNodeValue5);
        root.setLeftNode(leftNodeValue3);

        Tree rightNodeValue9 = new Tree(root, 9);
        Tree rightNodeValue10 = new Tree(rightNodeValue9, 10);
        Tree leftNodeValue2 = new Tree(rightNodeValue9, 2);
        Tree leftNodeValue8 = new Tree(leftNodeValue2, 8);
        Tree rightNodeValue5 = new Tree(leftNodeValue2, 5);
        Tree leftNodeValue10 = new Tree(rightNodeValue5, 10);

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
        Tree root = new Tree(0);

        Tree leftNodeValue3 = new Tree(root, 3);
        Tree leftNodeValue5 = new Tree(leftNodeValue3, 5);
        Tree leftNodeValue4 = new Tree(leftNodeValue5, 4);
        Tree rightNodeValue3 = new Tree(leftNodeValue5, 3);
        Tree leftNodeValue1 = new Tree(rightNodeValue3, 1);
        Tree rightNodeValue7 = new Tree(rightNodeValue3, 7);
        Tree leftNodeValue05 = new Tree(rightNodeValue7, 5);
        Tree rightNodeValue03 = new Tree(rightNodeValue7, 3);

        rightNodeValue7.setRightNode(rightNodeValue03);
        rightNodeValue7.setLeftNode(leftNodeValue05);
        rightNodeValue3.setRightNode(rightNodeValue7);
        rightNodeValue3.setLeftNode(leftNodeValue1);
        leftNodeValue5.setRightNode(rightNodeValue3);
        leftNodeValue5.setLeftNode(leftNodeValue4);
        leftNodeValue3.setLeftNode(leftNodeValue5);
        root.setLeftNode(leftNodeValue3);

        Tree rightNodeValue9 = new Tree(root, 9);
        Tree rightNodeValue10 = new Tree(rightNodeValue9, 10);
        Tree leftNodeValue2 = new Tree(rightNodeValue9, 2);
        Tree leftNodeValue8 = new Tree(leftNodeValue2, 8);
        Tree rightNodeValue5 = new Tree(leftNodeValue2, 5);
        Tree leftNodeValue10 = new Tree(rightNodeValue5, 10);
        Tree rightNodeValue010 = new Tree(leftNodeValue10, 10);

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
        Tree root = new Tree(0);

        final Tree leftNode1 = new Tree(root, 5);
        Tree leftNode2 = new Tree(leftNode1, 2);
        Tree rightNode10 = new Tree(leftNode1, 10);
        Tree leftNode05 = new Tree(rightNode10, 5);
        Tree rightNode3 = new Tree(rightNode10, 3);

        rightNode10.setRightNode(rightNode3);
        rightNode10.setLeftNode(leftNode05);
        leftNode1.setRightNode(rightNode10);
        leftNode1.setLeftNode(leftNode2);
        root.setLeftNode(leftNode1);


        assertThat(root.maxRepeatableValue(), is(5));
    }

    @Test
    public void returnsTheMaxRepeatableValue5WhenTreeHasNodesJustInRightDirections() {
        Tree root = new Tree(0);

        final Tree rightNode1 = new Tree(root, 5);
        Tree leftNode2 = new Tree(rightNode1, 2);
        Tree rightNode10 = new Tree(rightNode1, 10);
        Tree leftNode05 = new Tree(rightNode10, 5);
        Tree rightNode3 = new Tree(rightNode10, 3);

        rightNode10.setRightNode(rightNode3);
        rightNode10.setLeftNode(leftNode05);
        rightNode1.setRightNode(rightNode10);
        rightNode1.setLeftNode(leftNode2);

        root.setRightNode(rightNode1);


        assertThat(root.maxRepeatableValue(), is(5));
    }

}