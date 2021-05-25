import os 
import csv
import time
import sys
import psutil
from save import save
from compression import scaling, average, nearest_neighbors
from decompression import linear_interpolation



path = "C:/temp/ArchivosCSV"        
os.chdir(path)
sizes = []

def get_process_memory():
    process = psutil.Process(os.getpid())
    return process.memory_info().rss


def reader():

    medu = []
    for root, subDirs, files in os.walk("."): #o(n)
        
        for subDir in subDirs:#o(n)
            new_path = path+'/'+subDir
            os.chdir(new_path)

            for a,b,c in os.walk("."):#o(n)
                os.chdir(new_path)

                for file_data in c: #o(n)
                    os.chdir(new_path)
                    file_path = os.path.abspath(file_data)
                 
                    with open(file_path, 'r') as csv_file:
                        reader = csv.reader(csv_file, delimiter=",")
                        data = []
                        for row in reader: #o(n)
                            data.append(row)
                            
                        filename = os.path.basename(file_path)
                        imagename = filename.split('.')[0]
                        save(data, "Original", imagename)  
                        save(average(data), "Sin escala", imagename)  
                        inicio = time.time()
                        save(scaling(data), "Con escala", imagename)
                        fin = time.time()
                        print(f"TIEMPO PROMEDIO SIN ESCALA: {(fin-inicio)}")
                        
                        
                    

if __name__ == '__main__':
    #print(f"TIEMPO INICIO: {inicio}" )
    reader()
   # fin = time.time()
    #//print (f"TIEMPO FIN: {fin}" )
    #print("El tiempo de ejecucion es: ") 
    #print(fin-inicio)
    print("\n")