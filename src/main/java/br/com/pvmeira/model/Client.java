package br.com.pvmeira.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by pvciria on 23/02/2017.
 */
@Entity(name = "client")
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "log_in")
    private Calendar logIn;

    @Column(name = "email")
    private String email;

    @Column(name = "observation")
    private String observation;

    public Client() {
    }

    public Client(Long id, String name, String username, String password, Calendar logIn, String email, String observation) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.logIn = logIn;
        this.email = email;
        this.observation = observation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Calendar getLogIn() {
        return logIn;
    }

    public void setLogIn(Calendar logIn) {
        this.logIn = logIn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (id != null ? !id.equals(client.id) : client.id != null) return false;
        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        if (username != null ? !username.equals(client.username) : client.username != null) return false;
        if (password != null ? !password.equals(client.password) : client.password != null) return false;
        if (logIn != null ? !logIn.equals(client.logIn) : client.logIn != null) return false;
        if (email != null ? !email.equals(client.email) : client.email != null) return false;
        return observation != null ? observation.equals(client.observation) : client.observation == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (logIn != null ? logIn.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (observation != null ? observation.hashCode() : 0);
        return result;
    }
}
