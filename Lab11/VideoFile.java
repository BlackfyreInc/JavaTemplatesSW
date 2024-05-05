public class VideoFile {
    private final String name;        // ім'я файлу (без розширення)
    private final String codecType;   // тип відеокодека
    private final Buffer videoBuffer;  // буфер відео
    private Buffer audioBuffer;        // буфер аудіо

    public VideoFile(String name, Buffer videoBuffer, Buffer audioBuffer) {
        this.videoBuffer = videoBuffer;
        this.audioBuffer = audioBuffer;

        if (!name.contains(".")) {
            throw new RuntimeException("File format is undefined!");
        }

        this.name = name.substring(0, name.lastIndexOf("."));
        this.codecType = name.substring(name.lastIndexOf(".") + 1);
    }

    public VideoFile(String name, Buffer videlBuffer) {
        this(name, videlBuffer, null);
    }

    public String getCodecType() {
        return codecType;
    }

    public Buffer getVideoBuffer(Codec codec) {
        if (codec.type().equals(getCodecType())) {
            return videoBuffer;
        } else {
            return null;
        }
    }

    public void setAudioBuffer(Buffer audioBuffer) {
        this.audioBuffer = audioBuffer;
    }

    public Buffer getAudioBuffer() {
        return audioBuffer;
    }

    public String getName() {
        return name;
    }

    public void play(Codec codec) {
        if (codec.type().equals(codecType)) {
            System.out.println(videoBuffer.getData());
            if (audioBuffer == null){
                return;
            }
            System.out.println(audioBuffer.getData());
        } else {
            System.out.println("Process failed");
        }
    }
}