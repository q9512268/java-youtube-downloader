package com.github.kiulian.downloader;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.files.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ManipulateVideoTests {


    @Test
    void splitVideo_Success() {

        try {
            String inputPath = FileUtils.getResourcesPath() + "/videos/zoo.mp4";
            File file = new File(inputPath);
            InputStream inputStream = new FileInputStream(file);

            inputStream.read()

            /**
             * InputStream inputstream = new FileInputStream("c:\\data\\input-text.txt");
             *
             * int data = inputstream.read();
             * while(data != -1) {
             *   //do something with data...
             *   doSomethingWithData(data);
             *
             *   data = inputstream.read();
             * }
             * inputstream.close();
             */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
