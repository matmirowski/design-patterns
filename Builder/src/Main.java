public class Main {

    public static void main(String[] args) {
        Computer newPc = new Computer.ComputerBuilder()
                .setCpu("Intel Pentium 2")
                .setGpu("Radeon 2137")
                .setRamGb(16)
                .setKeyboard("Razer")
                .setMouse("Esperanza")
                .build();

        System.out.println(newPc.getCpu());
    }

}