def call() {
  def causes = currentBuild.rawBuild.getCauses()

  for (cause in causes) {
    echo cause
  }
  
  try {
    sh 'php --version'
    return true
  } catch(e) {
    return false
  }
}
