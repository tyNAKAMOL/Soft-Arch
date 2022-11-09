package structural;

import java.util.Set;
import java.util.HashSet;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    private Set<HealthcareServiceable> members ;

    public HealthcareWorkerTeam() {
        members = new HashSet<>();
    }

    public void addMember(HealthcareServiceable member) {
        members.add(member);
    }

    public void removeMember(HealthcareWorker member) {
        members.remove(member);
    }

    @Override
    public void service() {
        for (HealthcareServiceable member : members) {
            member.service();
        }
    }

    @Override
    public double getPrice() {
        double sum_ = 0.0;
        for (HealthcareServiceable member : members) {
            sum_ += member.getPrice();
        }
        return Sum_;
    }
}
