public class BitrateReader {
    public static Buffer read(VideoFile file, Codec codec) {
        System.out.println("Codec of file is " + codec.type());
        return file.getVideoBuffer(codec);
    }

    public static VideoFile convert(Buffer buffer, String name, Codec codec) {
        System.out.printf("Converting to '%s' \n", codec.type());
        String newName = name + "." + codec.type();
        System.out.println("Process finished");
        return new VideoFile(newName, buffer);
    }
}