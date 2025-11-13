package demeter_law;

public class Agent {
    private Fans fans;
    private Company company;
    private Star star;

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public void meeting(){
        System.out.println(star.getName() + "和粉丝" + fans.getName() + "见面");
    }

    public void business(){
        System.out.println(star.getName() + "和" + company.getName() + "见面");
    }

}
