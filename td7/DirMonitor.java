package td7;

import java.io.IOError;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;

public class DirMonitor {
    private final Path dir;

    public DirMonitor(Path dir) throws IOException{
        if (!Files.isDirectory(dir) || !Files.isReadable(dir)){
            throw new IOException();
        }
        this.dir = dir;
    }

    public void printfiles() throws IOException{
        for (Path p: Files.newDirectoryStream(dir)){
            System.out.println(p.getFileName());
        }
    }

    /* public void printfilesL() throws IOException{
        DirectoryStream<Path> directoryStream = new DirectoryStream<Path>(dir) {
    }

     */

    public long sizeofFiles() throws IOException{
            long s = 0;
            for (Path p: Files.newDirectoryStream(dir)){
                if (!Files.isDirectory(p)){
                    s += Files.size(p);
                }
            }
            return s;
    }

    class SizeFilter implements DirectoryStream.Filter<Path>{
        private final int sizeBand;
        public SizeFilter(int sizeBand){
            this.sizeBand = sizeBand;
        }

        @Override
        public boolean accept(Path entry) throws IOException {
            return Files.size(entry) > this.sizeBand;
        }
    }

}


