# Box of Sweets

## Project Overview

**Box of Sweets** is a Java application designed to manage a collection of various sweets and create a gift box. The application allows you to add sweets with different characteristics, remove them, calculate the total weight and cost of the gift, and optimize the contents of the box by weight and price.

## Project Structure

- `Sweet`: An abstract class that defines the main properties and methods for all types of sweets.
- `Marmalade`, `Candy`, `Chocolate`: Concrete classes that inherit from `Sweet`, each with unique properties.
- `SweetBox`: An interface that defines methods for working with a collection of sweets.
- `SweetBoxImpl`: A class that implements the `SweetBox` interface. This class manages the collection of sweets and provides functionality for managing the contents of the box.

## Functionality

- **Adding Sweets**: Methods for adding new sweets to the box.
- **Removing Sweets**: Methods for removing sweets by index or the last added sweet.
- **Displaying Information**: Outputs the weight, cost, and detailed description of all sweets in the box to the console.
- **Optimizing Contents**: 
  - **Weight Optimization**: Removes sweets with the lowest weight until the specified maximum weight is reached.
  - **Price Optimization**: Removes sweets with the lowest price until the specified maximum weight is reached.

