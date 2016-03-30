# clear previous backup
rm -rf "$(git rev-parse --git-dir)/refs/original/"

commit="3b97de6f23ce87716715710587c735016697d0fd"
date=$(date -d 'a day ago')
git filter-branch --env-filter \
    "if [ \$GIT_COMMIT = '$commit' ]; then
         export GIT_AUTHOR_DATE='$date'
         export GIT_COMMITTER_DATE='$date'
         export GIT_COMMITTER_NAME="\$GIT_AUTHOR_NAME"
         export GIT_COMMITTER_EMAIL="\$GIT_AUTHOR_EMAIL"
     fi"