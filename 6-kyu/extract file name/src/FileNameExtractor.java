public class FileNameExtractor {
    public static String extractFileName(String dirtyFileName) {
        return dirtyFileName.substring(dirtyFileName.indexOf("_") + 1, dirtyFileName.lastIndexOf("."));
    }
}
