package com.taiye.ogunlade.dsa.adt.interfaces;

public interface NameInterface {
    /**
     * Sets the first and last names.
     * @param firstName A string that is the desired first name.
     * @param lastName A string that is the desired last name.
     */

    public void setName(String firstName,String lastName);


    /**
     * Gets the fullname
     * @return A string containing the first and last names.
     */
    public String getName();

    public void setFirst(String firstName);

    public String getFirst();
    public String getLast();

    public void giveLastNameTo(NameInterface aName);
    public String toString();
}
