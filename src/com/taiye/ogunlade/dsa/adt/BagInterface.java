package com.taiye.ogunlade.dsa.adt;

public interface BagInterface<T> {

    /**
     * Gets the current number of entries in this bag
     * @return the integer number of entries currently in the bag
     */
    public int getCurrentSize();

    /**
     * Sees whether this bag is empty
     * @return True if the bag is empty or false if not
     */
  public  boolean isEmpty();


    /***
     * Adds a newentry to this bag
     * @param newEntry The object to be added as a new Entry
     * @return
     */
  public   boolean add(T newEntry);

    /**
     * Removes one unspecified entry from this bag, if possible
     * @return Either the removed entry , if the removal was successful or null
     */
   public T remove();

    /**
     * Removes one occurence of a given entry from this bag, possible
     * @param anEntry The entry to be removed
     * @return True if the remove was successful or false if not
     */
   public boolean remove(T anEntry);

    /**
     * remove all entries from this bag
     */
    void clear();

    /**
     * Counts the number of time a given entru appears in the bag
     * @param enEntry
     * @return
     */
    int getFrequencyOfOccurrence(T enEntry);

    /**
     * Tests whether this bag contains a given entry
     * @param anEntry The entry to find
     * @return True if the bag contains anEntry or false if not
     */
    boolean contains(T anEntry);


    /**
     * Retrieves all entries that are in this bag
     * @return A newly allocated array of all the entries in the bag ,
     *         Note returns
     */
    T[] toArray();
}
