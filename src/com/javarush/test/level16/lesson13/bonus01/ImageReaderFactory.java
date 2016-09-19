package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.ImageReader;
import com.javarush.test.level16.lesson13.bonus01.common.ImageTypes;
import com.javarush.test.level16.lesson13.bonus01.common.BmpReader;
import com.javarush.test.level16.lesson13.bonus01.common.JpgReader;
import com.javarush.test.level16.lesson13.bonus01.common.PngReader;

/**
 * Created on 19.09.16.
 */
public class ImageReaderFactory {

    public static ImageReader getReader(ImageTypes imageTypes) {
        if (ImageTypes.BMP == imageTypes) {
            return new BmpReader();
        } else if (ImageTypes.JPG == imageTypes) {
            return new JpgReader();
        } else if (ImageTypes.PNG == imageTypes) {
            return new PngReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
