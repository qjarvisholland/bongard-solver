#!/bin/bash

# Directory containing the images
image_directory="./resources/images"

# Loop through each .gif file in the directory
for image in "$image_directory"/p*.gif; do
    # Extract the base filename without the extension
    base_name=$(basename "$image" .gif)

    # Convert the image to .bmp format
    convert "$image" "$image_directory/$base_name.bmp"
done

echo "Conversion complete."

