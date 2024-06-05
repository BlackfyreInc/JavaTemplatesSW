public class PausedState extends State {
    public PausedState(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
    }

    @Override
    public void play() {
        context.setState(new PlayingState(context));
        context.setIcon("II");
        System.out.println("Video playing, icon changed to " + context.getIcon());
    }

    @Override
    public void pause() { }
}
