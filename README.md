# Project Management System with Binary Trees

This Java project implements a project management system using binary tree data structures. It provides functionalities to organize projects based on priority levels, rearrange priorities, create sub-trees, and integrate with a linked list for sorting and searching operations.

## Features

- **Binary Tree Implementation**: Utilizes binary trees to organize and manage projects.
- **Priority Management**: Allows users to prioritize projects based on "High" or "Low" priority levels.
- **Rearrange Priorities**: Enables users to rearrange project priorities with a stack-based approach.
- **Sub-Tree Creation**: Supports the creation of sub-trees within the main project tree.
- **Linked List Integration**: Integrates with a linked list for efficient sorting and searching operations.

## Usage

1. Clone the repository to your local machine.
2. Compile the Java files using a Java compiler.
3. Run the `Main` class to execute the program and test different functionalities.

## Example

```java
// Sample usage in the Main class
public static void main(String[] args) {
    // Create instances of BinaryTree, LinkedList, and LLstack
    BinaryTree<Integer> tree = new BinaryTree<>();
    SingleLinkedList<Integer> mySortedList = new SingleLinkedList<>();
    LLstack<Project> projectsStack = new LLstack<>();

    // Perform operations such as adding nodes to the tree, sorting linked list, etc.
    // Display results or perform further operations as needed
}
```
