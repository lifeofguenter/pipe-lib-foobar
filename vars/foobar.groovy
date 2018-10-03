def call() {
  def causes = currentBuild.rawBuild.getCause()

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
