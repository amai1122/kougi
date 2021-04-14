package read_writ;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IOtestCopy3 {

	public static void main(String[] args) throws IOException {

        Path inputPath = Paths.get("C:/temp/temp1.txt");
        Path outputPath = Paths.get("C:/temp/temp2.txt");

        Files.copy(inputPath, outputPath, StandardCopyOption.COPY_ATTRIBUTES);

    }

}
