package com.example.demo.Model;

public class HelloModel {
	private String id;
	private String title;
	private String text;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public HelloModel() {
	}

	public HelloModel(String id, String title, String text) {
		this.id = id;
		this.title = title;
		this.text = text;
	}

	@Override
	public String toString() {
		return "HelloModel{" +
				"id='" + id + '\'' +
				", title='" + title + '\'' +
				", text='" + text + '\'' +
				'}';
	}
}
