public class Client {

    public static void main(String[] args) {
        TriangleCli triangle = new TriangleCli(5, 5, 5);
        Caretaker<Memento, TriangleCli> caretaker = new Caretaker<>(triangle);

        String[] edges = {
                "a",
                "b",
                "c",
                "a",
                "b",
        };

        float[] values = {
                3,
                4,
                2,
                6,
                3,
        };

        for (int i = 0; i < edges.length; i++) {
            switch (edges[i]) {
                case "a" -> triangle.setA(values[i]);
                case "b" -> triangle.setB(values[i]);
                case "c" -> triangle.setC(values[i]);
            }

            caretaker.saveMemento(triangle.save());
            System.out.println("V = " + triangle.square());
        }

        Memento maxAreaMemento = caretaker.getMaxAreaMemento();

        if (maxAreaMemento != null) {
            triangle.restore(maxAreaMemento);
            System.out.println("Max area = " + triangle.square());
        }
    }
}
