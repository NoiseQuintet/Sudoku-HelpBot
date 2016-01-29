package MAIN;
public class StopWatch {

    private long startTime = 0;
    private long stopTime = 0;
    private long pausedTime = 0;
    private boolean running = false;

    public void start() {
        this.startTime = System.currentTimeMillis();
        pausedTime = 0;
        this.running = true;
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }

    public void pause() {
        if(running) {
            pausedTime = System.currentTimeMillis();
            stop();
        }
    }

    public void resume() {
        if(!running){
            long duration = System.currentTimeMillis() - pausedTime;
            startTime += duration;
            this.running = true;
        }
    }
    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        } else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }
}
