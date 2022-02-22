package com.example.android.githubsearchwithroom.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.githubsearchwithroom.R
import com.example.android.githubsearchwithroom.data.GitHubRepo

class BookmarkedReposActivity : AppCompatActivity() {
    private val repoListAdapter = GitHubRepoListAdapter(::onGitHubRepoClick)
    private lateinit var bookmarkedReposRV: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookmarked_repos)

        bookmarkedReposRV = findViewById(R.id.rv_bookmarked_repos)
        bookmarkedReposRV.layoutManager = LinearLayoutManager(this)
        bookmarkedReposRV.setHasFixedSize(true)
        bookmarkedReposRV.adapter = this.repoListAdapter
    }

    private fun onGitHubRepoClick(repo: GitHubRepo) {
        val intent = Intent(this, RepoDetailActivity::class.java).apply {
            putExtra(EXTRA_GITHUB_REPO, repo)
        }
        startActivity(intent)
    }
}