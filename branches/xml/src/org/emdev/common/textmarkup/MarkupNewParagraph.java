package org.emdev.common.textmarkup;


import org.ebookdroid.droids.fb2.codec.LineCreationParams;

import java.util.ArrayList;

import org.emdev.common.textmarkup.line.Line;
import org.emdev.common.textmarkup.line.LineFixedWhiteSpace;


public class MarkupNewParagraph implements MarkupElement {

    private final LineFixedWhiteSpace offset;

    public MarkupNewParagraph(final LineFixedWhiteSpace offset) {
        this.offset = offset;
    }

    @Override
    public void publishToLines(ArrayList<Line> lines, LineCreationParams params) {
        if (params.jm != JustificationMode.Center && offset != null) {
            offset.publishToLines(lines, params);
        }
    }

}
