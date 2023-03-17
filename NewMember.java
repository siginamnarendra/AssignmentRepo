package marketNetwork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class NewMember {
	static long ID = 0;
	long UserID, ParentID;
	String name;
	NewMember parentAddress;
	double Commission;

	List<NewMember> ChildrenList = new ArrayList<NewMember>();

	static NewMember root = new NewMember("Company", 0);

	NewMember(String name, long ParentID) {
		this.name = name;
		this.ParentID = ParentID;
		UserID = ID++;

	}

	public static NewMember FindParent(NewMember root, long id) {
		Queue<NewMember> q = new LinkedList<NewMember>();
		q.add(root);
		
		while (!q.isEmpty()) {
			int n = q.size();

			while (n > 0) {

				NewMember u = q.peek();
				
				if (u.UserID == id)
				 {
					System.out.println();
					return u;
				 }

				q.remove();
				for (int i = 0; i < u.ChildrenList.size(); i++) {
					q.add(u.ChildrenList.get(i));
				}
				n--;
			}
			System.out.println();
		}
		
		return null;
	}

	static void printing (NewMember root)
	{
		int level =0;
	    Queue<NewMember >q = new LinkedList<>();
	    q.add(root);
	    while (!q.isEmpty())
	    {
	        int n = q.size();
			System.out.println("At Level :"+level);
	        while (n > 0)
	        {
	            
	            NewMember p = q.peek();
	            q.remove();
	            System.out.print(p.name + " ");
	 
	            for (int i = 0; i < p.ChildrenList.size(); i++)
	                q.add(p.ChildrenList.get(i));
	            n--;
	        }
			level++;
	        System.out.println();
	    }
	}

	
	
}