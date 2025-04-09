def gitDownload(repo)
{
    git "https://github.com/KolliCharan/${repo}.git"
  
}

def buildArtifact()
{
    sh 'mvn package'

}
