package com.hansonwang99.domain.view;

import com.hansonwang99.domain.enums.ArticleType;

/**
 * Created by hansonwang on 2017/6/28.
 */
public interface ArticleView {

    Long getId();
    Long getUserId();
    String getUserName();
    Long getCategoryId();
    String getCategoryName();
    String getTitle();
    ArticleType getType();
    Long getPublish_at();
    String getCreate_time();
    String getContent();
    String getTag();
    String getProfilePicture();
}
