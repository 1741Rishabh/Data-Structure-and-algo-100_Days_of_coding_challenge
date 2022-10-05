package EveryDay;

import java.util.Arrays;
import java.util.Scanner;

class Node {
    int data;
    int x;
    int y;
    Node next;

    public Node(int data, int i, int j) {
        this.x = i;
        this.y = j;
        this.data = data;
        this.next = null;
    }

}

public class Question7 {
    static Node head = null;
    static Node tail = null;

    public static void add(int data, int i, int j) {
        Node newnode = new Node(data, i, j);

        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public static void display() {
        Node current = head;
        if (head == null) {
            System.out.println("Linked list is emplty");
        }
        while (current != null) {
            if (current.data != 0) {
                System.out.print(current.x + "" + current.y + "|" + current.data + "|" + " ");
            }
            current = current.next;
        }
    }

    public static int count() {

        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void addelement(int data, int x, int y) {
        Node current = head;
        name: while (current.next != null) {
            if (current.x == x && current.y == y) {

                current.data = data;
                break name;
            }
            current = current.next;
        }

    }

    public static void deleteElement(int x, int y) {
        Node current = head;
        name: while (current.next != null) {
            if (current.x == x && current.y == y) {

                current.data = 0;
                break name;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in an array");
        int row = sc.nextInt();
        System.out.println("Enter number of columns in an array");
        int col = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element");
                int n = sc.nextInt();
                add(n, i, j);
            }
        }
        System.out.println("display element");
        display();

        System.out.println();
        
        deleteElement(2, 1);
        System.out.println();
        System.out.println("display after deletion");
        display();

        addelement(10, 0, 2);
        System.out.println("display after change element");
        display();

    }

}
