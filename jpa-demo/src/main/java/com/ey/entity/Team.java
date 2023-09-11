package com.ey.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team {
	@Id
	@Column(name = "team_id")
	private int teamId;
	@Column(name = "team_name", length = 20)
	private String teamName;
	@Column(length = 20)
	private String league;
	@OneToMany
	private List<Player> players;

	public Team() {
	}

	public Team(int teamId, String teamName, String league) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.league = league;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", league=" + league + "]";
	}

}
