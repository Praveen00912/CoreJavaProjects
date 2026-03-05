package com.praveen.projects;

public class AudioPlayer implements Playable {

    String songName;
    int duration;
    String status;

    public AudioPlayer(String songName, int duration) {
        this.songName = songName;
        this.duration = duration;
        this.status = "STOPPED";
    }

    @Override
    public void play() {
        status = "PLAYING";
        System.out.println(songName + " is playing.");
    }

    @Override
    public void pause() {
        status = "PAUSED";
        System.out.println(songName + " is paused.");
    }

    @Override
    public void stop() {
        status = "STOPPED";
        System.out.println(songName + " is stopped.");
    }

    @Override
    public int getDuration() {
        return duration;
    }
}