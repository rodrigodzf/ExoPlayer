/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.C;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.util.Util;

/**
 * Encapsulates information describing an MP4 track.
 */
public final class Track {

//  TODO: need to implement all of these gpac constants.h
//  	/*!MPEG-4 Object Descriptor Stream*/
//  GF_STREAM_OD		= 0x01,
//	/*!MPEG-4 Object Clock Reference Stream*/
//  GF_STREAM_OCR		= 0x02,
//	/*!MPEG-4 Scene Description Stream*/
//  GF_STREAM_SCENE		= 0x03,
//	/*!Visual Stream (Video, Image or MPEG-4 SNHC Tools)*/
//  GF_STREAM_VISUAL	= 0x04,
//	/*!Audio Stream (Audio, MPEG-4 Structured-Audio Tools)*/
//  GF_STREAM_AUDIO		= 0x05,
//	/*!MPEG-7 Description Stream*/
//  GF_STREAM_MPEG7		= 0x06,
//	/*!MPEG-4 Intellectual Property Management and Protection Stream*/
//  GF_STREAM_IPMP		= 0x07,
//	/*!MPEG-4 Object Content Information Stream*/
//  GF_STREAM_OCI		= 0x08,
//	/*!MPEG-4 MPEGlet Stream*/
//  GF_STREAM_MPEGJ		= 0x09,
//	/*!MPEG-4 User Interaction Stream*/
//  GF_STREAM_INTERACT	= 0x0A,
//	/*!MPEG-4 IPMP Tool Stream*/
//  GF_STREAM_IPMP_TOOL	= 0x0B,
//	/*!MPEG-4 Font Data Stream*/
//  GF_STREAM_FONT		= 0x0C,
//	/*!MPEG-4 Streaming Text Stream*/
//  GF_STREAM_TEXT		= 0x0D,
//
//	/* From 0x20 to Ox3F, this is the user private range */
//
//	/*!Nero Digital Subpicture Stream*/
//  GF_STREAM_ND_SUBPIC = 0x38,
//
//	/*GPAC internal stream types*/
//
//
//	/*!GPAC Private Scene streams\n
//	*\n\note
//	*this stream type (MPEG-4 user-private) is reserved for streams only used to create a scene decoder
//	*handling the scene without input streams, as is the case for file readers (BT/VRML/XML..).\n
//	*The decoderSpecificInfo carried is as follows:
//	 \code
//		u32 file_size:	total file size
//		char file_name[dsi_size - sizeof(u32)]: local file name.
//		\n\note: File may be a cache file, it is the decoder responsability to check if the file is completely
//		downloaded before parsing if needed.
//	 \endcode
//	*The inBufferLength param for decoders using these streams is the stream clock in ms (no input data is given).\n
//	*The "dummy_in" module is available to generate these streams for common files, and also takes care of proper
//	clock init in case of seeking.\n
//	*This is a reentrant stream type: if any media object with this streamtype also exist in the scene, they will be
//	*attached to the scene decoder (except when a new inline scene is detected, in which case a new decoder will
//	*be created). This allows for animation/sprite usage along with the systems timing/stream management.\n
//	*\n
//	*the objectTypeIndication currently in use for these streams are documented below\n
//	*/
//  GF_STREAM_PRIVATE_SCENE	= 0x20,
//
//	/*!GPAC Private Media streams\n
//	*\n\note
//	*this stream type (MPEG-4 user-private) is reserved for media streams bypassing GPAC for decoding
//	and composition. The media decoder is only in charge of repositioning the video output, and the compositor will
//	draw an empty rectangle if using alpha composition
//
//	*The decoderSpecificInfo carried only contains an opaque pointer in the data field, which depends on the underlying InputServce provider
//
//	*the objectTypeIndication currently in use for these streams are documented below\n
//	*/
//  GF_STREAM_PRIVATE_MEDIA	= 0x21,
//
//	/*used internally to signal that the OTI carries a 4CC code, typically media subtype (stsd entry in file format)*/
//  GF_STREAM_4CC		= 0xF0

  public static final int TYPE_vide = Util.getIntegerCodeForString("vide");
  public static final int TYPE_soun = Util.getIntegerCodeForString("soun");
  public static final int TYPE_text = Util.getIntegerCodeForString("text");
  public static final int TYPE_sbtl = Util.getIntegerCodeForString("sbtl");
  public static final int TYPE_subt = Util.getIntegerCodeForString("subt");
  public static final int TYPE_sdsm = Util.getIntegerCodeForString("sdsm");
  /**
   * The track identifier.
   */
  public final int id;

  /**
   * One of {@link #TYPE_vide}, {@link #TYPE_soun}, {@link #TYPE_text} and {@link #TYPE_sbtl} and
   * {@link #TYPE_subt}.
   */
  public final int type;

  /**
   * The track timescale, defined as the number of time units that pass in one second.
   */
  public final long timescale;

  /**
   * The movie timescale.
   */
  public final long movieTimescale;

  /**
   * The duration of the track in microseconds, or {@link C#UNKNOWN_TIME_US} if unknown.
   */
  public final long durationUs;

  /**
   * The media format.
   */
  public final MediaFormat mediaFormat;

  /**
   * Track encryption boxes for the different track sample descriptions. Entries may be null.
   */
  public final TrackEncryptionBox[] sampleDescriptionEncryptionBoxes;

  /**
   * Durations of edit list segments in the movie timescale. Null if there is no edit list.
   */
  public final long[] editListDurations;

  /**
   * Media times for edit list segments in the track timescale. Null if there is no edit list.
   */
  public final long[] editListMediaTimes;

  /**
   * For H264 video tracks, the length in bytes of the NALUnitLength field in each sample. -1 for
   * other track types.
   */
  public final int nalUnitLengthFieldLength;

  public Track(int id, int type, long timescale, long movieTimescale, long durationUs,
      MediaFormat mediaFormat, TrackEncryptionBox[] sampleDescriptionEncryptionBoxes,
      int nalUnitLengthFieldLength, long[] editListDurations, long[] editListMediaTimes) {
    this.id = id;
    this.type = type;
    this.timescale = timescale;
    this.movieTimescale = movieTimescale;
    this.durationUs = durationUs;
    this.mediaFormat = mediaFormat;
    this.sampleDescriptionEncryptionBoxes = sampleDescriptionEncryptionBoxes;
    this.nalUnitLengthFieldLength = nalUnitLengthFieldLength;
    this.editListDurations = editListDurations;
    this.editListMediaTimes = editListMediaTimes;
  }

}
