package com.turbopass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class RobsHashMap {
	 
    /* The initial size of the bucket array */
    private int BUCKET_ARRAY_SIZE = 256;
    private Node bucketArray[] = new Node[BUCKET_ARRAY_SIZE];
 
    /* Constructors */
    public RobsHashMap(){}
 
    public RobsHashMap(int initialSize){
        this.BUCKET_ARRAY_SIZE = initialSize;
    }
 
    /**
     * Used to put a key-value pair into the data structure.
     * @param key Key string that is used identify the key-value pair
     * @param value Value string in which the key string maps to.
     */
    public void put(String key, String value){
        /* Get the hash code */
        int hash = Math.abs(key.hashCode() % BUCKET_ARRAY_SIZE);
        /* Create the Node to add to the linked list */
        Node entry = new Node(key,value);
 
        /* Insert the node to the bucket array at the hash index */
        if(bucketArray[hash] == null){
            /* No collision detected. Insert the node. */
            bucketArray[hash] = entry;
        }else{
            /* Collision detected. We must place the node at the end of the linked list. */
            Node current = bucketArray[hash];
            while(current.next != null){
                /* Check if the key already exists */
                if(current.getKey().equals(entry.getKey())){
                    /* Replace the keys value with the new one */
                    current.setValue(entry.getValue());
                    return;
                }
                current = current.next;
            }
            /* When the code gets here current.next == null */
            /* Insert the node */
            current.next = entry;
        }
    }
 
    /**
     * Returns the value that is mapped to the given key.
     * @param key The key string which is used to search for the value it
     *            is mapped to.
     * @return The value string
     */
    public String get(String key){
        /* Get the hash */
        int hash = Math.abs(key.hashCode() % BUCKET_ARRAY_SIZE);
        /* Search for key in linked list */
        Node n = bucketArray[hash];
        /* Traverse linked list */
        while(n != null){
            if(n.getKey().equals(key)){
                return n.getValue();
            }
            n = n.getNext();
        }
        /* Not found? then return null */
        return null;
    }
 
 
    /* This is the simple object that we use to store each key-value pair */
    class Node{
        private String key;
        private String value;
        private Node next;
 
        public Node(){}
 
        public Node(String key, String value){
            this.key = key;
            this.value = value;
        }
 
        public String getKey() {
            return key;
        }
 
        public void setKey(String key) {
            this.key = key;
        }
 
        public String getValue() {
            return value;
        }
 
        public void setValue(String value) {
            this.value = value;
        }
 
        public Node getNext() {
            return next;
        }
 
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
public class HashmapUsingArray {
	 
    /*private RobsHashMap robsHashMap;
    private final int NUM_ELEMENTS = 200000;
 
    @Before
    public void setUp(){
        robsHashMap = new RobsHashMap();
    }
 
    @Test
    public void testHashMapPut(){
        robsHashMap.put("Test1", "Test1Value");
    }
 
    @Test
    public void testPutGet(){
        String k = "TestPutGet";
        String v = "TestPutGetValue";
        robsHashMap.put(k, v);
        String valueResult = robsHashMap.get(k);
        assertEquals(v, valueResult);
    }
 
    @Test
    public void testHashMapCollisions() {
         Initialise hashmap 
        for(int i = 0; i < NUM_ELEMENTS; i++){
            robsHashMap.put(Integer.toString(i), Integer.toString(i));
        }
         Test all values of the get method 
        for(int i = 0; i < NUM_ELEMENTS; i++){
            String value = robsHashMap.get(Integer.toString(i));
            assertEquals(Integer.toString(i), value);
        }
    }
 
    @After
    public void tearDown(){
        robsHashMap = null;
    }
*/
	public static void main(String[] args) {
		RobsHashMap z=new RobsHashMap();
		z.put("nice", "good");
		System.out.println(z.get("nice"));
	}
	}
