package pl.kedrabartosz.designpatterns.exercise;

public class ShortenArticleHomework extends BasicHomework {
    private BasicHomework basicHomework;

    public ShortenArticleHomework(BasicHomework basicHomework) {
        this.basicHomework = basicHomework;
    }

    @Override
    public void doHomework() {
        this.basicHomework.doHomework();
        System.out.println("and shorten");
    }
}
