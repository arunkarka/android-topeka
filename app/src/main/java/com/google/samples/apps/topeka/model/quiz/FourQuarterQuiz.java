/*
 * Copyright 2014 Google Inc.
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
package com.google.samples.apps.topeka.model.quiz;

import android.os.Parcel;
import android.os.Parcelable;

public class FourQuarterQuiz extends OptionsQuiz<String> {

    public static final Parcelable.Creator<FourQuarterQuiz> CREATOR
            = new Parcelable.Creator<FourQuarterQuiz>() {
        @Override
        public FourQuarterQuiz createFromParcel(Parcel in) {
            return new FourQuarterQuiz(in);
        }

        @Override
        public FourQuarterQuiz[] newArray(int size) {
            return new FourQuarterQuiz[size];
        }
    };

    public FourQuarterQuiz(String question, int[] answer, String[] options) {
        super(question, answer, options);
    }

    public FourQuarterQuiz(Parcel in) {
        super(in);
        String options[] = in.createStringArray();
        setOptions(options);
    }

    @Override
    protected Type getType() {
        return Type.FOUR_QUARTER;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        String[] options = getOptions();
        dest.writeStringArray(options);
    }
}