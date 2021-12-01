package com.example.c482_sw1.data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Adrian Deardorff
 */
public class Product {
    private final ObservableList<Part> associatedParts;
    private int id;
    private String name;
    private double price;
    private int stock;
    private int min;
    private int max;

    public Product(int id, String name, double price, int stock, int min, int max) {
        associatedParts = FXCollections.emptyObservableList();
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.min = min;
        this.max = max;
    }

    /**
     * @param part the part to be added
     */
    public void addAssociatedPart(Part part) {
        if (part != null) {
            associatedParts.add(part);
        }
    }

    /**
     * @param part the part to be deleted
     * @return true if deleting the part was successful and false otherwise
     */
    public boolean deleteAssociatedPart(Part part) {
        if (part != null) {
            associatedParts.remove(part);
            return true;
        }
        return false;
    }

    /**
     * @return the associated parts list
     */
    public ObservableList<Part> getAllAssociatedParts() {
        return this.associatedParts;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the stock quantity
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock quantity to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the minimum quantity in stock
     */
    public int getMin() {
        return min;
    }

    /**
     * @param min the minimum quantity in stock to set
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * @return the maximum quantity in stock
     */
    public int getMax() {
        return max;
    }

    /**
     * @param max the maximum quantity in stock to set
     */
    public void setMax(int max) {
        this.max = max;
    }
}
