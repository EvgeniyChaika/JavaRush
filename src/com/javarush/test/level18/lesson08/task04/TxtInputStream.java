package com.javarush.test.level18.lesson08.task04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* UnsupportedFileName
Измените класс TxtInputStream так, чтобы он работал только с txt-файлами (*.txt)
Например, first.txt или name.1.part3.txt
Если передан не txt-файл, например, file.txt.exe, то конструктор должен выбрасывать исключение UnsupportedFileNameException
*/

public class TxtInputStream extends InputStream {

    private FileInputStream fileInputStream;

    public TxtInputStream(String fileName) throws FileNotFoundException, UnsupportedFileNameException {
        char[] arr = fileName.toCharArray();
        String str = new String(arr, arr.length - 4, 4);
        if ((".txt").equals(str)) {
            this.fileInputStream = new FileInputStream(fileName);
        } else {
            throw new UnsupportedFileNameException();
        }

    }

    public TxtInputStream() {
        super();
    }

    @Override
    public int read() throws IOException {
        return fileInputStream.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return fileInputStream.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return fileInputStream.read(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException {
        return fileInputStream.skip(n);
    }

    @Override
    public int available() throws IOException {
        return fileInputStream.available();
    }

    @Override
    public void close() throws IOException {
        fileInputStream.close();
    }

    @Override
    public synchronized void mark(int readlimit) {
        fileInputStream.mark(readlimit);
    }

    @Override
    public synchronized void reset() throws IOException {
        fileInputStream.reset();
    }

    @Override
    public boolean markSupported() {
        return fileInputStream.markSupported();
    }
}

