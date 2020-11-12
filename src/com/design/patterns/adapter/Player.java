package com.design.patterns.adapter;

public class Player implements MediaPlayer {
	
	private MediaAdapter mediaAdapter;

	@Override
	public void play(String fileName) {
		if (fileName.endsWith(".mp3")) {
			System.out.println("play mp3.");
		} else if (fileName.endsWith(".mp4") || fileName.endsWith(".avi")) {
			mediaAdapter = new MediaAdapter();
			mediaAdapter.play(fileName);
		} else {
			System.out.println("file format not support.");
		}
	}

}
