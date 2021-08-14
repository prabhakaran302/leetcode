class ParkingSystem {

    Map<Integer,Integer> map;
    public ParkingSystem(int big, int med, int small) {
        map = new HashMap<>();
        map.put(1,big);
        map.put(2,med);
        map.put(3,small);
    }
    
    public boolean addCar(int carType) {
        if(map.get(carType) > 0)    {
            map.put(carType, map.get(carType)-1);
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */