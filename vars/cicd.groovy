def gitDownload(repo)
{
    git "https://github.com/KolliCharan/${repo}.git"
  
}

def build Artifact()

{
    sh 'mvn package'

}
