package hotelManagementSystem;

public class Review {
    private Customer customer;
    private short star;
    private String contentReview;

    public Review(Customer customer, short star, String contentReview) {
        this.customer = customer;
        this.star = star;
        this.contentReview = contentReview;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public short getStar() {
        return star;
    }

    public void setStar(short star) {
        this.star = star;
    }

    public String getContentReview() {
        return contentReview;
    }

    public void setContentReview(String contentReview) {
        this.contentReview = contentReview;
    }
}
