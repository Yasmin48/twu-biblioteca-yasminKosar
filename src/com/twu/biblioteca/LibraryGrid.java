package com.twu.biblioteca;

public class LibraryGrid {

    private final int TITLE_WIDTH;
    private final int AUTHOR_WIDTH;
    private final int YEAR_WIDTH;

    public LibraryGrid(int titleWidth, int authorWidth, int yearWidth) {
        this.TITLE_WIDTH = titleWidth;
        this.AUTHOR_WIDTH = authorWidth;
        this.YEAR_WIDTH = yearWidth;
    }

    public void printLibrary(Library library) {
        System.out.println(getSeparatorLine());
        System.out.println(getContentLine("Title", "Author", "Year"));
        System.out.println(getSeparatorLine());

        for (Book book : library.getBooks()) {
            System.out.println(getContentLine(book.getTitle(), book.getAuthor(), Integer.toString(book.getYear())));
        }

        System.out.println(getSeparatorLine());
    }

    private String getSeparatorLine() {
        return String.format("+%s+%s+%s+", getRowLength(TITLE_WIDTH ), getRowLength(AUTHOR_WIDTH), getRowLength(YEAR_WIDTH));
    }

    private String getContentLine(String title, String author, String year) {
        return String.format("| %s | %s | %s |", formatToLength(title, TITLE_WIDTH), formatToLength(author, AUTHOR_WIDTH),
                formatToLength(year, YEAR_WIDTH));
    }

    public static String getRowLength(int row){
        StringBuilder sb = new StringBuilder(row + 2);
        for (int i = 0; i <= row + 2; i++){
            sb.append("-");
        }
        return sb.toString();
    }

    public static String formatStrToRowLength(int difference) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= difference; i++){
            sb.append(" ");
        }
        return sb.toString();
    }

    private static String formatToLength(String str, int length) {
        int actual = str.length();
        if (actual <= length) {
            return str + formatStrToRowLength(length - actual);
        } else {
            return str.substring(0, length - 3) + "...";
        }
    }
}



