def call() {
  def causes = currentBuild.rawBuild.getCauses()

  for (cause in causes) {
    if (cause instanceof hudson.triggers.TimerTrigger.TimerTriggerCause) {
      //return true
    }
  }

  sh 'php --version'
  //try {
  //  sh 'php --version'
  //  return true
  //} catch(e) {
  //  return false
  //}
}
