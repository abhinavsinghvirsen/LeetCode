class RandomizedSet {

    
    
    
    private Map<Integer, Integer> valToIndex;
    private List<Integer> nums;
    
    public RandomizedSet() {
        valToIndex = new HashMap<>();
        nums = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if (valToIndex.containsKey(val)) {
            return false; // Value already exists
        }
        nums.add(val);
        valToIndex.put(val, nums.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {
        if (!valToIndex.containsKey(val)) {
            return false; // Value doesn't exist
        }
        int index = valToIndex.get(val);
        if (index != nums.size() - 1) {
            int lastVal = nums.get(nums.size() - 1);
            nums.set(index, lastVal);
            valToIndex.put(lastVal, index);
        }
        nums.remove(nums.size() - 1);
        valToIndex.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(nums.size());
        return nums.get(randomIndex);
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */