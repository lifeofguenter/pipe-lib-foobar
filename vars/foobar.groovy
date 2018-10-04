def call() {
  def foobar = 'foobar' //= currentBuild.rawBuild.getCauses()
  echo foobar

  //for (cause in causes) {
  //  if (cause instanceof hudson.triggers.TimerTrigger.TimerTriggerCause) {
  //    //return true
  //  }
  //}

  try {
    sh 'php --version'
    return true
  } catch(e) {
    return false
  }
}
