class Node
{
	int data;
	Node next;

	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class LinkedList
{
	Node head;

	public LinkedList()
	{
		head = null;
	}

	public boolean isListEmpty()
	{
		return (head == null);
	}

	public void insertNode(Node newnode)
	{
		if(isListEmpty())
		{
			head = newnode;
		}

		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}

	public void reverseList()
	{
		if(isListEmpty())
		{
			System.out.println("No Element in List !");
		}

		else
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data+ " ");
				Stack.push(temp.data);
				temp = temp.next;
			}
			System.out.println();
		}
	}
}

class Stack
{
	static int arr[];
	static int top;
	static int size;

	public Stack(int size)
	{
		this.size = size;
		this.top = -1;
		arr = new int[size];
	}

	public static boolean isStackEmpty()
	{
		return (top == -1);
	}

	public static boolean isStackFull()
	{
		return (size-1 == top);
	}

	public static void push(int data)
	{
		if(isStackFull())
		{
			System.out.println("Stack OverFlow");
		}

		else
		{
			top++;
			arr[top] = data;
		}
	}

	public static void printStack()
	{
		if(isStackEmpty())
		{
			System.out.println("No Element");
		}

		else
		{
			for(int i = top; i >= 0; i--)
			{
				System.out.print(arr[i]+ " ");
			}
		}
	}
}

class ReverseLinkedList
{
	public static void main(String[] args)
	{
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Stack st = new Stack(10);
		LinkedList obj = new LinkedList();
		obj.insertNode(n1);
		obj.insertNode(n2);
		obj.insertNode(n3);
		obj.insertNode(n4);
		obj.insertNode(n5); 
		System.out.println("Insertion Order..\n=============");
		obj.reverseList();
		System.out.println("===============\nreverse Order..\n==============");
		st.printStack();
	}
}