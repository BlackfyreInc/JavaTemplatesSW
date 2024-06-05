public abstract class State {
    MediaPlayer context;

    public State(MediaPlayer mediaPlayer) {
        this.context = mediaPlayer;
    }

    abstract void play();
    abstract void pause();
}
