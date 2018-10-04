def call() {
  def foobar = currentBuild.rawBuild.getCauses()

  for (foo in foobar) {
    if (foo instanceof hudson.triggers.TimerTrigger.TimerTriggerCause) {
      echo 'time triggered'
    }
  }

  try {
    sh 'php --version'
    return true
  } catch(e) {
    return false
  }
}
