package com.design.patterns.adapter;

public class MediaAdapter implements MediaPlayer {

	private AdvancedMediaPlayer advancedMediaPlayer;
	
	@Override
	public void play(String fileName) {
		fileName = fileName.toLowerCase();
		if (fileName.endsWith(".mp4")) {
			advancedMediaPlayer = new Mp4Player();
			advancedMediaPlayer.playMp4(fileName);
		} else if (fileName.endsWith(".avi")) {
			advancedMediaPlayer = new AviPlayer();
			advancedMediaPlayer.playAvi(fileName);
		}
	}

}
