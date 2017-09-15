package action;

import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport{
	public String add(){
		System.out.println("add book");
		return NONE;
	}
	public String delete(){
		System.out.println("delete book");
		return NONE;
	}
	public String update(){
		System.out.println("update book");
		return NONE;
	}
	public String search(){
		System.out.println("search book");
		return NONE;
	}
}
