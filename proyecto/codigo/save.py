import numpy as np
from PIL import Image
import os

def save(image_data, method, name):
    
    image_name = '{}-{}.png'.format(name, method)
    csv_name = '{}-{}.csv'.format(name, method)
        
    py = len(image_data[0])
    px = len(image_data)

    print(image_name)
        
    pixels = np.array(image_data, dtype='uint8')
    pixels = pixels.reshape((px, py))
    
    path = create_directory(name)
    image_path = os.path.join(path, image_name)
    csv_path = os.path.join(path, csv_name)

    image = Image.fromarray(pixels)
    image.save(image_path)
    
    pass

def create_directory(directory_name):

    os.chdir("C:/temp/Imagenes")
    absolute_path = os.getcwd()


    path = os.path.join(absolute_path, "proyecto", "images", directory_name)

    if not os.path.exists(path):
        try:
            os.mkdir(path)
        except OSError as error:
            print ("Creation of the directory %s failed" % path, error)
   
    return path