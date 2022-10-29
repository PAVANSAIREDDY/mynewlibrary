def newgit(repo)
{
  git "https://github.com/PAVANSAIREDDY/${repo}.git"
}

def newmaven()
{
  sh 'mvn package'
}
