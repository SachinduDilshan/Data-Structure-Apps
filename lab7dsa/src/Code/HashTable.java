/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author sa22527974
 */
public class HashTable {

    private Country countryList[];
    private int arraySize;

    public HashTable(int arraySize) {
        this.arraySize = arraySize;
    }

    private int hashFunction(int key) {
        return key % arraySize;
    }

    public void insert(String CountryName, String alpha2Code, String alpha3Code, int m49Code) {
        
        int key=0;
        
        for (int i = 0; i < CountryName.length(); i++) {
            key+=(int) CountryName.charAt(i);
        }
        
        int hashval=hashFunction(key);
        while (countryList[hashval] !=null){
            ++hashval;
            hashval %=arraySize;
        }
        countryList[hashval]= new Country(CountryName, alpha2Code, alpha3Code, m49Code);
        
    }

    public Country delete(String k) {
        
        int key = 0;
        int hashval = hashFunction(key);
        
        while (countryList[hashval] != null) {
            if (countryList[hashval].equals(key)) {
                countryList[hashval] = null;     
            }
            ++hashval;
            hashval %= arraySize;
        }
        return null;
    }

    public Country find(String k) {
        
        int key = 0;
        int hashval = hashFunction(key);
        
        while (countryList[hashval] != null) {
            if (countryList[hashval].equals(key)) {
            ++hashval;
            hashval %= arraySize;
            }
        }
        return null;
    }
}
