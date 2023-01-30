package fr.eni.filmotheque.bo;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Film {

    private Integer id;

    @NotNull
    @NotBlank
    private String titre;

    @NotNull
    private int anneeSortie;
    
    private int duree;
    
    @Size(min = 20, max = 250)
    private String synopsis;

    @NotNull
    private Participant realisateur;

    private List<Participant> acteurs;

    private Genre genre;

    private List<Avis> avis;


    public Film(Integer id, String titre, int anneeSortie, Participant realisateur, 
    		int duree, Genre genre, String synopsis) {
		this();
		this.id = id;
		this.titre = titre;
		this.anneeSortie = anneeSortie;
		this.realisateur = realisateur;
		this.duree = duree;
		this.genre = genre;
		this.acteurs = new ArrayList<Participant>();
		this.avis = new ArrayList<Avis>();
		this.synopsis = synopsis;
	}

	public Film() {
		this.acteurs = new ArrayList<>();
    }



    public void addActeur(Participant acteur) {
    	this.acteurs.add(acteur);
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(int anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public Participant getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Participant realisateur) {
        this.realisateur = realisateur;
    }

    public List<Participant> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Participant> acteurs) {
        this.acteurs = acteurs;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Avis> getAvis() {
        return avis;
    }

    public void setAvis(List<Avis> avis) {
        this.avis = avis;
    }

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", anneeSortie=" + anneeSortie + ", duree=" + duree
				+ ", synopsis=" + synopsis + ", realisateur=" + realisateur + ", genre=" + genre + "]";
	}
}
