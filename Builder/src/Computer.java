public class Computer {
    private String gpu;
    private int ramGb;
    private String cpu;
    private String mouse;
    private String keyboard;

    public Computer(String gpu, int ramGb, String cpu, String mouse, String keyboard) {
        this.gpu = gpu;
        this.ramGb = ramGb;
        this.cpu = cpu;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public static class ComputerBuilder {
        private String gpu;
        private int ramGb;
        private String cpu;
        private String mouse;
        private String keyboard;

        public ComputerBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public ComputerBuilder setRamGb(int ramGb) {
            this.ramGb = ramGb;
            return this;
        }

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public ComputerBuilder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Computer build() {
            return new Computer(gpu, ramGb, cpu, mouse, keyboard);
        }
    }

    public String getGpu() {
        return gpu;
    }

    public int getRamGb() {
        return ramGb;
    }

    public String getCpu() {
        return cpu;
    }

    public String getMouse() {
        return mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }
}
