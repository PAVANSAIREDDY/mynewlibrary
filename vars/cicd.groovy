def newgit(repo)
{
  git "https://github.com/PAVANSAIREDDY/${repo}.git"
}

def newmaven()
{
  sh 'mvn package'
}

def newdeploy(job,ip,context)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${job}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}

def newtest()
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/sharedlibraries/testing.jar"
}
