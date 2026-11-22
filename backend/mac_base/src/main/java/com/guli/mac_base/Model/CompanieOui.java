import jakarta.persistence.*;
import org.hibernate.annotations.ColumnTransformer;
import com.guli.mac_base.Model.Company;

@Entity
@Table(name = "companies_oui")
public class CompanieOui {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer companiesOuiId;

    @Column(name = "oui", columnDefinition = "macaddr")
    @ColumnTransformer(read = "oui::text", write = "?::macaddr")
    private String oui;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    protected CompanieOui() {
    }

    public CompanieOui(String oui, Company company) {
        this.oui = oui;
        this.company = company;
    }

    public Integer getCompaniesOuiId() { return companiesOuiId; }
    public String getOui() { return oui; }
    public void setOui(String oui) { this.oui = oui; }
    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }
}