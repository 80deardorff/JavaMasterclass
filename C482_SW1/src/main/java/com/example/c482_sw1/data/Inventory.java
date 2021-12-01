package com.example.c482_sw1.data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Adrian Deardorff
 */
public class Inventory {
    private final ObservableList<Part> allParts;
    private final ObservableList<Product> allProducts;

    public Inventory() {
        allParts = FXCollections.emptyObservableList();
        allProducts = FXCollections.emptyObservableList();
    }

    /**
     * @param newPart the new part to be added
     */
    public void addPart(Part newPart) {
        if (newPart != null) {
            allParts.add(newPart);
        }
    }

    /**
     * @param newProduct the new product to be added
     */
    public void addProduct(Product newProduct) {
        if (newProduct != null) {
            allProducts.add(newProduct);
        }
    }

    /**
     * @param partId the part id to be looked up
     * @return part if part is in list and null otherwise
     */
    public Part lookupPart(int partId) {
        for (Part part : allParts) {
            if (part.getId() == partId) {
                return part;
            }
        }
        return null;
    }

    /**
     * @param productId the product id to be looked up
     * @return product if product is in list and null otherwise
     */
    public Product lookupProduct(int productId) {
        for (Product product : allProducts) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }

    /**
     * @param partName the part name to be looked up
     * @return list of parts containing that name
     */
    public ObservableList<Part> lookupPart(String partName) {
        ObservableList<Part> list = FXCollections.emptyObservableList();
        if (!partName.isEmpty()) {
            for (Part part : allParts) {
                if (part.getName().toLowerCase().contains(partName.toLowerCase())) {
                    list.add(part);
                }
            }
            return list;
        }
        return null;
    }

    /**
     * @param productName the product name to be looked up
     * @return list of products containing that name
     */
    public ObservableList<Product> lookupProduct(String productName) {
        ObservableList<Product> list = FXCollections.emptyObservableList();
        if (!productName.isEmpty()) {
            for (Product product : allProducts) {
                if (product.getName().toLowerCase().contains(productName.toLowerCase())) {
                    list.add(product);
                }
            }
            return list;
        }
        return null;
    }

    /**
     * @param index the index Todo
     * @param selectedPart Todo
     */
    public void updatePart(int index, Part selectedPart) {
        // Todo
    }

    /**
     * @param index the index Todo
     * @param newProduct Todo
     */
    public void updateProduct(int index, Product newProduct) {
        // Todo
    }

    /**
     * @param selectedPart the part to be deleted
     * @return true if delete was successful and false otherwise
     */
    public boolean deletePart(Part selectedPart) {
        if (allParts.contains(selectedPart)) {
            allParts.remove(selectedPart);
            return true;
        }
        return false;
    }

    /**
     * @param selectedProduct the product to be deleted
     * @return true if delete was successful and false otherwise
     */
    public boolean deleteProduct(Product selectedProduct) {
        if (allProducts.contains(selectedProduct)) {
            allProducts.remove(selectedProduct);
            return true;
        }
        return false;
    }

    /**
     * @return all parts list
     */
    public ObservableList<Part> getAllParts() {
        return allParts;
    }

    /**
     * @return all products list
     */
    public ObservableList<Product> getAllProducts() {
        return allProducts;
    }
}
