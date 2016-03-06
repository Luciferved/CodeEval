import java.io.*;
class ArrayStack
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MyStack stack = new MyStack(5);
		try
		{
			stack.push(4);
			stack.push(8);
			stack.push(3);
			stack.push(89);
			stack.pop();
			stack.push(34);
			stack.push(45);
			stack.push(78);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		try
		{
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	public class Mystack
	{
		private int size;
		private int[] arr;
		private int top;
		
		public class Mystack(int size)
		{
			this.size = size;
			this.arr = new arr[size];
			this.top = -1;
		}
		
		public void push(int entry)
		{
			if(this.isFull())
			{
				throw new Exception("Stack is already full.can not add element..!!");
			}
			System.out.println("Adding : "+entry);
			this.arr[++top] = entry;
		}
		
		public int pop()
		{
			if(this.isEmpty())
			{
				throw new Exception("stack is empty.Can not remove element..!!");
			}
			int entry = this.arr[top--];
			System.out.println("Removed entry : "+entry);
			return entry;
		}
		
		public int peek()
		{
			return arr[top];
		}
		
		public boolean isEmpty()
		{
			return(top==-1);
		}
		
		public boolean isFull()
		{
			return(top == arr-1);
		}
	}
}