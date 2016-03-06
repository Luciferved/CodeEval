import java.util.*;
class Point$Square
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		String str = src.nextLine();
		str = str.replaceAll("[()\\s]","");
		String str1[] = str.split(",");
		int a[] = new int[str1.length];
		int sum = 0;
		for(int i=0;i<str1.length;i++)
		{
			a[i] = Integer.parseInt(str1[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			sum +=a[i];
		}
		int r = sum/a.length;
		TreeSet ts = new TreeSet();
		TreeSet ts2 = new TreeSet();
		for(int i=0;i<a.length;i++)
		{
			
			ts.add(r-a[i]);
			//ts2.add(a[i]-a[i+1]);
		}
		System.out.println(ts);
		System.out.println(ts2);
	}
}

/*


There are some good answers here, but the question asked for the simplest approach. I gave this some quick thought and this is how I would do it.

You can tell if four points represent a square (even if rotated), but finding the average of the four points.

R = (A+B+C+D)/4
Once you have the average, the distance between each point and the average would have to be the same for all four points.

if(dist(R,A) == dist(R,B) == dist(R,C) == dist(R,D) then
   print "Is Square"
else
   print "Is Not Square"
EDIT:

My mistake. That would only tell you if the form points were on a circle. If you also check the distance between points, then it must be a square.

if(dist(R,A) == dist(R,B) == dist(R,C) == dist(R,D) AND
  (dist(A,B) == dist(B,C) == dist(C,D) == dist(R,D) then
   print "Is Square"
else
   print "Is Not Square"
This assumes that points A,B,C,D do not cross (as in have a valid winding order).*/