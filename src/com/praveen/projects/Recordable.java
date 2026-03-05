package com.praveen.projects;

public interface Recordable {

    void startRecording();
    void stopRecording();
    void saveRecording(String filename);
    boolean isRecording();

}