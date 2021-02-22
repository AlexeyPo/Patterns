package factory;

import java.time.LocalDate;
import java.util.StringJoiner;

public class NewsPost extends Post {

    private String headline;
    private LocalDate newsTime;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public LocalDate getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(LocalDate newsTime) {
        this.newsTime = newsTime;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", NewsPost.class.getSimpleName() + "[", "]")
                .add("headline='" + headline + "'")
                .add("newsTime=" + newsTime)
                .toString();
    }
}
