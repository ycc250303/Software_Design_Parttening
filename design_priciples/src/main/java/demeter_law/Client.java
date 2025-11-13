package demeter_law;

public class Client {
    public static void main(String[] args){
        Agent agent = new Agent();

        Star star = new Star("a");
        Fans fans = new Fans("b");
        Company company = new Company("c");

        agent.setStar(star);
        agent.setFans(fans);
        agent.setCompany(company);

        agent.meeting();
        agent.business();
    }
}
