# Compressor-Decompressor
1.Overview
This project is a file compression and decompression application that utilizes the GZIP algorithm. 
The goal of the project was to provide a user-friendly graphical interface for users to compress and decompress files.
The project consists of two main components: the graphical user interface (GUI) and the compression/decompression functionality.

2.GUI
The GUI is built using Java's Swing library and includes a main frame with two buttons:
'Compress' and 'Decompress'. When the 'Compress' button is clicked, a file chooser dialog is displayed, allowing the user to select a file for compression.
Similarly, when the 'Decompress' button is clicked, the user can choose a file for decompression. T
he chosen file is then passed to the respective compression or decompression method.

3.compression function
The compression functionality is implemented in the compression class.
When compressing a file, the method creates a GZIPOutputStream to handle the compression process.
It reads the contents of the file using a FileInputStream, writes the compressed data to a file with the '.gz' extension using a FileOutputStream,
and closes the necessary streams.

4.Decompression function
The decompression functionality is implemented in the decompression class.
It reads the compressed file using a FileInputStream, decompresses it using a GZIPInputStream, 
and writes the decompressed data to a file without the '.gz' extension using a FileOutputStream. Finally, the streams are closed.

5.Overall, the project aims to provide a simple and intuitive way for users to compress and decompress files using the GZIP algorithm.
The GUI allows users to select files, triggering the compression or decompression process.
The compressed or decompressed files are saved in the same directory as the original files.
