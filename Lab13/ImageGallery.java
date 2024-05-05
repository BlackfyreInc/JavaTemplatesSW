public class ImageGallery {
    public static void main(String[] args) {

        DisplayObject[] images = {
            // якщо виникає помилка завантаження, замініть відносний шлях на абсотютний шлях!
            new Proxy("src/resources/image1.jpeg"),
            new Proxy("src/resources/image2.jpeg"),
            new Proxy("src/resources/image3.jpeg"),
            new Proxy("src/resources/image4.jpeg"),
            new Proxy("src/resources/image5.jpeg"),
            new Proxy("src/resources/image6.jpeg"),
            new Proxy("src/resources/image7.jpeg"),
            new Proxy("src/resources/image8.jpeg"),
            new Proxy("src/resources/image9.jpeg"),
            new Proxy("src/resources/image10.jpeg"),
        };

        for (DisplayObject image : images) {
            image.display();
        }
    }
}
