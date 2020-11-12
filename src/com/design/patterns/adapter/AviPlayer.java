package com.design.patterns.adapter;

public class AviPlayer implements AdvancedMediaPlayer{

	@Override
	public void playAvi(String fileName) {
		 System.out.println("play avi.");
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		
	}

}
