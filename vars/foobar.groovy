def call() {
  def causes = currentBuild.rawBuild.getCauses()

  for (cause in causes) {
    echo cause.getClass().toString()
  }
  
  try {
    sh 'php --version'
    return true
  } catch(e) {
    return false
  }
}
