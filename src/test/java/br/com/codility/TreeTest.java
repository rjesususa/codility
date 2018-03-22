package br.com.codility;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TreeTest {

    @Test
    public void returnsTheMaxValue5WhenTreeHasNodesJustInLeftDirection() {
        Tree root = new Tree();
        root.setValue(0);
        final Tree leftNode1 = new Tree(root, 1);
        Tree leftNode2 = new Tree(leftNode1, 5);
        leftNode1.setLeftNodes(leftNode2);
        root.setLeftNodes(leftNode1);

        assertThat(root.maxValue(), equalTo(5));
    }

    @Test
    public void returnsTheMaxValue7WhenTreeHasNodesJustInRightDirection() {
        Tree root = new Tree();
        root.setValue(0);

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
        Tree root = new Tree();
        root.setValue(0);
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
        Tree root = new Tree();
        root.setValue(0);
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

}