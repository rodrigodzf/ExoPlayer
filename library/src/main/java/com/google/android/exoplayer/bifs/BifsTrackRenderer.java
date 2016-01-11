package com.google.android.exoplayer.bifs;

import android.os.Handler;
import android.os.Looper;

import com.google.android.exoplayer.MediaFormatHolder;
import com.google.android.exoplayer.SampleSource;
import com.google.android.exoplayer.SampleSourceTrackRenderer;
import com.google.android.exoplayer.text.SubtitleParser;
import com.google.android.exoplayer.text.TextRenderer;
import com.google.android.exoplayer.util.Assertions;

/**
 * Created by rodrigodiaz on 1/11/16.
 */
public class BifsTrackRenderer extends SampleSourceTrackRenderer {


    private final Handler textRendererHandler;
    private final BifsRenderer bifsRenderer;
    private final MediaFormatHolder formatHolder;
    private final BifsParser[] subtitleParsers;

    public BifsTrackRenderer(SampleSource source, BifsRenderer bifsRenderer,
                             Looper textRendererLooper, BifsParser... bifsParsers) {
        this(new SampleSource[] {source}, bifsRenderer, textRendererLooper, bifsParsers);
    }


    public BifsTrackRenderer(SampleSource[] sources, BifsRenderer bifsRenderer,
                             Looper textRendererLooper, BifsParser... bifsParsers) {
        super(sources);
        this.bifsRenderer = Assertions.checkNotNull(bifsRenderer);
        this.textRendererHandler = textRendererLooper == null ? null
                : new Handler(textRendererLooper, this);

            subtitleParsers = new SubtitleParser[1];

        }
        this.subtitleParsers = subtitleParsers;
        formatHolder = new MediaFormatHolder();
    }
}
