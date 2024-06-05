public class PlayingState extends State {
    public PlayingState(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
    }

    @Override
    public void play() { }

    @Override
    public void pause() {
        context.setState(new PausedState(context));
        context.setIcon("▷");
        System.out.println("Video paused, icon changed to " + context.getIcon());
    }
}
