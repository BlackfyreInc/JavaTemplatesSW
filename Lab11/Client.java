public class Client {

    public static void main(String[] args) {

        String fileName = "video.ogg";
        String format = "mp4";

        VideoFile videoFile = new VideoFile(fileName,
            new Buffer("Byte buffer of video"),
            new Buffer("Byte buffer of audio"));

        videoFile.play(new MPEG4CompressionCodec());



        VideoConversionFacade videoConversionFacade = new VideoConversionFacade();
        Codec destinationCodec = new MPEG4CompressionCodec();
        VideoFile videoFileConverted = videoConversionFacade.convert(videoFile, destinationCodec);

        videoFileConverted.play(new MPEG4CompressionCodec());
    }
}
