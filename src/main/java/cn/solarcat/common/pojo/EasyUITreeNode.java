package cn.solarcat.common.pojo;

import java.io.Serializable;

public class EasyUITreeNode implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2082430992954743058L;
	private long id;
	private String text;
	private String state;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public EasyUITreeNode(long id, String text, String state) {
		super();
		this.id = id;
		this.text = text;
		this.state = state;
	}
	public EasyUITreeNode() {
		super();
	}
	
	
}
