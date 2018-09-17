package com.magic;

public class ImageLoader {
	private static ImageLoader instance = new ImageLoader();

	private ImageLoader() {
	}

	public static ImageLoader getInstance() {
		return instance;
	}
}