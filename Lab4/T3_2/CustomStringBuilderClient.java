package task_3_2;


public class CustomStringBuilderClient {
    public void building() {
        CustomStringBuilder customStringBuilder = new CustomStringBuilder();
        customStringBuilder.append("Hello");
        customStringBuilder.insert(" world", 5);
        customStringBuilder.replace("guys", 6, 3);

        CustomString customString = customStringBuilder.build();
        System.out.println(customString);
    }
}
