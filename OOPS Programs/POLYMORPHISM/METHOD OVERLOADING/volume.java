class volume {
    
    double calculateVolume(int cubeSide) {
        return cubeSide * cubeSide * cubeSide;
    }

    double calculateVolume(int radius, int height) {
        return Math.PI * radius * radius * height;
    }

    double calculateVolume(int length, int width, int height) {
        return length * width * height;
    }

    public static void main(String args[]) {
        volume vc = new volume();
        System.out.println("Volume of Cube: " + vc.calculateVolume(5));               
        System.out.println("Volume of Cylinder: " + vc.calculateVolume(3, 7));       
        System.out.println("Volume of Cuboid: " + vc.calculateVolume(4, 5, 6)); 
    }
}
