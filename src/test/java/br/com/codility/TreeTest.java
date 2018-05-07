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
        leftNode1.setLeftNodes(leftNode2);
        root.setLeftNodes(leftNode1);

        assertThat(root.maxValue(), equalTo(5));
    }

    @Test
    public void returnsTheMaxValue7WhenTreeHasNodesJustInRightDirection() {
        Tree root = new Tree(0);

        Tree rightNode1 = new Tree(root, 3);
        Tree rightNode2 = new Tree(rightNode1, 7);
        Tree rightNode3 = new Tree(rightNode2, 2);

        rightNode2.setRightNodes(rightNode3);
        rightNode1.setRightNodes(rightNode2);
        root.setRightNodes(rightNode1);


        assertThat(root.maxValue(), is(7));
    }

    @Test
    public void returnsTheMaxValue8WhenTreeHasNodesInLeftAndRightDirections() {
        Tree root = new Tree(0);
        final Tree leftNode1 = new Tree(root, 5);
        Tree leftNode2 = new Tree(leftNode1, 2);
        leftNode1.setLeftNodes(leftNode2);
        root.setLeftNodes(leftNode1);

        Tree rightNode1 = new Tree(root, 3);
        Tree rightNode2 = new Tree(rightNode1, 6);
        Tree rightNode3 = new Tree(rightNode2, 8);

        rightNode2.setRightNodes(rightNode3);
        rightNode1.setRightNodes(rightNode2);
        root.setRightNodes(rightNode1);


        assertThat(root.maxValue(), is(8));
    }

    @Test
    public void returnsTheMaxValue9WhenTreeHasNodesWithManyLeftAndRightDirections() {
        Tree root = new Tree(0);
        final Tree leftNode1 = new Tree(root, 5);
        Tree leftNode2 = new Tree(leftNode1, 2);
        Tree rightNode11 = new Tree(leftNode2, 9);
        leftNode2.setRightNodes(rightNode11);
        leftNode1.setLeftNodes(leftNode2);
        root.setLeftNodes(leftNode1);

        Tree rightNode1 = new Tree(root, 3);
        Tree rightNode2 = new Tree(rightNode1, 8);
        Tree rightNode3 = new Tree(rightNode2, 7);

        rightNode2.setRightNodes(rightNode3);
        rightNode1.setRightNodes(rightNode2);
        root.setRightNodes(rightNode1);


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
        left2Node1.setRightNodes(right3Node2);
        Tree left3Node2 = new Tree(left2Node1, 9);
        Tree expectedNodeValue = new Tree(left3Node2, 10);
        left3Node2.setRightNodes(expectedNodeValue);
        left2Node1.setLeftNodes(left3Node2);
        Tree right2Node1 = new Tree(rightNode11, 5);

        rightNode11.setLeftNodes(left2Node1);
        rightNode11.setRightNodes(right2Node1);

        leftNode2.setRightNodes(rightNode11);
        leftNode1.setLeftNodes(leftNode2);
        root.setLeftNodes(leftNode1);

        Tree rightNode1 = new Tree(root, 3);
        Tree rightNode2 = new Tree(rightNode1, 8);
        Tree rightNode3 = new Tree(rightNode2, 7);

        rightNode2.setRightNodes(rightNode3);
        rightNode1.setRightNodes(rightNode2);
        root.setRightNodes(rightNode1);


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
        left2Node1.setRightNodes(right3Node2);
        Tree left3Node2 = new Tree(left2Node1, 9);
        Tree expectedNodeValue = new Tree(left3Node2, 10);
        left3Node2.setRightNodes(expectedNodeValue);
        left2Node1.setLeftNodes(left3Node2);
        Tree right2Node1 = new Tree(rightNode11, 5);

        rightNode11.setLeftNodes(left2Node1);
        rightNode11.setRightNodes(right2Node1);

        leftNode2.setRightNodes(rightNode11);
        leftNode1.setLeftNodes(leftNode2);
        root.setLeftNodes(leftNode1);

        Tree rightNode1 = new Tree(root, 3);
        Tree rightNode2 = new Tree(rightNode1, 8);
        Tree rightNode3 = new Tree(rightNode2, 11);

        rightNode2.setRightNodes(rightNode3);
        rightNode1.setRightNodes(rightNode2);
        root.setRightNodes(rightNode1);


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
        left2Node1.setRightNodes(right3Node2);
        Tree left3Node2 = new Tree(left2Node1, 9);
        Tree expectedNodeValue = new Tree(left3Node2, 10);
        left3Node2.setRightNodes(expectedNodeValue);
        left2Node1.setLeftNodes(left3Node2);
        Tree right2Node1 = new Tree(rightNode11, 5);

        rightNode11.setLeftNodes(left2Node1);
        rightNode11.setRightNodes(right2Node1);

        leftNode2.setRightNodes(rightNode11);
        leftNode1.setLeftNodes(leftNode2);
        root.setLeftNodes(leftNode1);

        Tree rightNode1 = new Tree(root, 3);
        Tree rightNode2 = new Tree(rightNode1, 8);
        Tree rightNode3 = new Tree(rightNode2, 11);

        Tree right3Node1 = new Tree(rightNode3, 2);
        Tree right4Node1 = new Tree(right3Node1, 9);
        Tree left4Node1 = new Tree(right3Node1, 13);
        right3Node1.setRightNodes(right4Node1);
        right3Node1.setLeftNodes(left4Node1);

        Tree left3Node1 = new Tree(rightNode3, 6);
        Tree right5Node1 = new Tree(left3Node1, 15);
        Tree left5Node1 = new Tree(left3Node1, 14);
        left3Node1.setLeftNodes(left5Node1);
        left3Node1.setRightNodes(right5Node1);
        rightNode3.setRightNodes(right3Node1);
        rightNode3.setLeftNodes(left3Node1);

        rightNode2.setRightNodes(rightNode3);
        rightNode1.setRightNodes(rightNode2);
        root.setRightNodes(rightNode1);


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

        rightNodeValue7.setRightNodes(rightNodeValue03);
        rightNodeValue7.setLeftNodes(leftNodeValue05);
        rightNodeValue3.setRightNodes(rightNodeValue7);
        rightNodeValue3.setLeftNodes(leftNodeValue1);
        leftNodeValue5.setRightNodes(rightNodeValue3);
        leftNodeValue5.setLeftNodes(leftNodeValue4);
        leftNodeValue3.setLeftNodes(leftNodeValue5);
        root.setLeftNodes(leftNodeValue3);

        Tree rightNodeValue9 = new Tree(root, 9);
        Tree rightNodeValue10 = new Tree(rightNodeValue9, 10);
        Tree leftNodeValue2 = new Tree(rightNodeValue9, 2);
        Tree leftNodeValue8 = new Tree(leftNodeValue2, 8);
        Tree rightNodeValue5 = new Tree(leftNodeValue2, 5);

        leftNodeValue2.setRightNodes(rightNodeValue5);
        leftNodeValue2.setLeftNodes(leftNodeValue8);
        rightNodeValue9.setLeftNodes(leftNodeValue2);
        rightNodeValue9.setRightNodes(rightNodeValue10);
        root.setRightNodes(rightNodeValue9);

        assertThat(root.maxRepeatableValue(), is(3));
    }

}