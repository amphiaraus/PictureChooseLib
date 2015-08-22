/**
 * <pre>
 * Copyright 2015 Soulwolf Ching
 * Copyright 2015 The Android Open Source Project for PictureChooseLib
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </pre>
 */
package net.soulwolf.image.picturelib.task;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import net.soulwolf.image.picturelib.R;

/**
 * author: Soulwolf Created on 2015/8/22 16:38.
 * email : Ching.Soulwolf@gmail.com
 */
public class DefaultImageLoadHandler implements ImageLoadHandler {

    Picasso mPicasso;

    public DefaultImageLoadHandler(Context context){
        mPicasso = Picasso.with(context);
    }

    @Override
    public <TARGET extends ImageView> void display(TARGET target, String url) {
        mPicasso.load(url).placeholder(R.color.pc_title_bar).error(R.drawable.pd_empty_picture).into(target);
    }

    @Override
    public void shutdown() {
        mPicasso.shutdown();
        mPicasso = null;
    }
}
