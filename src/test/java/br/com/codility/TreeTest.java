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


        assertThat(root.maxValue(), is(12));
    }

}