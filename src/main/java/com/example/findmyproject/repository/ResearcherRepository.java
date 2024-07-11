
package com.example.findmyproject.repository;

import com.example.findmyproject.model.Project;
import com.example.findmyproject.model.Researcher;

import java.util.ArrayList;
import java.util.List;

public interface ResearcherRepository {

    ArrayList<Researcher> getResearchers();

    Researcher getResearcherById(int researchId);

    Researcher addResearcher(Researcher research);

    Researcher updateResearcher(int researchId, Researcher research);

    void deleteResearcher(int researchId);

    List<Project> getResearcherProjects(int  researchId);
}
